package org.pokemon;

import javax.swing.*;
import java.awt.*;

/**
 * Enumeración que representa a la sexta generación de Pokémon.
 * Cada Pokémon tiene nombre, número de Pokédex nacional, dirección de imagen, HP, y tipos.
 */
public enum Generation6 {
    CHESPIN("Chespin", "650", "src/main/resources/pokemon/650.png", 56, Type.GRASS),
    QUILLADIN("Quilladin", "651", "src/main/resources/pokemon/651.png", 61, Type.GRASS),
    CHESNAUGHT("Chesnaught", "652", "src/main/resources/pokemon/652.png", 88, Type.GRASS, Type.FIGHTING),
    FENNEKIN("Fennekin", "653", "src/main/resources/pokemon/653.png", 40, Type.FIRE),
    BRAIXEN("Braixen", "654", "src/main/resources/pokemon/654.png", 59, Type.FIRE),
    DELPHOX("Delphox", "655", "src/main/resources/pokemon/655.png", 75, Type.FIRE, Type.PSYCHIC),
    FROAKIE("Froakie", "656", "src/main/resources/pokemon/656.png", 41, Type.WATER),
    FROGADIER("Frogadier", "657", "src/main/resources/pokemon/657.png", 54, Type.WATER),
    GRENINJA("Greninja", "658", "src/main/resources/pokemon/658.png", 72, Type.WATER, Type.DARK),
    BUNNELBY("Bunnelby", "659", "src/main/resources/pokemon/659.png", 38, Type.NORMAL),
    DIGGERSBY("Diggersby", "660", "src/main/resources/pokemon/660.png", 85, Type.NORMAL, Type.GROUND),
    FLETCHLING("Fletchling", "661", "src/main/resources/pokemon/661.png", 45, Type.NORMAL, Type.FLYING),
    FLETCHINDER("Fletchinder", "662", "src/main/resources/pokemon/662.png", 62, Type.FIRE, Type.FLYING),
    TALONFLAME("Talonflame", "663", "src/main/resources/pokemon/663.png", 78, Type.FIRE, Type.FLYING),
    SCATTERBUG("Scatterbug", "664", "src/main/resources/pokemon/664.png", 38, Type.BUG),
    SPEWPA("Spewpa", "665", "src/main/resources/pokemon/665.png", 45, Type.BUG),
    VIVILLON("Vivillon", "666", "src/main/resources/pokemon/666.png", 80, Type.BUG, Type.FLYING),
    LITLEO("Litleo", "667", "src/main/resources/pokemon/667.png", 62, Type.FIRE, Type.NORMAL),
    PYROAR("Pyroar", "668", "src/main/resources/pokemon/668.png", 86, Type.FIRE, Type.NORMAL),
    FLABEBE("Flabébé", "669", "src/main/resources/pokemon/669.png", 44, Type.FAIRY),
    FLOETTE("Floette", "670", "src/main/resources/pokemon/670.png", 54, Type.FAIRY),
    FLORGES("Florges", "671", "src/main/resources/pokemon/671.png", 78, Type.FAIRY),
    SKIDDO("Skiddo", "672", "src/main/resources/pokemon/672.png", 66, Type.GRASS),
    GOGOAT("Gogoat", "673", "src/main/resources/pokemon/673.png", 123, Type.GRASS),
    PANCHAM("Pancham", "674", "src/main/resources/pokemon/674.png", 67, Type.FIGHTING),
    PANGORO("Pangoro", "675", "src/main/resources/pokemon/675.png", 95, Type.FIGHTING, Type.DARK),
    FURFROU("Furfrou", "676", "src/main/resources/pokemon/676.png", 75, Type.NORMAL),
    ESPURR("Espurr", "677", "src/main/resources/pokemon/677.png", 62, Type.PSYCHIC),
    MEOWSTIC_MALE("Meowstic (Male)", "678", "src/main/resources/pokemon/678-male.png", 74, Type.PSYCHIC),
    MEOWSTIC_FEMALE("Meowstic (Female)", "678", "src/main/resources/pokemon/678-female.png", 74, Type.PSYCHIC),
    HONEDGE("Honedge", "679", "src/main/resources/pokemon/679.png", 45, Type.STEEL, Type.GHOST),
    DOUBLADE("Doublade", "680", "src/main/resources/pokemon/680.png", 59, Type.STEEL, Type.GHOST),
    AEGISLASH("Aegislash", "681", "src/main/resources/pokemon/681.png", 60, Type.STEEL, Type.GHOST),
    SPRITZEE("Spritzee", "682", "src/main/resources/pokemon/682.png", 78, Type.FAIRY),
    AROMATISSE("Aromatisse", "683", "src/main/resources/pokemon/683.png", 101, Type.FAIRY),
    SWIRLIX("Swirlix", "684", "src/main/resources/pokemon/684.png", 62, Type.FAIRY),
    SLURPUFF("Slurpuff", "685", "src/main/resources/pokemon/685.png", 82, Type.FAIRY),
    INKAY("Inkay", "686", "src/main/resources/pokemon/686.png", 53, Type.DARK, Type.PSYCHIC),
    MALAMAR("Malamar", "687", "src/main/resources/pokemon/687.png", 86, Type.DARK, Type.PSYCHIC),
    BINACLE("Binacle", "688", "src/main/resources/pokemon/688.png", 42, Type.ROCK, Type.WATER),
    BARBARACLE("Barbaracle", "689", "src/main/resources/pokemon/689.png", 72, Type.ROCK, Type.WATER),
    SKRELP("Skrelp", "690", "src/main/resources/pokemon/690.png", 50, Type.POISON, Type.WATER),
    DRAGALGE("Dragalge", "691", "src/main/resources/pokemon/691.png", 65, Type.POISON, Type.DRAGON),
    CLAUNCHER("Clauncher", "692", "src/main/resources/pokemon/692.png", 50, Type.WATER),
    CLAWITZER("Clawitzer", "693", "src/main/resources/pokemon/693.png", 71, Type.WATER),
    HELIOPTILE("Helioptile", "694", "src/main/resources/pokemon/694.png", 44, Type.ELECTRIC, Type.NORMAL),
    HELIOLISK("Heliolisk", "695", "src/main/resources/pokemon/695.png", 62, Type.ELECTRIC, Type.NORMAL),
    TYRUNT("Tyrunt", "696", "src/main/resources/pokemon/696.png", 58, Type.ROCK, Type.DRAGON),
    TYRANTRUM("Tyrantrum", "697", "src/main/resources/pokemon/697.png", 82, Type.ROCK, Type.DRAGON),
    AMAURA("Amaura", "698", "src/main/resources/pokemon/698.png", 77, Type.ROCK, Type.ICE),
    AURORUS("Aurorus", "699", "src/main/resources/pokemon/699.png", 123, Type.ROCK, Type.ICE),
    SYLVEON("Sylveon", "700", "src/main/resources/pokemon/700.png", 95, Type.FAIRY),
    HAWLUCHA("Hawlucha", "701", "src/main/resources/pokemon/701.png", 78, Type.FIGHTING, Type.FLYING),
    DEDENNE("Dedenne", "702", "src/main/resources/pokemon/702.png", 67, Type.ELECTRIC, Type.FAIRY),
    CARBINK("Carbink", "703", "src/main/resources/pokemon/703.png", 50, Type.ROCK, Type.FAIRY),
    GOOMY("Goomy", "704", "src/main/resources/pokemon/704.png", 45, Type.DRAGON),
    SLIGGOO("Sliggoo", "705", "src/main/resources/pokemon/705.png", 68, Type.DRAGON),
    GOODRA("Goodra", "706", "src/main/resources/pokemon/706.png", 90, Type.DRAGON),
    KLEFKI("Klefki", "707", "src/main/resources/pokemon/707.png", 57, Type.STEEL, Type.FAIRY),
    PHANTUMP("Phantump", "708", "src/main/resources/pokemon/708.png", 43, Type.GHOST, Type.GRASS),
    TREVENANT("Trevenant", "709", "src/main/resources/pokemon/709.png", 85, Type.GHOST, Type.GRASS),
    PUMPKABOO("Pumpkaboo", "710", "src/main/resources/pokemon/710.png", 49, Type.GHOST, Type.GRASS),
    GOURGEIST("Gourgeist", "711", "src/main/resources/pokemon/711.png", 65, Type.GHOST, Type.GRASS),
    BERGMITE("Bergmite", "712", "src/main/resources/pokemon/712.png", 55, Type.ICE),
    AVALUGG("Avalugg", "713", "src/main/resources/pokemon/713.png", 95, Type.ICE),
    NOIBAT("Noibat", "714", "src/main/resources/pokemon/714.png", 40, Type.FLYING, Type.DRAGON),
    NOIVERN("Noivern", "715", "src/main/resources/pokemon/715.png", 85, Type.FLYING, Type.DRAGON),
    XERNEAS("Xerneas", "716", "src/main/resources/pokemon/716.png", 126, Type.FAIRY),
    YVELTAL("Yveltal", "717", "src/main/resources/pokemon/717.png", 126, Type.DARK, Type.FLYING),
    ZYGARDE_50("Zygarde (50% Forme)", "718", "src/main/resources/pokemon/718.png", 108, Type.DRAGON, Type.GROUND),
    DIANCIE("Diancie", "719", "src/main/resources/pokemon/719.png", 50, Type.ROCK, Type.FAIRY),
    HOOPA("Hoopa (Confined)", "720", "src/main/resources/pokemon/720.png", 80, Type.PSYCHIC, Type.GHOST),
    VOLCANION("Volcanion", "721", "src/main/resources/pokemon/721.png", 80, Type.FIRE, Type.WATER),

