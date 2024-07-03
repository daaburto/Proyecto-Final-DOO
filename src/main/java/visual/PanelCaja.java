package visual;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelCaja extends JFrame implements ActionListener{
    private Mediator mediator;
    private JPanel panelOpciones;
    private JButton backButton;
    public PanelCaja() {
        super("Caja");

        // Crear LayeredPane para las capas
        JLayeredPane layeredPane = this.getLayeredPane();

        // Crear Panel para Pokemon
        panelOpciones = new JPanel() {
            ImageIcon panelOpciones_img = new ImageIcon("src\\main\\resources\\Interfaz\\TerrenoVacio.png");

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(panelOpciones_img.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };
        panelOpciones.setBounds(50, 40, 1180, 620);
        panelOpciones.setLayout(new GridLayout(2, 3));

        // backButton
        backButton = new JButton();
        backButton.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\GreenArrow.png"));
        backButton.addActionListener(this);
        backButton.setContentAreaFilled(false);
        backButton.setBorderPainted(false);
        backButton.setFocusPainted(false);
        backButton.setOpaque(false);
        backButton.setSize(80, 80);
        backButton.setVisible(true);

        this.setSize(1280, 720);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(null);
        this.getContentPane().setBackground(new Color(200, 200, 200));
        layeredPane.add(panelOpciones, JLayeredPane.DEFAULT_LAYER);
        layeredPane.add(backButton, JLayeredPane.PALETTE_LAYER);
        this.setVisible(false);
    }

    public void setMediator(Mediator m){
        mediator = m;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == backButton){
            mediator.notify(this, "Room_Goto(PanelPrincipal)");
        }
    }
}
