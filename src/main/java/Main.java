import org.pokemon.*;
import visual.*;
import java.awt.*;

public class Main {
    public static void main(String[] args){

        // Propiedades globales
        System.setProperty("room", "panelPrincipal");
        System.setProperty("habitatSelected", "null");

        // Crear Paneles y Mediator
        PanelPrincipal panelprincipal = new PanelPrincipal();
        PanelEscogerHabitat panelEscogerHabitat = new PanelEscogerHabitat();
        PanelAddPokemon panelAddPokemon = new PanelAddPokemon();
        PanelCaja panelCaja = new PanelCaja();

        ConcreteMediator mediator = new ConcreteMediator(panelprincipal, panelEscogerHabitat,panelAddPokemon, panelCaja);

        panelprincipal.setMediator(mediator);
        panelEscogerHabitat.setMediator(mediator);
        panelAddPokemon.setMediator(mediator);
        panelCaja.setMediator(mediator);
        panelprincipal.setVisible(true);
    }
}
