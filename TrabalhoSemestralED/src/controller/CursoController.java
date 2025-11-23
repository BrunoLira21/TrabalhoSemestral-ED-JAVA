package controller;

import boundary.disciplinasPanel;
import entity.Curso;
import br.edu.fateczl.Lista;
import javax.swing.*;
import java.io.*;
import javax.swing.table.DefaultTableModel;
import br.edu.fateczl.fila.Fila;

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
    
    public Lista<String> buscarCodigosCursos(){
        Lista<String> CodigosCursos = new Lista<>();
        try(BufferedReader ler= new BufferedReader(new FileReader(caminho))){
            String linha;
            while((linha = ler.readLine()) != null){
            String[] colunas = linha.split(separador);
            String codigo = colunas[0].trim() + " - " + colunas[1].trim();
            if(CodigosCursos.isEmpty()){
                CodigosCursos.addFirst(codigo);
            } else {
                CodigosCursos.addLast(codigo);
            }
        }
            return CodigosCursos;
    } catch(Exception e){
        e.printStackTrace();
        return new Lista<>();   
      }
    }
    public void preencherTabela(DefaultTableModel modelo) {
        modelo.setRowCount(0);
        Fila<Curso> fila = new Fila<>();

        try (BufferedReader ler = new BufferedReader(new FileReader(caminho))) {
            String linha;
            while ((linha = ler.readLine()) != null) {
                String[] dados = linha.split(separador);
                if (dados.length >= 3) {
                    Curso c = new Curso(
                       
                        Integer.parseInt(dados[0].trim()), 
                        dados[1].trim(),
                        dados[2].trim()
                    );
                    fila.insert(c); 
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            while (!fila.isEmpty()) {
                Curso c = (Curso) fila.remove(); 
                modelo.addRow(new Object[]{
                    c.getCodigoCurso(),
                    c.getNomeCurso(),
                    c.getAreaConhecimento()
                });
            }
        } catch (Exception e) {
            System.err.println("Erro na fila: " + e.getMessage());
        }
    }
    
   public String buscarNomesCursos(int codigoCurso){
        try(BufferedReader ler = new BufferedReader(new FileReader(caminho))){
            String linha;
            while((linha = ler.readLine()) != null){
                String[] colunas = linha.split(separador);
                if (colunas[0].trim().equals(codigoCurso)) {
                    String nome = colunas[1].trim();
                    return nome;
                }
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        return "";
    }
 
    
    
}
