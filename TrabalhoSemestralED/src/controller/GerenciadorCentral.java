package controller;
import boundary.TelaCadastro;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
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
        
        String linha = usuario + separador + senha;
        
        escrever.write(linha);
        escrever.newLine();
        
    } catch (IOException e) {
        e.printStackTrace();
    
    }
    
    }
    
    public boolean validarCadastro(JFrame tp, String usuario, String senha1, String senha2){

        if (usuario == null|| usuario.trim().isEmpty()||
            senha1 == null|| senha1.trim().isEmpty()||
            senha2 == null|| senha2.trim().isEmpty()){
        JOptionPane.showMessageDialog(tp, "Usuario e/ou senha não podem estar vazios",
                                        "Erro no Cadastro", JOptionPane.ERROR_MESSAGE);
        return false;
        }
        
        if (!senha1.equals(senha2)){
            JOptionPane.showMessageDialog(tp, "As senhas inseridas não são iguais", "Erro no Cadastro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        adicionarUsuario(usuario, senha1);
        JOptionPane.showMessageDialog(null, "Usuário criado com sucesso", "Criação de Usuário", JOptionPane.INFORMATION_MESSAGE);
        return true;
    }
    
    
}
