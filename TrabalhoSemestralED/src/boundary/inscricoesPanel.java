
package boundary;

import br.edu.fateczl.Lista;
import controller.CursoController;
import controller.DisciplinaController;
import controller.InscricoesController;
import entity.Inscrições;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class inscricoesPanel extends javax.swing.JPanel {
    private HomePage homePage;
    
    public inscricoesPanel() throws Exception {
        initComponents();
        String caminho  = "src/uteis/logofatec.png";
        ImageIcon logofatec = new ImageIcon(caminho);
        Image ImagemLogoRedimensionada = logofatec.getImage().getScaledInstance(130, 50, Image.SCALE_SMOOTH);
        ImageIcon logofatecRedimensionado = new ImageIcon(ImagemLogoRedimensionada);
        lblIcone.setIcon(logofatecRedimensionado);

        txtCodProcessoIns.setEditable(false);

        // pra preencher o cod qnd seleciona um curso no combobox
        cbxDisciplinaIns.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                preencherProcessoAutomaticamente();
            }
        });
// carrega os dados qnd abre
        try {
            PreencherComboBoxDisciplina();
            carregarTabelaInscricoes();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public inscricoesPanel(HomePage hp) throws Exception{
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
        jLabelIns1.setForeground(new java.awt.Color(0, 128, 96));
        jLabelIns1.setText("CPF do Professor");

        jLabelIns2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelIns2.setForeground(new java.awt.Color(0, 128, 96));
        jLabelIns2.setText("Código da Disciplina");

        jLabelIns3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelIns3.setForeground(new java.awt.Color(0, 128, 96));
        jLabelIns3.setText("Código do Processo");

        cbxDisciplinaIns.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbxDisciplinaIns.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtCodProcessoIns.setEditable(false);
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
        int linhaSelecionada = tabelaInscricoes.getSelectedRow();
        if (linhaSelecionada == -1) {
            JOptionPane.showMessageDialog(this, "Selecione uma inscrição na tabela.");
            return;
        }

        String cpf = (String) tabelaInscricoes.getValueAt(linhaSelecionada, 0).toString();
        String disciplinaStr = tabelaInscricoes.getValueAt(linhaSelecionada, 1).toString();
        int disciplina = Integer.parseInt(disciplinaStr);

        int confirma = JOptionPane.showConfirmDialog(this, "Deseja remover a inscrição do prof. " + cpf + "?", "Remover", JOptionPane.YES_NO_OPTION);
        if (confirma == JOptionPane.YES_OPTION) {
            try {
                InscricoesController ic = new InscricoesController();
                if (ic.removerInscricao(cpf, disciplina)) {
                    JOptionPane.showMessageDialog(this, "Removido com sucesso!");
                    carregarTabelaInscricoes();
                } else {
                    JOptionPane.showMessageDialog(this, "Erro ao remover.");
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnRemoverInsActionPerformed

    private void txtCodProcessoInsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodProcessoInsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodProcessoInsActionPerformed

    private void btnInscreverInsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInscreverInsActionPerformed
        String cpf = txtCPFProfessorIns.getText().trim();
        String processo = txtCodProcessoIns.getText().trim();

        if (cpf.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite o CPF do professor.");
            return;
        }
        if (processo.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Selecione uma disciplina válida para carregar o processo.");
            return;
        }

        String disciplinaStr = (String) cbxDisciplinaIns.getSelectedItem();
        int codDisciplina = Integer.parseInt(disciplinaStr.split(" - ")[0]);

        try {
            Inscrições inscricao = new Inscrições();
            inscricao.setCpf(cpf);
            inscricao.setCodigoDisciplina(codDisciplina);
            inscricao.setCodigoProcesso(Integer.parseInt(processo));

            InscricoesController ic = new InscricoesController();
            if (ic.adicionarInscricao(inscricao)) {
                JOptionPane.showMessageDialog(this, "Inscrição realizada com sucesso!");
                carregarTabelaInscricoes();
                txtCPFProfessorIns.setText("");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnInscreverInsActionPerformed

    private void btnVoltarCurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarCurActionPerformed
        homePage.mostrarPainel("Consultas");
    }//GEN-LAST:event_btnVoltarCurActionPerformed

    private void txtCPFProfessorInsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPFProfessorInsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCPFProfessorInsActionPerformed

    // umas funções

    private void preencherProcessoAutomaticamente() {
        String itemSelecionado = (String) cbxDisciplinaIns.getSelectedItem();
        if (itemSelecionado != null && !itemSelecionado.isEmpty()) {
            // O formato esperado no Combo é "1 - NomeDisciplina"
            String[] partes = itemSelecionado.split(" - ");
            if (partes.length >= 1) {
                try {
                    int idDisciplina = Integer.parseInt(partes[0].trim());

                    InscricoesController ic = new InscricoesController();
                    int idProcesso = ic.buscarProcessoDaDisciplina(idDisciplina);

                    if (idProcesso != -1) {
                        txtCodProcessoIns.setText(String.valueOf(idProcesso));
                    } else {
                        txtCodProcessoIns.setText("");
                    }
                } catch (NumberFormatException ex) {
                    txtCodProcessoIns.setText("");
                }
            }
        }
    }

    public void PreencherComboBoxDisciplina() throws Exception{
        DisciplinaController dc = new DisciplinaController();
        // A função buscarCodigosDisciplinas retorna Strings no formato "ID - Nome"
        Lista<String> nomesDisciplinas = dc.buscarCodigosDisciplinas();
        DefaultComboBoxModel<String> model = (DefaultComboBoxModel<String>) cbxDisciplinaIns.getModel();
        model.removeAllElements();

        // Adicionar item vazio para resetar
        model.addElement("");

        int tamanho = nomesDisciplinas.size();
        for (int i = 0; i < tamanho; i++){
            model.addElement(nomesDisciplinas.get(i));
        }
    }

    public void atualizarComboBoxDisciplinas() throws Exception {
        PreencherComboBoxDisciplina();
        carregarTabelaInscricoes();
    }

    private void carregarTabelaInscricoes() {
        DefaultTableModel model = (DefaultTableModel) tabelaInscricoes.getModel();
        model.setRowCount(0);

        try {
            InscricoesController ic = new InscricoesController();
            Lista<Inscrições> lista = ic.listarInscricoes();
            int tamanho = lista.size();

            for(int i = 0; i < tamanho; i++) {
                Inscrições ins = lista.get(i);
                model.addRow(new Object[]{
                        ins.getCpf(),
                        ins.getCodigoDisciplina(), // Poderia buscar o nome para exibir bonito
                        ins.getCodigoProcesso()
                });
            }
        } catch (Exception e) {
            System.out.println("Erro ao listar inscrições: " + e.getMessage());
        }
    }


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