    MEGA_VENUSAUR("Mega Venusaur", "001", "src/main/resources/pokemon/10033.png", 80, Type.GRASS, Type.POISON),
    MEGA_CHARIZARD_X("Mega Charizard X", "006", "src/main/resources/pokemon/10034.png", 78, Type.FIRE, Type.DRAGON),
    MEGA_CHARIZARD_Y("Mega Charizard Y", "006", "src/main/resources/pokemon/10035.png", 78, Type.FIRE, Type.FLYING),
    MEGA_BLASTOISE("Mega Blastoise", "009", "src/main/resources/pokemon/10036.png", 79, Type.WATER),
    MEGA_ALAKAZAM("Mega Alakazam", "065", "src/main/resources/pokemon/10037.png", 55, Type.PSYCHIC),
    MEGA_GENGAR("Mega Gengar", "094", "src/main/resources/pokemon/10038.png", 60, Type.GHOST, Type.POISON),
    MEGA_KANGASKHAN("Mega Kangaskhan", "115", "src/main/resources/pokemon/10039.png", 105, Type.NORMAL),
    MEGA_PINSIR("Mega Pinsir", "127", "src/main/resources/pokemon/10040.png", 65, Type.BUG),
    MEGA_GYARADOS("Mega Gyarados", "130", "src/main/resources/pokemon/10041.png", 95, Type.WATER, Type.DARK),
    MEGA_AERODACTYL("Mega Aerodactyl", "142", "src/main/resources/pokemon/10042.png", 80, Type.ROCK, Type.FLYING),
    MEGA_MEWTWO_X("Mega Mewtwo X", "150", "src/main/resources/pokemon/10043.png", 106, Type.PSYCHIC,Type.FIGHTING),
    MEGA_MEWTWO_Y("Mega Mewtwo Y", "150", "src/main/resources/pokemon/10044.png", 106, Type.PSYCHIC),
    MEGA_AMPHAROS("Mega Ampharos", "181", "src/main/resources/pokemon/10045.png", 90, Type.ELECTRIC, Type.DRAGON),
    MEGA_SCIZOR("Mega Scizor", "212", "src/main/resources/pokemon/10046.png", 70, Type.BUG, Type.STEEL),
    MEGA_HERACROSS("Mega Heracross", "214", "src/main/resources/pokemon/10047.png", 80, Type.BUG, Type.FIGHTING),
    MEGA_HOUNDOOM("Mega Houndoom", "229", "src/main/resources/pokemon/10048.png", 75, Type.DARK, Type.FIRE),
    MEGA_TYRANITAR("Mega Tyranitar", "248", "src/main/resources/pokemon/10049.png", 100, Type.ROCK, Type.DARK),
    MEGA_BLAZIKEN("Mega Blaziken", "257", "src/main/resources/pokemon/10050.png", 80, Type.FIRE, Type.FIGHTING),
    MEGA_GARDEVOIR("Mega Gardevoir", "282", "src/main/resources/pokemon/10051.png", 68, Type.PSYCHIC, Type.FAIRY),
    MEGA_MAWILE("Mega Mawile", "303", "src/main/resources/pokemon/10052.png", 50, Type.STEEL, Type.FAIRY),
    MEGA_AGGRON("Mega Aggron", "306", "src/main/resources/pokemon/10053.png", 70, Type.STEEL, Type.ROCK),
    MEGA_MEDICHAM("Mega Medicham", "308", "src/main/resources/pokemon/10054.png", 60, Type.FIGHTING, Type.PSYCHIC),
    MEGA_MANECTRIC("Mega Manectric", "310", "src/main/resources/pokemon/10055.png", 70, Type.ELECTRIC),
    MEGA_BANETTE("Mega Banette", "354", "src/main/resources/pokemon/10056.png", 64, Type.GHOST),
    MEGA_ABSOL("Mega Absol", "359", "src/main/resources/pokemon/10057.png", 65, Type.DARK),
    MEGA_GARCHOMP("Mega Garchomp", "445", "src/main/resources/pokemon/10058.png", 108, Type.DRAGON, Type.GROUND),
    MEGA_LUCARIO("Mega Lucario", "448", "src/main/resources/pokemon/10059.png", 70, Type.FIGHTING, Type.STEEL),
    MEGA_ABOMASNOW("Mega Abomasnow", "460", "src/main/resources/pokemon/10060.png", 90, Type.GRASS, Type.ICE),
    MEGA_LATIAS("Mega Latias", "380", "src/main/resources/pokemon/10062.png", 80, Type.DRAGON, Type.PSYCHIC),
    MEGA_LATIOS("Mega Latios", "381", "src/main/resources/pokemon/10063.png", 80, Type.DRAGON, Type.PSYCHIC),
    MEGA_SWAMPERT("Mega Swampert", "260", "src/main/resources/pokemon/10064.png", 100, Type.WATER, Type.GROUND),
    MEGA_SCEPTILE("Mega Sceptile", "254", "src/main/resources/pokemon/10065.png", 70, Type.GRASS),
    MEGA_SABLEYE("Mega Sableye", "302", "src/main/resources/pokemon/10066.png", 50, Type.DARK, Type.GHOST),
    MEGA_ALTARIA("Mega Altaria", "334", "src/main/resources/pokemon/10067.png", 75, Type.DRAGON, Type.FAIRY),
    MEGA_GALLADE("Mega Gallade", "475", "src/main/resources/pokemon/10068.png", 68, Type.PSYCHIC, Type.FIGHTING),
    MEGA_AUDINO("Mega Audino", "531", "src/main/resources/pokemon/10069.png", 103, Type.NORMAL),
    MEGA_SHARPEDO("Mega Sharpedo", "319", "src/main/resources/pokemon/10070.png", 70, Type.WATER, Type.DARK),
    MEGA_SLOWBRO("Mega Slowbro", "080", "src/main/resources/pokemon/10071.png", 95, Type.WATER, Type.PSYCHIC),
    MEGA_STEELIX("Mega Steelix", "208", "src/main/resources/pokemon/10072.png", 75, Type.STEEL, Type.GROUND),
    MEGA_PIDGEOT("Mega Pidgeot", "018", "src/main/resources/pokemon/10073.png", 83, Type.NORMAL, Type.FLYING),
    MEGA_GLALIE("Mega Glalie", "362", "src/main/resources/pokemon/10074.png", 80, Type.ICE),
    MEGA_DIANCIE("Mega Diancie", "719", "src/main/resources/pokemon/10075.png", 50, Type.ROCK, Type.FAIRY),
    MEGA_METAGROSS("Mega Metagross", "376", "src/main/resources/pokemon/10076.png", 80, Type.STEEL, Type.PSYCHIC),
    PRIMAL_KYOGRE("Primal Kyogre", "382", "src/main/resources/pokemon/10077.png", 100, Type.WATER),
    PRIMAL_GROUDON("Primal Groudon", "383", "src/main/resources/pokemon/10078.png", 100, Type.GROUND),
    MEGA_RAYQUAZA("Mega Rayquaza", "384", "src/main/resources/pokemon/10079.png", 105, Type.DRAGON, Type.FLYING),
    HOOPA_UNBOUND("Hoopa (Unbound)", "720", "src/main/resources/pokemon/10086.png", 80, Type.PSYCHIC, Type.GHOST),
    MEGA_CAMERUPT("Mega Camerupt", "323", "src/main/resources/pokemon/10087.png", 70, Type.FIRE, Type.GROUND),
    MEGA_LOPUNNY("Mega Lopunny", "428", "src/main/resources/pokemon/10088.png", 65, Type.NORMAL),
    MEGA_SALAMENCE("Mega Salamence", "373", "src/main/resources/pokemon/10089.png", 95, Type.DRAGON, Type.FLYING),
    MEGA_BEEDRILL("Mega Beedrill", "015", "src/main/resources/pokemon/10090.png", 65, Type.BUG, Type.POISON);


