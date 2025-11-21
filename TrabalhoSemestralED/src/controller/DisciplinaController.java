package controller;
import entity.Disciplina;
import javax.swing.*;
import java.io.*;

public class DisciplinaController {

    private final String caminho = "Arquivos/disciplinas.csv";
    private final String separador = ";";

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

    }


    private boolean exists(String nomeDisciplina) throws Exception {
        BufferedReader ler = new BufferedReader(new FileReader(caminho));
        String linha;
        while ((linha = ler.readLine()) != null) {
            String separador = ";";
            String[] colunas = linha.split(separador);

            if (colunas.length == 6) {
                String nome = colunas[1].trim();

                if (nome.equals(nomeDisciplina)) {
                    return true;
                }
            }
        }
        return false;
    }
}