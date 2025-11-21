package controller;

import entity.Curso;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class CursoController {

    private final String caminho = "Arquivos/cursos.csv";
    private final String separador = ";";

    public boolean adicionarCurso(Curso curso) throws Exception {



        if (!exists(curso.getNomeCurso())) {
            try (BufferedWriter escrever = new BufferedWriter(new FileWriter(caminho, true))) {
                String linha = curso.getCodigoCurso() + separador +
                        curso.getNomeCurso() + separador +
                        curso.getArea();
                escrever.write(linha);
                escrever.newLine();
                return true;
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Curso '" + curso.getNomeCurso() + "' já cadastrado!",
                    "Cadastro do Curso", JOptionPane.INFORMATION_MESSAGE);
        }
        return false;
    }

    public void removerCurso(Curso curso) throws Exception {

    }

    public void consultarCurso() {

    }

    private boolean exists(String nomeCurso) throws Exception{
        BufferedReader ler= new BufferedReader(new FileReader(caminho));
        String linha;
        while((linha = ler.readLine()) != null){
            String separador = ";";
            String[] colunas = linha.split(separador);

            if(colunas.length == 3){
                String nome = colunas[1].trim();
                if(nome.equals(nomeCurso)){
                    return true;
                }
            }
        }
        return false;
    }
}
