
package boundary;

import java.awt.Image;
import javax.swing.ImageIcon;


public class professoresPanel extends javax.swing.JPanel {
    private HomePage homePage;
    
    public professoresPanel() {
        initComponents();
        
        String caminho  = "src/uteis/logofatec.png";
        ImageIcon logofatec = new ImageIcon(caminho);
        Image ImagemLogoRedimensionada = logofatec.getImage().getScaledInstance(130, 50, Image.SCALE_SMOOTH);
        ImageIcon logofatecRedimensionado = new ImageIcon(ImagemLogoRedimensionada);
        lblIcone2.setIcon(logofatecRedimensionado);
    }

    public professoresPanel(HomePage hp){
        this();
        this.homePage = hp;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        professoresPanel = new javax.swing.JPanel();
        jLabelPro1 = new javax.swing.JLabel();
        jLabelPro2 = new javax.swing.JLabel();
        jLabelPro3 = new javax.swing.JLabel();
        jLabelPro4 = new javax.swing.JLabel();
        txtCPF = new javax.swing.JTextField();
        txtNomeProfessor = new javax.swing.JTextField();
        txtAreaProfessor = new javax.swing.JTextField();
        txtPontuacao = new javax.swing.JTextField();
        btnRemoverPro = new javax.swing.JButton();
        btnAdicionarPro = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaProfessores = new javax.swing.JTable();
        btnVoltarCur = new javax.swing.JButton();
        lblIcone2 = new javax.swing.JLabel();

        professoresPanel.setBackground(new java.awt.Color(255, 255, 255));
        professoresPanel.setPreferredSize(new java.awt.Dimension(1000, 600));

        jLabelPro1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelPro1.setText("CPF");

        jLabelPro2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelPro2.setText("Nome");

        jLabelPro3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelPro3.setText("Área de Interesse");

        jLabelPro4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelPro4.setText("Pontuação");

        txtCPF.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCPF.setToolTipText("");
        txtCPF.setCaretColor(new java.awt.Color(255, 255, 255));
        txtCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPFActionPerformed(evt);
            }
        });

        txtNomeProfessor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNomeProfessor.setMargin(new java.awt.Insets(0, 0, 0, 0));
        txtNomeProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeProfessorActionPerformed(evt);
            }
        });

        txtAreaProfessor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtAreaProfessor.setAutoscrolls(false);
        txtAreaProfessor.setMargin(new java.awt.Insets(0, 0, 0, 0));
        txtAreaProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAreaProfessorActionPerformed(evt);
            }
        });

        txtPontuacao.setMinimumSize(new java.awt.Dimension(64, 21));
        txtPontuacao.setPreferredSize(new java.awt.Dimension(64, 21));
        txtPontuacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPontuacaoActionPerformed(evt);
            }
        });

        btnRemoverPro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRemoverPro.setForeground(new java.awt.Color(255, 51, 51));
        btnRemoverPro.setText("Remover");
        btnRemoverPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverProActionPerformed(evt);
            }
        });

        btnAdicionarPro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAdicionarPro.setForeground(new java.awt.Color(0, 153, 0));
        btnAdicionarPro.setText("Adicionar");
        btnAdicionarPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarProActionPerformed(evt);
            }
        });

        tabelaProfessores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CPF do Professor", "Nome do Professor", "Área de Interesse", "Pontuação"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaProfessores.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tabelaProfessores);
        if (tabelaProfessores.getColumnModel().getColumnCount() > 0) {
            tabelaProfessores.getColumnModel().getColumn(0).setResizable(false);
            tabelaProfessores.getColumnModel().getColumn(1).setResizable(false);
            tabelaProfessores.getColumnModel().getColumn(2).setResizable(false);
            tabelaProfessores.getColumnModel().getColumn(3).setResizable(false);
        }

        btnVoltarCur.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnVoltarCur.setForeground(new java.awt.Color(0, 51, 255));
        btnVoltarCur.setText("Voltar");
        btnVoltarCur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarCurActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout professoresPanelLayout = new javax.swing.GroupLayout(professoresPanel);
        professoresPanel.setLayout(professoresPanelLayout);
        professoresPanelLayout.setHorizontalGroup(
            professoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(professoresPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(professoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(professoresPanelLayout.createSequentialGroup()
                        .addGroup(professoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, professoresPanelLayout.createSequentialGroup()
                                .addComponent(btnAdicionarPro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRemoverPro)
                                .addGap(59, 59, 59))
                            .addGroup(professoresPanelLayout.createSequentialGroup()
                                .addGroup(professoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCPF, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                    .addComponent(jLabelPro1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(professoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelPro2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNomeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(professoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAreaProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelPro3))
                                .addGroup(professoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(professoresPanelLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtPontuacao, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, professoresPanelLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelPro4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVoltarCur))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 733, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(235, Short.MAX_VALUE))
        );
        professoresPanelLayout.setVerticalGroup(
            professoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(professoresPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(professoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPro1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelPro2)
                    .addComponent(jLabelPro3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPro4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(professoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(professoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtAreaProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtPontuacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, professoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNomeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(professoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionarPro)
                    .addComponent(btnVoltarCur)
                    .addComponent(btnRemoverPro))
                .addGap(398, 398, 398))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(798, Short.MAX_VALUE)
                .addComponent(lblIcone2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 3, Short.MAX_VALUE)
                    .addComponent(professoresPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 2, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblIcone2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(537, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(professoresPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCPFActionPerformed

    private void txtNomeProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeProfessorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeProfessorActionPerformed

    private void txtAreaProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAreaProfessorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAreaProfessorActionPerformed

    private void txtPontuacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPontuacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPontuacaoActionPerformed

    private void btnRemoverProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverProActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRemoverProActionPerformed

    private void btnAdicionarProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarProActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdicionarProActionPerformed

    private void btnVoltarCurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarCurActionPerformed
        homePage.mostrarPainel("Consultas");
    }//GEN-LAST:event_btnVoltarCurActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarPro;
    private javax.swing.JButton btnRemoverPro;
    private javax.swing.JButton btnVoltarCur;
    private javax.swing.JLabel jLabelPro1;
    private javax.swing.JLabel jLabelPro2;
    private javax.swing.JLabel jLabelPro3;
    private javax.swing.JLabel jLabelPro4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblIcone2;
    private javax.swing.JPanel professoresPanel;
    private javax.swing.JTable tabelaProfessores;
    private javax.swing.JTextField txtAreaProfessor;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtNomeProfessor;
    private javax.swing.JTextField txtPontuacao;
    // End of variables declaration//GEN-END:variables
}
