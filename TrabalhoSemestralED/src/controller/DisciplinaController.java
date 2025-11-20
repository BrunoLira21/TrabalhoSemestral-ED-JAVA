package controller;
import entity.Disciplina;
import br.edu.fateczl.fila.Fila;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class DisciplinaController {
    public void adicionarDisciplina(Disciplina disciplina) throws Exception {

        String caminho = "Arquivos/disciplinas.csv";
        try (BufferedWriter escrever = new BufferedWriter(new FileWriter(caminho, true))) {
            String sep = ";";
            String linha = disciplina.getCodigoDisciplina() + sep +
                            disciplina.getNomeDisciplina() + sep +
                            disciplina.getDiaSemana() + sep +
                            disciplina.getHorarioInicial() + sep +
                            disciplina.getQuantidadeHoras() + sep +
                            disciplina.getCodigoCurso();

            escrever.write(linha);
            escrever.newLine();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public void removerDisciplina(){

    }
}
