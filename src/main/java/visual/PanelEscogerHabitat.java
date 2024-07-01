package visual;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelEscogerHabitat extends JFrame implements ActionListener {
    private Mediator mediator;
    private JButton backButton;
    public habitatButton[] habitatButtons = new habitatButton[6];
    private JPanel panelOpciones;
    private JButton[] nextPageButton = new JButton[2];
    PanelEscogerHabitat(){
        super("Escoger habitat");

        // Crear LayeredPane para las capas
        JLayeredPane layeredPane = this.getLayeredPane();

        // Crear Panel para habitats
        panelOpciones = new JPanel(){
            ImageIcon panelOpciones_img = new ImageIcon("src\\main\\resources\\Interfaz\\TerrenoVacio.png");
            @Override
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                g.drawImage(panelOpciones_img.getImage(), 0,0,getWidth(),getHeight(),this);
            }
        };
        panelOpciones.setBounds(50,40,1180,620);
        panelOpciones.setLayout(new GridLayout(2,3));

        // Crear Botones de selección de habitats
        for (int i = 0; i < 6; i++){
            habitatButtons[i] = new habitatButton(i);
            //habitatButtons[i].setContentAreaFilled(false);
            //habitatButtons[i].setBorderPainted(false);
            //habitatButtons[i].setFocusPainted(false);
            habitatButtons[i].setId(i);
            habitatButtons[i].setIcon(i);
            habitatButtons[i].addActionListener(this);
            habitatButtons[i].setPreferredSize(new Dimension(288,162));
            int index = i;
            panelOpciones.add(new JPanel(null){
                {
                    if (index == 0 || index == 1 || index == 2) {
                        habitatButtons[index].setBounds(50, 100, 288, 162);
                    }else{
                        habitatButtons[index].setBounds(50, 50, 288, 162);
                    }
                    setOpaque(false);

                    add(habitatButtons[index]);
                }
            });
        }

        // Next & Previos Page Button
        for (int i = 0; i < 2; i++){
            nextPageButton[i] = new JButton();
            nextPageButton[i].setContentAreaFilled(false);
            nextPageButton[i].setBorderPainted(false);
            nextPageButton[i].setFocusPainted(false);
            nextPageButton[i].addActionListener(this);
            if (i == 0){
                nextPageButton[i].setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\Arrow_Right.png"));
                nextPageButton[i].setBounds(1190,300,80,80);
            }
            else{
                nextPageButton[i].setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\Arrow_Left.png"));
                nextPageButton[i].setBounds(0,300,80,80);
                nextPageButton[i].setVisible(false);
            }
        }

        // backButton
        backButton = new JButton();
        backButton.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\GreenArrow.png"));
        backButton.addActionListener(this);
        backButton.setContentAreaFilled(false);
        backButton.setBorderPainted(false);
        backButton.setFocusPainted(false);
        backButton.setOpaque(false);
        backButton.setSize(80,80);
        backButton.setVisible(true);

        this.setSize(1280,720);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(null);
        this.getContentPane().setBackground(new Color(200,200,200));
        layeredPane.add(panelOpciones,JLayeredPane.DEFAULT_LAYER);
        layeredPane.add(backButton,JLayeredPane.PALETTE_LAYER);
        layeredPane.add(nextPageButton[0], JLayeredPane.PALETTE_LAYER);
        layeredPane.add(nextPageButton[1], JLayeredPane.PALETTE_LAYER);
        this.setVisible(false);
    }


    public void movePage(int destination_page){
        for (int i = 0; i < 6; i++) {
            habitatButtons[i].setId(6 * (destination_page-1) + i);
            habitatButtons[i].setIcon(6 * (destination_page-1) + i);

            if (destination_page == 1) {
                nextPageButton[0].setVisible(true);
                nextPageButton[1].setVisible(false);
            } else if (destination_page == 2) {
                nextPageButton[0].setVisible(true);
                nextPageButton[1].setVisible(true);
            } else if (destination_page == 3) {
                nextPageButton[0].setVisible(false);
                nextPageButton[1].setVisible(true);
            }
        }
    }

    public void setMediator(Mediator m){
        mediator = m;
        for (int i = 0; i < 6; i++){
            this.habitatButtons[i].setMediator(m);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == backButton){
            mediator.notify(this, "Room_Goto(PanelPrincipal)");
        }
        if (e.getSource() == nextPageButton[0]){
            mediator.notify(this,"Room_Goto(NextRoom)");
        }
        if (e.getSource() == nextPageButton[1]){
            mediator.notify(this,"Room_Goto(PreviousRoom)");
        }
        for (int i = 0; i < 6; i++){
            if (e.getSource() == habitatButtons[i]){
                mediator.notify(this, "habitatSelect = " + habitatButtons[i].getId());
            }
        }

    }
}

class habitatButton extends JButton implements ActionListener{
    private Mediator mediator;
    private int id;
    private JLabel idlabel;
    habitatButton(int id){
        this.id = id;
        idlabel = new JLabel("nm " + id);
        this.add(idlabel);
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
        idlabel.setText("nm " + id);
    }
    public void setIcon(int id){
        switch (id){
            case 0:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\Habitats\\normal.png"));
                break;
            case 1:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\Habitats\\lucha.png"));
                break;
            case 2:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\Habitats\\vuelo.png"));
                break;
            case 3:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\Habitats\\veneno.png"));
                break;
            case 4:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\Habitats\\tierra.png"));
                break;
            case 5:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\Habitats\\roca.png"));
                break;
            case 6:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\Habitats\\bicho.png"));
                break;
            case 7:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\Habitats\\fantasma.png"));
                break;
            case 8:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\Habitats\\acero.png"));
                break;
            case 9:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\Habitats\\fuego.png"));
                break;
            case 10:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\Habitats\\agua.png"));
                break;
            case 11:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\Habitats\\planta.png"));
                break;
            case 12:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\Habitats\\electrico.png"));
                break;
            case 13:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\Habitats\\psiquico.png"));
                break;
            case 14:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\Habitats\\hielo.png"));
                break;
            case 15:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\Habitats\\dragon.png"));
                break;
            case 16:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\Habitats\\siniestro.png"));
                break;
            case 17:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\Habitats\\hada.png"));
                break;
            default:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\SeleccionHabitat.png"));
                break;
        }
    }

    public void setMediator(Mediator m){
        mediator = m;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this){
            mediator.notify(this, "habitatSelect = " + id);
        }
    }
}