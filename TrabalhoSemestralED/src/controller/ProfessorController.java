package controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import entity.Professor;

import javax.swing.*;

public class ProfessorController {
    private String separador = ";";
    private String caminho = "Arquivos/professor.csv";

    public void adicionarProfessor(Professor prof) throws Exception {

        if (!exists(prof.getCpf())) {
            try (BufferedWriter escrever = new BufferedWriter(new FileWriter(caminho, true))) {
                String linha = prof.getCpf() + separador +
                        prof.getNome() + separador +
                        prof.getArea() + separador +
                        prof.getPonto() + separador;
                escrever.write(linha);
                escrever.newLine();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "O CPF inserido já está cadastrado",
                    "Cadastro do Professor", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void removerProfessor(Professor prof) throws Exception {

    }

    public void consultarProfessor() throws Exception {

    }

    private boolean exists(String cpfProfessor) throws Exception {
        BufferedReader ler = new BufferedReader(new FileReader(caminho));
        String linha;
        while ((linha = ler.readLine()) != null) {
            String[] colunas = linha.split(separador);

            if (colunas.length == 4) {
                String cpf = colunas[0].trim();

                if (cpf.equals(cpfProfessor)) {
                    return true;
                }
            }
        }
        return false;
    }
}
