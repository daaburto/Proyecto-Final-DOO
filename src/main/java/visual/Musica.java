package visual;
import java.io.File;
import javax.sound.sampled.*;

/**
 * La clase Música añade métodos para reproducir varios efectos de sonido y música de fondo
 * @author Daniel Aburto
 */
public class Musica {
    /**
     * Clip de audio que puede ser reproducido, pausado o detenido.
     */
    private Clip clip;

    /**
     * Singleton de la clase Musica
     */
    public static Musica music = new Musica();

    /**
     * Reproduce musica en bucle.
     */
    public void playMusic() {
        try {
            File musicPath = new File("src/main/resources/Interfaz/Musica/fondo.wav");
            AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
            clip = AudioSystem.getClip();
            clip.open(audioInput);
            clip.start();
            clip.loop(Clip.LOOP_CONTINUOUSLY);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Reproduce un sonido al presionar ciertos botones
     */
    public void ButtonGeneric() {
        try {
            File musicPath = new File("src/main/resources/Interfaz/Musica/generico.wav");
            AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
            clip = AudioSystem.getClip();
            clip.open(audioInput);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Reproduce un sonido al crear un hábitat
     */
    public void ButtonBuild() {
        try {
            File musicPath = new File("src/main/resources/Interfaz/Musica/building.wav");
            AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
            clip = AudioSystem.getClip();
            clip.open(audioInput);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Reproduce un sonido al alimentar un Pokémon
     */
    public void ButtonAlimentar() {
        try {
            File musicPath = new File("src/main/resources/Interfaz/Musica/alimentar.wav");
            AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
            clip = AudioSystem.getClip();
            clip.open(audioInput);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Reproduce un sonido al borrar un hábitat
     */
    public void ButtonDeleteHabitat() {
        try {
            File musicPath = new File("src/main/resources/Interfaz/Musica/habitat_delete.wav");
            AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
            clip = AudioSystem.getClip();
            clip.open(audioInput);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Reproduce un sonido al seleccionar un nuevo pokémon
     */
    public void ButtonAddPokemon() {
        try {
            File musicPath = new File("src/main/resources/Interfaz/Musica/seleccionar_pokemon.wav");
            AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
            clip = AudioSystem.getClip();
            clip.open(audioInput);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Reproduce un sonido al borrar un Pokémon
     */
    public void ButtonDeletePokemon() {
        try {
            File musicPath = new File("src/main/resources/Interfaz/Musica/pokemon_delete.wav");
            AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
            clip = AudioSystem.getClip();
            clip.open(audioInput);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Reproduce un sonido al apretar el botón reroll
     */
    public void ButtonReroll() {
        try {
            File musicPath = new File("src/main/resources/Interfaz/Musica/random.wav");
            AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
            clip = AudioSystem.getClip();
            clip.open(audioInput);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}