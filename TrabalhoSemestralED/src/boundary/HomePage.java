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


public class HomePage extends javax.swing.JFrame {
    public CardLayout cardLayout;

    public HomePage() {
        initComponents();

        cardLayout = (CardLayout) jContentPane.getLayout();
        jContentPane.add(new consultasPanel(this), "Consultas");        
        jContentPane.add(new disciplinasPanel(this), "Disciplinas");        
        jContentPane.add(new inscricoesPanel(this), "Inscrições");        
        jContentPane.add(new professoresPanel(this), "Professores"); 
        jContentPane.add(new cursosPanel(this), "Cursos");
    }     
    
    public void mostrarPainel(String nome){
        cardLayout = (CardLayout) jContentPane.getLayout();
        cardLayout.show(jContentPane, nome);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jContentPane = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

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
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jContentPane;
    // End of variables declaration//GEN-END:variables
}
