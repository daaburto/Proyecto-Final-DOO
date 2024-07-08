package visual;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static visual.Musica.music;

public class PanelEscogerHabitat extends JFrame implements ActionListener {
    private Mediator mediator;
    private JButton backButton;
    public habitatButton[] habitatButtons = new habitatButton[6];
    private typeLabel[] typeLabels = new typeLabel[9];
    private JPanel panelOpciones;
    private JButton[] nextPageButton = new JButton[2];
    public PanelEscogerHabitat(){
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

        // Crear Botones de selección de habitats & Crear label con tipo del habitat
        for (int i = 0; i < 6; i++){
            // Habitat
            habitatButtons[i] = new habitatButton(i);
            habitatButtons[i].setId(i);
            habitatButtons[i].setIcon(i);
            habitatButtons[i].addActionListener(this);
            habitatButtons[i].setPreferredSize(new Dimension(288,162));

            // Label
            typeLabels[i] = new typeLabel(i);
            typeLabels[i].setId(i);
            typeLabels[i].setIcon(i);
            typeLabels[i].setPreferredSize(new Dimension(200,40));

            int index = i;
            panelOpciones.add(new JPanel(null){
                {
                    if (index == 0 || index == 1 || index == 2) {
                        habitatButtons[index].setBounds(50, 100, 288, 162);
                        typeLabels[index].setBounds(100,270,200,40);
                    }else{
                        habitatButtons[index].setBounds(50, 50, 288, 162);
                        typeLabels[index].setBounds(100,220,200,40);
                    }
                    setOpaque(false);

                    add(habitatButtons[index]);
                    add(typeLabels[index]);
                }
            });
        }

        // Next & Previous Page Button
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
            typeLabels[i].setId(6 * (destination_page-1) + i);
            typeLabels[i].setIcon(6 * (destination_page-1) + i);

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
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == backButton){
            music.ButtonGeneric();
            mediator.notify(this, "Room_Goto(PanelPrincipal)");
        }
        if (e.getSource() == nextPageButton[0]){
            music.ButtonGeneric();
            mediator.notify(this,"Room_Goto(NextRoom)");
        }
        if (e.getSource() == nextPageButton[1]){
            music.ButtonGeneric();
            mediator.notify(this,"Room_Goto(PreviousRoom)");
        }
        for (int i = 0; i < 6; i++){
            if (e.getSource() == habitatButtons[i]){
                music.ButtonBuild();
                mediator.notify(this, "habitatSelect = " + habitatButtons[i].getId());
            }
        }

    }
}

class habitatButton extends JButton{
    private int id;

    habitatButton(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
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

}

class typeLabel extends JLabel{
    private int id;
    typeLabel(int id){
        this.id = id;
    }

    public int getId(){
        return id;

    }
    public void setId(int i){
        this.id = i;
    }

    public void setIcon(int id){
        switch (id){
            case 0:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\tipos\\Tipo_normal.png"));
                break;
            case 1:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\tipos\\Tipo_lucha.png"));
                break;
            case 2:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\tipos\\Tipo_vuelo.png"));
                break;
            case 3:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\tipos\\Tipo_veneno.png"));
                break;
            case 4:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\tipos\\Tipo_tierra.png"));
                break;
            case 5:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\tipos\\Tipo_roca.png"));
                break;
            case 6:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\tipos\\Tipo_bicho.png"));
                break;
            case 7:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\tipos\\Tipo_fantasma.png"));
                break;
            case 8:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\tipos\\Tipo_acero.png"));
                break;
            case 9:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\tipos\\Tipo_fuego.png"));
                break;
            case 10:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\tipos\\Tipo_agua.png"));
                break;
            case 11:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\tipos\\Tipo_planta.png"));
                break;
            case 12:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\tipos\\Tipo_electrico.png"));
                break;
            case 13:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\tipos\\Tipo_psiquico.png"));
                break;
            case 14:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\tipos\\Tipo_hielo.png"));
                break;
            case 15:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\tipos\\Tipo_dragon.png"));
                break;
            case 16:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\tipos\\Tipo_siniestro.png"));
                break;
            case 17:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\tipos\\Tipo_hada.png"));
                break;
            default:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\SeleccionHabitat.png"));
                break;
        }
    }
}