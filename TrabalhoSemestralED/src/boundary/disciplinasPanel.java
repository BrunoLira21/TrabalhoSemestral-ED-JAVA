
package boundary;

import br.edu.fateczl.Lista;
import controller.CursoController;
import java.awt.Image;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

public class disciplinasPanel extends javax.swing.JPanel {
    private HomePage homePage;
    
    public disciplinasPanel() throws Exception {
        initComponents();
        
        String caminho  = "src/uteis/logofatec.png";
        ImageIcon logofatec = new ImageIcon(caminho);
        Image ImagemLogoRedimensionada = logofatec.getImage().getScaledInstance(130, 50, Image.SCALE_SMOOTH);
        ImageIcon logofatecRedimensionado = new ImageIcon(ImagemLogoRedimensionada);
        lblIcone1.setIcon(logofatecRedimensionado);
        
        PreencherComboBox();
    }

    public disciplinasPanel(HomePage hp) throws Exception{
        this();
        this.homePage = hp;
        
        
    }
    
    public void PreencherComboBox() throws Exception{
    CursoController cc = new CursoController();
    Lista<String> nomesCursos = cc.buscarNomesCursos();
    DefaultComboBoxModel<String> Cursomodel = (DefaultComboBoxModel<String>) cbxCodigoCurso.getModel();
    Cursomodel.removeAllElements();
    
    for (int i = 0; i < nomesCursos.size(); i++){
        String nome = nomesCursos.get(i);
        Cursomodel.addElement(nome);
    }
    
    }
    
    public void atualizarComboBoxCursos() throws Exception {
        PreencherComboBox();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        disciplinasPanel = new javax.swing.JPanel();
        jLabelDis1 = new javax.swing.JLabel();
        jLabelDis2 = new javax.swing.JLabel();
        jLabelDis3 = new javax.swing.JLabel();
        lblIcone1 = new javax.swing.JLabel();
        jLabelDis5 = new javax.swing.JLabel();
        jLabelDis6 = new javax.swing.JLabel();
        jLabelDis7 = new javax.swing.JLabel();
        jLabelDis8 = new javax.swing.JLabel();
        txtCodigoDisciplina = new javax.swing.JTextField();
        txtNomeDisciplina = new javax.swing.JTextField();
        cbxCodigoCurso = new javax.swing.JComboBox<>();
        txtDiaSemana = new javax.swing.JTextField();
        txtHoraInicial = new javax.swing.JTextField();
        txtHorasDiarias = new javax.swing.JTextField();
        txtCodigoProcesso = new javax.swing.JTextField();
        btnRemoverDis = new javax.swing.JButton();
        btnAdicionarDis = new javax.swing.JButton();
        btnVoltarDis = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaDisiciplinas = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(1000, 600));

        disciplinasPanel.setBackground(new java.awt.Color(255, 255, 255));
        disciplinasPanel.setForeground(new java.awt.Color(255, 255, 255));
        disciplinasPanel.setToolTipText("");
        disciplinasPanel.setFont(new java.awt.Font("Vivaldi", 1, 36)); // NOI18N
        disciplinasPanel.setName("Disciplinas"); // NOI18N

        jLabelDis1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelDis1.setText("Código da Disciplina");

        jLabelDis2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelDis2.setText("Nome da Disciplina");

        jLabelDis3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelDis3.setText("Código do Curso");

        jLabelDis5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelDis5.setText("Dia da Semana");

        jLabelDis6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelDis6.setText("Hora Inicial");

        jLabelDis7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelDis7.setText("Horas Diárias");

        jLabelDis8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelDis8.setText("Código do Processo");

