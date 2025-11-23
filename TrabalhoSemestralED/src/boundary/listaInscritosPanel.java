package boundary;

import br.edu.fateczl.Lista;
import controller.DisciplinaController;
import controller.InscricoesController;
import controller.ProfessorController;
import controller.Quick;
import entity.Inscrições;
import entity.Professor;
import java.awt.Image;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class listaInscritosPanel extends javax.swing.JPanel {

    private HomePage homePage;

    public listaInscritosPanel() throws Exception {
        initComponents();

        //logo da Fatec
        String caminho = "src/uteis/logofatec.png";
        ImageIcon logofatec = new ImageIcon(caminho);
        Image imagemRedimensionada = logofatec.getImage().getScaledInstance(130, 50, Image.SCALE_SMOOTH);
        lbLogoFatec.setIcon(new ImageIcon(imagemRedimensionada));

        // Preenche o combo box e configura o evento
        atualizarComboBoxDisciplinas();
        configurarActionListenerCombo();
    }
    public listaInscritosPanel(HomePage hp) throws Exception{
        this();
        this.homePage = hp;
    }

        public void PreencherComboBoxDisciplina() throws Exception{
        DisciplinaController dc = new DisciplinaController();
        Lista<String> nomesDisciplinas = dc.buscarCodigosDisciplinas();
        DefaultComboBoxModel<String> Disciplinamodel = (DefaultComboBoxModel<String>) bxbDisciplina.getModel();
        Disciplinamodel.removeAllElements();
        Disciplinamodel.addElement("");

        int tamanho = nomesDisciplinas.size();
        for (int i = 0; i < tamanho; i++){
            Disciplinamodel.addElement(nomesDisciplinas.get(i));
        }
        
        bxbDisciplina.setModel(Disciplinamodel);
    }

    public void atualizarComboBoxDisciplinas() throws Exception {
        PreencherComboBoxDisciplina();
        limparTabela();
    }
    
    private void configurarActionListenerCombo() {
        bxbDisciplina.addActionListener(e -> {
            String selecionado = (String) bxbDisciplina.getSelectedItem();

            // Se for o item padrão ou vazio, limpa a tabela
            if (selecionado == null || selecionado.trim().isEmpty()) {
                limparTabela();
                return;
            }

            try {
                String[] partes = selecionado.split(" - ");
                int codigoDisciplina = Integer.parseInt(partes[0].trim());
                carregarInscritosDaDisciplina(codigoDisciplina);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Erro ao processar disciplina: " + ex.getMessage());
                limparTabela();
            }
        });
    }


   private void carregarInscritosDaDisciplina(int codigoDisciplina) {
    DefaultTableModel model = (DefaultTableModel) tabelaRankingLista.getModel();
    model.setRowCount(0); 

    try {
        InscricoesController ic = new InscricoesController();
        ProfessorController pc = new ProfessorController();
        Lista<Inscrições> inscricoes = ic.listarInscricoes();

        // Coleta os professores inscritos na disciplina
        Lista<Professor> profsInscritos = new Lista<>();
        for (int i = 0; i < inscricoes.size(); i++) {
            Inscrições ins = inscricoes.get(i);
            if (ins.getCodigoDisciplina() == codigoDisciplina) {
                Professor prof = pc.buscarPorCpf(ins.getCpf());
                if (prof != null) {
                    if (profsInscritos.isEmpty()) {
                        profsInscritos.addFirst(prof);
                    } else {
                        profsInscritos.addLast(prof);
                    }
                }
            }
        }

        if (profsInscritos.isEmpty()) {
            model.addRow(new Object[]{" ", " ", "Nenhum professor inscrito", " ", " "});
            return;
        }

        // Converter Lista para array de Professor
        Professor[] arrayProfs = new Professor[profsInscritos.size()];
        for (int i = 0; i < profsInscritos.size(); i++) {
            arrayProfs[i] = profsInscritos.get(i);
        }

        // Ordenação Decrescente (Quick)
        Quick quick = new Quick();
        quick.quickSortProfessores(arrayProfs, 0, arrayProfs.length - 1);

        // Preencher tabela com classificação
        for (int i = 0; i < arrayProfs.length; i++) {
            Professor prof = arrayProfs[i];
            model.addRow(new Object[]{
                i + 1,  // Classificação (1, 2, 3...)
                prof.getPonto(),
                prof.getNome(),
                prof.getCpf(),
                prof.getArea()
            });
        }

    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Erro ao carregar inscritos: " + ex.getMessage());
    }
}

    private void limparTabela() {
        DefaultTableModel model = (DefaultTableModel) tabelaRankingLista.getModel();
        model.setRowCount(0);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        listaInscritosPanel = new javax.swing.JPanel();
        jLabelLis1 = new javax.swing.JLabel();
        lbLogoFatec = new javax.swing.JLabel();
        btnVoltarLis = new javax.swing.JButton();
        btnBuscarRanking = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaRankingLista = new javax.swing.JTable();
        bxbDisciplina = new javax.swing.JComboBox<>();

        listaInscritosPanel.setBackground(new java.awt.Color(255, 255, 255));
        listaInscritosPanel.setPreferredSize(new java.awt.Dimension(1000, 600));

        jLabelLis1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelLis1.setForeground(new java.awt.Color(0, 128, 96));
        jLabelLis1.setText("Código da Disciplina");

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

        bxbDisciplina.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout listaInscritosPanelLayout = new javax.swing.GroupLayout(listaInscritosPanel);
        listaInscritosPanel.setLayout(listaInscritosPanelLayout);
        listaInscritosPanelLayout.setHorizontalGroup(
            listaInscritosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listaInscritosPanelLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(listaInscritosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(listaInscritosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(listaInscritosPanelLayout.createSequentialGroup()
                            .addGroup(listaInscritosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelLis1)
                                .addComponent(bxbDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(559, 559, 559)
                            .addComponent(lbLogoFatec, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(listaInscritosPanelLayout.createSequentialGroup()
                            .addComponent(btnBuscarRanking, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(616, 616, 616)
                            .addComponent(btnVoltarLis)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 853, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        listaInscritosPanelLayout.setVerticalGroup(
            listaInscritosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listaInscritosPanelLayout.createSequentialGroup()
                .addGroup(listaInscritosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(listaInscritosPanelLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabelLis1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bxbDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
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

    private void btnVoltarLisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarLisActionPerformed
        homePage.mostrarPainel("Consultas");
    }//GEN-LAST:event_btnVoltarLisActionPerformed

    private void btnBuscarRankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarRankingActionPerformed

    }//GEN-LAST:event_btnBuscarRankingActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarRanking;
    private javax.swing.JButton btnVoltarLis;
    private javax.swing.JComboBox<String> bxbDisciplina;
    private javax.swing.JLabel jLabelLis1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbLogoFatec;
    private javax.swing.JPanel listaInscritosPanel;
    private javax.swing.JTable tabelaRankingLista;
    // End of variables declaration//GEN-END:variables
}