package controller;

import java.io.*;

import br.edu.fateczl.Lista;
import entity.Professor;

import javax.swing.*;

public class ProfessorController {

    private final String separador = ";";
    private final String caminho = "Arquivos/professor.csv";

    public boolean adicionarProfessor(Professor prof) throws Exception {

        if (!exists(prof.getCpf())) {
            try (BufferedWriter escrever = new BufferedWriter(new FileWriter(caminho, true))) {
                String linha = prof.getCpf() + separador +
                        prof.getNome() + separador +
                        prof.getArea() + separador +
                        prof.getPonto() + separador;
                escrever.write(linha);
                escrever.newLine();
                return true;
            } catch (IOException e) {
                e.printStackTrace();
                throw new Exception("Erro ao escrever o arquivo: " + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "O CPF inserido já está cadastrado",
                    "Cadastro do Professor", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
    }

    public boolean removerProfessor(Professor prof) throws Exception {
        Lista<String> linhas = new Lista<>();
        boolean encontrou = false;

        try (BufferedReader ler = new BufferedReader(new FileReader(caminho))) {
            String linha;
            while ((linha = ler.readLine()) != null) {
                String[] dados = linha.split(separador);
                if (dados.length > 0) {
                    String cpfAtual = dados[0].trim();
                    // Se o CPF for igual, marcamos que encontrou e NÃO adicionamos na lista (removemos)
                    if (cpfAtual.equals(prof.getCpf())) {
                        encontrou = true;
                    } else {
                        adicionarNaLista(linhas, linha);
                    }
                }
            }
        } catch (IOException e) {
            throw new Exception("Erro ao ler o arquivo de professores: " + e.getMessage());
        }

        if (encontrou) {
            reescreverArquivo(linhas);
            return true;
        } else {
            return false;
        }
    }

    private void reescreverArquivo(Lista<String> lista)throws Exception{
        try (BufferedWriter escrever = new BufferedWriter(new FileWriter(caminho, false))) {
            int tamanho = lista.size();
            for (int i = 0; i < tamanho; i++) {
                String linha = lista.get(i);
                escrever.write(linha);
                escrever.newLine();
            }
        } catch (IOException e) {
            throw new Exception("Erro ao gravar no arquivo: " + e.getMessage());
        }
    }

    private void adicionarNaLista(Lista<String> lista, String conteudo)throws Exception{
        if (lista.isEmpty()) {
            lista.addFirst(conteudo);
        } else {
            lista.addLast(conteudo);
        }
    }

    public Lista<Professor> listarProfessores() throws Exception {
        Lista<Professor> listaProfessores = new Lista<>();
        try (BufferedReader ler = new BufferedReader(new FileReader(caminho))) {
            String linha;
            while ((linha = ler.readLine()) != null) {
                String[] dados = linha.split(separador);
                if (dados.length >= 4) {
                    Professor p = new Professor();
                    p.setCpf(dados[0].trim());
                    p.setNome(dados[1].trim());
                    p.setArea(dados[2].trim());
                    try {
                        p.setPonto(Float.parseFloat(dados[3].trim()));
                    } catch (NumberFormatException e) {
                        p.setPonto(0.0f);
                    }

                    if (listaProfessores.isEmpty()) {
                        listaProfessores.addFirst(p);
                    } else {
                        listaProfessores.addLast(p);
                    }
                }
            }
        } catch (IOException e) {
            throw new Exception("Erro ao ler lista: " + e.getMessage());
        }
        return listaProfessores;
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
    
    public Professor buscarPorCpf(String cpf) throws Exception {
    Lista<Professor> lista = listarProfessores();
    for (int i = 0; i < lista.size(); i++) {
        Professor p = lista.get(i);
        if (p.getCpf().equals(cpf)) {
            return p;
        }
    }
    return null;
}
}
