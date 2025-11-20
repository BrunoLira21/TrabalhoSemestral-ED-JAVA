package boundary;
import com.formdev.flatlaf.FlatLightLaf;
import controller.GerenciadorCentral;
import java.awt.event.ComponentAdapter; 
import java.awt.event.ComponentEvent;
import javax.swing.JOptionPane;

public class TelaCadastro extends javax.swing.JFrame {
GerenciadorCentral gc = new GerenciadorCentral();

    public TelaCadastro() {
        initComponents();
          
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        pnPrincipal = new javax.swing.JPanel();
        pnEsquerda = new javax.swing.JPanel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnPrincipal.setLayout(new java.awt.GridLayout(1, 2));

        pnEsquerda.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout pnEsquerdaLayout = new javax.swing.GroupLayout(pnEsquerda);
        pnEsquerda.setLayout(pnEsquerdaLayout);
        pnEsquerdaLayout.setHorizontalGroup(
            pnEsquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        pnEsquerdaLayout.setVerticalGroup(
            pnEsquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pnPrincipal.add(pnEsquerda);

        pnDireita.setBackground(new java.awt.Color(255, 255, 255));
        pnDireita.setLayout(new java.awt.GridBagLayout());

        lbUsuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbUsuario.setText("Usuario");
        lbUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        pnDireita.add(lbUsuario, gridBagConstraints);

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

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.weighty = 1.0;
        pnDireita.add(pnPreenchimentoVertical, gridBagConstraints);

        txtUsuario.setColumns(20);
        txtUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUsuario.setMinimumSize(new java.awt.Dimension(100, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.2;
        pnDireita.add(txtUsuario, gridBagConstraints);

        lbSenha.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbSenha.setText("Confirmar Senha");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 3;
        pnDireita.add(lbSenha, gridBagConstraints);

        lbLogo.setBackground(new java.awt.Color(255, 255, 255));
        lbLogo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbLogo.setText("Cadastro de Usuário");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        pnDireita.add(lbLogo, gridBagConstraints);

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

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.weighty = 0.5;
        pnDireita.add(pnPreenchimentoSuperior, gridBagConstraints);

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        pnDireita.add(btnCadastrar, gridBagConstraints);

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

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.weighty = 0.5;
        pnDireita.add(pnPreenchimentoVertical1, gridBagConstraints);

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

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.5;
        gridBagConstraints.weighty = 1.0;
        pnDireita.add(pnPreenchimentoHorizontalFim, gridBagConstraints);

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

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.5;
        gridBagConstraints.weighty = 1.0;
        pnDireita.add(pnPreenchimentoHorizontalInicio, gridBagConstraints);

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

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.weighty = 0.5;
        pnDireita.add(pnPreenchimentoVertical2, gridBagConstraints);

        jPasswordField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.2;
        pnDireita.add(jPasswordField1, gridBagConstraints);

        lbSenha1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbSenha1.setText("Senha");
        lbSenha1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        pnDireita.add(lbSenha1, gridBagConstraints);

        jPasswordField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.2;
        pnDireita.add(jPasswordField2, gridBagConstraints);

        pnPrincipal.add(pnDireita);

        getContentPane().add(pnPrincipal, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(414, 308));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        
        String usuario = txtUsuario.getText();
        String senha = new String(jPasswordField1.getPassword());
        String senha1 = new String(jPasswordField2.getPassword());
        boolean dados = gc.validarCadastro(usuario, senha, senha1);
        if (dados){
            TelaLogin login = new TelaLogin();
            login.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos", "Login", JOptionPane.ERROR_MESSAGE);
            jPasswordField1.setText("");
            jPasswordField2.setText("");
            txtUsuario.setText("");
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void jPasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField2ActionPerformed

    public static void main(String args[]) {
        FlatLightLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    public javax.swing.JPasswordField jPasswordField1;
    public javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JLabel lbLogo;
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
