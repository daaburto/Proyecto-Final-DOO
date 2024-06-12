package org.pokemon;

import javax.swing.*;
import java.awt.*;

public enum Generation1 {
    BULBASAUR("Bulbasaur", "001", "src/main/resources/1.png" , 45, Type.GRASS, Type.POISON),
    IVYSAUR("Ivysaur", "002", "src/main/resources/2.png", 60, Type.GRASS, Type.POISON),
    VENUSAUR("Venusaur", "003", "src/main/resources/3.png", 80, Type.GRASS, Type.POISON),
    CHARMANDER("Charmander", "004", "src/main/resources/4.png", 39, Type.FIRE),
    CHARMELEON("Charmeleon", "005", "src/main/resources/5.png", 58, Type.FIRE),
    CHARIZARD("Charizard", "006", "src/main/resources/6.png", 78, Type.FIRE, Type.FLYING),
    SQUIRTLE("Squirtle", "007", "src/main/resources/7.png", 44, Type.WATER),
    WARTORTLE("Wartortle", "008", "src/main/resources/8.png", 59, Type.WATER),
    BLASTOISE("Blastoise", "009", "src/main/resources/9.png", 79, Type.WATER),
    CATERPIE("Caterpie", "010", "src/main/resources/10.png", 45, Type.BUG),
    METAPOD("Metapod", "011", "src/main/resources/11.png", 50, Type.BUG),
    BUTTERFREE("Butterfree", "012", "src/main/resources/12.png", 60, Type.BUG, Type.FLYING),
    WEEDLE("Weedle", "013", "src/main/resources/13.png", 40, Type.BUG, Type.POISON),
    KAKUNA("Kakuna", "014", "src/main/resources/14.png", 45, Type.BUG, Type.POISON),
    BEEDRILL("Beedrill", "015", "src/main/resources/15.png", 65, Type.BUG, Type.POISON),
    PIDGEY("Pidgey", "016", "src/main/resources/16.png", 40, Type.NORMAL, Type.FLYING),
    PIDGEOTTO("Pidgeotto", "017", "src/main/resources/17.png", 63, Type.NORMAL, Type.FLYING),
    PIDGEOT("Pidgeot", "018", "src/main/resources/18.png", 83, Type.NORMAL, Type.FLYING),
    RATTATA("Rattata", "019", "src/main/resources/19.png", 30, Type.NORMAL),
    RATICATE("Raticate", "020", "src/main/resources/20.png", 55, Type.NORMAL),
    SPEAROW("Spearow", "021", "src/main/resources/21.png", 40, Type.NORMAL, Type.FLYING),
    FEAROW("Fearow", "022", "src/main/resources/22.png", 65, Type.NORMAL, Type.FLYING),
    EKANS("Ekans", "023", "src/main/resources/23.png", 35, Type.POISON),
    ARBOK("Arbok", "024", "src/main/resources/24.png", 60, Type.POISON),
    PIKACHU("Pikachu", "025", "src/main/resources/25.png", 35, Type.ELECTRIC),
    RAICHU("Raichu", "026", "src/main/resources/26.png", 60, Type.ELECTRIC),
    SANDSHREW("Sandshrew", "027", "src/main/resources/27.png", 50, Type.GROUND),
    SANDSLASH("Sandslash", "028", "src/main/resources/28.png", 75, Type.GROUND),
    NIDORAN_FEMALE("Nidoran♀", "029", "src/main/resources/29.png", 55, Type.POISON),
    NIDORINA("Nidorina", "030", "src/main/resources/30.png", 70, Type.POISON),
    NIDOQUEEN("Nidoqueen", "031", "src/main/resources/31.png", 90, Type.POISON, Type.GROUND),
    NIDORAN_MALE("Nidoran♂", "032", "src/main/resources/32.png", 46, Type.POISON),
    NIDORINO("Nidorino", "033", "src/main/resources/33.png", 61, Type.POISON),
    NIDOKING("Nidoking", "034", "src/main/resources/34.png", 81, Type.POISON, Type.GROUND),
    CLEFAIRY("Clefairy", "035", "src/main/resources/35.png", 70, Type.FAIRY),
    CLEFABLE("Clefable", "036", "src/main/resources/36.png", 95, Type.FAIRY),
    VULPIX("Vulpix", "037", "src/main/resources/37.png", 38, Type.FIRE),
    NINETALES("Ninetales", "038", "src/main/resources/38.png", 73, Type.FIRE),
    JIGGLYPUFF("Jigglypuff", "039", "src/main/resources/39.png", 115, Type.NORMAL, Type.FAIRY),
    WIGGLYTUFF("Wigglytuff", "040", "src/main/resources/40.png", 140, Type.NORMAL, Type.FAIRY),
    ZUBAT("Zubat", "041", "src/main/resources/41.png", 40, Type.POISON, Type.FLYING),
    GOLBAT("Golbat", "042", "src/main/resources/42.png", 75, Type.POISON, Type.FLYING),
    ODDISH("Oddish", "043", "src/main/resources/43.png", 45, Type.GRASS, Type.POISON),
    GLOOM("Gloom", "044", "src/main/resources/44.png", 60, Type.GRASS, Type.POISON),
    VILEPLUME("Vileplume", "045", "src/main/resources/45.png", 75, Type.GRASS, Type.POISON),
    PARAS("Paras", "046", "src/main/resources/46.png", 35, Type.BUG, Type.GRASS),
    PARASECT("Parasect", "047", "src/main/resources/47.png", 60, Type.BUG, Type.GRASS),
    VENONAT("Venonat", "048", "src/main/resources/48.png", 60, Type.BUG, Type.POISON),
    VENOMOTH("Venomoth", "049", "src/main/resources/49.png", 70, Type.BUG, Type.POISON),
    DIGLETT("Diglett", "050", "src/main/resources/50.png", 10, Type.GROUND),
    DUGTRIO("Dugtrio", "051", "src/main/resources/51.png", 35, Type.GROUND),
    MEOWTH("Meowth", "052", "src/main/resources/52.png", 40, Type.NORMAL),
    PERSIAN("Persian", "053", "src/main/resources/53.png", 65, Type.NORMAL),
    PSYDUCK("Psyduck", "054", "src/main/resources/54.png", 50, Type.WATER),
    GOLDUCK("Golduck", "055", "src/main/resources/55.png", 80, Type.WATER),
    MANKEY("Mankey", "056", "src/main/resources/56.png", 40, Type.FIGHTING),
    PRIMEAPE("Primeape", "057", "src/main/resources/57.png", 65, Type.FIGHTING),
    GROWLITHE("Growlithe", "058", "src/main/resources/58.png", 55, Type.FIRE),
    ARCANINE("Arcanine", "059", "src/main/resources/59.png", 90, Type.FIRE),
    POLIWAG("Poliwag", "060", "src/main/resources/60.png", 40, Type.WATER),
    POLIWHIRL("Poliwhirl", "061", "src/main/resources/61.png", 65, Type.WATER),
    POLIWRATH("Poliwrath", "062", "src/main/resources/62.png", 90, Type.WATER, Type.FIGHTING),
    ABRA("Abra", "063", "src/main/resources/63.png", 25, Type.PSYCHIC),
    KADABRA("Kadabra", "064", "src/main/resources/64.png", 40, Type.PSYCHIC),
    ALAKAZAM("Alakazam", "065", "src/main/resources/65.png", 55, Type.PSYCHIC),
    MACHOP("Machop", "066", "src/main/resources/66.png", 70, Type.FIGHTING),
    MACHOKE("Machoke", "067", "src/main/resources/67.png", 80, Type.FIGHTING),
    MACHAMP("Machamp", "068", "src/main/resources/68.png", 90, Type.FIGHTING),
    BELLSPROUT("Bellsprout", "069", "src/main/resources/69.png", 50, Type.GRASS, Type.POISON),
    WEEPINBELL("Weepinbell", "070", "src/main/resources/70.png", 65, Type.GRASS, Type.POISON),
    VICTREEBEL("Victreebel", "071", "src/main/resources/71.png", 80, Type.GRASS, Type.POISON),
    TENTACOOL("Tentacool", "072", "src/main/resources/72.png", 40, Type.WATER, Type.POISON),
    TENTACRUEL("Tentacruel", "073", "src/main/resources/73.png", 80, Type.WATER, Type.POISON),
    GEODUDE("Geodude", "074", "src/main/resources/74.png", 40, Type.ROCK, Type.GROUND),
    GRAVELER("Graveler", "075", "src/main/resources/75.png", 55, Type.ROCK, Type.GROUND),
    GOLEM("Golem", "076", "src/main/resources/76.png", 80, Type.ROCK, Type.GROUND),
    PONYTA("Ponyta", "077", "src/main/resources/77.png", 50, Type.FIRE),
    RAPIDASH("Rapidash", "078", "src/main/resources/78.png", 65, Type.FIRE),
    SLOWPOKE("Slowpoke", "079", "src/main/resources/79.png", 90, Type.WATER, Type.PSYCHIC),
    SLOWBRO("Slowbro", "080", "src/main/resources/80.png", 95, Type.WATER, Type.PSYCHIC),
    MAGNEMITE("Magnemite", "081", "src/main/resources/81.png", 25, Type.ELECTRIC, Type.STEEL),
    MAGNETON("Magneton", "082", "src/main/resources/82.png", 50, Type.ELECTRIC, Type.STEEL),
    FARFETCH_D("Farfetch%27d", "083", "src/main/resources/83.png", 52, Type.NORMAL, Type.FLYING),
    DODUO("Doduo", "084", "src/main/resources/84.png", 35, Type.NORMAL, Type.FLYING),
    DODRIO("Dodrio", "085", "src/main/resources/85.png", 60, Type.NORMAL, Type.FLYING),
    SEEL("Seel", "086", "src/main/resources/86.png", 65, Type.WATER),
    DEWGONG("Dewgong", "087", "src/main/resources/87.png", 90, Type.WATER, Type.ICE),
    GRIMER("Grimer", "088", "src/main/resources/88.png", 80, Type.POISON),
    MUK("Muk", "089", "src/main/resources/89.png", 105, Type.POISON),
    SHELLDER("Shellder", "090", "src/main/resources/90.png", 30, Type.WATER),
    CLOYSTER("Cloyster", "091", "src/main/resources/91.png", 50, Type.WATER, Type.ICE),
    GASTLY("Gastly", "092", "src/main/resources/92.png", 30, Type.GHOST, Type.POISON),
    HAUNTER("Haunter", "093", "src/main/resources/93.png", 45, Type.GHOST, Type.POISON),
    GENGAR("Gengar", "094", "src/main/resources/94.png", 60, Type.GHOST, Type.POISON),
    ONIX("Onix", "095", "src/main/resources/95.png", 35, Type.ROCK, Type.GROUND),
    DROWZEE("Drowzee", "096", "src/main/resources/96.png", 60, Type.PSYCHIC),
    HYPNO("Hypno", "097", "src/main/resources/97.png", 85, Type.PSYCHIC),
    KRABBY("Krabby", "098", "src/main/resources/98.png", 30, Type.WATER),
    KINGLER("Kingler", "099", "src/main/resources/99.png", 55, Type.WATER),
    VOLTORB("Voltorb", "100", "src/main/resources/100.png", 40, Type.ELECTRIC),
    ELECTRODE("Electrode", "101", "src/main/resources/101.png", 60, Type.ELECTRIC),
    EXEGGCUTE("Exeggcute", "102", "src/main/resources/102.png", 60, Type.GRASS, Type.PSYCHIC),
    EXEGGUTOR("Exeggutor", "103", "src/main/resources/103.png", 95, Type.GRASS, Type.PSYCHIC),
    CUBONE("Cubone", "104", "src/main/resources/104.png", 50, Type.GROUND),
    MAROWAK("Marowak", "105", "src/main/resources/105.png", 60, Type.GROUND),
    HITMONLEE("Hitmonlee", "106", "src/main/resources/106.png", 50, Type.FIGHTING),
    HITMONCHAN("Hitmonchan", "107", "src/main/resources/107.png", 50, Type.FIGHTING),
    LICKITUNG("Lickitung", "108", "src/main/resources/108.png", 90, Type.NORMAL),
    KOFFING("Koffing", "109", "src/main/resources/109.png", 40, Type.POISON),
    WEEZING("Weezing", "110", "src/main/resources/110.png", 65, Type.POISON),
    RHYHORN("Rhyhorn", "111", "src/main/resources/111.png", 80, Type.GROUND, Type.ROCK),
    RHYDON("Rhydon", "112", "src/main/resources/112.png", 105, Type.GROUND, Type.ROCK),
    CHANSEY("Chansey", "113", "src/main/resources/113.png", 250, Type.NORMAL),
    TANGELA("Tangela", "114", "src/main/resources/114.png", 65, Type.GRASS),
    KANGASKHAN("Kangaskhan", "115", "src/main/resources/115.png", 105, Type.NORMAL),
    HORSEA("Horsea", "116", "src/main/resources/116.png", 30, Type.WATER),
    SEADRA("Seadra", "117", "src/main/resources/117.png", 55, Type.WATER),
    GOLDEEN("Goldeen", "118", "src/main/resources/118.png", 45, Type.WATER),
    SEAKING("Seaking", "119", "src/main/resources/119.png", 80, Type.WATER),
    STARYU("Staryu", "120", "src/main/resources/120.png", 30, Type.WATER),
    STARMIE("Starmie", "121", "src/main/resources/121.png", 60, Type.WATER, Type.PSYCHIC),
    MR_MIME("Mr. Mime", "122", "src/main/resources/122.png", 40, Type.PSYCHIC, Type.FAIRY),
    SCYTHER("Scyther", "123", "src/main/resources/123.png", 70, Type.BUG, Type.FLYING),
    JYNX("Jynx", "124", "src/main/resources/124.png", 65, Type.ICE, Type.PSYCHIC),
    ELECTABUZZ("Electabuzz", "125", "src/main/resources/125.png", 65, Type.ELECTRIC),
    MAGMAR("Magmar", "126", "src/main/resources/126.png", 65, Type.FIRE),
    PINSIR("Pinsir", "127", "src/main/resources/127.png", 65, Type.BUG),
    TAUROS("Tauros", "128", "src/main/resources/128.png", 75, Type.NORMAL),
    MAGIKARP("Magikarp", "129", "src/main/resources/129.png", 20, Type.WATER),
    GYARADOS("Gyarados", "130", "src/main/resources/130.png", 95, Type.WATER, Type.FLYING),
    LAPRAS("Lapras", "131", "src/main/resources/131.png", 130, Type.WATER, Type.ICE),
    DITTO("Ditto", "132", "src/main/resources/132.png", 48, Type.NORMAL),
    EEVEE("Eevee", "133", "src/main/resources/133.png", 55, Type.NORMAL),
    VAPOREON("Vaporeon", "134", "src/main/resources/134.png", 130, Type.WATER),
    JOLTEON("Jolteon", "135", "src/main/resources/135.png", 65, Type.ELECTRIC),
    FLAREON("Flareon", "136", "src/main/resources/136.png", 65, Type.FIRE),
    PORYGON("Porygon", "137", "src/main/resources/137.png", 65, Type.NORMAL),
    OMANYTE("Omanyte", "138", "src/main/resources/138.png", 35, Type.ROCK, Type.WATER),
    OMASTAR("Omastar", "139", "src/main/resources/139.png", 70, Type.ROCK, Type.WATER),
    KABUTO("Kabuto", "140", "src/main/resources/140.png", 30, Type.ROCK, Type.WATER),
    KABUTOPS("Kabutops", "141", "src/main/resources/141.png", 60, Type.ROCK, Type.WATER),
    AERODACTYL("Aerodactyl", "142", "src/main/resources/142.png", 80, Type.ROCK, Type.FLYING),
    SNORLAX("Snorlax", "143", "src/main/resources/143.png", 160, Type.NORMAL),
    ARTICUNO("Articuno", "144", "src/main/resources/144.png", 90, Type.ICE, Type.FLYING),
    ZAPDOS("Zapdos", "145", "src/main/resources/145.png", 90, Type.ELECTRIC, Type.FLYING),
    MOLTRES("Moltres", "146", "src/main/resources/146.png", 90, Type.FIRE, Type.FLYING),
    DRATINI("Dratini", "147", "src/main/resources/147.png", 41, Type.DRAGON),
    DRAGONAIR("Dragonair", "148", "src/main/resources/148.png", 61, Type.DRAGON),
    DRAGONITE("Dragonite", "149", "src/main/resources/149.png", 91, Type.DRAGON, Type.FLYING),
    MEWTWO("Mewtwo", "150", "src/main/resources/150.png", 106, Type.PSYCHIC),
    MEW("Mew", "151", "src/main/resources/151.png", 100, Type.PSYCHIC);

    private final int HP;
    private final Type[] TYPE;
    private final String NAME, NAT_DEX_NUMBER;
    private ImageIcon IMG;

    Generation1(final String name, final String dexNumber, final String path, final int hp, final Type... type) {
        HP = hp;
        NAT_DEX_NUMBER = dexNumber;
        NAME = name;
        TYPE = type;
        IMG = new ImageIcon(new ImageIcon(path).getImage().getScaledInstance(400, 400, Image.SCALE_SMOOTH));

    }

    public String getDexNumber()
    {
        return NAT_DEX_NUMBER;
    }

    public int getHP(){
        return HP;
    }

    /**
     * Returns Name of the Pokemon
     *
     * @return Name of the Pokemon
     */
    public String getName()
    {
        return NAME;
    }

    /**
     * Gets the first type of the Pokemon
     * @return Their first type
     */
    public Type[] getType()
    {
        return TYPE;
    }

    public ImageIcon getImg(){
        return IMG;
    }
}