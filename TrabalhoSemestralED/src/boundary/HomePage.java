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

    public HomePage() throws Exception {
        initComponents();
        painelDisciplinas = new disciplinasPanel(this);

        cardLayout = (CardLayout) jContentPane.getLayout();
        jContentPane.add(new consultasPanel(this), "Consultas");        
        jContentPane.add(painelDisciplinas, "Disciplinas");        
        jContentPane.add(new inscricoesPanel(this), "Inscrições");        
        jContentPane.add(new professoresPanel(this), "Professores"); 
        jContentPane.add(new cursosPanel(this), "Cursos");
        jContentPane.add(new consultaGeralPanel(this), "ConsultaGeral");
        jContentPane.add(new listaInscritosPanel(this), "listaInscritos");
    }     
    
    public void mostrarPainel(String nome){
    cardLayout.show(jContentPane, nome);
    
    if ("Disciplinas".equals(nome)) {
        try {
            painelDisciplinas.atualizarComboBoxCursos();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao atualizar cursos: " + ex.getMessage());
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

  

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new HomePage().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jContentPane;
    // End of variables declaration//GEN-END:variables
}
