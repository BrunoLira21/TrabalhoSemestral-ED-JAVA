package Controller;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;
import java.util.ArrayList;
import br.edu.fateczl.Lista;
import br.edu.fateczl.fila.Fila;
import br.edu.fateczl.pilha.Pilha;

import java.io.IOException;
public class GerenciadorCentral {
    String separador = ";";
    
    public boolean validarLogin(String usuario, String senha){
        String arquivo = "Arquivos/usuarios.csv";
        
        try(BufferedReader ler = new BufferedReader(new FileReader(arquivo))){
            String linha;
            while ((linha = ler.readLine()) != null){
                String[] colunas = linha.split(separador);
                
                if(colunas.length == 2){
                    String usuarioCheck = colunas[0].replace("\uFEFF", "").trim();
                    String senhaCheck = colunas[1].trim();
                    
                    if (usuarioCheck.equals(usuario) && senhaCheck.equals(senha)){
                        return true;
                
                    }
                }
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
        
        return false;
        
    }
    
    
    public void adicionarUsuario(String usuario, String senha){
    try(BufferedWriter escrever = new BufferedWriter(new FileWriter("Arquivos/usuarios.csv", true)))
    {
        
        escrever.write("usuario, senha");
        escrever.newLine();
        
    } catch (IOException e) {
        e.printStackTrace();
    
    }
    
    }
}
