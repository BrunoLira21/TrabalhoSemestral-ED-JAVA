package boundary;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import controller.GerenciadorCentral;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.net.URL;
import java.awt.event.ComponentAdapter; 
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class TelaLogin extends javax.swing.JFrame {
GerenciadorCentral gc = new GerenciadorCentral();
    private ImageIcon logoOriginal; 
    private boolean logoCarregadoComSucesso = false; 

    public TelaLogin() {
        initComponents();
      

    pnDireita.addComponentListener(new ComponentAdapter() {
        @Override
        public void componentResized(ComponentEvent e) {

        }
    });
    
    lbUsuario.addMouseListener(new MouseAdapter(){
        @Override
        public void mouseClicked(MouseEvent e){
            novoCadastro();
        }
    });
    ImageIcon iconeLogin;
    String caminhoLogin = "src/uteis/login.png";
    iconeLogin = new ImageIcon(caminhoLogin);
    lbLoginIcon.setIcon(iconeLogin);
    
    
    try {
        Image imagemOriginal = iconeLogin.getImage();
        Image imagemRedimensionada = imagemOriginal.getScaledInstance(100, 80, Image.SCALE_SMOOTH);
        
        ImageIcon logoRedimensionado = new ImageIcon(imagemRedimensionada);
        lbLoginIcon.setIcon(logoRedimensionado);
        
    } catch (Exception e) {
        e.printStackTrace();
        System.err.println("Erro ao redimensionar o logo dinamicamente.");
    }
    
    
    
    ImageIcon iconeFatec;
    String caminhoFatec = "src/uteis/logofatec.png";
    iconeFatec = new ImageIcon(caminhoFatec);
    lbLogoFatec.setIcon(iconeFatec);
    
    
    try {
        Image imagemOriginal = iconeFatec.getImage();
        Image imagemRedimensionada = imagemOriginal.getScaledInstance(164, 71, Image.SCALE_SMOOTH);
        
        ImageIcon logoRedimensionado = new ImageIcon(imagemRedimensionada);
        lbLogoFatec.setIcon(logoRedimensionado);
        
    } catch (Exception e) {
        e.printStackTrace();
        System.err.println("Erro ao redimensionar o logo dinamicamente.");
    }
    
    
    
 }





    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnEsquerda = new javax.swing.JPanel();
        lbLogin = new javax.swing.JLabel();
        lbLoginIcon = new javax.swing.JLabel();
        pnDireita = new javax.swing.JPanel();
        lbUsuario = new javax.swing.JLabel();
        lbSenha = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        pswSenha = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        lbprimeiroAcesso = new javax.swing.JLabel();
        lbCadastro = new javax.swing.JLabel();
        lbLogoFatec = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Professor");
        setAlwaysOnTop(true);
        setPreferredSize(new java.awt.Dimension(800, 800));
        setResizable(false);

        pnEsquerda.setBackground(new java.awt.Color(0, 102, 102));
        pnEsquerda.setPreferredSize(new java.awt.Dimension(200, 300));

        lbLogin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbLogin.setForeground(new java.awt.Color(255, 255, 255));
        lbLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbLogin.setText("LOGIN");

        javax.swing.GroupLayout pnEsquerdaLayout = new javax.swing.GroupLayout(pnEsquerda);
        pnEsquerda.setLayout(pnEsquerdaLayout);
        pnEsquerdaLayout.setHorizontalGroup(
            pnEsquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnEsquerdaLayout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addGroup(pnEsquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbLoginIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        pnEsquerdaLayout.setVerticalGroup(
            pnEsquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnEsquerdaLayout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addComponent(lbLoginIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(lbLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(161, 161, 161))
        );

        pnDireita.setBackground(new java.awt.Color(255, 255, 255));
        pnDireita.setPreferredSize(new java.awt.Dimension(200, 300));

        lbUsuario.setText("Usuário");

        lbSenha.setText("Senha");

        btnLogin.setText("Login");
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginMouseClicked(evt);
            }
        });

        lbprimeiroAcesso.setText("Primeiro Acesso?");

        lbCadastro.setText("Clique aqui!");
        lbCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbCadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbCadastroMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnDireitaLayout = new javax.swing.GroupLayout(pnDireita);
        pnDireita.setLayout(pnDireitaLayout);
        pnDireitaLayout.setHorizontalGroup(
            pnDireitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnDireitaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnLogin)
                .addGap(125, 125, 125))
            .addGroup(pnDireitaLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(pnDireitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbLogoFatec, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnDireitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnDireitaLayout.createSequentialGroup()
                            .addComponent(lbprimeiroAcesso, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(lbCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnDireitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnDireitaLayout.createSequentialGroup()
                                .addComponent(lbSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pswSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnDireitaLayout.createSequentialGroup()
                                .addComponent(lbUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        pnDireitaLayout.setVerticalGroup(
            pnDireitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDireitaLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lbLogoFatec, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnDireitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbUsuario)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(pnDireitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSenha)
                    .addComponent(pswSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(btnLogin)
                .addGap(53, 53, 53)
                .addGroup(pnDireitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbprimeiroAcesso)
                    .addComponent(lbCadastro))
                .addContainerGap(115, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnEsquerda, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnDireita, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnEsquerda, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(pnDireita, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(701, 423));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked
        GerenciadorCentral gc = new GerenciadorCentral();
        String usuario = txtUsuario.getText();
        String senha = new String(pswSenha.getPassword());
        
        boolean acesso = gc.validarLogin(usuario, senha);
        if(acesso){
        HomePage principal = null;
            try {
                principal = new HomePage();
            } catch (Exception ex) {
                Logger.getLogger(TelaLogin.class.getName()).log(Level.SEVERE, null, ex);
            }
        principal.setVisible(true);
        this.dispose();
        } else {
        JOptionPane.showMessageDialog(this, "Usuario ou senha incorretos", "Dados Incorretos", JOptionPane.ERROR_MESSAGE);
        txtUsuario.setText("");
        pswSenha.setText("");
        }
        
        
    }//GEN-LAST:event_btnLoginMouseClicked

    private void lbCadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCadastroMouseClicked
        novoCadastro();
    }//GEN-LAST:event_lbCadastroMouseClicked

    public void novoCadastro(){
    TelaCadastro tc = new TelaCadastro();
    tc.setVisible(true);
    this.dispose();
    }
    
    public static void main(String args[]) {
        FlatLightLaf.setup();
        UIManager.put("defaultFont", new Font("Segoe UI", Font.PLAIN, 16));
        UIManager.put("Button.arc", 14);
        UIManager.put("TextField.arc", 10);
        UIManager.put("PasswordField.arc", 10);
        UIManager.put("ComboBox.arc", 10);
        UIManager.put("Component.arc", 12);
        UIManager.put("ScrollBar.showButtons", false);
        UIManager.put("ScrollBar.width", 12);
        
        SwingUtilities.invokeLater(() -> {
            new TelaLogin().setVisible(true);
        });
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel lbCadastro;
    private javax.swing.JLabel lbLogin;
    private javax.swing.JLabel lbLoginIcon;
    private javax.swing.JLabel lbLogoFatec;
    private javax.swing.JLabel lbSenha;
    private javax.swing.JLabel lbUsuario;
    private javax.swing.JLabel lbprimeiroAcesso;
    private javax.swing.JPanel pnDireita;
    private javax.swing.JPanel pnEsquerda;
    private javax.swing.JPasswordField pswSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
