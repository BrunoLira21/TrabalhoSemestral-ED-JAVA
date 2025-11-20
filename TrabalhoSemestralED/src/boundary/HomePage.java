package boundary;

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
                JPanel source = (JPanel) e.getSource(); // Converte para JPanel
                if (source == cursosItem) {
                    cardLayout.show(jContentPane, "Cursos");
                } else if (source == ProfessoresItem) {
                    cardLayout.show(jContentPane, "Professores");
                } else if(source == disciplinasItem){
                    cardLayout.show(jContentPane, "Disciplinas");
                } else if(source == inscricoesItem){
                    cardLayout.show(jContentPane, "Inscrições");
                } else if(source == consultasItem){
                    cardLayout.show(jContentPane, "Consultas");
                }
            }
            
        };
        
        cursosItem.addMouseListener(menuListener);
        ProfessoresItem.addMouseListener(menuListener);
        disciplinasItem.addMouseListener(menuListener);
        inscricoesItem.addMouseListener(menuListener);
        consultasItem.addMouseListener(menuListener);
        
        
        ImageIcon iconeHomePage;
        String caminho = "src/uteis/logofatec.png";
        iconeHomePage = new ImageIcon(caminho);
        lblIcone.setIcon(iconeHomePage);
        
        
        try {
        Image imagemOriginal = iconeHomePage.getImage();
        Image imagemRedimensionada = imagemOriginal.getScaledInstance(123, 53, Image.SCALE_SMOOTH);
        
        ImageIcon logoRedimensionado = new ImageIcon(imagemRedimensionada);
        lblIcone.setIcon(logoRedimensionado);
        
    } catch (Exception e) {
        e.printStackTrace();
        System.err.println("Erro ao redimensionar o logo dinamicamente.");
    }
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuLateral = new javax.swing.JPanel();
        consultasItem = new javax.swing.JPanel();
        jLabel = new javax.swing.JLabel();
        cursosItem = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        disciplinasItem = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ProfessoresItem = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        inscricoesItem = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jContentPane = new javax.swing.JPanel();
        consultasPanel = new javax.swing.JPanel();
        inscricoesPanel = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        professoresPanel = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        disciplinasPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        cursosPanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnAdicionar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblIcone = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenuLateral.setBackground(new java.awt.Color(255, 51, 51));
        jMenuLateral.setForeground(new java.awt.Color(255, 255, 255));
        jMenuLateral.setPreferredSize(new java.awt.Dimension(200, 500));
        jMenuLateral.setLayout(new javax.swing.BoxLayout(jMenuLateral, javax.swing.BoxLayout.Y_AXIS));

        consultasItem.setBackground(new java.awt.Color(0, 102, 102));
        consultasItem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));
        consultasItem.setPreferredSize(new java.awt.Dimension(200, 20));

        jLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel.setForeground(new java.awt.Color(255, 255, 255));
        jLabel.setText("Consultas");

        javax.swing.GroupLayout consultasItemLayout = new javax.swing.GroupLayout(consultasItem);
        consultasItem.setLayout(consultasItemLayout);
        consultasItemLayout.setHorizontalGroup(
            consultasItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, consultasItemLayout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(jLabel)
                .addGap(51, 51, 51))
        );
        consultasItemLayout.setVerticalGroup(
            consultasItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, consultasItemLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel)
                .addGap(45, 45, 45))
        );

        jMenuLateral.add(consultasItem);
        consultasItem.getAccessibleContext().setAccessibleName("Consultas");

        cursosItem.setBackground(new java.awt.Color(0, 102, 102));
        cursosItem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));
        cursosItem.setMinimumSize(new java.awt.Dimension(100, 1));
        cursosItem.setName("Cursos"); // NOI18N
        cursosItem.setPreferredSize(new java.awt.Dimension(200, 20));
        cursosItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cursosItemMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cursos");

        javax.swing.GroupLayout cursosItemLayout = new javax.swing.GroupLayout(cursosItem);
        cursosItem.setLayout(cursosItemLayout);
        cursosItemLayout.setHorizontalGroup(
            cursosItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cursosItemLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        cursosItemLayout.setVerticalGroup(
            cursosItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cursosItemLayout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(45, 45, 45))
        );

        jMenuLateral.add(cursosItem);
        cursosItem.getAccessibleContext().setAccessibleName("Cursos");

        disciplinasItem.setBackground(new java.awt.Color(0, 102, 102));
        disciplinasItem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));
        disciplinasItem.setName("Disciplinas"); // NOI18N
        disciplinasItem.setPreferredSize(new java.awt.Dimension(200, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Disciplinas");

        javax.swing.GroupLayout disciplinasItemLayout = new javax.swing.GroupLayout(disciplinasItem);
        disciplinasItem.setLayout(disciplinasItemLayout);
        disciplinasItemLayout.setHorizontalGroup(
            disciplinasItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(disciplinasItemLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        disciplinasItemLayout.setVerticalGroup(
            disciplinasItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, disciplinasItemLayout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(45, 45, 45))
        );

        jMenuLateral.add(disciplinasItem);
        disciplinasItem.getAccessibleContext().setAccessibleName("Disciplinas");

        ProfessoresItem.setBackground(new java.awt.Color(0, 102, 102));
        ProfessoresItem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));
        ProfessoresItem.setName("Professores"); // NOI18N
        ProfessoresItem.setPreferredSize(new java.awt.Dimension(200, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Professores");

        javax.swing.GroupLayout ProfessoresItemLayout = new javax.swing.GroupLayout(ProfessoresItem);
        ProfessoresItem.setLayout(ProfessoresItemLayout);
        ProfessoresItemLayout.setHorizontalGroup(
            ProfessoresItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProfessoresItemLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel3)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        ProfessoresItemLayout.setVerticalGroup(
            ProfessoresItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProfessoresItemLayout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(46, 46, 46))
        );

        jMenuLateral.add(ProfessoresItem);
        ProfessoresItem.getAccessibleContext().setAccessibleName("Professores");

        inscricoesItem.setBackground(new java.awt.Color(0, 102, 102));
        inscricoesItem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));
        inscricoesItem.setName("inscricoesItem"); // NOI18N
        inscricoesItem.setPreferredSize(new java.awt.Dimension(200, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Inscrições");

        javax.swing.GroupLayout inscricoesItemLayout = new javax.swing.GroupLayout(inscricoesItem);
        inscricoesItem.setLayout(inscricoesItemLayout);
        inscricoesItemLayout.setHorizontalGroup(
            inscricoesItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inscricoesItemLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel4)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        inscricoesItemLayout.setVerticalGroup(
            inscricoesItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inscricoesItemLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel4)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jMenuLateral.add(inscricoesItem);
        inscricoesItem.getAccessibleContext().setAccessibleName("Inscrições");

        getContentPane().add(jMenuLateral, java.awt.BorderLayout.LINE_START);

        jContentPane.setBackground(new java.awt.Color(255, 255, 255));
        jContentPane.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout consultasPanelLayout = new javax.swing.GroupLayout(consultasPanel);
        consultasPanel.setLayout(consultasPanelLayout);
        consultasPanelLayout.setHorizontalGroup(
            consultasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        consultasPanelLayout.setVerticalGroup(
            consultasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
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
                .addContainerGap(426, Short.MAX_VALUE))
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

        professoresPanel.setBackground(new java.awt.Color(0, 153, 153));

        jButton3.setText("email");

        javax.swing.GroupLayout professoresPanelLayout = new javax.swing.GroupLayout(professoresPanel);
        professoresPanel.setLayout(professoresPanelLayout);
        professoresPanelLayout.setHorizontalGroup(
            professoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(professoresPanelLayout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addComponent(jButton3)
                .addContainerGap(481, Short.MAX_VALUE))
        );
        professoresPanelLayout.setVerticalGroup(
            professoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, professoresPanelLayout.createSequentialGroup()
                .addContainerGap(350, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(227, 227, 227))
        );

        jContentPane.add(professoresPanel, "Professores");
        professoresPanel.getAccessibleContext().setAccessibleName("Professores");

        disciplinasPanel.setBackground(new java.awt.Color(255, 0, 0));
        disciplinasPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 1, 10, 1, new java.awt.Color(0, 0, 102)));
        disciplinasPanel.setForeground(new java.awt.Color(255, 255, 0));
        disciplinasPanel.setToolTipText("");
        disciplinasPanel.setFont(new java.awt.Font("Vivaldi", 1, 36)); // NOI18N
        disciplinasPanel.setName("SIM"); // NOI18N

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("<HTML> COLEVATI PARA <br>PRESIDENTE DA FATEC ZL 2026");

        javax.swing.GroupLayout disciplinasPanelLayout = new javax.swing.GroupLayout(disciplinasPanel);
        disciplinasPanel.setLayout(disciplinasPanelLayout);
        disciplinasPanelLayout.setHorizontalGroup(
            disciplinasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, disciplinasPanelLayout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        disciplinasPanelLayout.setVerticalGroup(
            disciplinasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(disciplinasPanelLayout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(273, Short.MAX_VALUE))
        );

        jContentPane.add(disciplinasPanel, "Disciplinas");
        disciplinasPanel.getAccessibleContext().setAccessibleName("Disciplinas");

        cursosPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Área de Conhecimento");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Nome");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Código do Curso");

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField1.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        btnSalvar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(51, 102, 0));
        btnSalvar.setText("Salvar");

        btnRemover.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRemover.setForeground(new java.awt.Color(255, 51, 51));
        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        btnLimpar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnLimpar.setForeground(new java.awt.Color(255, 102, 102));
        btnLimpar.setText("Limpar Campos");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnAdicionar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnAdicionar.setForeground(new java.awt.Color(0, 51, 255));
        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout cursosPanelLayout = new javax.swing.GroupLayout(cursosPanel);
        cursosPanel.setLayout(cursosPanelLayout);
        cursosPanelLayout.setHorizontalGroup(
            cursosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cursosPanelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(cursosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cursosPanelLayout.createSequentialGroup()
                        .addGroup(cursosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addGroup(cursosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addGroup(cursosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(40, 40, 40)
                        .addComponent(lblIcone, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cursosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 712, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cursosPanelLayout.createSequentialGroup()
                            .addComponent(btnSalvar)
                            .addGap(96, 96, 96)
                            .addComponent(btnAdicionar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 213, Short.MAX_VALUE)
                            .addComponent(btnRemover)
                            .addGap(60, 60, 60)
                            .addComponent(btnLimpar))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        cursosPanelLayout.setVerticalGroup(
            cursosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cursosPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(cursosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cursosPanelLayout.createSequentialGroup()
                        .addGroup(cursosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(cursosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblIcone, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(cursosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnAdicionar)
                    .addComponent(btnRemover)
                    .addComponent(btnLimpar))
                .addGap(396, 396, 396))
        );

        jContentPane.add(cursosPanel, "Cursos");
        cursosPanel.getAccessibleContext().setAccessibleName("CursosPanel");

        getContentPane().add(jContentPane, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1014, 608));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cursosItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cursosItemMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cursosItemMouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ProfessoresItem;
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JPanel consultasItem;
    private javax.swing.JPanel consultasPanel;
    private javax.swing.JPanel cursosItem;
    private javax.swing.JPanel cursosPanel;
    private javax.swing.JPanel disciplinasItem;
    private javax.swing.JPanel disciplinasPanel;
    private javax.swing.JPanel inscricoesItem;
    private javax.swing.JPanel inscricoesPanel;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jContentPane;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jMenuLateral;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel lblIcone;
    private javax.swing.JPanel professoresPanel;
    // End of variables declaration//GEN-END:variables
}
