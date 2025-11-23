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
    
    public int codigoHash(int codigo) {
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

        try (BufferedReader ler = new BufferedReader(new FileReader(caminho))) {
            String linha;
            while ((linha = ler.readLine()) != null) {
                String[] dados = linha.split(separador, -1);
                if (dados.length > 0) {
                    try {
                        int codAtual = Integer.parseInt(dados[0].trim());
                        if (codAtual != codigoParaRemover) {
                            linhasParaManter.addLast(linha); 
                        } else {
                            encontrou = true; 
                        }
                    } catch (NumberFormatException e) {
                        continue; 
                    }
                }
            }
        }

        if (encontrou) {
            try (BufferedWriter escrever = new BufferedWriter(new FileWriter(caminho))) {
                int tamanhoLista = linhasParaManter.size();
                for (int i = 0; i < tamanhoLista; i++) {
                    escrever.write(linhasParaManter.get(i));
                    escrever.newLine();
                }
            }
            JOptionPane.showMessageDialog(null, "Disciplina removida com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Disciplina não encontrada.");
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
    
    public Lista<String> buscarCodigosDisciplinas(){
        return new Lista<>(); 
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
}