package visual;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static visual.Musica.music;

/**
 * Panel principal de la interfáz gráfica, aqui se encuentran los hábitats
 * @see PanelHabitat
 */
public class PanelPrincipal extends JFrame implements ActionListener{
    /**
     * El mediador al cual está conectado
     * @see ConcreteMediator
     */
    private Mediator mediator;

    /**
     * Botones que permiten construir un hábitat, llevan al panel para construir habitats
     * @see PanelEscogerHabitat
     */
    JButton[] buildButton = new JButton[9];

    /**
     * Paneles donde se encuentran los botones y hábitats
     */
    JPanel[] zonaHabitat = new JPanel[9];

    /**
     * Constructor del panel principal
     * Se inician todas las imágenes y botones
     */
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

        music.playMusic();
    }

    /**
     * Método que permite al mediador construir un hábitat
     * @see ConcreteMediator
     * @param panelHabitat El panel hábitat que se construirá
     * @param place El lugar donde se contruirá
     */
    public void buildHabitat(PanelHabitat panelHabitat, int place){
        zonaHabitat[place].remove(buildButton[place]);
        zonaHabitat[place].add(panelHabitat);
        panelHabitat.setMediator(mediator);
    }

    /**
     * Método que permite al mediador remover un hábitat
     * @param place El lugar donde se removerá el hábitat
     */
    public void removeHabitat(int place){
        zonaHabitat[place].removeAll();
        zonaHabitat[place].add(buildButton[place]);
        this.repaint();
    }

    /**
     * Método para conectar al objeto con el mediador
     * @param m Mediador al que se conectará
     */
    public void setMediator(Mediator m){
        mediator = m;
    }

    /**
     * Método implementado desde ActionListener, permite recibir el input del mouse
     * @param e El evento a ser procesado
     */
    @Override
    public void actionPerformed(ActionEvent event){
        music.ButtonGeneric();
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



