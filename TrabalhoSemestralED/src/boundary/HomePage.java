package boundary;
import javax.swing.border.*;
import controller.CursoController;
import entity.Curso;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import boundary.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class HomePage extends javax.swing.JFrame {
    public CardLayout cardLayout;
    private disciplinasPanel painelDisciplinas;
    inscricoesPanel painelInscricoes;
    private listaInscritosPanel painelInscritos;

    public HomePage() throws Exception {
        initComponents();
        painelDisciplinas = new disciplinasPanel(this);
        painelInscricoes = new inscricoesPanel(this);
        painelInscritos = new listaInscritosPanel(this);
        
        
        cardLayout = (CardLayout) jContentPane.getLayout();
        jContentPane.add(new consultasPanel(this), "Consultas");        
        jContentPane.add(painelDisciplinas, "Disciplinas");        
        jContentPane.add(painelInscricoes, "Inscrições");        
        jContentPane.add(new professoresPanel(this), "Professores"); 
        jContentPane.add(new cursosPanel(this), "Cursos");
        jContentPane.add(new consultaGeralPanel(this), "ConsultaGeral");
        jContentPane.add(painelInscritos, "listaInscritos");
    }     
    
    public void mostrarPainel(String nome){
    cardLayout.show(jContentPane, nome);
    
    if ("Disciplinas".equals(nome)) {
        try {
            painelDisciplinas.atualizarComboBoxCursos();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao atualizar cursos: " + ex.getMessage());
        }
    } else if ("Inscrições".equals(nome)) {
        try {
            painelInscricoes.atualizarComboBoxDisciplinas();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao atualizar cursos: " + ex.getMessage());
        }
    } else if ("listaInscritos".equals(nome)){
        try{    
        painelInscritos.atualizarComboBoxDisciplinas();
        } catch (Exception e){
        JOptionPane.showMessageDialog(this, "Erro ao carregar disciplinas: " + e.getMessage());
        }
    }

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jContentPane = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Avante");
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 600));

        jContentPane.setBackground(new java.awt.Color(255, 255, 255));
        jContentPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jContentPane.setLayout(new java.awt.CardLayout());
        getContentPane().add(jContentPane, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1014, 608));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jContentPane;
    // End of variables declaration//GEN-END:variables
}
