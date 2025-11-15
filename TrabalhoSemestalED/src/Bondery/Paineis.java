package Bondery;
import com.formdev.flatlaf.FlatLightLaf;


import javax.swing.ImageIcon;
import java.awt.Image;
import java.net.URL;
import java.awt.event.ComponentAdapter; 
import java.awt.event.ComponentEvent;   

public class Paineis extends javax.swing.JFrame {

    private ImageIcon logoOriginal; 
    private boolean logoCarregadoComSucesso = false; 

    public Paineis() {
        initComponents();
      
        carregarImagemOriginal();

    pnDireita.addComponentListener(new ComponentAdapter() {
        @Override
        public void componentResized(ComponentEvent e) {
            atualizarLogoRedimensionado();
        }
    });
}

    private void carregarImagemOriginal() {
    try {
        String caminhoString = "/uteis/logofatec.png"; 
        URL caminhoURL = Paineis.class.getResource(caminhoString);
        
        if (caminhoURL == null) {
            System.err.println("Imagem não encontrada em: " + caminhoString);
            lbLogo.setText("Logo não encontrado");
            this.logoCarregadoComSucesso = false;
        } else {
            // Carrega e armazena na variável de classe
            this.logoOriginal = new ImageIcon(caminhoURL); 
            this.logoCarregadoComSucesso = true;
        }
    } catch (Exception e) {
        e.printStackTrace();
        System.err.println("Erro ao carregar o logo original.");
        this.logoCarregadoComSucesso = false;
    }
}

private void atualizarLogoRedimensionado() {
    // Se a imagem não foi carregada, não faz nada
    if (!this.logoCarregadoComSucesso) {
        return;
    }

    // Pega a largura ATUAL do painel branco
    int larguraPainel = pnDireita.getWidth();
    
    // Se o painel for muito pequeno, não faz nada
    if (larguraPainel < 10) { 
        return;
    }

    // --- Lógica do Tamanho ---
    int novaLargura = (int) (larguraPainel * 0.3);

    // Para manter a proporção da imagem (evitar distorção):
    int larguraOriginal = logoOriginal.getIconWidth();
    int alturaOriginal = logoOriginal.getIconHeight();
    
    // Calcula a nova altura baseado na nova largura (Regra de três)
    int novaAltura = (novaLargura * alturaOriginal) / larguraOriginal;
    
    // Evita erro se o cálculo der 0
    if (novaLargura <= 0) novaLargura = 1;
    if (novaAltura <= 0) novaAltura = 1;
    //-----------------------------------------------------
    try {
        Image imagemOriginal = logoOriginal.getImage();
        Image imagemRedimensionada = imagemOriginal.getScaledInstance(
                novaLargura, 
                novaAltura, 
                Image.SCALE_SMOOTH
        );
        
        ImageIcon logoRedimensionado = new ImageIcon(imagemRedimensionada);
        lbLogo.setIcon(logoRedimensionado);
        
    } catch (Exception e) {
        e.printStackTrace();
        System.err.println("Erro ao redimensionar o logo dinamicamente.");
    }
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
        txtSenha = new javax.swing.JTextField();
        lbLogo = new javax.swing.JLabel();
        pnPreenchimentoSuperior = new javax.swing.JPanel();
        btnLogin = new javax.swing.JButton();
        pnPreenchimentoVertical1 = new javax.swing.JPanel();
        pnPreenchimentoHorizontalFim = new javax.swing.JPanel();
        pnPreenchimentoHorizontalInicio = new javax.swing.JPanel();
        pnPreenchimentoVertical2 = new javax.swing.JPanel();

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

        lbUsuario.setText("Usuario");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
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
        txtUsuario.setMinimumSize(new java.awt.Dimension(100, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.2;
        pnDireita.add(txtUsuario, gridBagConstraints);

        lbSenha.setText("Senha");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        pnDireita.add(lbSenha, gridBagConstraints);

        txtSenha.setColumns(20);
        txtSenha.setMinimumSize(new java.awt.Dimension(100, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        pnDireita.add(txtSenha, gridBagConstraints);
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

        btnLogin.setText("Login");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        pnDireita.add(btnLogin, gridBagConstraints);

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
        gridBagConstraints.gridy = 5;
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

        pnPrincipal.add(pnDireita);

        getContentPane().add(pnPrincipal, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(414, 308));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        FlatLightLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Paineis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel lbLogo;
    private javax.swing.JLabel lbSenha;
    private javax.swing.JLabel lbUsuario;
    private javax.swing.JPanel pnDireita;
    private javax.swing.JPanel pnEsquerda;
    private javax.swing.JPanel pnPreenchimentoHorizontalFim;
    private javax.swing.JPanel pnPreenchimentoHorizontalInicio;
    private javax.swing.JPanel pnPreenchimentoSuperior;
    private javax.swing.JPanel pnPreenchimentoVertical;
    private javax.swing.JPanel pnPreenchimentoVertical1;
    private javax.swing.JPanel pnPreenchimentoVertical2;
    private javax.swing.JPanel pnPrincipal;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
