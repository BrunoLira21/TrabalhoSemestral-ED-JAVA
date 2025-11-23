package controller;

import entity.Disciplina;
import javax.swing.*;
import java.io.*;
import javax.swing.table.DefaultTableModel;
import br.edu.fateczl.Lista;
import br.edu.fateczl.fila.Fila;
import controller.DisciplinaController;

public class DisciplinaController {
    private final String caminho = "Arquivos/disciplinas.csv";
    private final String separador = ";";    
    private final int tamanho = 23;
    Lista<Disciplina>[] tabelaHashDisciplinas;
    private CursoController cc;

    public DisciplinaController() throws Exception {
        cc = new CursoController();
        tabelaHashDisciplinas = new Lista[tamanho];
        inicializarTabelaHash();
        carregarHash();
    }

    public void inicializarTabelaHash() {
        for (int i = 0; i < tabelaHashDisciplinas.length; i++) {
            tabelaHashDisciplinas[i] = new Lista<>();
        }
    }
    
     public void carregarHash() throws Exception {
        try (BufferedReader ler = new BufferedReader(new FileReader(caminho))) {
            String linha;
            while ((linha = ler.readLine()) != null) {
                String[] colunas = linha.split(separador);
                if (colunas.length == 7) {
                     Disciplina d = new Disciplina(
                        Integer.parseInt(colunas[0].trim()),
                        colunas[1].trim(),
                        colunas[2].trim(),
                        colunas[3].trim(),
                        Integer.parseInt(colunas[4].trim()),
                        Integer.parseInt(colunas[5].trim()),
                        colunas[6].trim());
                    inserirNaHash(d);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

     public void inserirNaHash(Disciplina disciplina) throws Exception {
        int codigo = disciplina.getCodigoCurso(); 
        int posicao = codigoHash(codigo);
        tabelaHashDisciplinas[posicao].addFirst(disciplina);

    }

    public int codigoHash (int codigo) {
        double a = ((codigo * (Math.sqrt(5) - 1) / 2) % 1);
        int posicao = (int) (tamanho * a);
        return posicao;
    }
    
    public boolean adicionarDisciplina(Disciplina disciplina) throws Exception {
        if (!exists(disciplina.getNomeDisciplina())) {
        try (BufferedWriter escrever = new BufferedWriter(new FileWriter(caminho, true))) {
            escrever.write(disciplina.toString());
            escrever.newLine();
            inserirNaHash(disciplina);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        } else {
            JOptionPane.showMessageDialog(null, "Disciplina" + disciplina.getNomeDisciplina() + "já cadastrada!", "Cadastro Disciplina", JOptionPane.INFORMATION_MESSAGE);
        }
        
        return false;
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
                            adicionarNaLista(linhasParaManter, linha);
                        }
                    } catch (NumberFormatException e) {
                        adicionarNaLista(linhasParaManter, linha);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Erro ao ler arquivo: " + e.getMessage());
        }

        if (encontrou) {
            reescreverArquivo(linhasParaManter);
            removerDaHash(codigoParaRemover);
            InscricoesController ic = new InscricoesController();
            ic.excluirPorDisciplina(codigoParaRemover);
            JOptionPane.showMessageDialog(null, "Disciplina removida com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Disciplina não encontrada (Código: " + codigoParaRemover + ")");
        }
        
    }
    
    private void reescreverArquivo(Lista<String> linhasParaManter) throws Exception{
        try(BufferedWriter escrever = new BufferedWriter(new FileWriter(caminho, false))){
            if (!linhasParaManter.isEmpty()) {
                int tamanho = linhasParaManter.size();
                for(int i = 0; i < tamanho; i++){
                    String linha = linhasParaManter.get(i);
                    escrever.write(linha);
                    escrever.newLine();
                }
            }
        } catch (IOException e){
            throw new Exception ("Erro ao gravar no arquivo: " + e.getMessage());
        }
    }    

    private void adicionarNaLista(Lista<String> lista, String conteudo) throws Exception{
        if(lista.isEmpty()){
            lista.addFirst(conteudo);
        } else{
            lista.addLast(conteudo);
        }
    }    

    private void removerDaHash(int codDisciplinaRemover) throws Exception{
        for (int i = 0; i < tamanho; i++){
        Lista<Disciplina> lista = tabelaHashDisciplinas[i];
        int qtd = lista.size();
        
        for(int j = 0; j < qtd; j++){
            Disciplina d = lista.get(j);
            
            if(d.getCodigoDisciplina() == codDisciplinaRemover){
                lista.remove(j);
                return;
            }
        }
     }
   }

    public Lista<Disciplina> consultarHash() throws Exception{
        Lista<Disciplina> resultado = new Lista<>();
        
        for (int i = 0; i < tamanho; i++){
            Lista<Disciplina> auxiliar = tabelaHashDisciplinas[i];
            
            if(!auxiliar.isEmpty()){
                int tamanhoAuxiliar = auxiliar.size();
                        
                for (int j = 0; j < tamanhoAuxiliar; j++){
                    Disciplina d = auxiliar.get(j);
                    resultado.addLast(d);
                }
            }
        }
            return resultado;
    }
    
    private boolean exists(String nomeDisciplina) throws Exception {
        try (BufferedReader ler = new BufferedReader(new FileReader(caminho))) {
            String linha;
            while ((linha = ler.readLine()) != null) {
                String[] colunas = linha.split(separador);
                if (colunas.length == 6) {
                    String nome = colunas[1].trim();

                    if (nome.equals(nomeDisciplina)){
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
        Lista<String> CodigosDisciplinas = new Lista<>();
        try (BufferedReader ler = new BufferedReader(new FileReader(caminho))) {
            String linha;
            while ((linha = ler.readLine()) != null) {
                String[] colunas = linha.split(separador);
                String codigo = colunas[0].trim() + " - " + colunas[1].trim();
                if (CodigosDisciplinas.isEmpty()){
                    CodigosDisciplinas.addFirst(codigo);
                } else {
                    CodigosDisciplinas.addLast(codigo);
                }
            }
                return CodigosDisciplinas;
        } catch (Exception e) {
            e.printStackTrace();
            return new Lista<>();
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

    public void mostrarTabelaHash(DefaultTableModel modelo) throws Exception {
        modelo.setRowCount(0);
        Lista<Disciplina> todasDisciplinas = consultarHash();

        if (todasDisciplinas.isEmpty()) {
            return;
        }

        int tamanho = todasDisciplinas.size();
        for (int i = 0; i < tamanho; i++) {
            try {
                Disciplina d = todasDisciplinas.get(i);
                int codCurso = d.getCodigoCurso();
                String nomeCurso = cc.buscarNomesCursos(codCurso);
                String nomeDisciplina = d.getNomeDisciplina();
                Object codigoProcessoObj;
                try {
                    codigoProcessoObj = Integer.parseInt(d.getCodigoProcesso());
                } catch (NumberFormatException e) {
                    codigoProcessoObj = d.getCodigoProcesso(); // Mantém como string se falhar
                }
                modelo.addRow(new Object[]{
                        codCurso,
                        nomeCurso,
                        nomeDisciplina,
                        codigoProcessoObj,
                });
            } catch (Exception e) {
                System.err.println("Erro ao iterar disciplina no índice: " + i + ": " + e.getMessage());
            }
        }
    }
}