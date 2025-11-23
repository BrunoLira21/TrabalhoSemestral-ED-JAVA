
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
                    homePage.mostrarPainel("listaInscritos");
                }else if(source == btnConsultaGeral){
                    homePage.mostrarPainel("ConsultaGeral");
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
        ImageIcon iconeBD = new ImageIcon("src/uteis/Disciplina.png");
        Image ImagemBDRedimensionada = iconeBD.getImage().getScaledInstance(150, 100, Image.SCALE_SMOOTH);
        ImageIcon iconeBDRedimensionado = new ImageIcon(ImagemBDRedimensionada);
        btnDisciplina.setIcon(iconeBDRedimensionado);
        
        ImageIcon iconeBC = new ImageIcon("src/uteis/Curso.png");
        Image ImagemBCRedimensionada = iconeBC.getImage().getScaledInstance(150, 100, Image.SCALE_SMOOTH);
        ImageIcon iconeBCRedimensionado = new ImageIcon(ImagemBCRedimensionada);
        btnCurso.setIcon(iconeBCRedimensionado);
        
        ImageIcon iconeBI = new ImageIcon("src/uteis/Inscricoes.png");
        Image ImagemBIRedimensionada = iconeBI.getImage().getScaledInstance(150, 100, Image.SCALE_SMOOTH);
        ImageIcon iconeBIRedimensionado = new ImageIcon(ImagemBIRedimensionada);
        btnInscricao.setIcon(iconeBIRedimensionado);
        
        ImageIcon iconeBP = new ImageIcon("src/uteis/Professor.png");
        Image ImagemBPRedimensionada = iconeBP.getImage().getScaledInstance(150, 100, Image.SCALE_SMOOTH);
        ImageIcon iconeBPRedimensionado = new ImageIcon(ImagemBPRedimensionada);
        btnProfessor.setIcon(iconeBPRedimensionado);
        
        ImageIcon iconeBLI = new ImageIcon("src/uteis/ListaInscricoes.png");
        Image ImagemBLIRedimensionada = iconeBLI.getImage().getScaledInstance(150, 100, Image.SCALE_SMOOTH);
        ImageIcon iconeBLIRedimensionado = new ImageIcon(ImagemBLIRedimensionada);
        btnListaInscritos.setIcon(iconeBLIRedimensionado);
        
        ImageIcon iconeBCG = new ImageIcon("src/uteis/ConsultaGeral.png");
        Image ImagemBCGRedimensionada = iconeBCG.getImage().getScaledInstance(150, 90, Image.SCALE_SMOOTH);
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

        btnInscricao = new javax.swing.JToggleButton();
        btnCurso = new javax.swing.JToggleButton();
        btnDisciplina = new javax.swing.JToggleButton();
        btnProfessor = new javax.swing.JToggleButton();
        btnConsultaGeral = new javax.swing.JToggleButton();
        btnListaInscritos = new javax.swing.JToggleButton();
        pncabecalho = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        lbLogoFatec = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1000, 600));

        btnInscricao.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnInscricao.setForeground(new java.awt.Color(0, 128, 96));
        btnInscricao.setText("Cadastrar Inscrições");
        btnInscricao.setBorder(null);
        btnInscricao.setContentAreaFilled(false);
        btnInscricao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInscricao.setFocusable(false);
        btnInscricao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnInscricao.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnInscricao.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnCurso.setBackground(new java.awt.Color(0, 102, 102));
        btnCurso.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCurso.setForeground(new java.awt.Color(0, 128, 96));
        btnCurso.setText("Cadastrar Cursos");
        btnCurso.setBorder(null);
        btnCurso.setBorderPainted(false);
        btnCurso.setContentAreaFilled(false);
        btnCurso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCurso.setFocusable(false);
        btnCurso.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCurso.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnCurso.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnDisciplina.setBackground(new java.awt.Color(0, 102, 102));
        btnDisciplina.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDisciplina.setForeground(new java.awt.Color(0, 128, 96));
        btnDisciplina.setText("Cadastrar Disciplina");
        btnDisciplina.setBorder(null);
        btnDisciplina.setBorderPainted(false);
        btnDisciplina.setContentAreaFilled(false);
        btnDisciplina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDisciplina.setFocusable(false);
        btnDisciplina.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDisciplina.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnDisciplina.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnProfessor.setBackground(new java.awt.Color(0, 102, 102));
        btnProfessor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnProfessor.setForeground(new java.awt.Color(0, 128, 96));
        btnProfessor.setText("Cadastrar Professor");
        btnProfessor.setBorder(null);
        btnProfessor.setContentAreaFilled(false);
        btnProfessor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProfessor.setFocusable(false);
        btnProfessor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnProfessor.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnProfessor.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnConsultaGeral.setBackground(new java.awt.Color(0, 102, 102));
        btnConsultaGeral.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnConsultaGeral.setForeground(new java.awt.Color(0, 128, 96));
        btnConsultaGeral.setText("<html><center>Consulta<br>Disciplina por Curso<center><html>");
        btnConsultaGeral.setBorder(null);
        btnConsultaGeral.setBorderPainted(false);
        btnConsultaGeral.setContentAreaFilled(false);
        btnConsultaGeral.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsultaGeral.setFocusable(false);
        btnConsultaGeral.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnConsultaGeral.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnConsultaGeral.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnListaInscritos.setBackground(new java.awt.Color(0, 153, 153));
        btnListaInscritos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnListaInscritos.setForeground(new java.awt.Color(0, 128, 96));
        btnListaInscritos.setText("<html><center>Consulta<br> Lista de Inscritos");
        btnListaInscritos.setBorder(null);
        btnListaInscritos.setContentAreaFilled(false);
        btnListaInscritos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnListaInscritos.setFocusable(false);
        btnListaInscritos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnListaInscritos.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnListaInscritos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        pncabecalho.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout pncabecalhoLayout = new javax.swing.GroupLayout(pncabecalho);
        pncabecalho.setLayout(pncabecalhoLayout);
        pncabecalhoLayout.setHorizontalGroup(
            pncabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pncabecalhoLayout.setVerticalGroup(
            pncabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
        );

        lbTitulo.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(0, 128, 96));
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("SISTEMA AVANTE");
        lbTitulo.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pncabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(btnInscricao, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultaGeral, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(btnProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(btnDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnListaInscritos, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 747, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbLogoFatec, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pncabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbLogoFatec, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnProfessor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCurso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnInscricao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDisciplina, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(66, 66, 66)
                        .addComponent(btnListaInscritos, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnConsultaGeral, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(126, 126, 126))
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
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JPanel pncabecalho;
    // End of variables declaration//GEN-END:variables
}
