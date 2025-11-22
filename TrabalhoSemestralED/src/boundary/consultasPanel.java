
package boundary;

import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JToggleButton;


public class consultasPanel extends javax.swing.JPanel {
    private HomePage homePage;

    public consultasPanel() {
        initComponents();
        
        String caminho  = "src/uteis/logofatec.png";
        ImageIcon logofatec = new ImageIcon(caminho);
        Image ImagemLogoRedimensionada = logofatec.getImage().getScaledInstance(130, 50, Image.SCALE_SMOOTH);
        ImageIcon logofatecRedimensionado = new ImageIcon(ImagemLogoRedimensionada);
        lbLogoFatec.setIcon(logofatecRedimensionado);
        
        //clicks do Mouse
        MouseAdapter menuListener = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JToggleButton source = (JToggleButton) e.getSource(); 
                if (source == btnCurso) {
                    homePage.mostrarPainel("Cursos");
                } else if (source == btnProfessor) {
                    homePage.mostrarPainel("Professores");
                } else if(source == btnDisciplina){
                    homePage.mostrarPainel("Disciplinas");
                } else if(source == btnInscricao){
                    homePage.mostrarPainel("Inscrições");
                }else if(source == btnListaInscritos){
                    homePage.mostrarPainel("Inscrições");
                }else if(source == btnConsultaGeral){
                    homePage.mostrarPainel("Inscrições");
                } 
            }

        };
        
        
        btnCurso.addMouseListener(menuListener);
        btnProfessor.addMouseListener(menuListener);
        btnDisciplina.addMouseListener(menuListener);
        btnInscricao.addMouseListener(menuListener);
        btnListaInscritos.addMouseListener(menuListener);
        btnConsultaGeral.addMouseListener(menuListener);
        //--------------------------------------------------------------------------------------
        
        //Icones Botoes
        ImageIcon iconeBD = new ImageIcon("src/uteis/Disciplinas.jpeg");
        Image ImagemBDRedimensionada = iconeBD.getImage().getScaledInstance(150, 120, Image.SCALE_SMOOTH);
        ImageIcon iconeBDRedimensionado = new ImageIcon(ImagemBDRedimensionada);
        btnDisciplina.setIcon(iconeBDRedimensionado);
        
        ImageIcon iconeBC = new ImageIcon("src/uteis/Cursos.png");
        Image ImagemBCRedimensionada = iconeBC.getImage().getScaledInstance(150, 120, Image.SCALE_SMOOTH);
        ImageIcon iconeBCRedimensionado = new ImageIcon(ImagemBCRedimensionada);
        btnCurso.setIcon(iconeBCRedimensionado);
        
        ImageIcon iconeBI = new ImageIcon("src/uteis/Inscricoes.jpeg");
        Image ImagemBIRedimensionada = iconeBI.getImage().getScaledInstance(150, 120, Image.SCALE_SMOOTH);
        ImageIcon iconeBIRedimensionado = new ImageIcon(ImagemBIRedimensionada);
        btnInscricao.setIcon(iconeBIRedimensionado);
        
        ImageIcon iconeBP = new ImageIcon("src/uteis/Professor.jpeg");
        Image ImagemBPRedimensionada = iconeBP.getImage().getScaledInstance(150, 120, Image.SCALE_SMOOTH);
        ImageIcon iconeBPRedimensionado = new ImageIcon(ImagemBPRedimensionada);
        btnProfessor.setIcon(iconeBPRedimensionado);
        
        ImageIcon iconeBLI = new ImageIcon("src/uteis/ListaInscritos.png");
        Image ImagemBLIRedimensionada = iconeBLI.getImage().getScaledInstance(150, 120, Image.SCALE_SMOOTH);
        ImageIcon iconeBLIRedimensionado = new ImageIcon(ImagemBLIRedimensionada);
        btnListaInscritos.setIcon(iconeBLIRedimensionado);
        
        ImageIcon iconeBCG = new ImageIcon("src/uteis/ConsultaGeral.png");
        Image ImagemBCGRedimensionada = iconeBCG.getImage().getScaledInstance(150, 120, Image.SCALE_SMOOTH);
        ImageIcon iconeBCGRedimensionado = new ImageIcon(ImagemBCGRedimensionada);
        btnConsultaGeral.setIcon(iconeBCGRedimensionado);
        
    }
    public consultasPanel(HomePage hp){
        this();
        this.homePage = hp;
    }
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCurso = new javax.swing.JToggleButton();
        btnDisciplina = new javax.swing.JToggleButton();
        btnProfessor = new javax.swing.JToggleButton();
        btnInscricao = new javax.swing.JToggleButton();
        lbLogoFatec = new javax.swing.JLabel();
        btnListaInscritos = new javax.swing.JToggleButton();
        btnConsultaGeral = new javax.swing.JToggleButton();

        setBackground(new java.awt.Color(255, 255, 255));

        btnCurso.setBackground(new java.awt.Color(0, 102, 102));
        btnCurso.setBorder(null);
        btnCurso.setBorderPainted(false);
        btnCurso.setContentAreaFilled(false);
        btnCurso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCurso.setFocusable(false);

        btnDisciplina.setBackground(new java.awt.Color(0, 102, 102));
        btnDisciplina.setBorder(null);
        btnDisciplina.setBorderPainted(false);
        btnDisciplina.setContentAreaFilled(false);
        btnDisciplina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDisciplina.setFocusable(false);

        btnProfessor.setBackground(new java.awt.Color(0, 102, 102));
        btnProfessor.setBorder(null);
        btnProfessor.setContentAreaFilled(false);
        btnProfessor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProfessor.setFocusable(false);

        btnInscricao.setBackground(new java.awt.Color(0, 102, 102));
        btnInscricao.setBorder(null);
        btnInscricao.setContentAreaFilled(false);
        btnInscricao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInscricao.setFocusable(false);

        btnListaInscritos.setBackground(new java.awt.Color(0, 153, 153));
        btnListaInscritos.setBorder(null);
        btnListaInscritos.setContentAreaFilled(false);
        btnListaInscritos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnListaInscritos.setFocusable(false);

        btnConsultaGeral.setBackground(new java.awt.Color(0, 102, 102));
        btnConsultaGeral.setBorder(null);
        btnConsultaGeral.setBorderPainted(false);
        btnConsultaGeral.setContentAreaFilled(false);
        btnConsultaGeral.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsultaGeral.setFocusable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbLogoFatec, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
            .addGroup(layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnInscricao, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnConsultaGeral, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnListaInscritos, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(231, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lbLogoFatec, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnInscricao, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnConsultaGeral, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnListaInscritos, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(608, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnConsultaGeral;
    private javax.swing.JToggleButton btnCurso;
    private javax.swing.JToggleButton btnDisciplina;
    private javax.swing.JToggleButton btnInscricao;
    private javax.swing.JToggleButton btnListaInscritos;
    private javax.swing.JToggleButton btnProfessor;
    private javax.swing.JLabel lbLogoFatec;
    // End of variables declaration//GEN-END:variables
}
