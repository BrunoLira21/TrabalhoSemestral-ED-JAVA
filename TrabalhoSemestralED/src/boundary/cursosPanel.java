
package boundary;

import controller.CursoController;
import entity.Curso;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class cursosPanel extends javax.swing.JPanel {
    private HomePage homePage;

    public cursosPanel() {
        initComponents();
    }
    
    public cursosPanel(HomePage hp){
        this();
        this.homePage = hp;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cursosPanel = new javax.swing.JPanel();
        jLabelCur1 = new javax.swing.JLabel();
        jLabelCur2 = new javax.swing.JLabel();
        jLabelCur3 = new javax.swing.JLabel();
        lblIcone = new javax.swing.JLabel();
        txtAreaCurso = new javax.swing.JTextField();
        txtNomeCurso = new javax.swing.JTextField();
        txtCodigoCurso = new javax.swing.JTextField();
        btnSalvarCur = new javax.swing.JButton();
        btnRemoverCur = new javax.swing.JButton();
        btnVoltarCur = new javax.swing.JButton();
        btnAdicionarCur = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCursos = new javax.swing.JTable();

        cursosPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabelCur1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelCur1.setText("Área de Conhecimento");

        jLabelCur2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelCur2.setText("Nome");

        jLabelCur3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelCur3.setText("Código do Curso");

        txtAreaCurso.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtAreaCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAreaCursoActionPerformed(evt);
            }
        });

        txtNomeCurso.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNomeCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeCursoActionPerformed(evt);
            }
        });

        txtCodigoCurso.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCodigoCurso.setCaretColor(new java.awt.Color(255, 255, 255));
        txtCodigoCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoCursoActionPerformed(evt);
            }
        });

        btnSalvarCur.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSalvarCur.setForeground(new java.awt.Color(51, 102, 0));
        btnSalvarCur.setText("Salvar");

        btnRemoverCur.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRemoverCur.setForeground(new java.awt.Color(255, 51, 51));
        btnRemoverCur.setText("Remover");
        btnRemoverCur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverCurActionPerformed(evt);
            }
        });

        btnVoltarCur.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnVoltarCur.setForeground(new java.awt.Color(0, 153, 0));
        btnVoltarCur.setText("Voltar");
        btnVoltarCur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarCurActionPerformed(evt);
            }
        });

        btnAdicionarCur.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAdicionarCur.setForeground(new java.awt.Color(0, 51, 255));
        btnAdicionarCur.setText("Adicionar");
        btnAdicionarCur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarCurActionPerformed(evt);
            }
        });

        tabelaCursos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código do Curso", "Nome do Curso", "Área de Conhecimento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
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
        tabelaCursos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabelaCursos);
        if (tabelaCursos.getColumnModel().getColumnCount() > 0) {
            tabelaCursos.getColumnModel().getColumn(0).setResizable(false);
            tabelaCursos.getColumnModel().getColumn(1).setResizable(false);
            tabelaCursos.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout cursosPanelLayout = new javax.swing.GroupLayout(cursosPanel);
        cursosPanel.setLayout(cursosPanelLayout);
        cursosPanelLayout.setHorizontalGroup(
            cursosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cursosPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(cursosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(cursosPanelLayout.createSequentialGroup()
                        .addGroup(cursosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCur3)
                            .addComponent(txtCodigoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addGroup(cursosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNomeCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCur2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                        .addGroup(cursosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAreaCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCur1))
                        .addGap(46, 46, 46)
                        .addComponent(lblIcone, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 712, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cursosPanelLayout.createSequentialGroup()
                        .addComponent(btnSalvarCur)
                        .addGap(96, 96, 96)
                        .addComponent(btnAdicionarCur)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRemoverCur)
                        .addGap(68, 68, 68)
                        .addComponent(btnVoltarCur)))
                .addGap(56, 56, 56))
        );
        cursosPanelLayout.setVerticalGroup(
            cursosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cursosPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(cursosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cursosPanelLayout.createSequentialGroup()
                        .addGroup(cursosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCur3)
                            .addComponent(jLabelCur2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(cursosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodigoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNomeCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblIcone, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(cursosPanelLayout.createSequentialGroup()
                        .addComponent(jLabelCur1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAreaCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(cursosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvarCur)
                    .addComponent(btnAdicionarCur)
                    .addComponent(btnRemoverCur)
                    .addComponent(btnVoltarCur))
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
                    .addComponent(cursosPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 937, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(cursosPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtAreaCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAreaCursoActionPerformed

    }//GEN-LAST:event_txtAreaCursoActionPerformed

    private void txtNomeCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeCursoActionPerformed

    }//GEN-LAST:event_txtNomeCursoActionPerformed

    private void txtCodigoCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoCursoActionPerformed

    }//GEN-LAST:event_txtCodigoCursoActionPerformed

    private void btnRemoverCurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverCurActionPerformed

    }//GEN-LAST:event_btnRemoverCurActionPerformed

    private void btnVoltarCurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarCurActionPerformed
        homePage.mostrarPainel("Consultas");
    }//GEN-LAST:event_btnVoltarCurActionPerformed

    private void btnAdicionarCurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarCurActionPerformed
        try {
            Curso curso = new Curso();

            curso.setCodigoCurso(Integer.parseInt(txtCodigoCurso.getText()));
            curso.setNomeCurso(txtNomeCurso.getText());
            curso.setArea(txtAreaCurso.getText());

            CursoController cc = new CursoController();

            boolean sucesso = cc.adicionarCurso(curso);

            if (sucesso) {
                JOptionPane.showMessageDialog(this, "Curso salvo com sucesso!");
                curso.limparCamposCurso();
                carregarDadosCursoCSV(); // atualiza a tabela
            } else {
                JOptionPane.showMessageDialog(this, "Curso já existe ou erro ao salvar.");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao adicionar curso: " + ex.getMessage());
            ex.printStackTrace();
        }
        limparCampos();
    }//GEN-LAST:event_btnAdicionarCurActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarCur;
    private javax.swing.JButton btnRemoverCur;
    private javax.swing.JButton btnSalvarCur;
    private javax.swing.JButton btnVoltarCur;
    private javax.swing.JPanel cursosPanel;
    private javax.swing.JLabel jLabelCur1;
    private javax.swing.JLabel jLabelCur2;
    private javax.swing.JLabel jLabelCur3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblIcone;
    private javax.swing.JTable tabelaCursos;
    private javax.swing.JTextField txtAreaCurso;
    private javax.swing.JTextField txtCodigoCurso;
    private javax.swing.JTextField txtNomeCurso;
    // End of variables declaration//GEN-END:variables

    // Algumas funções

    private void limparCampos(){
        txtAreaCurso.setText("");
        txtCodigoCurso.setText("");
        txtNomeCurso.setText("");
    }

    private void carregarDadosCursoCSV(){
        String arquivo = "Arquivos/cursos.csv";
        String separador = ";";
        String linha = "";

        DefaultTableModel model = (DefaultTableModel) tabelaCursos.getModel();
        model.setRowCount(0);

        try(BufferedReader ler = new BufferedReader(new FileReader(arquivo))){
            while((linha = ler.readLine()) != null){
                String[] dados = linha.split(separador);
                if(dados.length >= 3){
                    try{
                        int codigo = Integer.parseInt(dados[0].trim());
                        String nome = dados[1].trim();
                        String area = dados[2].trim();

                        model.addRow(new Object[]{codigo, nome, area});
                    }catch(NumberFormatException ex){
                        System.out.println("Ignorando linha com código inválido: " + linha);
                    }
                }
            }
        }catch(IOException e){
            JOptionPane.showMessageDialog(this, "Erro ao ler arquivo CSV: " + e.getMessage());
        }
        limparCampos();
    }
}