    /**
     * La HP base del Pokémon.
     */
    private final int HP;

    /**
     * Los tipos del Pokémon.
     * @see Type
     */
    private final Type[] TYPE;

    /**
     * El nombre del Pokémon.
     */
    private final String NAME;

    /**
     * El número de la Pokédex nacional del Pokémon.
     */
    private final String NAT_DEX_NUMBER;

    /**
     * La imagen del Pokémon.
     */
    private ImageIcon IMG;


    /**
     * Constructor de la enumeración
     * @param name nombre del Pokémon
     * @param dexNumber el número de la Pokédex nacional
     * @param path la dirección de imagen del Pokémon
     * @param hp estadistica base del Pokémon en HP
     * @param type tipos del Pokémon
     */
    Generation6(final String name, final String dexNumber, final String path, final int hp, final Type... type) {
        HP = hp;
        NAT_DEX_NUMBER = dexNumber;
        NAME = name;
        TYPE = type;
        IMG = new ImageIcon(new ImageIcon(path).getImage().getScaledInstance(180, 180, Image.SCALE_SMOOTH));
    }

    /**
     * @return numero Pokédex nacional
     */
    public String getDexNumber()
    {
        return NAT_DEX_NUMBER;
    }

    /**
     * @return vida (HP) base del Pokémon
     */
    public int getHP(){
        return HP;
    }

    /**
     * @return nombre del Pokémon
     */
    public String getName()
    {
        return NAME;
    }

    /**
     * @return primer tipo del Pokémon
     */
    public Type[] getType()
    {
        return TYPE;
    }

    /**
     * @return imagen del Pokémon
     */
    public ImageIcon getImg(){
        return IMG;
    }
}