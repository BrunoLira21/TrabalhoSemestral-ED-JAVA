package ComponentesUIUteis;

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
                if (source == dashboardItem) {
                    cardLayout.show(jContentPane, "Dashboard");
                } else if (source == emailItem) {
                    cardLayout.show(jContentPane, "email");
                } else if(source == clientesItem){
                    cardLayout.show(jContentPane, "clientes");
                }
            }
            
        };
        
        dashboardItem.addMouseListener(menuListener);
        emailItem.addMouseListener(menuListener);
        clientesItem.addMouseListener(menuListener);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcabecalho = new javax.swing.JPanel();
        jMenuLateral = new javax.swing.JPanel();
        dashboardItem = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        clientesItem = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        emailItem = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jContentPane = new javax.swing.JPanel();
        dashboardPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        clientesPanel = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        emailPanel = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jcabecalho.setBackground(new java.awt.Color(255, 0, 0));
        jcabecalho.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jcabecalhoLayout = new javax.swing.GroupLayout(jcabecalho);
        jcabecalho.setLayout(jcabecalhoLayout);
        jcabecalhoLayout.setHorizontalGroup(
            jcabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jcabecalhoLayout.setVerticalGroup(
            jcabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jcabecalho, java.awt.BorderLayout.PAGE_START);

        jMenuLateral.setBackground(new java.awt.Color(255, 51, 51));
        jMenuLateral.setForeground(new java.awt.Color(255, 255, 255));
        jMenuLateral.setPreferredSize(new java.awt.Dimension(200, 500));
        jMenuLateral.setLayout(new javax.swing.BoxLayout(jMenuLateral, javax.swing.BoxLayout.Y_AXIS));

        dashboardItem.setMinimumSize(new java.awt.Dimension(100, 1));
        dashboardItem.setName("Dashboard"); // NOI18N
        dashboardItem.setPreferredSize(new java.awt.Dimension(200, 10));
        dashboardItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboardItemMouseClicked(evt);
            }
        });

        jLabel1.setText("Dashboard");

        javax.swing.GroupLayout dashboardItemLayout = new javax.swing.GroupLayout(dashboardItem);
        dashboardItem.setLayout(dashboardItemLayout);
        dashboardItemLayout.setHorizontalGroup(
            dashboardItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardItemLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        dashboardItemLayout.setVerticalGroup(
            dashboardItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardItemLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel1)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        jMenuLateral.add(dashboardItem);

        clientesItem.setName("Clientes"); // NOI18N
        clientesItem.setPreferredSize(new java.awt.Dimension(200, 30));

        jLabel2.setText("Clientes");

        javax.swing.GroupLayout clientesItemLayout = new javax.swing.GroupLayout(clientesItem);
        clientesItem.setLayout(clientesItemLayout);
        clientesItemLayout.setHorizontalGroup(
            clientesItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clientesItemLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        clientesItemLayout.setVerticalGroup(
            clientesItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clientesItemLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel2)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        jMenuLateral.add(clientesItem);

        emailItem.setName("email"); // NOI18N
        emailItem.setPreferredSize(new java.awt.Dimension(200, 30));

        jLabel3.setText("Email");

        javax.swing.GroupLayout emailItemLayout = new javax.swing.GroupLayout(emailItem);
        emailItem.setLayout(emailItemLayout);
        emailItemLayout.setHorizontalGroup(
            emailItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(emailItemLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        emailItemLayout.setVerticalGroup(
            emailItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(emailItemLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel3)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        jMenuLateral.add(emailItem);

        getContentPane().add(jMenuLateral, java.awt.BorderLayout.LINE_START);

        jContentPane.setBackground(new java.awt.Color(255, 255, 255));
        jContentPane.setLayout(new java.awt.CardLayout());

        dashboardPanel.setBackground(new java.awt.Color(255, 255, 51));

        jButton1.setText("Dashboard");

        javax.swing.GroupLayout dashboardPanelLayout = new javax.swing.GroupLayout(dashboardPanel);
        dashboardPanel.setLayout(dashboardPanelLayout);
        dashboardPanelLayout.setHorizontalGroup(
            dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardPanelLayout.createSequentialGroup()
                .addGap(273, 273, 273)
                .addComponent(jButton1)
                .addContainerGap(439, Short.MAX_VALUE))
        );
        dashboardPanelLayout.setVerticalGroup(
            dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardPanelLayout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addComponent(jButton1)
                .addContainerGap(264, Short.MAX_VALUE))
        );

        jContentPane.add(dashboardPanel, "Dashboard");

        clientesPanel.setBackground(new java.awt.Color(51, 255, 0));

        jButton2.setText("Clientes");

        javax.swing.GroupLayout clientesPanelLayout = new javax.swing.GroupLayout(clientesPanel);
        clientesPanel.setLayout(clientesPanelLayout);
        clientesPanelLayout.setHorizontalGroup(
            clientesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clientesPanelLayout.createSequentialGroup()
                .addGap(302, 302, 302)
                .addComponent(jButton2)
                .addContainerGap(426, Short.MAX_VALUE))
        );
        clientesPanelLayout.setVerticalGroup(
            clientesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clientesPanelLayout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addComponent(jButton2)
                .addContainerGap(268, Short.MAX_VALUE))
        );

        jContentPane.add(clientesPanel, "clientes");

        emailPanel.setBackground(new java.awt.Color(0, 153, 153));

        jButton3.setText("email");

        javax.swing.GroupLayout emailPanelLayout = new javax.swing.GroupLayout(emailPanel);
        emailPanel.setLayout(emailPanelLayout);
        emailPanelLayout.setHorizontalGroup(
            emailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(emailPanelLayout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addComponent(jButton3)
                .addContainerGap(481, Short.MAX_VALUE))
        );
        emailPanelLayout.setVerticalGroup(
            emailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, emailPanelLayout.createSequentialGroup()
                .addContainerGap(250, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(227, 227, 227))
        );

        jContentPane.add(emailPanel, "email");

        getContentPane().add(jContentPane, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1014, 608));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dashboardItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardItemMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_dashboardItemMouseClicked


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel clientesItem;
    private javax.swing.JPanel clientesPanel;
    private javax.swing.JPanel dashboardItem;
    private javax.swing.JPanel dashboardPanel;
    private javax.swing.JPanel emailItem;
    private javax.swing.JPanel emailPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jContentPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jMenuLateral;
    private javax.swing.JPanel jcabecalho;
    // End of variables declaration//GEN-END:variables
}
