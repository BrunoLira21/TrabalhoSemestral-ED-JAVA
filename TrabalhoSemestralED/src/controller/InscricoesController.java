
package controller;

import entity.Inscrições;
import entity.Curso;
import entity.Disciplina;
import br.edu.fateczl.Lista;
import javax.swing.*;
import java.io.*;


public class InscricoesController {

    private final String caminho = "Arquivos/inscricoes.csv";
    private final String caminhoDisciplina = "Arquivos/disciplinas.csv";
    private final String caminhoProfessor = "Arquivos/professor.csv";
    private final String separador = ";";

    public boolean adicionarInscricao(Inscrições inscricao) throws Exception {
        // vamo ver se o professor existe memo...
        if (!existeProfessor(inscricao.getCpf())){
            JOptionPane.showMessageDialog(null, "Professor com CPF " + inscricao.getCpf() + " não encontrado.",
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        // ver se o doidao nao ta tentando fazer a mesma inscrição dnv (mesmo professor na mesma disciplina)
        if(existeInscricao(inscricao.getCpf(), inscricao.getCodigoDisciplina())){
            JOptionPane.showMessageDialog(null, "Este professor já está inscrito nesta disciplina.",
                    "Erro", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        // escrever no arquivo
        try(BufferedWriter escrever = new BufferedWriter(new FileWriter(caminho, true))){
            String linha = inscricao.getCpf() + separador +
                    inscricao.getCodigoDisciplina() + separador +
                    inscricao.getCodigoProcesso();
            escrever.write(linha);
            escrever.newLine();
            return true;
        }catch(IOException e){
            throw new Exception("Erro ao gravar inscrição: " + e.getMessage());
        }
    }

    private boolean existeProfessor(String cpf) throws Exception {
        try (BufferedReader ler = new BufferedReader(new FileReader(caminhoProfessor))) {
            String linha;
            while ((linha = ler.readLine()) != null) {
                String[] dados = linha.split(separador);
                if (dados.length > 0) {
                    if (dados[0].trim().equals(cpf)) return true;
                }
            }
        }
        return false;
    }

    private boolean existeInscricao(String cpf, int codDisciplina)throws Exception{
        try (BufferedReader ler = new BufferedReader(new FileReader(caminho))) {
            String linha;
            while ((linha = ler.readLine()) != null) {
                String[] dados = linha.split(separador);
                if (dados.length >= 2) {
                    if (dados[0].trim().equals(cpf) && Integer.parseInt(dados[1].trim()) == codDisciplina) {
                        return true;
                    }
                }
            }
        } catch (FileNotFoundException e){return false;}
        return false;
    }

    public boolean removerInscricao(String cpf, int codDisciplina)throws Exception{
        Lista<String> linhas = new Lista<>();
        boolean encontrou = false;

        // ler e filtrar TUdoooo
        try (BufferedReader ler = new BufferedReader(new FileReader(caminho))) {
            String linha;
            while ((linha = ler.readLine()) != null) {
                String[] dados = linha.split(separador);
                if (dados.length >= 3) {
                    String cpfAtual = dados[0].trim();
                    int codDiscAtual = Integer.parseInt(dados[1].trim());
                // se cpf e disciplina forem iguais, não adiciona na lista (remove)
                    if (cpfAtual.equals(cpf) && codDiscAtual == codDisciplina) {
                        encontrou = true;
                    } else {
                        linhas.addLast(linha);
                    }
                }
            }
        } catch (FileNotFoundException e){
            return false;
        }

        if(encontrou){
            reescreverArquivo(linhas);
            return true;
        }
        return false;
    }

    private void reescreverArquivo(Lista<String> lista)throws IOException, Exception{
        try (BufferedWriter escrever = new BufferedWriter(new FileWriter(caminho, false))) {
            int tamanho = lista.size();
            for (int i = 0; i < tamanho; i++) {
                escrever.write(lista.get(i));
                escrever.newLine();
            }
        }
    }

    public Lista<Inscrições> listarInscricoes() throws Exception {
        Lista<Inscrições> lista = new Lista<>();
        try (BufferedReader ler = new BufferedReader(new FileReader(caminho))) {
            String linha;
            while ((linha = ler.readLine()) != null) {
                String[] dados = linha.split(separador);
                if (dados.length >= 3) {
                    Inscrições i = new Inscrições();
                    i.setCpf(dados[0].trim());
                    i.setCodigoDisciplina(Integer.parseInt(dados[1].trim()));
                    i.setCodigoProcesso(Integer.parseInt(dados[2].trim()));

                    if (lista.isEmpty()) lista.addFirst(i);
                    else lista.addLast(i);
                }
            }
        } catch (FileNotFoundException e) {
            // nunca vai acontecer ...
        }
        return lista;
    }

    // o disciplina controller vai chamar aqui pra excluir o que estiver relacionado
    public void excluirPorDisciplina(int codigoDisciplina)throws Exception{
        Lista<String> linhasMantidas = new Lista<>();
        boolean alterou = false;

        try (BufferedReader ler = new BufferedReader(new FileReader(caminho))) {
            String linha;
            while ((linha = ler.readLine()) != null) {
                String[] dados = linha.split(separador);
                if (dados.length >= 2) {
                    int codDiscAtual = Integer.parseInt(dados[1].trim());

                    // Se for a disciplina que está sendo excluida, IGNORA (remove)
                    if (codDiscAtual == codigoDisciplina) {
                        alterou = true;
                    } else {
                        if(linhasMantidas.isEmpty()) linhasMantidas.addFirst(linha);
                        else linhasMantidas.addLast(linha);
                    }
                }
            }
        }

        if(alterou){
            reescreverArquivo(linhasMantidas);
        }
    }

    public int buscarProcessoDaDisciplina(int codigoDisciplinaAlvo) {
        try (BufferedReader ler = new BufferedReader(new FileReader(caminhoDisciplina))) {
            String linha;
            while ((linha = ler.readLine()) != null) {
                String[] dados = linha.split(separador);
                // Formato Disciplina: cod;nome;dia;hora;qtd;codCurso;codProcesso
                if (dados.length >= 7) {
                    int codDisc = Integer.parseInt(dados[0].trim());
                    if (codDisc == codigoDisciplinaAlvo) {
                        // Retorna o Codigo do Processo (Coluna 7, indice 6)
                        return Integer.parseInt(dados[6].trim());
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1; // Não achou
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
