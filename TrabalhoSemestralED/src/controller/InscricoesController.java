/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import entity.Disciplina;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import entity.Inscrições;

/**
 *
 * @author Família Lira
 */
public class InscricoesController {

    private final String caminho = "Arquivos/incrições.csv";
    private final String separador = ";";

    public void adicionarInscricao(Inscrições inscricao) throws Exception {

        if (!exists(inscricao.getCpf())) {
            try (BufferedWriter escrever = new BufferedWriter(new FileWriter(caminho, true))) {
                String linha = inscricao.getCpf() + separador +
                        inscricao.getCodigoDisciplina() + separador +
                        inscricao.getCodigoProcesso() + separador;
                escrever.write(linha);
                escrever.newLine();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Candidato '" + inscricao.getCpf() + " já está cadastrado!",
                    "Cadastro do Candidato", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void removerInscricao() {

    }

    public void consultarInscricao() {

    }

    private boolean exists(String nomeDisciplina) throws Exception {
        BufferedReader ler = new BufferedReader(new FileReader(caminho));
        String linha;
        while ((linha = ler.readLine()) != null) {
            String separador = ";";
            String[] colunas = linha.split(separador);

            if (colunas.length == 3) {
                String nome = colunas[0].trim();

                if (nome.equals(nomeDisciplina)) {
                    return true;
                }
            }
        }
        return false;
    }
}
