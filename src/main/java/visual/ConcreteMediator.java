package visual;

import org.pokemon.Pokemon;
import org.pokemon.Species;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Mediador concreto que llevará a cabo las tareas entre los paneles
 * Aqui se crean todos los paneles y llegan todos los eventos, para así lograr esta conexión
 * Para la llegada de los eventos, se implementa Mediator
 * @see Mediator
 */
public class ConcreteMediator implements Mediator {
    /**
     * Panel principal de la parte gráfica
     * @see PanelPrincipal
     */
    private PanelPrincipal panelPrincipal;

    /**
     * Panel donde se escogen los habitats
     * @see PanelHabitat
     */
    private PanelEscogerHabitat panelEscogerHabitat;

    /**
     * Panel donde se añaden los pokemon
     * @see PanelAddPokemon
     */
    private PanelAddPokemon panelAddPokemon;

    /**
     * Panel donde se encuentran los pokemon que están en tu habitat
     * @see PanelCaja
     */
    private PanelCaja panelCaja;

    /**
     * Paneles de habitats que se encuentran construidos en el panel principal
     * @see PanelHabitat
     */
    private PanelHabitat[] panelHabitats = new PanelHabitat[9];

    /**
     * Constructor del mediador que inicializa todos los paneles
     * El Timer "timer" actualiza la barra de hambre y mueve a los pokemon en el habitat
     * El Timer "timerMov" permite iniciar el movimiento de cada pokemon por habitat
     * @see PokemonPanel
     * @param panelPrincipal El panel principal
     * @param panelEscogerHabitat el panel para escoger habitats
     * @param panelAddPokemon el panel para añadir pokemon
     * @param panelCaja el panel de la caja de tus habitats
     */
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
                // Vida hambre pokemon
                for (int j = 0; j < 6; j++) {
                    if (Integer.parseInt(System.getProperty("habitatSelected")) != -1){
                        int index = Integer.parseInt(System.getProperty("habitatSelected"));
                        if (panelHabitats[index] != null && panelHabitats[index].habitat.caja[j] != null && panelCaja.hambreLabel[j] != null) {
                            panelCaja.actualizarHambre(panelHabitats[index].habitat.caja[j].getHp(), j);
                        }
                    }

                }

                // Movimiento pokemon
                for (int i = 0; i < 9; i++){
                    if (panelHabitats[i] != null){
                        for (int j = 0; j < 6; j++){
                            if (panelHabitats[i].pokemonPanels[j] != null && panelHabitats[i].pokemonPanels[j].moving){
                                if(panelHabitats[i].habitat.caja[j].getHp() != 0){
                                    panelHabitats[i].pokemonPanels[j].movePos();
                                    panelHabitats[i].pokemonPanels[j].setHungryIcon(false);
                                }else{
                                    panelHabitats[i].pokemonPanels[j].setHungryIcon(true);
                                }

                            }
                        }
                    }
                }
            }
        }, 0, 100);

        // Timer Movimiento pokemon
        Timer timerMov = new Timer(true); // Daemon thread
        timerMov.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                for (int i = 0; i < 9; i++){
                    if (panelHabitats[i] != null){
                        for (int j = 0; j < 6; j++){
                            if (panelHabitats[i].pokemonPanels[j] != null && !panelHabitats[i].pokemonPanels[j].moving){
                                Random random_x = new Random();
                                Random random_y = new Random();
                                panelHabitats[i].pokemonPanels[j].moving = true;
                                panelHabitats[i].pokemonPanels[j].new_x = random_x.nextInt(350);
                                panelHabitats[i].pokemonPanels[j].new_y = random_y.nextInt(150);
                            }
                        }
                    }
                }
            }
        }, 0, 10000);// period = 10000
    }

    /**
     * Método que se implementa desde Mediator, maneja los eventos entre los paneles
     * @see Mediator
     * @param sender Es el objeto que está enviando el mensaje
     * @param event Es el evento que se manejará
     */
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
                    panelHabitats[index].removePokemonPanel(i);
                    panelCaja.clearPanels();
                    for (int j = 0; j < 6; j++) {
                        if (panelHabitats[index].habitat.caja[j] != null) {
                            panelHabitats[index].habitat.evaluarEfectividad();
                            panelCaja.paintPokemon(panelHabitats[index].habitat.caja[j].getSpecies(), j, panelHabitats[index].habitat.caja[j].getState());
                        } else {
                            panelCaja.paintEmpty(j);
                        }
                    }
                }else if (event.equals("alimentarPokemon"+i)){
                    int index = Integer.parseInt(System.getProperty("habitatSelected"));
                    panelHabitats[index].habitat.caja[i].calculateHp();
                }
            }
        }
    }

    /**
     *  Método implementado desde Mediator que también maneja los eventos, pero permite usar la especie de un pokemon en concreto
     * @see Mediator
     * @see Species
     * @param sender Es el objeto que está enviando el mensaje
     * @param event Es el evento que se manejará
     * @param specie
     */
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
                            panelHabitats[i].addPokemonPanel(panelHabitats[i].habitat.getFreeBox(), specie);

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