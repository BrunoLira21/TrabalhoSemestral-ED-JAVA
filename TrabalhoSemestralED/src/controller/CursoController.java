package controller;

import entity.Curso;
import br.edu.fateczl.Lista;
import javax.swing.*;
import java.io.*;

public class CursoController {

    Curso curso = new Curso();

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

    public boolean removerCurso(Curso cursoParaRemover) throws Exception {

        // Lista de linhas que vão ficar...
        Lista<String> linhas= new Lista<>();
        boolean encontrou = false;

        // Ler os arquivos e guardar oq não vai ser removido
        try(BufferedReader ler = new BufferedReader(new FileReader(caminho))) {
            String linha;
            while ((linha = ler.readLine()) != null) {
                String[] dados = linha.split(separador);
                if (dados.length > 0) {
                    try {
                        int codigoAtual = Integer.parseInt(dados[0].trim());
                        if(codigoAtual == cursoParaRemover.getCodigoCurso()){
                            encontrou = true;
                        }else{
                            adicionarNaLista(linhas, linha);
                        }
                    }catch(NumberFormatException e){
                        adicionarNaLista(linhas, linha);
                    }
                }
            }
        }catch(IOException e){
            throw new Exception("Erro ao ler o banco de dados: "+e.getMessage());
        }
        // Com o curso na mão, vamo escrever no arquivo
        if(encontrou){
            reescreverArquivo(linhas);
            return true;
        }else{
            return false; // nunca vai acontecer, mas vai que né
        }
    }

    private void reescreverArquivo(Lista<String> lista)throws Exception{
        try (BufferedWriter escrever = new BufferedWriter(new FileWriter(caminho, false))) {
            int tamanho = lista.size();

            // escrevendo... escrevendo...
            for (int i = 0; i < tamanho; i++) {
                String linha = lista.get(i);
                escrever.write(linha);
                escrever.newLine();
            }
        }catch (IOException e){
            throw new Exception("Erro ao gravar no arquivo: " + e.getMessage());
        }
    }

    private void adicionarNaLista(Lista<String> lista, String conteudo)throws Exception{
        if(lista.isEmpty()){
            lista.addFirst(conteudo);
        }else{
            lista.addLast(conteudo);
        }
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
