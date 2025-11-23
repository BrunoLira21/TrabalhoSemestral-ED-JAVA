package controller;

import entity.Disciplina;
import javax.swing.*;
import java.io.*;
import javax.swing.table.DefaultTableModel;
import br.edu.fateczl.Lista;
import br.edu.fateczl.fila.Fila; 

public class DisciplinaController {

    private final String caminho = "Arquivos/disciplinas.csv";
    private final String separador = ";";    
    private final int tamanho = 101;
    
    Lista<Disciplina>[] tabelaHashDisciplinas;

    public DisciplinaController() throws Exception {
        tabelaHashDisciplinas = new Lista[tamanho];
        inicializarTabelaHash();
        // carregarHash();     }
    }
    
    public void inicializarTabelaHash() {
        for (int i = 0; i < tabelaHashDisciplinas.length; i++) {
            tabelaHashDisciplinas[i] = new Lista<>();
        }
    }

    public int codigoHash (int codigo) {
        double a = ((codigo * (Math.sqrt(5) - 1) / 2) % 1);
        int posicao = (int) (tamanho * a);
        return posicao;
    }

    public void inserirNaHash(Disciplina disciplina) throws Exception {
        int codigo = disciplina.getCodigoCurso(); // Hash baseado no Curso
        int posicao = codigoHash(codigo);
        tabelaHashDisciplinas[posicao].addFirst(disciplina);
    }
    
