package visual;

import org.pokemon.Pokemon;
import org.pokemon.Species;

import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class ConcreteMediator implements Mediator {
    private PanelPrincipal panelPrincipal;
    private PanelEscogerHabitat panelEscogerHabitat;
    private PanelAddPokemon panelAddPokemon;
    private PanelCaja panelCaja;
    private PanelHabitat[] panelHabitats = new PanelHabitat[9];

    public ConcreteMediator(PanelPrincipal panelPrincipal, PanelEscogerHabitat panelEscogerHabitat, PanelAddPokemon panelAddPokemon, PanelCaja panelCaja) {
        this.panelPrincipal = panelPrincipal;
        this.panelEscogerHabitat = panelEscogerHabitat;
        this.panelAddPokemon = panelAddPokemon;
        this.panelCaja = panelCaja;
        System.setProperty("habitatSelected", "-1");
        Timer timer = new Timer(true); // Daemon thread
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                for (int j = 0; j < 6; j++) {
                    if (Integer.parseInt(System.getProperty("habitatSelected")) != -1){
                        int index = Integer.parseInt(System.getProperty("habitatSelected"));
                        if (panelHabitats[index] != null && panelHabitats[index].habitat.caja[j] != null) {
                            panelCaja.actualizarHambre(panelHabitats[index].habitat.caja[j].getHp(), j);
                            //System.out.println(panelHabitats[index].habitat.caja[j].getHp());
                        }
                    }

                }
            }
        }, 0, 1000);
    }


    @Override
    public void notify(Component sender, String event) {
        // Panel Principal
        if (sender == panelPrincipal) {
            if (event.equals("Room_Goto(PanelEscogerHabitat)[0]")) {
                panelPrincipal.setVisible(false);
                panelEscogerHabitat.setLocation(panelPrincipal.getLocation());
                System.setProperty("room", "PanelEscogerHabitat_1");
                System.setProperty("habitatSelected", "0");
                panelEscogerHabitat.setVisible(true);
            } else if (event.equals("Room_Goto(PanelEscogerHabitat)[1]")) {
                panelPrincipal.setVisible(false);
                panelEscogerHabitat.setLocation(panelPrincipal.getLocation());
                System.setProperty("room", "PanelEscogerHabitat_1");
                System.setProperty("habitatSelected", "1");
                panelEscogerHabitat.setVisible(true);
            } else if (event.equals("Room_Goto(PanelEscogerHabitat)[2]")) {
                panelPrincipal.setVisible(false);
                panelEscogerHabitat.setLocation(panelPrincipal.getLocation());
                System.setProperty("room", "PanelEscogerHabitat_1");
                System.setProperty("habitatSelected", "2");
                panelEscogerHabitat.setVisible(true);
            } else if (event.equals("Room_Goto(PanelEscogerHabitat)[3]")) {
                panelPrincipal.setVisible(false);
                panelEscogerHabitat.setLocation(panelPrincipal.getLocation());
                System.setProperty("room", "PanelEscogerHabitat_1");
                System.setProperty("habitatSelected", "3");
                panelEscogerHabitat.setVisible(true);
            } else if (event.equals("Room_Goto(PanelEscogerHabitat)[4]")) {
                panelPrincipal.setVisible(false);
                panelEscogerHabitat.setLocation(panelPrincipal.getLocation());
                System.setProperty("room", "PanelEscogerHabitat_1");
                System.setProperty("habitatSelected", "4");
                panelEscogerHabitat.setVisible(true);
            } else if (event.equals("Room_Goto(PanelEscogerHabitat)[5]")) {
                panelPrincipal.setVisible(false);
                panelEscogerHabitat.setLocation(panelPrincipal.getLocation());
                System.setProperty("room", "PanelEscogerHabitat_1");
                System.setProperty("habitatSelected", "5");
                panelEscogerHabitat.setVisible(true);
            } else if (event.equals("Room_Goto(PanelEscogerHabitat)[6]")) {
                panelPrincipal.setVisible(false);
                panelEscogerHabitat.setLocation(panelPrincipal.getLocation());
                System.setProperty("room", "PanelEscogerHabitat_1");
                System.setProperty("habitatSelected", "6");
                panelEscogerHabitat.setVisible(true);
            } else if (event.equals("Room_Goto(PanelEscogerHabitat)[7]")) {
                panelPrincipal.setVisible(false);
                panelEscogerHabitat.setLocation(panelPrincipal.getLocation());
                System.setProperty("room", "PanelEscogerHabitat_1");
                System.setProperty("habitatSelected", "7");
                panelAddPokemon.rerrolPokemon();
                panelEscogerHabitat.setVisible(true);
            } else if (event.equals("Room_Goto(PanelEscogerHabitat)[8]")) {
                panelPrincipal.setVisible(false);
                panelEscogerHabitat.setLocation(panelPrincipal.getLocation());
                System.setProperty("room", "PanelEscogerHabitat_1");
                System.setProperty("habitatSelected", "8");
                panelEscogerHabitat.setVisible(true);
            }
        }

        // PanelEscogerHabitat
        if (sender == panelEscogerHabitat) {
            if (event.equals("Room_Goto(PanelPrincipal)")) {
                panelEscogerHabitat.setVisible(false);
                panelPrincipal.setLocation(panelEscogerHabitat.getLocation());
                panelEscogerHabitat.movePage(1);
                System.setProperty("room", "PanelPrincipal");
                System.setProperty("habitatSelected", "-1");
                panelPrincipal.setVisible(true);
            } else if (event.equals("Room_Goto(NextRoom)")) {
                if (System.getProperty("room").equals("PanelEscogerHabitat_1")) {
                    panelEscogerHabitat.movePage(2);
                    System.setProperty("room", "PanelEscogerHabitat_2");
                } else if (System.getProperty("room").equals("PanelEscogerHabitat_2")) {
                    panelEscogerHabitat.movePage(3);
                    System.setProperty("room", "PanelEscogerHabitat_3");
                }
            } else if (event.equals("Room_Goto(PreviousRoom)")) {
                if (System.getProperty("room").equals("PanelEscogerHabitat_3")) {
                    panelEscogerHabitat.movePage(2);
                    System.setProperty("room", "PanelEscogerHabitat_2");
                } else if (System.getProperty("room").equals("PanelEscogerHabitat_2")) {
                    panelEscogerHabitat.movePage(1);
                    System.setProperty("room", "PanelEscogerHabitat_1");
                }
            }

            // Construccion de habitats
            for (int j = 0; j < 18; j++) {
                if (event.equals("habitatSelect = " + j)) {
                    panelHabitats[Integer.parseInt(System.getProperty("habitatSelected"))] = new PanelHabitat(j);

                    // Cambiar sala
                    panelEscogerHabitat.setVisible(false);
                    panelPrincipal.setLocation(panelEscogerHabitat.getLocation());
                    panelEscogerHabitat.movePage(1);
                    System.setProperty("room", "PanelPrincipal");

                    // Construir habitat
                    panelPrincipal.buildHabitat(panelHabitats[Integer.parseInt(System.getProperty("habitatSelected"))], Integer.parseInt(System.getProperty("habitatSelected")));
                    System.setProperty("habitatSelected", "-1");
                    panelPrincipal.setVisible(true);
                    break;
                }
            }

        }

        // Habitats construidos en PanelPrincipal

        for (int i = 0; i < 9; i++) {
            if (sender == panelHabitats[i]) {
                if (event.equals("PanelHabitatShowButtons")) {
                    if (panelHabitats[i].habitat.caja[5] != null) {
                        panelHabitats[i].setHabitatFull(true);
                    } else {
                        panelHabitats[i].setHabitatFull(false);
                    }
                    panelHabitats[i].setButtonsVisible(true);
                    for (int j = 0; j < 9; j++) {
                        if (j != i && panelHabitats[j] != null) {
                            panelHabitats[j].setButtonsVisible(false);
                        }
                    }
                } else if (event.equals("PanelHabitatHideButtons")) {
                    panelHabitats[i].setButtonsVisible(false);

                } else if (event.equals("Room_Goto(PanelAddPokemon)")) {
                    panelHabitats[i].setButtonsVisible(false);
                    panelPrincipal.setVisible(false);
                    panelAddPokemon.setLocation(panelPrincipal.getLocation());
                    System.setProperty("room", "PanelAddPokemon" + i);
                    panelAddPokemon.rerrolPokemon();
                    System.setProperty("habitatSelected", "" + i);
                    panelAddPokemon.setVisible(true);

                } else if (event.equals("Room_Goto(PanelCaja)")) {
                    panelHabitats[i].setButtonsVisible(false);
                    panelPrincipal.setVisible(false);
                    panelCaja.setLocation(panelPrincipal.getLocation());
                    System.setProperty("room", "PanelCaja" + i);
                    System.setProperty("habitatSelected", "" + i);

                    // Dibujar pokemon en caja segun habitat
                    panelCaja.clearPanels();
                    for (int j = 0; j < 6; j++) {
                        if (panelHabitats[i].habitat.caja[j] != null) {
                            panelHabitats[i].habitat.evaluarEfectividad();
                            panelCaja.paintPokemon(panelHabitats[i].habitat.caja[j].getSpecies(), j, panelHabitats[i].habitat.caja[j].getState());
                        } else {
                            panelCaja.paintEmpty(j);
                        }
                    }
                    panelCaja.setVisible(true);

                } else if (event.equals("destroyHabitat")) {
                    panelHabitats[i] = null;
                    panelPrincipal.removeHabitat(i);
                }
            }
        }

        // PanelAddPokemon

        if (sender == panelAddPokemon) {
            if (event.equals("Room_Goto(PanelPrincipal)")) {
                panelAddPokemon.setVisible(false);
                panelPrincipal.setLocation(panelAddPokemon.getLocation());
                System.setProperty("room", "PanelPrincipal");
                System.setProperty("habitatSelected", "-1");
                panelPrincipal.setVisible(true);
            } else if (event.equals("reroll")) {
                panelAddPokemon.rerrolPokemon();
            }
        }

        // Panel Caja

        if (sender == panelCaja) {
            if (event.equals("Room_Goto(PanelPrincipal)")) {
                panelCaja.setVisible(false);
                panelPrincipal.setLocation(panelCaja.getLocation());
                System.setProperty("room", "PanelPrincipal");
                System.setProperty("habitatSelected", "-1");
                panelCaja.clearPanels();
                panelPrincipal.setVisible(true);
            }

            for (int i = 0; i < 6; i++) {
                if (event.equals("deletePokemon" + i)) {
                    int index = Integer.parseInt(System.getProperty("habitatSelected"));
                    panelHabitats[index].habitat.removePokemon(panelHabitats[index].habitat.caja[i]);
                    panelCaja.clearPanels();
                    for (int j = 0; j < 6; j++) {
                        if (panelHabitats[index].habitat.caja[j] != null) {
                            panelHabitats[index].habitat.evaluarEfectividad();
                            panelCaja.paintPokemon(panelHabitats[index].habitat.caja[j].getSpecies(), j, panelHabitats[index].habitat.caja[j].getState());
                        } else {
                            panelCaja.paintEmpty(j);
                        }
                    }
                }
            }
        }
    }

        @Override
        public void notify(Component sender, String event, Species specie){
            // Añadir pokemon
            if (sender == panelAddPokemon) {
                if (event.equals("pokemonSelect")) {
                    for (int i = 0; i < 9; i++) {
                        if (System.getProperty("room").equals("PanelAddPokemon" + i)) {
                            // Añadir pokemon al habitat
                            panelHabitats[i].habitat.addPokemon(new Pokemon(specie));
                            panelHabitats[i].habitat.imprimirCaja();

                            // Cambiar sala
                            panelAddPokemon.setVisible(false);
                            panelPrincipal.setLocation(panelAddPokemon.getLocation());
                            System.setProperty("room", "PanelPrincipal");
                            System.setProperty("habitatSelected", "-1");
                            panelAddPokemon.rerrolPokemon();
                            panelPrincipal.setVisible(true);
                            break;
                        }
                    }
                }
            }
    }
}