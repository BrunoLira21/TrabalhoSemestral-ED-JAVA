package controller;
import entity.Disciplina;
import javax.swing.*;
import java.io.*;
import br.edu.fateczl.Lista;

public class DisciplinaController {

    private final String caminho = "Arquivos/disciplinas.csv";
    private final String separador = ";";
    private final int tamanho = 23;
    Lista<Disciplina>[] tabelaHashDisciplinas;

    public DisciplinaController() throws Exception {
        //int tamanho = archiveSize();
        tabelaHashDisciplinas = new Lista[tamanho];
        inicializarTabelaHash();
        carregarHash();
    }

    public void inicializarTabelaHash() {
        for (int i = 0; i < tabelaHashDisciplinas.length; i++) {
            tabelaHashDisciplinas[i] = new Lista<>();
        }
    }

    //Carrega todas as disciplinas do arquivo para a hash
    public void carregarHash() throws Exception {
        try (BufferedReader ler = new BufferedReader(new FileReader("Arquivos/disciplinas.csv"))) {
            String linha;
            while ((linha = ler.readLine()) != null) {
                String[] colunas =  linha.split(separador);
                // precisa verificar o status usando .equals(true) para disciplinas em aberto, depois realizar o hash code
                if (colunas.length >= 6) {
                    String status = colunas[6].trim();
                    Disciplina d = new Disciplina(
                            Integer.parseInt(colunas[0].trim()),
                            colunas[1].trim(),
                            colunas[2].trim(),
                            colunas[3].trim(),
                            Integer.parseInt(colunas[4].trim()),
                            Integer.parseInt(colunas[5].trim()),
                            Boolean.parseBoolean(colunas[6].trim())
                    );

//                    if (d.isStatus()) {
                    inserirNaHash(d);
//                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void inserirNaHash(Disciplina disciplina) throws Exception {
        int codigo =  disciplina.getCodigoCurso();
        int posicao = codigoHash(codigo);
        tabelaHashDisciplinas[posicao].addFirst(disciplina);
    }

    // Gera um número de posição a partir do código do curso da disciplina
    public int codigoHash (int codigo) {
        double a = ((codigo * (Math.sqrt(5) - 1) / 2) % 1);
        int posicao = (int) (tamanho * a);
        return posicao;
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
//                       + separador + disciplina.isStatus();
                escrever.write(linha);
                escrever.newLine();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Disciplina '" + disciplina.getNomeDisciplina() + "' já cadastrada!",
                    "Cadastro da Disciplina", JOptionPane.INFORMATION_MESSAGE);
        }
//        if (disciplina.isStatus()) {
        inserirNaHash(disciplina);
//        }
    }

    public boolean removerDisciplina(Disciplina disciplinaParaRemover) throws Exception {
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
                        if(codigoAtual == disciplinaParaRemover.getCodigoDisciplina()){
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
            removerDaHash(disciplinaParaRemover.getCodigoDisciplina());
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

    public void removerDaHash(int codigoDisciplina) throws Exception {
        for (int i = 0; i < tamanho; i++) {
            Lista<Disciplina> lista = tabelaHashDisciplinas[i];

            int qtd = lista.size();

            for (int j = 0; j < qtd; j++) {
                Disciplina d = lista.get(j);

                if (d.getCodigoDisciplina() == codigoDisciplina) {
                    lista.remove(j);
                    return;
                }
            }
        }
    }

//    public int archiveSize() {
//        String linha;
//        int ctd = 0;
//        try (BufferedReader ler = new BufferedReader(new FileReader("Arquivos/disciplinas.csv"))) {
//            // conta a quantidade de linhas
//            while ((linha = ler.readLine()) != null) {
//                ctd++;
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return ctd;
//    }


//    public void atualizarDisciplina(Disciplina disciplina) throws Exception {
//        File arquivo = new File(caminho);
//        File arquivoTemp = new File("Arquivos/disciplinas_temp.csv");
//
//        try (
//                BufferedReader ler = new BufferedReader(new FileReader(arquivo));
//                BufferedWriter escrever = new BufferedWriter(new FileWriter(arquivoTemp))
//        ) {
//            String linha;
//
//            while ((linha = ler.readLine()) != null) {
//                String[] colunas = linha.split(separador);
//
//                if (Integer.parseInt(colunas[0]) == disciplina.getCodigoDisciplina()) {
//
//                    // Substitui pela nova linha atualizada
//                    String novaLinha = disciplina.getCodigoDisciplina() + separador +
//                            disciplina.getNomeDisciplina() + separador +
//                            disciplina.getDiaSemana() + separador +
//                            disciplina.getHorarioInicial() + separador +
//                            disciplina.getQuantidadeHoras() + separador +
//                            disciplina.getCodigoCurso() + separador +
//                            disciplina.isStatus();
//
//                    escrever.write(novaLinha);
//                    escrever.newLine();
//
//                } else {
//                    // COPIA LINHA SEM ALTERAÇÃO
//                    escrever.write(linha);
//                    escrever.newLine();
//                }
//            }
//        }
//    }

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
    
    public Lista<String> buscarCodigosDisciplinas(){
        Lista<String> CodigosDisciplinas = new Lista<>();
        try(BufferedReader ler= new BufferedReader(new FileReader(caminho))){
            String linha;
            while((linha = ler.readLine()) != null){
            String[] colunas = linha.split(separador);
            String codigo = colunas[0].trim() + " - " + colunas[1].trim();
            if(CodigosDisciplinas.isEmpty()){
                CodigosDisciplinas.addFirst(codigo);
            } else {
                CodigosDisciplinas.addLast(codigo);
            }
        }
            return CodigosDisciplinas;
    } catch(Exception e){
        e.printStackTrace();
        return new Lista<>();   
    }
   } 
}