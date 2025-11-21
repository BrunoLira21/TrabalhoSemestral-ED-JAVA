package boundary;
import javax.swing.border.*;
import controller.CursoController;
import entity.Curso;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class HomePage extends javax.swing.JFrame {
    private CardLayout cardLayout;

    public HomePage() {
        initComponents();

        cardLayout = (CardLayout) jContentPane.getLayout();

        MouseAdapter menuListener = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JToggleButton source = (JToggleButton) e.getSource(); 
                if (source == btnCursos) {
                    cardLayout.show(jContentPane, "Cursos");
                } else if (source == btnProfessores) {
                    cardLayout.show(jContentPane, "Professores");
                } else if(source == btnDisciplinas){
                    cardLayout.show(jContentPane, "Disciplinas");
                } else if(source == btnInscricoes){
                    cardLayout.show(jContentPane, "Inscrições");
                } 
            }

        };

        btnCursos.addMouseListener(menuListener);
        btnProfessores.addMouseListener(menuListener);
        btnDisciplinas.addMouseListener(menuListener);
        btnInscricoes.addMouseListener(menuListener);
        

        //Icones Logo
        ImageIcon iconeHomePage = new ImageIcon("src/uteis/logofatec.png");
        Image imagemRedimensionada = iconeHomePage.getImage().getScaledInstance(123, 53, Image.SCALE_SMOOTH);
        ImageIcon logoRedimensionado = new ImageIcon(imagemRedimensionada);

        lblIcone.setIcon(logoRedimensionado);    // Cursos
        lblIcone1.setIcon(logoRedimensionado);   // Disciplinas
        lblIcone2.setIcon(logoRedimensionado);   // Professores
        lbIcone3.setIcon(logoRedimensionado);



        //Icones Botões
        ImageIcon iconeButtonDisc = new ImageIcon("src/uteis/Disciplinas.jpeg");
        Image imagemIconDiscRedimensionada = iconeButtonDisc.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        ImageIcon iconeDiscRedimensionado = new ImageIcon(imagemIconDiscRedimensionada);
        btnDisciplinas.setIcon(iconeDiscRedimensionado);
        

        ImageIcon iconeButtonCur = new ImageIcon("src/uteis/Cursos.png");
        Image imagemIconCurRedimensionada = iconeButtonCur.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        ImageIcon iconeCurRedimensionado = new ImageIcon(imagemIconCurRedimensionada);
        btnCursos.setIcon(iconeCurRedimensionado);
        
        ImageIcon iconeButtonPro = new ImageIcon("src/uteis/Professor.jpeg");
        Image imagemIconProRedimensionada = iconeButtonPro.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        ImageIcon iconeProRedimensionado = new ImageIcon(imagemIconProRedimensionada);
        btnProfessores.setIcon(iconeProRedimensionado);
        
        
        ImageIcon iconeButtonIns = new ImageIcon("src/uteis/Inscricoes.jpeg");
        Image imagemIconInsRedimensionada = iconeButtonIns.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        ImageIcon iconeInsRedimensionado = new ImageIcon(imagemIconInsRedimensionada);
        btnInscricoes.setIcon(iconeInsRedimensionado);
        
        
        
        carregarDadosCursoCSV();

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jContentPane = new javax.swing.JPanel();
        consultasPanel = new javax.swing.JPanel();
        lbIcone3 = new javax.swing.JLabel();
        btnDisciplinas = new javax.swing.JToggleButton();
        btnProfessores = new javax.swing.JToggleButton();
        btnInscricoes = new javax.swing.JToggleButton();
        btnCursos = new javax.swing.JToggleButton();
        inscricoesPanel = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        professoresPanel = new javax.swing.JPanel();
        jLabelPro1 = new javax.swing.JLabel();
        jLabelPro2 = new javax.swing.JLabel();
        jLabelPro3 = new javax.swing.JLabel();
        jLabelPro4 = new javax.swing.JLabel();
        lblIcone2 = new javax.swing.JLabel();
        txtCPF = new javax.swing.JTextField();
        txtNomeProfessor = new javax.swing.JTextField();
        txtAreaProfessor = new javax.swing.JTextField();
        txtPontuacao = new javax.swing.JTextField();
        btnSalvarPro = new javax.swing.JButton();
        btnRemoverPro = new javax.swing.JButton();
        btnLimparPro = new javax.swing.JButton();
        btnAdicionarPro = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaProfessores = new javax.swing.JTable();
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
        btnSalvarDis = new javax.swing.JButton();
        btnRemoverDis = new javax.swing.JButton();
        btnLimparDis = new javax.swing.JButton();
        btnAdicionarDis = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaDisiciplinas = new javax.swing.JTable();
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
        btnLimparCur = new javax.swing.JButton();
        btnAdicionarCur = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCursos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jContentPane.setBackground(new java.awt.Color(255, 255, 255));
        jContentPane.setLayout(new java.awt.CardLayout());

        consultasPanel.setBackground(new java.awt.Color(255, 255, 255));
        consultasPanel.setToolTipText("");

        btnDisciplinas.setBackground(new java.awt.Color(0, 102, 102));
        btnDisciplinas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnDisciplinas.setForeground(new java.awt.Color(255, 255, 255));
        btnDisciplinas.setText("Disciplinas");
        btnDisciplinas.setBorder(null);
        btnDisciplinas.setBorderPainted(false);
        btnDisciplinas.setContentAreaFilled(false);
        btnDisciplinas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDisciplinas.setFocusPainted(false);
        btnDisciplinas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDisciplinas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnProfessores.setBackground(new java.awt.Color(0, 102, 102));
        btnProfessores.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnProfessores.setForeground(new java.awt.Color(255, 255, 255));
        btnProfessores.setText("Professores");
        btnProfessores.setBorder(null);
        btnProfessores.setBorderPainted(false);
        btnProfessores.setContentAreaFilled(false);
        btnProfessores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProfessores.setFocusPainted(false);
        btnProfessores.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnProfessores.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnInscricoes.setBackground(new java.awt.Color(0, 102, 102));
        btnInscricoes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnInscricoes.setForeground(new java.awt.Color(255, 255, 255));
        btnInscricoes.setText("Inscrições");
        btnInscricoes.setBorder(null);
        btnInscricoes.setBorderPainted(false);
        btnInscricoes.setContentAreaFilled(false);
        btnInscricoes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInscricoes.setFocusPainted(false);
        btnInscricoes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnInscricoes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnCursos.setBackground(new java.awt.Color(0, 102, 102));
        btnCursos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCursos.setForeground(new java.awt.Color(255, 255, 255));
        btnCursos.setText("Cursos");
        btnCursos.setBorder(null);
        btnCursos.setBorderPainted(false);
        btnCursos.setContentAreaFilled(false);
        btnCursos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCursos.setFocusPainted(false);
        btnCursos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCursos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout consultasPanelLayout = new javax.swing.GroupLayout(consultasPanel);
        consultasPanel.setLayout(consultasPanelLayout);
        consultasPanelLayout.setHorizontalGroup(
            consultasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(consultasPanelLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addGroup(consultasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, consultasPanelLayout.createSequentialGroup()
                        .addComponent(lbIcone3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, consultasPanelLayout.createSequentialGroup()
                        .addGroup(consultasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnInscricoes, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(consultasPanelLayout.createSequentialGroup()
                                .addComponent(btnCursos, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 423, Short.MAX_VALUE)
                                .addComponent(btnDisciplinas, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(127, 127, 127))))
            .addGroup(consultasPanelLayout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(btnProfessores, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        consultasPanelLayout.setVerticalGroup(
            consultasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(consultasPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lbIcone3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addGroup(consultasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDisciplinas, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCursos, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addGroup(consultasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProfessores, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInscricoes, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69))
        );

        jContentPane.add(consultasPanel, "Consultas");
        consultasPanel.getAccessibleContext().setAccessibleName("Consultas");

        inscricoesPanel.setBackground(new java.awt.Color(51, 255, 0));

        jButton2.setText("Clientes");

        javax.swing.GroupLayout inscricoesPanelLayout = new javax.swing.GroupLayout(inscricoesPanel);
        inscricoesPanel.setLayout(inscricoesPanelLayout);
        inscricoesPanelLayout.setHorizontalGroup(
            inscricoesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inscricoesPanelLayout.createSequentialGroup()
                .addGap(302, 302, 302)
                .addComponent(jButton2)
                .addContainerGap(626, Short.MAX_VALUE))
        );
        inscricoesPanelLayout.setVerticalGroup(
            inscricoesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inscricoesPanelLayout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addComponent(jButton2)
                .addContainerGap(368, Short.MAX_VALUE))
        );

        jContentPane.add(inscricoesPanel, "Inscrições");
        inscricoesPanel.getAccessibleContext().setAccessibleName("Inscrições");

        professoresPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabelPro1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelPro1.setText("CPF");

        jLabelPro2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelPro2.setText("Nome");

        jLabelPro3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelPro3.setText("Área de Interesse");

        jLabelPro4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelPro4.setText("Pontuação");

        txtCPF.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCPF.setCaretColor(new java.awt.Color(255, 255, 255));
        txtCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPFActionPerformed(evt);
            }
        });

        txtNomeProfessor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNomeProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeProfessorActionPerformed(evt);
            }
        });

        txtAreaProfessor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtAreaProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAreaProfessorActionPerformed(evt);
            }
        });

        txtPontuacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPontuacaoActionPerformed(evt);
            }
        });

        btnSalvarPro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSalvarPro.setForeground(new java.awt.Color(51, 102, 0));
        btnSalvarPro.setText("Salvar");

        btnRemoverPro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRemoverPro.setForeground(new java.awt.Color(255, 51, 51));
        btnRemoverPro.setText("Remover");
        btnRemoverPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverProActionPerformed(evt);
            }
        });

        btnLimparPro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnLimparPro.setForeground(new java.awt.Color(255, 102, 102));
        btnLimparPro.setText("Limpar Campos");
        btnLimparPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparProActionPerformed(evt);
            }
        });

        btnAdicionarPro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnAdicionarPro.setForeground(new java.awt.Color(0, 51, 255));
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

        javax.swing.GroupLayout professoresPanelLayout = new javax.swing.GroupLayout(professoresPanel);
        professoresPanel.setLayout(professoresPanelLayout);
        professoresPanelLayout.setHorizontalGroup(
            professoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(professoresPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(professoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(professoresPanelLayout.createSequentialGroup()
                        .addGroup(professoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCPF, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                            .addComponent(jLabelPro1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(professoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNomeProfessor)
                            .addComponent(jLabelPro2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(professoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(professoresPanelLayout.createSequentialGroup()
                                .addComponent(txtAreaProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPontuacao, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, professoresPanelLayout.createSequentialGroup()
                                .addComponent(jLabelPro3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelPro4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblIcone2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 727, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, professoresPanelLayout.createSequentialGroup()
                        .addComponent(btnSalvarPro)
                        .addGap(96, 96, 96)
                        .addComponent(btnAdicionarPro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRemoverPro)
                        .addGap(60, 60, 60)
                        .addComponent(btnLimparPro)))
                .addGap(56, 56, 56))
        );
        professoresPanelLayout.setVerticalGroup(
            professoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(professoresPanelLayout.createSequentialGroup()
                .addGroup(professoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(professoresPanelLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(professoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(professoresPanelLayout.createSequentialGroup()
                                .addGroup(professoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelPro3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(professoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelPro1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelPro4)))
                                .addGap(7, 7, 7)
                                .addGroup(professoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPontuacao, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(5, 5, 5))
                            .addComponent(lblIcone2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(professoresPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelPro2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(professoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNomeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAreaProfessor))
                        .addGap(13, 13, 13)))
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(professoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvarPro)
                    .addComponent(btnAdicionarPro)
                    .addComponent(btnRemoverPro)
                    .addComponent(btnLimparPro))
                .addGap(389, 389, 389))
        );

        jContentPane.add(professoresPanel, "Professores");
        professoresPanel.getAccessibleContext().setAccessibleName("Professores");

        disciplinasPanel.setBackground(new java.awt.Color(255, 255, 255));
        disciplinasPanel.setForeground(new java.awt.Color(255, 255, 255));
        disciplinasPanel.setToolTipText("");
        disciplinasPanel.setFont(new java.awt.Font("Vivaldi", 1, 36)); // NOI18N
        disciplinasPanel.setName("SIM"); // NOI18N

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

        btnSalvarDis.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSalvarDis.setForeground(new java.awt.Color(51, 102, 0));
        btnSalvarDis.setText("Salvar");

        btnRemoverDis.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRemoverDis.setForeground(new java.awt.Color(255, 51, 51));
        btnRemoverDis.setText("Remover");
        btnRemoverDis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverDisActionPerformed(evt);
            }
        });

        btnLimparDis.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnLimparDis.setForeground(new java.awt.Color(255, 102, 102));
        btnLimparDis.setText("Limpar Campos");
        btnLimparDis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparDisActionPerformed(evt);
            }
        });

        btnAdicionarDis.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnAdicionarDis.setForeground(new java.awt.Color(0, 51, 255));
        btnAdicionarDis.setText("Adicionar");
        btnAdicionarDis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarDisActionPerformed(evt);
            }
        });

        tabelaDisiciplinas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cód. da Disciplina", "Nome da Disciplina", "Cód. do Curso", "Dia da Semana", "Hora Inicial", "Qtd. de Horas", "Cód. do Processo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
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

        javax.swing.GroupLayout disciplinasPanelLayout = new javax.swing.GroupLayout(disciplinasPanel);
        disciplinasPanel.setLayout(disciplinasPanelLayout);
        disciplinasPanelLayout.setHorizontalGroup(
            disciplinasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(disciplinasPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(disciplinasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 737, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                    .addComponent(txtDiaSemana)
                                    .addComponent(jLabelDis5))
                                .addGap(53, 53, 53)
                                .addGroup(disciplinasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtHoraInicial)
                                    .addComponent(jLabelDis6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(53, 53, 53)
                                .addGroup(disciplinasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtHorasDiarias)
                                    .addComponent(jLabelDis7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(disciplinasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCodigoProcesso)
                                    .addComponent(jLabelDis8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(74, 74, 74)
                        .addComponent(lblIcone1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(disciplinasPanelLayout.createSequentialGroup()
                        .addComponent(btnSalvarDis)
                        .addGap(96, 96, 96)
                        .addComponent(btnAdicionarDis)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRemoverDis)
                        .addGap(70, 70, 70)
                        .addComponent(btnLimparDis)))
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
                            .addComponent(jLabelDis5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtDiaSemana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(disciplinasPanelLayout.createSequentialGroup()
                            .addComponent(jLabelDis6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtHoraInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(btnSalvarDis)
                    .addComponent(btnAdicionarDis)
                    .addComponent(btnRemoverDis)
                    .addComponent(btnLimparDis))
                .addGap(388, 388, 388))
        );

        jContentPane.add(disciplinasPanel, "Disciplinas");
        disciplinasPanel.getAccessibleContext().setAccessibleName("Disciplinas");

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

        btnLimparCur.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnLimparCur.setForeground(new java.awt.Color(255, 102, 102));
        btnLimparCur.setText("Limpar Campos");
        btnLimparCur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparCurActionPerformed(evt);
            }
        });

        btnAdicionarCur.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 213, Short.MAX_VALUE)
                        .addComponent(btnRemoverCur)
                        .addGap(60, 60, 60)
                        .addComponent(btnLimparCur)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(cursosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvarCur)
                    .addComponent(btnAdicionarCur)
                    .addComponent(btnRemoverCur)
                    .addComponent(btnLimparCur))
                .addGap(389, 389, 389))
        );

        txtAreaCurso.getAccessibleContext().setAccessibleName("");

        jContentPane.add(cursosPanel, "Cursos");
        cursosPanel.getAccessibleContext().setAccessibleName("CursosPanel");

        getContentPane().add(jContentPane, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1014, 608));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoCursoActionPerformed

    private void btnRemoverCurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverCurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRemoverCurActionPerformed

    private void btnLimparCurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparCurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimparCurActionPerformed

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

    }//GEN-LAST:event_btnAdicionarCurActionPerformed

    private void txtNomeCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeCursoActionPerformed

    private void txtAreaCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAreaCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAreaCursoActionPerformed

    private void txtNomeDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeDisciplinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeDisciplinaActionPerformed

    private void txtCodigoDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoDisciplinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoDisciplinaActionPerformed

    private void btnRemoverDisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverDisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRemoverDisActionPerformed

    private void btnLimparDisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparDisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimparDisActionPerformed

    private void btnAdicionarDisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarDisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdicionarDisActionPerformed

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

    private void txtNomeProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeProfessorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeProfessorActionPerformed

    private void txtCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCPFActionPerformed

    private void btnRemoverProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverProActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRemoverProActionPerformed

    private void btnLimparProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparProActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimparProActionPerformed

    private void btnAdicionarProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarProActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdicionarProActionPerformed

    private void txtAreaProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAreaProfessorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAreaProfessorActionPerformed

    private void txtPontuacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPontuacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPontuacaoActionPerformed

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
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarCur;
    private javax.swing.JButton btnAdicionarDis;
    private javax.swing.JButton btnAdicionarPro;
    private javax.swing.JToggleButton btnCursos;
    private javax.swing.JToggleButton btnDisciplinas;
    private javax.swing.JToggleButton btnInscricoes;
    private javax.swing.JButton btnLimparCur;
    private javax.swing.JButton btnLimparDis;
    private javax.swing.JButton btnLimparPro;
    private javax.swing.JToggleButton btnProfessores;
    private javax.swing.JButton btnRemoverCur;
    private javax.swing.JButton btnRemoverDis;
    private javax.swing.JButton btnRemoverPro;
    private javax.swing.JButton btnSalvarCur;
    private javax.swing.JButton btnSalvarDis;
    private javax.swing.JButton btnSalvarPro;
    private javax.swing.JComboBox<String> cbxCodigoCurso;
    private javax.swing.JPanel consultasPanel;
    private javax.swing.JPanel cursosPanel;
    private javax.swing.JPanel disciplinasPanel;
    private javax.swing.JPanel inscricoesPanel;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jContentPane;
    private javax.swing.JLabel jLabelCur1;
    private javax.swing.JLabel jLabelCur2;
    private javax.swing.JLabel jLabelCur3;
    private javax.swing.JLabel jLabelDis1;
    private javax.swing.JLabel jLabelDis2;
    private javax.swing.JLabel jLabelDis3;
    private javax.swing.JLabel jLabelDis5;
    private javax.swing.JLabel jLabelDis6;
    private javax.swing.JLabel jLabelDis7;
    private javax.swing.JLabel jLabelDis8;
    private javax.swing.JLabel jLabelPro1;
    private javax.swing.JLabel jLabelPro2;
    private javax.swing.JLabel jLabelPro3;
    private javax.swing.JLabel jLabelPro4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbIcone3;
    private javax.swing.JLabel lblIcone;
    private javax.swing.JLabel lblIcone1;
    private javax.swing.JLabel lblIcone2;
    private javax.swing.JPanel professoresPanel;
    private javax.swing.JTable tabelaCursos;
    private javax.swing.JTable tabelaDisiciplinas;
    private javax.swing.JTable tabelaProfessores;
    private javax.swing.JTextField txtAreaCurso;
    private javax.swing.JTextField txtAreaProfessor;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtCodigoCurso;
    private javax.swing.JTextField txtCodigoDisciplina;
    private javax.swing.JTextField txtCodigoProcesso;
    private javax.swing.JTextField txtDiaSemana;
    private javax.swing.JTextField txtHoraInicial;
    private javax.swing.JTextField txtHorasDiarias;
    private javax.swing.JTextField txtNomeCurso;
    private javax.swing.JTextField txtNomeDisciplina;
    private javax.swing.JTextField txtNomeProfessor;
    private javax.swing.JTextField txtPontuacao;
    // End of variables declaration//GEN-END:variables
}
