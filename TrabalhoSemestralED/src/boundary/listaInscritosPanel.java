/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package boundary;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author rafin
 */
public class listaInscritosPanel extends javax.swing.JPanel {
    private HomePage homePage;

    public listaInscritosPanel() {
        initComponents();
        
        String caminho  = "src/uteis/logofatec.png";
        ImageIcon logofatec = new ImageIcon(caminho);
        Image ImagemLogoRedimensionada = logofatec.getImage().getScaledInstance(130, 50, Image.SCALE_SMOOTH);
        ImageIcon logofatecRedimensionado = new ImageIcon(ImagemLogoRedimensionada);
        lbLogoFatec.setIcon(logofatecRedimensionado);
    }
    public listaInscritosPanel(HomePage hp){
        this();
        this.homePage = hp;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        listaInscritosPanel = new javax.swing.JPanel();
        jLabelLis1 = new javax.swing.JLabel();
        lbLogoFatec = new javax.swing.JLabel();
        txtDisciplinaBuscaLista = new javax.swing.JTextField();
        btnVoltarLis = new javax.swing.JButton();
        btnBuscarRanking = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaRankingLista = new javax.swing.JTable();

        listaInscritosPanel.setBackground(new java.awt.Color(255, 255, 255));
        listaInscritosPanel.setPreferredSize(new java.awt.Dimension(1000, 600));

        jLabelLis1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelLis1.setForeground(new java.awt.Color(0, 128, 96));
        jLabelLis1.setText("Código da Disciplina");

        txtDisciplinaBuscaLista.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtDisciplinaBuscaLista.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtDisciplinaBuscaLista.setToolTipText("");
        txtDisciplinaBuscaLista.setCaretColor(new java.awt.Color(255, 255, 255));
        txtDisciplinaBuscaLista.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtDisciplinaBuscaLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDisciplinaBuscaListaActionPerformed(evt);
            }
        });

        btnVoltarLis.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnVoltarLis.setForeground(new java.awt.Color(0, 51, 255));
        btnVoltarLis.setText("Voltar");
        btnVoltarLis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarLisActionPerformed(evt);
            }
        });

        btnBuscarRanking.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBuscarRanking.setForeground(new java.awt.Color(0, 153, 0));
        btnBuscarRanking.setLabel("Buscar Ranking");
        btnBuscarRanking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarRankingActionPerformed(evt);
            }
        });

        tabelaRankingLista.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tabelaRankingLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Classificação", "Pontuação", "Nome do Professor", "CPF", "Área de Interesse"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaRankingLista.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabelaRankingLista);
        if (tabelaRankingLista.getColumnModel().getColumnCount() > 0) {
            tabelaRankingLista.getColumnModel().getColumn(0).setResizable(false);
            tabelaRankingLista.getColumnModel().getColumn(1).setResizable(false);
            tabelaRankingLista.getColumnModel().getColumn(2).setResizable(false);
            tabelaRankingLista.getColumnModel().getColumn(3).setResizable(false);
            tabelaRankingLista.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout listaInscritosPanelLayout = new javax.swing.GroupLayout(listaInscritosPanel);
        listaInscritosPanel.setLayout(listaInscritosPanelLayout);
        listaInscritosPanelLayout.setHorizontalGroup(
            listaInscritosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listaInscritosPanelLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(listaInscritosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(listaInscritosPanelLayout.createSequentialGroup()
                        .addGroup(listaInscritosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelLis1)
                            .addComponent(txtDisciplinaBuscaLista, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(553, 553, 553)
                        .addComponent(lbLogoFatec, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(listaInscritosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(listaInscritosPanelLayout.createSequentialGroup()
                            .addComponent(btnBuscarRanking, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnVoltarLis))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        listaInscritosPanelLayout.setVerticalGroup(
            listaInscritosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listaInscritosPanelLayout.createSequentialGroup()
                .addGroup(listaInscritosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(listaInscritosPanelLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabelLis1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtDisciplinaBuscaLista, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listaInscritosPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbLogoFatec, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(listaInscritosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltarLis)
                    .addComponent(btnBuscarRanking))
                .addGap(389, 389, 389))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(listaInscritosPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(listaInscritosPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        listaInscritosPanel.getAccessibleContext().setAccessibleName("ListaInscritos");
    }// </editor-fold>//GEN-END:initComponents

    private void txtDisciplinaBuscaListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDisciplinaBuscaListaActionPerformed

    }//GEN-LAST:event_txtDisciplinaBuscaListaActionPerformed

    private void btnVoltarLisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarLisActionPerformed
        homePage.mostrarPainel("Consultas");
    }//GEN-LAST:event_btnVoltarLisActionPerformed

    private void btnBuscarRankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarRankingActionPerformed

    }//GEN-LAST:event_btnBuscarRankingActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarRanking;
    private javax.swing.JButton btnVoltarLis;
    private javax.swing.JLabel jLabelLis1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbLogoFatec;
    private javax.swing.JPanel listaInscritosPanel;
    private javax.swing.JTable tabelaRankingLista;
    private javax.swing.JTextField txtDisciplinaBuscaLista;
    // End of variables declaration//GEN-END:variables
}
