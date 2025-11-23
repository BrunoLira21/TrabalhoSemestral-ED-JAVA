package boundary;

import br.edu.fateczl.Lista;
import controller.CursoController;
import controller.DisciplinaController;
import entity.Disciplina;
import java.awt.Image;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class disciplinasPanel extends javax.swing.JPanel {
    private HomePage homePage;
    private DisciplinaController controller;
    
    public disciplinasPanel() throws Exception {
        initComponents();
        
        String caminho  = "src/uteis/logofatec.png";
        ImageIcon logofatec = new ImageIcon(caminho);
        Image ImagemLogoRedimensionada = logofatec.getImage().getScaledInstance(130, 50, Image.SCALE_SMOOTH);
        ImageIcon logofatecRedimensionado = new ImageIcon(ImagemLogoRedimensionada);
        lblIcone1.setIcon(logofatecRedimensionado);
        
        try {
            controller = new DisciplinaController();
            controller.preencherTabela((javax.swing.table.DefaultTableModel) tabelaDisiciplinas.getModel());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao iniciar sistema: " + e.getMessage());
        }
        
        PreencherComboBox();
    }

    public disciplinasPanel(HomePage hp) throws Exception{
        this();
        this.homePage = hp;
        
        configurarIdsAutomaticos();
    }
    
    public void PreencherComboBox() throws Exception{
    CursoController cc = new CursoController();
    Lista<String> nomesCursos = cc.buscarCodigosCursos();
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
        txtCodigoProcesso = new javax.swing.JTextField();
        btnRemoverDis = new javax.swing.JButton();
        btnAdicionarDis = new javax.swing.JButton();
        btnVoltarDis = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaDisiciplinas = new javax.swing.JTable();
        cbxDiaSemana = new javax.swing.JComboBox<>();
        txtHoraInicial = new javax.swing.JFormattedTextField();
        txtHorasDiarias = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(1000, 600));

        disciplinasPanel.setBackground(new java.awt.Color(255, 255, 255));
        disciplinasPanel.setForeground(new java.awt.Color(255, 255, 255));
        disciplinasPanel.setToolTipText("");
        disciplinasPanel.setFont(new java.awt.Font("Vivaldi", 1, 36)); // NOI18N
        disciplinasPanel.setName("Disciplinas"); // NOI18N

        jLabelDis1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelDis1.setForeground(new java.awt.Color(0, 128, 96));
        jLabelDis1.setText("Código da Disciplina");

        jLabelDis2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelDis2.setForeground(new java.awt.Color(0, 128, 96));
        jLabelDis2.setText("Nome da Disciplina");

        jLabelDis3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelDis3.setForeground(new java.awt.Color(0, 128, 96));
        jLabelDis3.setText("Código do Curso");

        jLabelDis5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelDis5.setForeground(new java.awt.Color(0, 128, 96));
        jLabelDis5.setText("Dia da Semana");

        jLabelDis6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelDis6.setForeground(new java.awt.Color(0, 128, 96));
        jLabelDis6.setText("Hora Inicial");

        jLabelDis7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelDis7.setForeground(new java.awt.Color(0, 128, 96));
        jLabelDis7.setText("Horas Diárias");

        jLabelDis8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelDis8.setForeground(new java.awt.Color(0, 128, 96));
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

        cbxCodigoCurso.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbxCodigoCurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxCodigoCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCodigoCursoActionPerformed(evt);
            }
        });

        txtCodigoProcesso.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
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

        tabelaDisiciplinas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
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

        cbxDiaSemana.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbxDiaSemana.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Domingo", "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sábado" }));

        try {
            txtHoraInicial.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtHoraInicial.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtHorasDiarias.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtHorasDiarias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHorasDiariasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout disciplinasPanelLayout = new javax.swing.GroupLayout(disciplinasPanel);
        disciplinasPanel.setLayout(disciplinasPanelLayout);
        disciplinasPanelLayout.setHorizontalGroup(
            disciplinasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(disciplinasPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(disciplinasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(disciplinasPanelLayout.createSequentialGroup()
                        .addComponent(btnAdicionarDis)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRemoverDis)
                        .addGap(76, 76, 76)
                        .addComponent(btnVoltarDis))
                    .addComponent(jScrollPane2)
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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 296, Short.MAX_VALUE)
                                .addGroup(disciplinasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbxCodigoCurso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelDis3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(disciplinasPanelLayout.createSequentialGroup()
                                .addGroup(disciplinasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelDis5)
                                    .addComponent(cbxDiaSemana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(74, 74, 74)
                                .addGroup(disciplinasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelDis6, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                    .addComponent(txtHoraInicial))
                                .addGap(44, 44, 44)
                                .addGroup(disciplinasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelDis7, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                    .addComponent(txtHorasDiarias))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(disciplinasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCodigoProcesso)
                                    .addComponent(jLabelDis8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(lblIcone1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49))
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
                            .addComponent(cbxDiaSemana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, disciplinasPanelLayout.createSequentialGroup()
                            .addComponent(jLabelDis7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(disciplinasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtHoraInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtHorasDiarias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
            .addGap(0, 1037, Short.MAX_VALUE)
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

    private void txtCodigoProcessoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoProcessoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoProcessoActionPerformed

    private void btnRemoverDisActionPerformed(java.awt.event.ActionEvent evt) {                                              
        try {
            String codigoStr = "";

            int linhaSelecionada = tabelaDisiciplinas.getSelectedRow();

            if (linhaSelecionada != -1) {
                Object valorCelula = tabelaDisiciplinas.getValueAt(linhaSelecionada, 0);
                codigoStr = valorCelula.toString();
            } else {
                codigoStr = txtCodigoDisciplina.getText();
            }

            if (codigoStr.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, selecione uma linha na tabela ou digite o código para remover.");
                return;
            }

            int confirmacao = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja remover a disciplina " + codigoStr + "?", "Confirmar Exclusão", JOptionPane.YES_NO_OPTION);
            if (confirmacao != JOptionPane.YES_OPTION) {
                return;
            }

            controller.removerDisciplina(Integer.parseInt(codigoStr));
            
            controller.preencherTabela((javax.swing.table.DefaultTableModel) tabelaDisiciplinas.getModel());
            if (homePage != null && homePage.painelInscricoes != null) {
                try {
                homePage.painelInscricoes.atualizarComboBoxDisciplinas();
            } catch (Exception ex) {
                // Se der erro, não trava o sistema
                System.out.println("Erro ao atualizar combo de inscrições após remoção: " + ex.getMessage());
            }
        }
            limparCampos();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao remover: " + e.getMessage());
        }
    }

    private void btnAdicionarDisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarDisActionPerformed
        try {
            if (txtCodigoDisciplina.getText().isEmpty() || txtNomeDisciplina.getText().isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(this, "Preencha os campos obrigatórios!");
                return;
            }

            int codigo = Integer.parseInt(txtCodigoDisciplina.getText());
            String nome = txtNomeDisciplina.getText();
            
            String dia = (String) cbxDiaSemana.getSelectedItem();
            
            String horaIni = txtHoraInicial.getText();
            if (horaIni.trim().equals(":")) {
                horaIni = "00:00";
            }

            int horas = Integer.parseInt(txtHorasDiarias.getText());
            String processo = txtCodigoProcesso.getText();
            
            String cursoSel = (String) cbxCodigoCurso.getSelectedItem();
            int codCurso = 0;
            if (cursoSel != null && !cursoSel.isEmpty()) {
                 try { codCurso = Integer.parseInt(cursoSel.split(" ")[0]); } catch(Exception e){}
            }

            Disciplina disciplina = new Disciplina(codigo, nome, dia, horaIni, horas, codCurso, processo);            
            controller.adicionarDisciplina(disciplina);
            
            controller.preencherTabela((javax.swing.table.DefaultTableModel) tabelaDisiciplinas.getModel());
            
            limparCampos();
            javax.swing.JOptionPane.showMessageDialog(this, "Salvo com sucesso!");

        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Verifique os campos numéricos (Código, Horas)!");
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Erro: " + e.getMessage());
        }
    }//GEN-LAST:event_btnAdicionarDisActionPerformed

    private void btnVoltarDisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarDisActionPerformed
        homePage.mostrarPainel("Consultas");
    }//GEN-LAST:event_btnVoltarDisActionPerformed

    private void txtHorasDiariasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHorasDiariasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHorasDiariasActionPerformed

    //Funções

    private void configurarIdsAutomaticos() {
        try {
            if (controller == null) controller = new DisciplinaController();

            // Gera os próximos IDs
            int proxCod = controller.gerarProximoCodigoDisciplina();
            int proxProc = controller.gerarProximoCodigoProcesso();

            // Preenche os campos
            txtCodigoDisciplina.setText(String.valueOf(proxCod));
            txtCodigoProcesso.setText(String.valueOf(proxProc));

            // Bloqueia edição para evitar erro de consistência
            txtCodigoDisciplina.setEditable(false);
            txtCodigoProcesso.setEditable(false);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void limparCampos() {
        txtNomeDisciplina.setText("");
        if (cbxDiaSemana.getItemCount() > 0) {
            cbxDiaSemana.setSelectedIndex(0);
        }
        if (cbxCodigoCurso.getItemCount() > 0) {
            cbxCodigoCurso.setSelectedIndex(0);
        }
        txtHoraInicial.setText("");
        txtHoraInicial.setValue(null);
        txtHorasDiarias.setText("");
        configurarIdsAutomaticos();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarDis;
    private javax.swing.JButton btnRemoverDis;
    private javax.swing.JButton btnVoltarDis;
    private javax.swing.JComboBox<String> cbxCodigoCurso;
    private javax.swing.JComboBox<String> cbxDiaSemana;
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
    private javax.swing.JFormattedTextField txtHoraInicial;
    private javax.swing.JTextField txtHorasDiarias;
    private javax.swing.JTextField txtNomeDisciplina;
    // End of variables declaration//GEN-END:variables
}
