package visual;

import javax.swing.*;
import java.awt.*;

public class ConcreteMediator implements Mediator{
    private PanelPrincipal panelPrincipal;
    private PanelEscogerHabitat panelEscogerHabitat;
    private PanelHabitat[] panelHabitats = new PanelHabitat[9];

    public ConcreteMediator(PanelPrincipal panelPrincipal, PanelEscogerHabitat panelEscogerHabitat){
        this.panelPrincipal = panelPrincipal;
        this.panelEscogerHabitat = panelEscogerHabitat;
    }
    @Override
    public void notify(Component sender, String event){
        if (sender == panelPrincipal){
            if (event.equals("Room_Goto(PanelEscogerHabitat)[0]")) {
                panelPrincipal.setVisible(false);
                panelEscogerHabitat.setLocation(panelPrincipal.getLocation());
                System.setProperty("room", "PanelEscogerHabitat_1");
                System.setProperty("habitatSelected", "0");
                panelEscogerHabitat.setVisible(true);
            }else if (event.equals("Room_Goto(PanelEscogerHabitat)[1]")){
                panelPrincipal.setVisible(false);
                panelEscogerHabitat.setLocation(panelPrincipal.getLocation());
                System.setProperty("room", "PanelEscogerHabitat_1");
                System.setProperty("habitatSelected", "1");
                panelEscogerHabitat.setVisible(true);
            }else if (event.equals("Room_Goto(PanelEscogerHabitat)[2]")){
                panelPrincipal.setVisible(false);
                panelEscogerHabitat.setLocation(panelPrincipal.getLocation());
                System.setProperty("room", "PanelEscogerHabitat_1");
                System.setProperty("habitatSelected", "2");
                panelEscogerHabitat.setVisible(true);
            }else if (event.equals("Room_Goto(PanelEscogerHabitat)[3]")){
                panelPrincipal.setVisible(false);
                panelEscogerHabitat.setLocation(panelPrincipal.getLocation());
                System.setProperty("room", "PanelEscogerHabitat_1");
                System.setProperty("habitatSelected", "3");
                panelEscogerHabitat.setVisible(true);
            }else if (event.equals("Room_Goto(PanelEscogerHabitat)[4]")){
                panelPrincipal.setVisible(false);
                panelEscogerHabitat.setLocation(panelPrincipal.getLocation());
                System.setProperty("room", "PanelEscogerHabitat_1");
                System.setProperty("habitatSelected", "4");
                panelEscogerHabitat.setVisible(true);
            }else if (event.equals("Room_Goto(PanelEscogerHabitat)[5]")){
                panelPrincipal.setVisible(false);
                panelEscogerHabitat.setLocation(panelPrincipal.getLocation());
                System.setProperty("room", "PanelEscogerHabitat_1");
                System.setProperty("habitatSelected", "5");
                panelEscogerHabitat.setVisible(true);
            }else if (event.equals("Room_Goto(PanelEscogerHabitat)[6]")){
                panelPrincipal.setVisible(false);
                panelEscogerHabitat.setLocation(panelPrincipal.getLocation());
                System.setProperty("room", "PanelEscogerHabitat_1");
                System.setProperty("habitatSelected", "6");
                panelEscogerHabitat.setVisible(true);
            }else if (event.equals("Room_Goto(PanelEscogerHabitat)[7]")){
                panelPrincipal.setVisible(false);
                panelEscogerHabitat.setLocation(panelPrincipal.getLocation());
                System.setProperty("room", "PanelEscogerHabitat_1");
                System.setProperty("habitatSelected", "7");
                panelEscogerHabitat.setVisible(true);
            }else if (event.equals("Room_Goto(PanelEscogerHabitat)[8]")){
                panelPrincipal.setVisible(false);
                panelEscogerHabitat.setLocation(panelPrincipal.getLocation());
                System.setProperty("room", "PanelEscogerHabitat_1");
                System.setProperty("habitatSelected", "8");
                panelEscogerHabitat.setVisible(true);
            }
        }

        if (sender == panelEscogerHabitat){
            if(event.equals("Room_Goto(PanelPrincipal)")) {
                panelEscogerHabitat.setVisible(false);
                panelPrincipal.setLocation(panelEscogerHabitat.getLocation());
                panelEscogerHabitat.movePage(1);
                System.setProperty("room", "PanelPrincipal");
                panelPrincipal.setVisible(true);
            }
            else if(event.equals("Room_Goto(NextRoom)")){
                if (System.getProperty("room").equals("PanelEscogerHabitat_1")){
                    panelEscogerHabitat.movePage(2);
                    System.setProperty("room", "PanelEscogerHabitat_2");
                }
                else if (System.getProperty("room").equals("PanelEscogerHabitat_2")){
                    panelEscogerHabitat.movePage(3);
                    System.setProperty("room", "PanelEscogerHabitat_3");
                }
            }
            else if(event.equals("Room_Goto(PreviousRoom)")){
                if (System.getProperty("room").equals("PanelEscogerHabitat_3")){
                    panelEscogerHabitat.movePage(2);
                    System.setProperty("room", "PanelEscogerHabitat_2");
                }
                else if (System.getProperty("room").equals("PanelEscogerHabitat_2")){
                    panelEscogerHabitat.movePage(1);
                    System.setProperty("room", "PanelEscogerHabitat_1");
                }
            }

            for (int j = 0; j < 18; j++){
                if(event.equals("habitatSelect = " + j)){
                    panelHabitats[Integer.parseInt(System.getProperty("habitatSelected"))] = new PanelHabitat(j);

                    // Cambiar sala
                    panelEscogerHabitat.setVisible(false);
                    panelPrincipal.setLocation(panelEscogerHabitat.getLocation());
                    panelEscogerHabitat.movePage(1);
                    System.setProperty("room", "PanelPrincipal");

                    // Construir habitat
                    panelPrincipal.buildHabitat(panelHabitats[Integer.parseInt(System.getProperty("habitatSelected"))], Integer.parseInt(System.getProperty("habitatSelected")));
                    panelPrincipal.setVisible(true);
                    break;
                }
            }

        }


    }
}
