package boundary;
import com.formdev.flatlaf.FlatLightLaf;
import controller.GerenciadorCentral;
import java.awt.Image;
import java.awt.event.ComponentAdapter; 
import java.awt.event.ComponentEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TelaCadastro extends javax.swing.JFrame {
GerenciadorCentral gc = new GerenciadorCentral();

    public TelaCadastro() {
        initComponents();
        
        String caminho  = "src/uteis/logofatec.png";
        ImageIcon logofatec = new ImageIcon(caminho);
        Image ImagemLogoRedimensionada = logofatec.getImage().getScaledInstance(130, 50, Image.SCALE_SMOOTH);
        ImageIcon logofatecRedimensionado = new ImageIcon(ImagemLogoRedimensionada);
        lbLogoFatec.setIcon(logofatecRedimensionado);
          
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnPrincipal = new javax.swing.JPanel();
        pnEsquerda = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnDireita = new javax.swing.JPanel();
        lbUsuario = new javax.swing.JLabel();
        pnPreenchimentoVertical = new javax.swing.JPanel();
        txtUsuario = new javax.swing.JTextField();
        lbSenha = new javax.swing.JLabel();
        lbLogo = new javax.swing.JLabel();
        pnPreenchimentoSuperior = new javax.swing.JPanel();
        btnCadastrar = new javax.swing.JButton();
        pnPreenchimentoVertical1 = new javax.swing.JPanel();
        pnPreenchimentoHorizontalFim = new javax.swing.JPanel();
        pnPreenchimentoHorizontalInicio = new javax.swing.JPanel();
        pnPreenchimentoVertical2 = new javax.swing.JPanel();
        jPasswordField1 = new javax.swing.JPasswordField();
        lbSenha1 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        lbLogoFatec = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnPrincipal.setLayout(new java.awt.GridLayout(1, 2));

        pnEsquerda.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bem vindo!");

        javax.swing.GroupLayout pnEsquerdaLayout = new javax.swing.GroupLayout(pnEsquerda);
        pnEsquerda.setLayout(pnEsquerdaLayout);
        pnEsquerdaLayout.setHorizontalGroup(
            pnEsquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnEsquerdaLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );
        pnEsquerdaLayout.setVerticalGroup(
            pnEsquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnEsquerdaLayout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(195, Short.MAX_VALUE))
        );

        pnPrincipal.add(pnEsquerda);

        pnDireita.setBackground(new java.awt.Color(255, 255, 255));

        lbUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbUsuario.setForeground(new java.awt.Color(0, 128, 96));
        lbUsuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbUsuario.setText("Usuario");
        lbUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout pnPreenchimentoVerticalLayout = new javax.swing.GroupLayout(pnPreenchimentoVertical);
        pnPreenchimentoVertical.setLayout(pnPreenchimentoVerticalLayout);
        pnPreenchimentoVerticalLayout.setHorizontalGroup(
            pnPreenchimentoVerticalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnPreenchimentoVerticalLayout.setVerticalGroup(
            pnPreenchimentoVerticalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        txtUsuario.setColumns(20);
        txtUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUsuario.setMinimumSize(new java.awt.Dimension(100, 22));

        lbSenha.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbSenha.setForeground(new java.awt.Color(0, 128, 96));
        lbSenha.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbSenha.setText("Confirmar Senha");

        lbLogo.setBackground(new java.awt.Color(255, 255, 255));
        lbLogo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbLogo.setForeground(new java.awt.Color(0, 128, 96));
        lbLogo.setText("Cadastro de Usuário");

        javax.swing.GroupLayout pnPreenchimentoSuperiorLayout = new javax.swing.GroupLayout(pnPreenchimentoSuperior);
        pnPreenchimentoSuperior.setLayout(pnPreenchimentoSuperiorLayout);
        pnPreenchimentoSuperiorLayout.setHorizontalGroup(
            pnPreenchimentoSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnPreenchimentoSuperiorLayout.setVerticalGroup(
            pnPreenchimentoSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btnCadastrar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(0, 128, 96));
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnPreenchimentoVertical1Layout = new javax.swing.GroupLayout(pnPreenchimentoVertical1);
        pnPreenchimentoVertical1.setLayout(pnPreenchimentoVertical1Layout);
        pnPreenchimentoVertical1Layout.setHorizontalGroup(
            pnPreenchimentoVertical1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnPreenchimentoVertical1Layout.setVerticalGroup(
            pnPreenchimentoVertical1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnPreenchimentoHorizontalFimLayout = new javax.swing.GroupLayout(pnPreenchimentoHorizontalFim);
        pnPreenchimentoHorizontalFim.setLayout(pnPreenchimentoHorizontalFimLayout);
        pnPreenchimentoHorizontalFimLayout.setHorizontalGroup(
            pnPreenchimentoHorizontalFimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnPreenchimentoHorizontalFimLayout.setVerticalGroup(
            pnPreenchimentoHorizontalFimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnPreenchimentoHorizontalInicioLayout = new javax.swing.GroupLayout(pnPreenchimentoHorizontalInicio);
        pnPreenchimentoHorizontalInicio.setLayout(pnPreenchimentoHorizontalInicioLayout);
        pnPreenchimentoHorizontalInicioLayout.setHorizontalGroup(
            pnPreenchimentoHorizontalInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnPreenchimentoHorizontalInicioLayout.setVerticalGroup(
            pnPreenchimentoHorizontalInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnPreenchimentoVertical2Layout = new javax.swing.GroupLayout(pnPreenchimentoVertical2);
        pnPreenchimentoVertical2.setLayout(pnPreenchimentoVertical2Layout);
        pnPreenchimentoVertical2Layout.setHorizontalGroup(
            pnPreenchimentoVertical2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnPreenchimentoVertical2Layout.setVerticalGroup(
            pnPreenchimentoVertical2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPasswordField1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPasswordField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lbSenha1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbSenha1.setForeground(new java.awt.Color(0, 128, 96));
        lbSenha1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbSenha1.setText("Senha");
        lbSenha1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jPasswordField2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPasswordField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout pnDireitaLayout = new javax.swing.GroupLayout(pnDireita);
        pnDireita.setLayout(pnDireitaLayout);
        pnDireitaLayout.setHorizontalGroup(
            pnDireitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDireitaLayout.createSequentialGroup()
                .addGroup(pnDireitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnDireitaLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnDireitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbSenha1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbUsuario, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(51, 51, 51)
                        .addGroup(pnDireitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPasswordField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1))
                    .addComponent(pnPreenchimentoSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnPreenchimentoVertical, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnPreenchimentoVertical1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnPreenchimentoHorizontalFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnPreenchimentoVertical2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnPreenchimentoHorizontalInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnDireitaLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(lbLogo))
                    .addGroup(pnDireitaLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lbSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(96, 96, 96))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnDireitaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbLogoFatec, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
            .addGroup(pnDireitaLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnDireitaLayout.setVerticalGroup(
            pnDireitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDireitaLayout.createSequentialGroup()
                .addGroup(pnDireitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnPreenchimentoSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnPreenchimentoVertical, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnPreenchimentoVertical1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnPreenchimentoHorizontalFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnPreenchimentoVertical2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnPreenchimentoHorizontalInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(lbLogoFatec, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbLogo)
                .addGap(18, 18, 18)
                .addGroup(pnDireitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbUsuario))
                .addGap(19, 19, 19)
                .addGroup(pnDireitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbSenha1))
                .addGap(19, 19, 19)
                .addGroup(pnDireitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(btnCadastrar)
                .addContainerGap())
        );

        pnPrincipal.add(pnDireita);

        getContentPane().add(pnPrincipal, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(701, 423));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        
        String usuario = txtUsuario.getText();
        String senha = new String(jPasswordField1.getPassword());
        String senha1 = new String(jPasswordField2.getPassword());
        boolean dados = gc.validarCadastro(this, usuario, senha, senha1);
        if (dados){
            TelaLogin login = new TelaLogin();
            login.setVisible(true);
            this.dispose();
        } else {
            jPasswordField1.setText("");
            jPasswordField2.setText("");
            txtUsuario.setText("");
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JPasswordField jPasswordField1;
    public javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JLabel lbLogo;
    private javax.swing.JLabel lbLogoFatec;
    private javax.swing.JLabel lbSenha;
    private javax.swing.JLabel lbSenha1;
    public javax.swing.JLabel lbUsuario;
    private javax.swing.JPanel pnDireita;
    private javax.swing.JPanel pnEsquerda;
    private javax.swing.JPanel pnPreenchimentoHorizontalFim;
    private javax.swing.JPanel pnPreenchimentoHorizontalInicio;
    private javax.swing.JPanel pnPreenchimentoSuperior;
    private javax.swing.JPanel pnPreenchimentoVertical;
    private javax.swing.JPanel pnPreenchimentoVertical1;
    private javax.swing.JPanel pnPreenchimentoVertical2;
    private javax.swing.JPanel pnPrincipal;
    public javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