        txtCodigoDisciplina.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCodigoDisciplina.setCaretColor(new java.awt.Color(255, 255, 255));
        txtCodigoDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoDisciplinaActionPerformed(evt);
            }
        });

        txtNomeDisciplina.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNomeDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeDisciplinaActionPerformed(evt);
            }
        });

        cbxCodigoCurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxCodigoCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCodigoCursoActionPerformed(evt);
            }
        });

        txtDiaSemana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiaSemanaActionPerformed(evt);
            }
        });

        txtHoraInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoraInicialActionPerformed(evt);
            }
        });

        txtHorasDiarias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHorasDiariasActionPerformed(evt);
            }
        });

        txtCodigoProcesso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoProcessoActionPerformed(evt);
            }
        });

        btnRemoverDis.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRemoverDis.setForeground(new java.awt.Color(255, 51, 51));
        btnRemoverDis.setText("Remover");
        btnRemoverDis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverDisActionPerformed(evt);
            }
        });

        btnAdicionarDis.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAdicionarDis.setForeground(new java.awt.Color(0, 153, 0));
        btnAdicionarDis.setText("Adicionar");
        btnAdicionarDis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarDisActionPerformed(evt);
            }
        });

        btnVoltarDis.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnVoltarDis.setForeground(new java.awt.Color(0, 51, 255));
        btnVoltarDis.setText("Voltar");
        btnVoltarDis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarDisActionPerformed(evt);
            }
        });

        tabelaDisiciplinas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cód. da Disciplina", "Nome da Disciplina", "Dia da Semana", "Hora Inicial", "Qtd. de Horas", "Cód. do Curso", "Cód. do Processo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaDisiciplinas.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tabelaDisiciplinas);
        if (tabelaDisiciplinas.getColumnModel().getColumnCount() > 0) {
            tabelaDisiciplinas.getColumnModel().getColumn(0).setResizable(false);
            tabelaDisiciplinas.getColumnModel().getColumn(1).setResizable(false);
            tabelaDisiciplinas.getColumnModel().getColumn(2).setResizable(false);
            tabelaDisiciplinas.getColumnModel().getColumn(3).setResizable(false);
            tabelaDisiciplinas.getColumnModel().getColumn(4).setResizable(false);
            tabelaDisiciplinas.getColumnModel().getColumn(5).setResizable(false);
            tabelaDisiciplinas.getColumnModel().getColumn(6).setResizable(false);
        }

        javax.swing.GroupLayout disciplinasPanelLayout = new javax.swing.GroupLayout(disciplinasPanel);
        disciplinasPanel.setLayout(disciplinasPanelLayout);
        disciplinasPanelLayout.setHorizontalGroup(
            disciplinasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(disciplinasPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(disciplinasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(disciplinasPanelLayout.createSequentialGroup()
                        .addGroup(disciplinasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(disciplinasPanelLayout.createSequentialGroup()
                                .addGroup(disciplinasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCodigoDisciplina)
                                    .addComponent(jLabelDis1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(53, 53, 53)
                                .addGroup(disciplinasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelDis2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtNomeDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(disciplinasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbxCodigoCurso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelDis3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(disciplinasPanelLayout.createSequentialGroup()
                                .addGroup(disciplinasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(disciplinasPanelLayout.createSequentialGroup()
                                        .addComponent(jLabelDis5)
                                        .addGap(53, 53, 53))
                                    .addGroup(disciplinasPanelLayout.createSequentialGroup()
                                        .addComponent(txtDiaSemana)
                                        .addGap(8, 8, 8)))
                                .addGap(21, 21, 21)
                                .addGroup(disciplinasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtHoraInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelDis6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addGroup(disciplinasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtHorasDiarias)
                                    .addComponent(jLabelDis7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 255, Short.MAX_VALUE)
                                .addGroup(disciplinasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCodigoProcesso)
                                    .addComponent(jLabelDis8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(38, 38, 38)
                        .addComponent(lblIcone1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(disciplinasPanelLayout.createSequentialGroup()
                        .addComponent(btnAdicionarDis)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRemoverDis)
                        .addGap(96, 96, 96)
                        .addComponent(btnVoltarDis))
                    .addComponent(jScrollPane2))
                .addGap(29, 29, 29))
        );
        disciplinasPanelLayout.setVerticalGroup(
            disciplinasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(disciplinasPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(disciplinasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(disciplinasPanelLayout.createSequentialGroup()
                        .addGroup(disciplinasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDis1)
                            .addComponent(jLabelDis2)
                            .addComponent(jLabelDis3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(disciplinasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodigoDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNomeDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxCodigoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblIcone1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(disciplinasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(disciplinasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(disciplinasPanelLayout.createSequentialGroup()
                            .addGroup(disciplinasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabelDis5)
                                .addComponent(jLabelDis6))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(disciplinasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtDiaSemana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtHoraInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, disciplinasPanelLayout.createSequentialGroup()
                            .addComponent(jLabelDis7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtHorasDiarias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(disciplinasPanelLayout.createSequentialGroup()
                        .addComponent(jLabelDis8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigoProcesso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(disciplinasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionarDis)
                    .addComponent(btnRemoverDis)
                    .addComponent(btnVoltarDis))
                .addGap(238, 238, 238))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(disciplinasPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 787, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(disciplinasPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        disciplinasPanel.getAccessibleContext().setAccessibleName("Disciplinas");
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoDisciplinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoDisciplinaActionPerformed

    private void txtNomeDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeDisciplinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeDisciplinaActionPerformed

    private void cbxCodigoCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCodigoCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxCodigoCursoActionPerformed

    private void txtDiaSemanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiaSemanaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiaSemanaActionPerformed

    private void txtHoraInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoraInicialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoraInicialActionPerformed

    private void txtHorasDiariasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHorasDiariasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHorasDiariasActionPerformed

    private void txtCodigoProcessoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoProcessoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoProcessoActionPerformed

    private void btnRemoverDisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverDisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRemoverDisActionPerformed

    private void btnAdicionarDisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarDisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdicionarDisActionPerformed

    private void btnVoltarDisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarDisActionPerformed
        homePage.mostrarPainel("Consultas");
    }//GEN-LAST:event_btnVoltarDisActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarDis;
    private javax.swing.JButton btnRemoverDis;
    private javax.swing.JButton btnVoltarDis;
    private javax.swing.JComboBox<String> cbxCodigoCurso;
    private javax.swing.JPanel disciplinasPanel;
    private javax.swing.JLabel jLabelDis1;
    private javax.swing.JLabel jLabelDis2;
    private javax.swing.JLabel jLabelDis3;
    private javax.swing.JLabel jLabelDis5;
    private javax.swing.JLabel jLabelDis6;
    private javax.swing.JLabel jLabelDis7;
    private javax.swing.JLabel jLabelDis8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblIcone1;
    private javax.swing.JTable tabelaDisiciplinas;
    private javax.swing.JTextField txtCodigoDisciplina;
    private javax.swing.JTextField txtCodigoProcesso;
    private javax.swing.JTextField txtDiaSemana;
    private javax.swing.JTextField txtHoraInicial;
    private javax.swing.JTextField txtHorasDiarias;
    private javax.swing.JTextField txtNomeDisciplina;
    // End of variables declaration//GEN-END:variables
}
