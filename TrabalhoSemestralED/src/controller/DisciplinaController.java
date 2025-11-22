package controller;
import entity.Disciplina;
import javax.swing.*;
import java.io.*;
import br.edu.fateczl.Lista;

public class DisciplinaController {

    private final String caminho = "Arquivos/disciplinas.csv";
    private final String separador = ";";
    Lista[] tabelaHashDisciplinas;

    public DisciplinaController() {
        int tamanho = archiveSize();
        tabelaHashDisciplinas = new Lista[tamanho];
        inicializarTabelaHash();
    }

    public void inicializarTabelaHash() {
        for (int i = 0; i < tabelaHashDisciplinas.length; i++) {
            tabelaHashDisciplinas[i] = new Lista();
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

    public void consultarDisciplina(Disciplina disciplina) throws Exception {
        try (BufferedReader ler = new BufferedReader(new FileReader("Arquivos/disciplinas.csv"))) {
            int tamanho = archiveSize();
            String linha;
            while ((linha = ler.readLine()) != null) {
                String[] colunas =  linha.split(separador);
                // precisa verificar o status usando .equals(true) para disciplinas em aberto, depois realizar o hash code
                if (colunas.length == 7) {
                    int codigoCurso = Integer.parseInt(colunas[6]);
                    int id = codigoHash(codigoCurso, tamanho);

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

    public int codigoHash (int codigo, int tamanho) {
        int posicao = Math.abs(codigo % tamanho);
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
}