package controller;
import entity.Disciplina;
import javax.swing.*;
import java.io.*;
import br.edu.fateczl.Lista;

public class DisciplinaController {

    private final String caminho = "Arquivos/disciplinas.csv";
    private final String separador = ";";
    private final int tamanho = 101;
    Lista[] tabelaHashDisciplinas;

    public DisciplinaController() {
        //int tamanho = archiveSize();
        tabelaHashDisciplinas = new Lista[tamanho];
        inicializarTabelaHash();
    }

    public void inicializarTabelaHash() {
        for (int i = 0; i < tabelaHashDisciplinas.length; i++) {
            tabelaHashDisciplinas[i] = new Lista<Disciplina>();
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
                escrever.write(linha);
                escrever.newLine();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Disciplina '" + disciplina.getNomeDisciplina() + "' já cadastrada!",
                    "Cadastro da Disciplina", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void removerDisciplina() {

    }

    public void carregarHash() throws Exception {
        try (BufferedReader ler = new BufferedReader(new FileReader("Arquivos/disciplinas.csv"))) {
            String linha;
            while ((linha = ler.readLine()) != null) {
                String[] colunas =  linha.split(separador);
                // precisa verificar o status usando .equals(true) para disciplinas em aberto, depois realizar o hash code
                if (colunas.length == 7) {
                    String status = colunas[6].trim();
                    int codigoCurso = Integer.parseInt(colunas[5]);
                    if (status.equalsIgnoreCase("true")) {
                        //int id = codigoHash(codigoCurso, tamanho);
                        int id = codigoHash(codigoCurso);
                        tabelaHashDisciplinas[id].addFirst(new Disciplina(
                                Integer.parseInt(colunas[0].trim()),
                                colunas[1].trim(),
                                colunas[2].trim(),
                                colunas[3].trim(),
                                Integer.parseInt(colunas[4].trim()),
                                Integer.parseInt(colunas[5].trim()),
                                true));
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int archiveSize() {
        String linha;
        int ctd = 0;
        try (BufferedReader ler = new BufferedReader(new FileReader("Arquivos/disciplinas.csv"))) {
            // conta a quantidade de linhas
            while ((linha = ler.readLine()) != null) {
                ctd++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ctd;
    }

    public int codigoHash (int codigo) {
        //int posicao = Math.abs(codigo % tamanho);
        double a = ((codigo * (Math.sqrt(5) - 1) / 2) % 1);
        int posicao = (int) (tamanho * a);
        return posicao;
    }


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