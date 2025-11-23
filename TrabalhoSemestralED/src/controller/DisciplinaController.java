package controller;
import entity.Disciplina;
import javax.swing.*;
import java.io.*;
import br.edu.fateczl.Lista;

public class DisciplinaController {

    private final String caminho = "Arquivos/disciplinas.csv";
    private final String separador = ";";
    private final int tamanho = 101;
    Lista<Disciplina>[] tabelaHashDisciplinas;

    public DisciplinaController() throws Exception {
        //int tamanho = archiveSize();
        tabelaHashDisciplinas = new Lista[tamanho];
        inicializarTabelaHash();
        carregarHash();
    }

    public void inicializarTabelaHash() {
        for (int i = 0; i < tabelaHashDisciplinas.length; i++) {
            tabelaHashDisciplinas[i] = new Lista<>();
        }
    }

    public void adicionarDisciplina(Disciplina disciplina) throws Exception {

        if (!exists(disciplina.getNomeDisciplina())) {
            try (BufferedWriter escrever = new BufferedWriter(new FileWriter(caminho, true))) {
                String linha = disciplina.getCodigoDisciplina() + separador +
                        disciplina.getNomeDisciplina() + separador +
                        disciplina.getDiaSemana() + separador +
                        disciplina.getHorarioInicial() + separador +
                        disciplina.getQuantidadeHoras() + separador +
                        disciplina.getCodigoCurso();
//                       + separador + disciplina.isStatus();
                escrever.write(linha);
                escrever.newLine();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Disciplina '" + disciplina.getNomeDisciplina() + "' já cadastrada!",
                    "Cadastro da Disciplina", JOptionPane.INFORMATION_MESSAGE);
        }
//        if (disciplina.isStatus()) {
        inserirNaHash(disciplina);
//        }
    }

    public void removerDisciplina() {

    }

    //Carrega todas as disciplinas do arquivo para a hash
    public void carregarHash() throws Exception {
        try (BufferedReader ler = new BufferedReader(new FileReader("Arquivos/disciplinas.csv"))) {
            String linha;
            while ((linha = ler.readLine()) != null) {
                String[] colunas =  linha.split(separador);
                // precisa verificar o status usando .equals(true) para disciplinas em aberto, depois realizar o hash code
                if (colunas.length >= 6) {
                    String status = colunas[6].trim();
                    Disciplina d = new Disciplina(
                            Integer.parseInt(colunas[0].trim()),
                            colunas[1].trim(),
                            colunas[2].trim(),
                            colunas[3].trim(),
                            Integer.parseInt(colunas[4].trim()),
                            Integer.parseInt(colunas[5].trim()),
                            Boolean.parseBoolean(colunas[6].trim())
                    );

//                    if (d.isStatus()) {
                    inserirNaHash(d);
//                    }

//                    int codigoCurso = Integer.parseInt(colunas[5]);
//                    if (status.equalsIgnoreCase("true")) {
//                        //int id = codigoHash(codigoCurso, tamanho);
//                        int id = codigoHash(codigoCurso);
//                        tabelaHashDisciplinas[id].addFirst(new Disciplina(
//                                Integer.parseInt(colunas[0].trim()),
//                                colunas[1].trim(),
//                                colunas[2].trim(),
//                                colunas[3].trim(),
//                                Integer.parseInt(colunas[4].trim()),
//                                Integer.parseInt(colunas[5].trim()),
//                                true));
//                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void inserirNaHash(Disciplina disciplina) throws Exception {
        int codigo =  disciplina.getCodigoCurso();
        int posicao = codigoHash(codigo);
        tabelaHashDisciplinas[posicao].addFirst(disciplina);
    }

//    public int archiveSize() {
//        String linha;
//        int ctd = 0;
//        try (BufferedReader ler = new BufferedReader(new FileReader("Arquivos/disciplinas.csv"))) {
//            // conta a quantidade de linhas
//            while ((linha = ler.readLine()) != null) {
//                ctd++;
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return ctd;
//    }

    public int codigoHash (int codigo) {
        //int posicao = Math.abs(codigo % tamanho);
        double a = ((codigo * (Math.sqrt(5) - 1) / 2) % 1);
        int posicao = (int) (tamanho * a);
        return posicao;
    }

//    public void atualizarDisciplina(Disciplina disciplina) throws Exception {
//        File arquivo = new File(caminho);
//        File arquivoTemp = new File("Arquivos/disciplinas_temp.csv");
//
//        try (
//                BufferedReader ler = new BufferedReader(new FileReader(arquivo));
//                BufferedWriter escrever = new BufferedWriter(new FileWriter(arquivoTemp))
//        ) {
//            String linha;
//
//            while ((linha = ler.readLine()) != null) {
//                String[] colunas = linha.split(separador);
//
//                if (Integer.parseInt(colunas[0]) == disciplina.getCodigoDisciplina()) {
//
//                    // Substitui pela nova linha atualizada
//                    String novaLinha = disciplina.getCodigoDisciplina() + separador +
//                            disciplina.getNomeDisciplina() + separador +
//                            disciplina.getDiaSemana() + separador +
//                            disciplina.getHorarioInicial() + separador +
//                            disciplina.getQuantidadeHoras() + separador +
//                            disciplina.getCodigoCurso() + separador +
//                            disciplina.isStatus();
//
//                    escrever.write(novaLinha);
//                    escrever.newLine();
//
//                } else {
//                    // COPIA LINHA SEM ALTERAÇÃO
//                    escrever.write(linha);
//                    escrever.newLine();
//                }
//            }
//        }
//    }

    private boolean exists(String nomeDisciplina) throws Exception {
        BufferedReader ler = new BufferedReader(new FileReader(caminho));
        String linha;
        while ((linha = ler.readLine()) != null) {
            String[] colunas = linha.split(separador);
            if (colunas.length == 7) {
                String nome = colunas[1].trim();

                if (nome.equals(nomeDisciplina)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public Lista<String> buscarCodigosDisciplinas(){
        Lista<String> CodigosDisciplinas = new Lista<>();
        try(BufferedReader ler= new BufferedReader(new FileReader(caminho))){
            String linha;
            while((linha = ler.readLine()) != null){
            String[] colunas = linha.split(separador);
            String codigo = colunas[0].trim() + " - " + colunas[1].trim();
            if(CodigosDisciplinas.isEmpty()){
                CodigosDisciplinas.addFirst(codigo);
            } else {
                CodigosDisciplinas.addLast(codigo);
            }
        }
            return CodigosDisciplinas;
    } catch(Exception e){
        e.printStackTrace();
        return new Lista<>();   
    }
   } 
}