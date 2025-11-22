
package controller;

import entity.Inscrições;
import entity.Curso;
import entity.Disciplina;
import br.edu.fateczl.Lista;
import javax.swing.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;


public class InscricoesController { 
    Lista[] tabelaHash;

    private final String caminho = "Arquivos/incrições.csv";
    private final String separador = ";";
    Curso curso;

    public void adicionarInscricao(Inscrições inscricao) throws Exception {

        // Valida se o professor já está inscrito a partir do seu cpf
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
