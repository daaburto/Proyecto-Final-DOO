package visual;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelPrincipal extends JFrame implements ActionListener{
    private Mediator mediator;
    JButton[] buildButton = new JButton[9];
    JPanel[] zonaHabitat = new JPanel[9];
    public PanelPrincipal(){
        super("Panel Principal");
        int width = 1280;
        int height = 720;
        this.setLayout(new GridLayout(3,3));

        ImageIcon buildButton_img = new ImageIcon("src\\main\\resources\\Interfaz\\BuildButton.png");
        ImageIcon zonaHabitatEmpty_img = new ImageIcon("src\\main\\resources\\Interfaz\\TerrenoVacio.png");


        // Creacion de zonas para hábitats

        for (int i = 0; i < 9; i++){
            zonaHabitat[i] = new JPanel(){
                @Override
                protected void paintComponent(Graphics g){
                    super.paintComponent(g);
                    g.drawImage(zonaHabitatEmpty_img.getImage(),0,0,getWidth(),getHeight(),this);
                }
            };
            zonaHabitat[i].setLayout(null);

            buildButton[i] = new JButton();
            buildButton[i].setContentAreaFilled(false);
            buildButton[i].setBorderPainted(false);
            buildButton[i].setFocusPainted(false);
            buildButton[i].setIcon(buildButton_img);
            buildButton[i].setBounds(width/10,height/18,width/8,width/8);
            buildButton[i].addActionListener(this);

            zonaHabitat[i].add(buildButton[i]);
            this.add(zonaHabitat[i]);
        }


        this.setSize(width,height);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(false);
    }

    public void buildHabitat(PanelHabitat panelHabitat, int place){
        zonaHabitat[place].remove(buildButton[place]);
        zonaHabitat[place].add(panelHabitat);
        panelHabitat.setMediator(mediator);
    }

    public void setMediator(Mediator m){
        mediator = m;
    }

    @Override
    public void actionPerformed(ActionEvent event){
        if (event.getSource() == buildButton[0]){
            mediator.notify(this, "Room_Goto(PanelEscogerHabitat)[0]");
        }
        if (event.getSource() == buildButton[1]){
            mediator.notify(this, "Room_Goto(PanelEscogerHabitat)[1]");
        }
        if (event.getSource() == buildButton[2]){
            mediator.notify(this, "Room_Goto(PanelEscogerHabitat)[2]");
        }
        if (event.getSource() == buildButton[3]){
            mediator.notify(this, "Room_Goto(PanelEscogerHabitat)[3]");
        }
        if (event.getSource() == buildButton[4]){
            mediator.notify(this, "Room_Goto(PanelEscogerHabitat)[4]");
        }
        if (event.getSource() == buildButton[5]){
            mediator.notify(this, "Room_Goto(PanelEscogerHabitat)[5]");
        }
        if (event.getSource() == buildButton[6]){
            mediator.notify(this, "Room_Goto(PanelEscogerHabitat)[6]");
        }
        if (event.getSource() == buildButton[7]){
            mediator.notify(this, "Room_Goto(PanelEscogerHabitat)[7]");
        }
        if (event.getSource() == buildButton[8]){
            mediator.notify(this, "Room_Goto(PanelEscogerHabitat)[8]");
        }

    }

}



