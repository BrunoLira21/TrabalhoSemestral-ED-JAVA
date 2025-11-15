package ComponentesUIUteis;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.EmptyBorder;

public class MenuItemModel extends JPanel {
    private int iconWidth = 20;
    private int iconHeight = 20;
    private String itemName;
    private ImageIcon icon;
    private CardLayout cardLayout;
    private JPanel contentPanel;
    private JLabel menuLabel;

    public MenuItemModel(String itemName, CardLayout cardLayout, JPanel contentPanel) {
        initComponents();
        this.itemName = itemName;
        this.cardLayout = cardLayout;
        this.contentPanel = contentPanel;
        menuLabel.setText(itemName);
    }

    private void initComponents() {
        setOpaque(false);
        setBorder(new EmptyBorder(10, 15, 10, 15));
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        setLayout(new BorderLayout());

        menuLabel = new JLabel("MenuItem");
        menuLabel.setForeground(Color.WHITE);
        menuLabel.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        menuLabel.setIconTextGap(10);
        add(menuLabel, BorderLayout.CENTER);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                setBackground(new Color(80, 80, 80));
                setOpaque(true);
                repaint();
            }
            @Override
            public void mouseExited(MouseEvent e) {
                setOpaque(false);
                repaint();
            }
            @Override
            public void mouseClicked(MouseEvent e) {
                if (cardLayout != null && contentPanel != null && itemName != null) {
                    cardLayout.show(contentPanel, itemName);
                }
            }
        });
    }

    private ImageIcon resizeIcon(ImageIcon sourceIcon, int width, int height) {
        Image image = sourceIcon.getImage();
        Image resizedImage = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImage);
    }

    public String getItemName() { return itemName; }
    public void setItemName(String itemName) { this.itemName = itemName; menuLabel.setText(itemName); }
    public ImageIcon getIcon() { return icon; }
    public void setIcon(ImageIcon newIcon) { this.icon = newIcon; if (icon != null) menuLabel.setIcon(resizeIcon(icon, iconWidth, iconHeight)); else menuLabel.setIcon(null); }
    public int getIconWidth() { return iconWidth; }
    public void setIconWidth(int iconWidth) { this.iconWidth = iconWidth; if (icon != null) setIcon(icon); }
    public int getIconHeight() { return iconHeight; }
    public void setIconHeight(int iconHeight) { this.iconHeight = iconHeight; if (icon != null) setIcon(icon); }
    public CardLayout getCardLayout() { return cardLayout; }
    public void setCardLayout(CardLayout cardLayout) { this.cardLayout = cardLayout; }
    public JPanel getContentPanel() { return contentPanel; }
    public void setContentPanel(JPanel contentPanel) { this.contentPanel = contentPanel; }
}