    public void adicionarDisciplina(Disciplina disciplina) throws Exception {
        if (exists(disciplina.getNomeDisciplina())) {
            JOptionPane.showMessageDialog(null, "Disciplina '" + disciplina.getNomeDisciplina() + "' já cadastrada!", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try (BufferedWriter escrever = new BufferedWriter(new FileWriter(caminho, true))) {
            escrever.write(disciplina.toString());
            escrever.newLine();
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Erro ao escrever no arquivo.");
        }
        
        // inserirNaHash(disciplina);
    }

    public void removerDisciplina(int codigoParaRemover) throws Exception {

        Lista<String> linhasParaManter = new Lista<>();
        boolean encontrou = false;

        File arquivo = new File(caminho);
        if (!arquivo.exists()) {
            throw new Exception("Arquivo não encontrado!");
        }

        try (BufferedReader ler = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while ((linha = ler.readLine()) != null) {
                if (linha.trim().isEmpty()) continue; // Pula linha vazia

                String[] dados = linha.split(separador, -1);
                
                if (dados.length > 0 && !dados[0].trim().isEmpty()) {
                    try {
                        int codAtual = Integer.parseInt(dados[0].trim());
                        
                        if (codAtual == codigoParaRemover) {
                            encontrou = true;
                        } else {
                            if (linhasParaManter.isEmpty()) {
                                linhasParaManter.addFirst(linha);
                            } else {
                                linhasParaManter.addLast(linha);
                            }
                        }
                    } catch (NumberFormatException e) {
                        if (linhasParaManter.isEmpty()) {
                            linhasParaManter.addFirst(linha);
                        } else {
                            linhasParaManter.addLast(linha);
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Erro ao ler arquivo: " + e.getMessage());
        }

        if (encontrou) {
            try (BufferedWriter escrever = new BufferedWriter(new FileWriter(caminho))) { // false = apaga tudo e escreve de novo
                if (!linhasParaManter.isEmpty()) {
                    int tamanho = linhasParaManter.size();
                    for (int i = 0; i < tamanho; i++) {
                        String texto = linhasParaManter.get(i);
                        escrever.write(texto);
                        escrever.newLine();
                    }
                }
            } catch (Exception e) {
                throw new Exception("Erro ao gravar arquivo: " + e.getMessage());
            }
            JOptionPane.showMessageDialog(null, "Disciplina removida com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Disciplina não encontrada (Código: " + codigoParaRemover + ")");
        }
        
    }

    public void preencherTabela(DefaultTableModel modelo) {
        modelo.setRowCount(0);
        Fila<Disciplina> filaDisciplinas = new Fila<>();

        try (BufferedReader ler = new BufferedReader(new FileReader(caminho))) {
            String linha;
            while ((linha = ler.readLine()) != null) {
                String[] dados = linha.split(separador, -1);
                
                if (dados.length >= 7) {
                    try {
                        Disciplina d = new Disciplina(
                            Integer.parseInt(dados[0].trim()),
                            dados[1].trim(),
                            dados[2].trim(),
                            dados[3].trim(),
                            Integer.parseInt(dados[4].trim()),
                            Integer.parseInt(dados[5].trim()),
                            dados[6].trim()
                        );
                        filaDisciplinas.insert(d); 
                    } catch (NumberFormatException e) {
                        System.out.println("Linha inválida ignorada: " + linha);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            while (!filaDisciplinas.isEmpty()) {
                Disciplina d = (Disciplina) filaDisciplinas.remove();
                
                modelo.addRow(new Object[]{
                    d.getCodigoDisciplina(),
                    d.getNomeDisciplina(),
                    d.getDiaSemana(),
                    d.getHorarioInicial(),
                    d.getQuantidadeHoras(),
                    d.getCodigoCurso(),
                    d.getCodigoProcesso()
                });
            }
        } catch (Exception e) {
            System.err.println("Erro ao manipular a fila: " + e.getMessage());
        }
    }
    
    private boolean exists(String nomeDisciplina) throws Exception {
        try (BufferedReader ler = new BufferedReader(new FileReader(caminho))) {
            String linha;
            while ((linha = ler.readLine()) != null) {
                String[] colunas = linha.split(separador);
                if (colunas.length >= 2) {
                    if (colunas[1].trim().equalsIgnoreCase(nomeDisciplina.trim())) {
                        return true;
                    }
                }
            }
        } catch (FileNotFoundException e) {
            return false; 
        }
        return false;
    }

    public Lista<String> buscarCodigosDisciplinas() {
        Lista<String> lista = new Lista<>();
        try (BufferedReader ler = new BufferedReader(new FileReader(caminho))) {
            String linha;
            while ((linha = ler.readLine()) != null) {
                String[] dados = linha.split(separador);
                // Verifica se tem pelo menos Código e Nome (indices 0 e 1)
                if (dados.length >= 2) {
                    // Formata para "1 - Estrutura de Dados"
                    String item = dados[0].trim() + " - " + dados[1].trim();

                    if (lista.isEmpty()) {
                        lista.addFirst(item);
                    } else {
                        lista.addLast(item);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    public void carregarHash() throws Exception {
        try (BufferedReader ler = new BufferedReader(new FileReader(caminho))) {
            String linha;
            while ((linha = ler.readLine()) != null) {
                String[] dados = linha.split(separador, -1);
                if (dados.length >= 7) {
                     Disciplina d = new Disciplina(
                        Integer.parseInt(dados[0].trim()),
                        dados[1].trim(),
                        dados[2].trim(),
                        dados[3].trim(),
                        Integer.parseInt(dados[4].trim()),
                        Integer.parseInt(dados[5].trim()),
                        dados[6].trim()
                    );
                    inserirNaHash(d);
                }
            }
        } catch (Exception e) {
        }
    }
    public int gerarProximoCodigoDisciplina() {
        int maiorId = 0;
        try (BufferedReader ler = new BufferedReader(new FileReader(caminho))) {
            String linha;
            while ((linha = ler.readLine()) != null) {
                String[] dados = linha.split(separador);
                if (dados.length >= 1) {
                    try {
                        int idAtual = Integer.parseInt(dados[0].trim());
                        if (idAtual > maiorId) {
                            maiorId = idAtual;
                        }
                    } catch (NumberFormatException e) {
                        // ignora cabeçalho ou linhas inválidas
                    }
                }
            }
        } catch (FileNotFoundException e) {
            return 1; // Se o arquivo não existe, começa do 1
        } catch (IOException e) {
            e.printStackTrace();
        }
        return maiorId + 1;
    }

    public int gerarProximoCodigoProcesso() {
        int maiorProcesso = 5000; // valor base inicial (5000)
        try (BufferedReader ler = new BufferedReader(new FileReader(caminho))) {
            String linha;
            while ((linha = ler.readLine()) != null) {
                String[] dados = linha.split(separador);
                // O Processo é a 7ª coluna (índice 6)
                if (dados.length >= 7) {
                    try {
                        int procAtual = Integer.parseInt(dados[6].trim());
                        if (procAtual > maiorProcesso) {
                            maiorProcesso = procAtual;
                        }
                    } catch (NumberFormatException e) {
                        // ignora
                    }
                }
            }
        } catch (FileNotFoundException e) {
            return 5001; // Se arquivo não existe
        } catch (IOException e) {
            e.printStackTrace();
        }
        return maiorProcesso + 1;
    }
}