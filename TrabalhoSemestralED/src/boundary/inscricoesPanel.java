
package boundary;

import java.awt.Image;
import javax.swing.ImageIcon;


public class inscricoesPanel extends javax.swing.JPanel {
    private HomePage homePage;
    
    public inscricoesPanel() {
        initComponents();
        
        String caminho  = "src/uteis/logofatec.png";
        ImageIcon logofatec = new ImageIcon(caminho);
        Image ImagemLogoRedimensionada = logofatec.getImage().getScaledInstance(130, 50, Image.SCALE_SMOOTH);
        ImageIcon logofatecRedimensionado = new ImageIcon(ImagemLogoRedimensionada);
        lblIcone.setIcon(logofatecRedimensionado);
    }

    public inscricoesPanel(HomePage hp){
        this();
        this.homePage = hp;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inscricoesPanel = new javax.swing.JPanel();
        jLabelIns1 = new javax.swing.JLabel();
        jLabelIns2 = new javax.swing.JLabel();
        jLabelIns3 = new javax.swing.JLabel();
        lblIcone = new javax.swing.JLabel();
        cbxDisciplinaIns = new javax.swing.JComboBox<>();
        txtCodProcessoIns = new javax.swing.JTextField();
        btnInscreverIns = new javax.swing.JButton();
        btnRemoverIns = new javax.swing.JButton();
        btnVoltarCur = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaInscricoes = new javax.swing.JTable();
        txtCPFProfessorIns = new javax.swing.JTextField();

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(1000, 600));

        inscricoesPanel.setBackground(new java.awt.Color(255, 255, 255));
        inscricoesPanel.setPreferredSize(new java.awt.Dimension(1000, 600));

        jLabelIns1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelIns1.setText("CPF do Professor");

        jLabelIns2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelIns2.setText("Código da Disciplina");

        jLabelIns3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelIns3.setText("Código do Processo");

        cbxDisciplinaIns.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtCodProcessoIns.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCodProcessoIns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodProcessoInsActionPerformed(evt);
            }
        });

        btnInscreverIns.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnInscreverIns.setForeground(new java.awt.Color(0, 153, 0));
        btnInscreverIns.setText("Inscrever");
        btnInscreverIns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInscreverInsActionPerformed(evt);
            }
        });

        btnRemoverIns.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRemoverIns.setForeground(new java.awt.Color(255, 51, 51));
        btnRemoverIns.setText("Remover");
        btnRemoverIns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverInsActionPerformed(evt);
            }
        });

        btnVoltarCur.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnVoltarCur.setForeground(new java.awt.Color(0, 51, 255));
        btnVoltarCur.setText("Voltar");
        btnVoltarCur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarCurActionPerformed(evt);
            }
        });

        tabelaInscricoes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CPF do Professor", "Código da Disciplina", "Código do Processo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaInscricoes.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabelaInscricoes);
        if (tabelaInscricoes.getColumnModel().getColumnCount() > 0) {
            tabelaInscricoes.getColumnModel().getColumn(0).setResizable(false);
            tabelaInscricoes.getColumnModel().getColumn(1).setResizable(false);
            tabelaInscricoes.getColumnModel().getColumn(2).setResizable(false);
        }

        txtCPFProfessorIns.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCPFProfessorIns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPFProfessorInsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout inscricoesPanelLayout = new javax.swing.GroupLayout(inscricoesPanel);
        inscricoesPanel.setLayout(inscricoesPanelLayout);
        inscricoesPanelLayout.setHorizontalGroup(
            inscricoesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inscricoesPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(inscricoesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inscricoesPanelLayout.createSequentialGroup()
                        .addGroup(inscricoesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelIns1, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                            .addComponent(txtCPFProfessorIns))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(inscricoesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbxDisciplinaIns, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelIns2, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(inscricoesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodProcessoIns, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelIns3))
                        .addGap(75, 75, 75)
                        .addComponent(lblIcone, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68))
                    .addGroup(inscricoesPanelLayout.createSequentialGroup()
                        .addGroup(inscricoesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(inscricoesPanelLayout.createSequentialGroup()
                                .addComponent(btnInscreverIns)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRemoverIns)
                                .addGap(158, 158, 158)
                                .addComponent(btnVoltarCur))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 751, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(217, Short.MAX_VALUE))))
        );
        inscricoesPanelLayout.setVerticalGroup(
            inscricoesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inscricoesPanelLayout.createSequentialGroup()
                .addGroup(inscricoesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inscricoesPanelLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(inscricoesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(inscricoesPanelLayout.createSequentialGroup()
                                .addGroup(inscricoesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelIns1)
                                    .addComponent(jLabelIns2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(inscricoesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbxDisciplinaIns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCPFProfessorIns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(inscricoesPanelLayout.createSequentialGroup()
                                .addComponent(jLabelIns3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCodProcessoIns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(inscricoesPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblIcone, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(inscricoesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRemoverIns)
                    .addComponent(btnInscreverIns)
                    .addComponent(btnVoltarCur))
                .addGap(389, 389, 389))
        );

        txtCPFProfessorIns.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inscricoesPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inscricoesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRemoverInsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverInsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRemoverInsActionPerformed

    private void txtCodProcessoInsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodProcessoInsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodProcessoInsActionPerformed

    private void btnInscreverInsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInscreverInsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInscreverInsActionPerformed

    private void btnVoltarCurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarCurActionPerformed
        homePage.mostrarPainel("Consultas");
    }//GEN-LAST:event_btnVoltarCurActionPerformed

    private void txtCPFProfessorInsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPFProfessorInsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCPFProfessorInsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInscreverIns;
    private javax.swing.JButton btnRemoverIns;
    private javax.swing.JButton btnVoltarCur;
    private javax.swing.JComboBox<String> cbxDisciplinaIns;
    private javax.swing.JPanel inscricoesPanel;
    private javax.swing.JLabel jLabelIns1;
    private javax.swing.JLabel jLabelIns2;
    private javax.swing.JLabel jLabelIns3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblIcone;
    private javax.swing.JTable tabelaInscricoes;
    private javax.swing.JTextField txtCPFProfessorIns;
    private javax.swing.JTextField txtCodProcessoIns;
    // End of variables declaration//GEN-END:variables
}
