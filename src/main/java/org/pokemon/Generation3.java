package org.pokemon;

import javax.swing.*;
import java.awt.*;

public enum Generation3 {
    TREECKO("Treecko", "252", "src/main/resources/pokemon/252.png", 40, Type.GRASS),
    GROVYLE("Grovyle", "253", "src/main/resources/pokemon/253.png", 50, Type.GRASS),
    SCEPTILE("Sceptile", "254", "src/main/resources/pokemon/254.png", 70, Type.GRASS),
    TORCHIC("Torchic", "255", "src/main/resources/pokemon/255.png", 45, Type.FIRE),
    COMBUSKEN("Combusken", "256", "src/main/resources/pokemon/256.png", 60, Type.FIRE, Type.FIGHTING),
    BLAZIKEN("Blaziken", "257", "src/main/resources/pokemon/257.png", 80, Type.FIRE, Type.FIGHTING),
    MUDKIP("Mudkip", "258", "src/main/resources/pokemon/258.png", 50, Type.WATER),
    MARSHTOMP("Marshtomp", "259", "src/main/resources/pokemon/259.png", 70, Type.WATER, Type.GROUND),
    SWAMPERT("Swampert", "260", "src/main/resources/pokemon/260.png", 100, Type.WATER, Type.GROUND),
    POOCHYENA("Poochyena", "261", "src/main/resources/pokemon/261.png", 35, Type.DARK),
    MIGHTYENA("Mightyena", "262", "src/main/resources/pokemon/262.png", 70, Type.DARK),
    ZIGZAGOON("Zigzagoon", "263", "src/main/resources/pokemon/263.png", 38, Type.NORMAL),
    LINOONE("Linoone", "264", "src/main/resources/pokemon/264.png", 78, Type.NORMAL),
    WURMPLE("Wurmple", "265", "src/main/resources/pokemon/265.png", 45, Type.BUG),
    SILCOON("Silcoon", "266", "src/main/resources/pokemon/266.png", 50, Type.BUG),
    BEAUTIFLY("Beautifly", "267", "src/main/resources/pokemon/267.png", 60, Type.BUG, Type.FLYING),
    CASCOON("Cascoon", "268", "src/main/resources/pokemon/268.png", 50, Type.BUG),
    DUSTOX("Dustox", "269", "src/main/resources/pokemon/269.png", 60, Type.BUG, Type.POISON),
    LOTAD("Lotad", "270", "src/main/resources/pokemon/270.png", 40, Type.WATER, Type.GRASS),
    LOMBRE("Lombre", "271", "src/main/resources/pokemon/271.png", 60, Type.WATER, Type.GRASS),
    LUDICOLO("Ludicolo", "272", "src/main/resources/pokemon/272.png", 80, Type.WATER, Type.GRASS),
    SEEDOT("Seedot", "273", "src/main/resources/pokemon/273.png", 40, Type.GRASS),
    NUZLEAF("Nuzleaf", "274", "src/main/resources/pokemon/274.png", 70, Type.GRASS, Type.DARK),
    SHIFTRY("Shiftry", "275", "src/main/resources/pokemon/275.png", 90, Type.GRASS, Type.DARK),
    TAILLOW("Taillow", "276", "src/main/resources/pokemon/276.png", 40, Type.NORMAL, Type.FLYING),
    SWELLOW("Swellow", "277", "src/main/resources/pokemon/277.png", 60, Type.NORMAL, Type.FLYING),
    WINGULL("Wingull", "278", "src/main/resources/pokemon/278.png", 40, Type.WATER, Type.FLYING),
    PELIPPER("Pelipper", "279", "src/main/resources/pokemon/279.png", 60, Type.WATER, Type.FLYING),
    RALTS("Ralts", "280", "src/main/resources/pokemon/280.png", 28, Type.PSYCHIC, Type.FAIRY),
    KIRLIA("Kirlia", "281", "src/main/resources/pokemon/281.png", 38, Type.PSYCHIC, Type.FAIRY),
    GARDEVOIR("Gardevoir", "282", "src/main/resources/pokemon/282.png", 68, Type.PSYCHIC, Type.FAIRY),
    SURSKIT("Surskit", "283", "src/main/resources/pokemon/283.png", 40, Type.BUG, Type.WATER),
    MASQUERAIN("Masquerain", "284", "src/main/resources/pokemon/284.png", 70, Type.BUG, Type.FLYING),
    SHROOMISH("Shroomish", "285", "src/main/resources/pokemon/285.png", 60, Type.GRASS),
    BRELOOM("Breloom", "286", "src/main/resources/pokemon/286.png", 60, Type.GRASS, Type.FIGHTING),
    SLAKOTH("Slakoth", "287", "src/main/resources/pokemon/287.png", 60, Type.NORMAL),
    VIGOROTH("Vigoroth", "288", "src/main/resources/pokemon/288.png", 80, Type.NORMAL),
    SLAKING("Slaking", "289", "src/main/resources/pokemon/289.png", 150, Type.NORMAL),
    NINCADA("Nincada", "290", "src/main/resources/pokemon/290.png", 31, Type.BUG, Type.GROUND),
    NINJASK("Ninjask", "291", "src/main/resources/pokemon/291.png", 61, Type.BUG, Type.FLYING),
    SHEDINJA("Shedinja", "292", "src/main/resources/pokemon/292.png", 1, Type.BUG, Type.GHOST),
    WHISMUR("Whismur", "293", "src/main/resources/pokemon/293.png", 64, Type.NORMAL),
    LOUDRED("Loudred", "294", "src/main/resources/pokemon/294.png", 84, Type.NORMAL),
    EXPLOUD("Exploud", "295", "src/main/resources/pokemon/295.png", 104, Type.NORMAL),
    MAKUHITA("Makuhita", "296", "src/main/resources/pokemon/296.png", 72, Type.FIGHTING),
    HARIYAMA("Hariyama", "297", "src/main/resources/pokemon/297.png", 144, Type.FIGHTING),
    AZURILL("Azurill", "298", "src/main/resources/pokemon/298.png", 50, Type.NORMAL, Type.FAIRY),
    NOSEPASS("Nosepass", "299", "src/main/resources/pokemon/299.png", 30, Type.ROCK),
    SKITTY("Skitty", "300", "src/main/resources/pokemon/300.png", 50, Type.NORMAL),
    DELCATTY("Delcatty", "301", "src/main/resources/pokemon/301.png", 70, Type.NORMAL),
    SABLEYE("Sableye", "302", "src/main/resources/pokemon/302.png", 50, Type.DARK, Type.GHOST),
    MAWILE("Mawile", "303", "src/main/resources/pokemon/303.png", 50, Type.STEEL, Type.FAIRY),
    ARON("Aron", "304", "src/main/resources/pokemon/304.png", 50, Type.STEEL, Type.ROCK),
    LAIRON("Lairon", "305", "src/main/resources/pokemon/305.png", 60, Type.STEEL, Type.ROCK),
    AGGRON("Aggron", "306", "src/main/resources/pokemon/306.png", 70, Type.STEEL, Type.ROCK),
    MEDITITE("Meditite", "307", "src/main/resources/pokemon/307.png", 30, Type.FIGHTING, Type.PSYCHIC),
    MEDICHAM("Medicham", "308", "src/main/resources/pokemon/308.png", 60, Type.FIGHTING, Type.PSYCHIC),
    ELECTRIKE("Electrike", "309", "src/main/resources/pokemon/309.png", 40, Type.ELECTRIC),
    MANECTRIC("Manectric", "310", "src/main/resources/pokemon/310.png", 70, Type.ELECTRIC),
    PLUSLE("Plusle", "311", "src/main/resources/pokemon/311.png", 60, Type.ELECTRIC),
    MINUN("Minun", "312", "src/main/resources/pokemon/312.png", 60, Type.ELECTRIC),
    VOLBEAT("Volbeat", "313", "src/main/resources/pokemon/313.png", 65, Type.BUG),
    ILLUMISE("Illumise", "314", "src/main/resources/pokemon/314.png", 65, Type.BUG),
    ROSELIA("Roselia", "315", "src/main/resources/pokemon/315.png", 50, Type.GRASS, Type.POISON),
    GULPIN("Gulpin", "316", "src/main/resources/pokemon/316.png", 70, Type.POISON),
    SWALOT("Swalot", "317", "src/main/resources/pokemon/317.png", 100, Type.POISON),
    CARVANHA("Carvanha", "318", "src/main/resources/pokemon/318.png", 45, Type.WATER, Type.DARK),
    SHARPEDO("Sharpedo", "319", "src/main/resources/pokemon/319.png", 70, Type.WATER, Type.DARK),
    WAILMER("Wailmer", "320", "src/main/resources/pokemon/320.png", 130, Type.WATER),
    WAILORD("Wailord", "321", "src/main/resources/pokemon/321.png", 170, Type.WATER),
    NUMEL("Numel", "322", "src/main/resources/pokemon/322.png", 60, Type.FIRE, Type.GROUND),
    CAMERUPT("Camerupt", "323", "src/main/resources/pokemon/323.png", 70, Type.FIRE, Type.GROUND),
    TORKOAL("Torkoal", "324", "src/main/resources/pokemon/324.png", 70, Type.FIRE),
    SPOINK("Spoink", "325", "src/main/resources/pokemon/325.png", 60, Type.PSYCHIC),
    GRUMPIG("Grumpig", "326", "src/main/resources/pokemon/326.png", 80, Type.PSYCHIC),
    SPINDA("Spinda", "327", "src/main/resources/pokemon/327.png", 60, Type.NORMAL),
    TRAPINCH("Trapinch", "328", "src/main/resources/pokemon/328.png", 45, Type.GROUND),
    VIBRAVA("Vibrava", "329", "src/main/resources/pokemon/329.png", 50, Type.GROUND, Type.DRAGON),
    FLYGON("Flygon", "330", "src/main/resources/pokemon/330.png", 80, Type.GROUND, Type.DRAGON),
    CACNEA("Cacnea", "331", "src/main/resources/pokemon/331.png", 50, Type.GRASS),
    CACTURNE("Cacturne", "332", "src/main/resources/pokemon/332.png", 70, Type.GRASS, Type.DARK),
    SWABLU("Swablu", "333", "src/main/resources/pokemon/333.png", 45, Type.NORMAL, Type.FLYING),
    ALTARIA("Altaria", "334", "src/main/resources/pokemon/334.png", 75, Type.DRAGON, Type.FLYING),
    ZANGOOSE("Zangoose", "335", "src/main/resources/pokemon/335.png", 73, Type.NORMAL),
    SEVIPER("Seviper", "336", "src/main/resources/pokemon/336.png", 73, Type.POISON),
    LUNATONE("Lunatone", "337", "src/main/resources/pokemon/337.png", 70, Type.ROCK, Type.PSYCHIC),
    SOLROCK("Solrock", "338", "src/main/resources/pokemon/338.png", 70, Type.ROCK, Type.PSYCHIC),
    BARBOACH("Barboach", "339", "src/main/resources/pokemon/339.png", 50, Type.WATER, Type.GROUND),
    WHISCASH("Whiscash", "340", "src/main/resources/pokemon/340.png", 110, Type.WATER, Type.GROUND),
    CORPHISH("Corphish", "341", "src/main/resources/pokemon/341.png", 43, Type.WATER),
    CRAWDAUNT("Crawdaunt", "342", "src/main/resources/pokemon/342.png", 63, Type.WATER, Type.DARK),
    BALTOY("Baltoy", "343", "src/main/resources/pokemon/343.png", 40, Type.GROUND, Type.PSYCHIC),
    CLAYDOL("Claydol", "344", "src/main/resources/pokemon/344.png", 60, Type.GROUND, Type.PSYCHIC),
    LILEEP("Lileep", "345", "src/main/resources/pokemon/345.png", 66, Type.ROCK, Type.GRASS),
    CRADILY("Cradily", "346", "src/main/resources/pokemon/346.png", 86, Type.ROCK, Type.GRASS),
    ANORITH("Anorith", "347", "src/main/resources/pokemon/347.png", 45, Type.ROCK, Type.BUG),
    ARMALDO("Armaldo", "348", "src/main/resources/pokemon/348.png", 75, Type.ROCK, Type.BUG),
    FEEBAS("Feebas", "349", "src/main/resources/pokemon/349.png", 20, Type.WATER),
    MILOTIC("Milotic", "350", "src/main/resources/pokemon/350.png", 95, Type.WATER),
    CASTFORM("Castform", "351", "src/main/resources/pokemon/351.png", 70, Type.NORMAL),
    CASTFORM_SUNNY("Castform Sunny", "351", "src/main/resources/pokemon/351-sunny.png", 70, Type.FIRE),
    CASTFORM_RAINY("Castform Rainy", "351", "src/main/resources/pokemon/351-rainy.png", 70, Type.WATER),
    CASTFORM_SNOWY("Castform Snowy", "351", "src/main/resources/pokemon/351-snowy.png", 70, Type.ICE),
    KECLEON("Kecleon", "352", "src/main/resources/pokemon/352.png", 60, Type.NORMAL),
    SHUPPET("Shuppet", "353", "src/main/resources/pokemon/353.png", 44, Type.GHOST),
    BANETTE("Banette", "354", "src/main/resources/pokemon/354.png", 64, Type.GHOST),
    DUSKULL("Duskull", "355", "src/main/resources/pokemon/355.png", 20, Type.GHOST),
    DUSCLOPS("Dusclops", "356", "src/main/resources/pokemon/356.png", 40, Type.GHOST),
    TROPIUS("Tropius", "357", "src/main/resources/pokemon/357.png", 99, Type.GRASS, Type.FLYING),
    CHIMECHO("Chimecho", "358", "src/main/resources/pokemon/358.png", 65, Type.PSYCHIC),
    ABSOL("Absol", "359", "src/main/resources/pokemon/359.png", 65, Type.DARK),
    WYNAUT("Wynaut", "360", "src/main/resources/pokemon/360.png", 95, Type.PSYCHIC),
    SNORUNT("Snorunt", "361", "src/main/resources/pokemon/361.png", 50, Type.ICE),
    GLALIE("Glalie", "362", "src/main/resources/pokemon/362.png", 80, Type.ICE),
    SPHEAL("Spheal", "363", "src/main/resources/pokemon/363.png", 70, Type.ICE, Type.WATER),
    SEALEO("Sealeo", "364", "src/main/resources/pokemon/364.png", 90, Type.ICE, Type.WATER),
    WALREIN("Walrein", "365", "src/main/resources/pokemon/365.png", 110, Type.ICE, Type.WATER),
    CLAMPERL("Clamperl", "366", "src/main/resources/pokemon/366.png", 35, Type.WATER),
    HUNTAIL("Huntail", "367", "src/main/resources/pokemon/367.png", 55, Type.WATER),
    GOREBYSS("Gorebyss", "368", "src/main/resources/pokemon/368.png", 55, Type.WATER),
    RELICANTH("Relicanth", "369", "src/main/resources/pokemon/369.png", 100, Type.WATER, Type.ROCK),
    LUVDISC("Luvdisc", "370", "src/main/resources/pokemon/370.png", 43, Type.WATER),
    BAGON("Bagon", "371", "src/main/resources/pokemon/371.png", 45, Type.DRAGON),
    SHELGON("Shelgon", "372", "src/main/resources/pokemon/372.png", 65, Type.DRAGON),
    SALAMENCE("Salamence", "373", "src/main/resources/pokemon/373.png", 95, Type.DRAGON, Type.FLYING),
    BELDUM("Beldum", "374", "src/main/resources/pokemon/374.png", 40, Type.STEEL, Type.PSYCHIC),
    METANG("Metang", "375", "src/main/resources/pokemon/375.png", 60, Type.STEEL, Type.PSYCHIC),
    METAGROSS("Metagross", "376", "src/main/resources/pokemon/376.png", 80, Type.STEEL, Type.PSYCHIC),
    REGIROCK("Regirock", "377", "src/main/resources/pokemon/377.png", 80, Type.ROCK),
    REGICE("Regice", "378", "src/main/resources/pokemon/378.png", 80, Type.ICE),
    REGISTEEL("Registeel", "379", "src/main/resources/pokemon/379.png", 80, Type.STEEL),
    LATIAS("Latias", "380", "src/main/resources/pokemon/380.png", 80, Type.DRAGON, Type.PSYCHIC),
    LATIOS("Latios", "381", "src/main/resources/pokemon/381.png", 80, Type.DRAGON, Type.PSYCHIC),
    KYOGRE("Kyogre", "382", "src/main/resources/pokemon/382.png", 100, Type.WATER),
    GROUDON("Groudon", "383", "src/main/resources/pokemon/383.png", 100, Type.GROUND),
    RAYQUAZA("Rayquaza", "384", "src/main/resources/pokemon/384.png", 105, Type.DRAGON, Type.FLYING),
    JIRACHI("Jirachi", "385", "src/main/resources/pokemon/385.png", 100, Type.STEEL, Type.PSYCHIC),
    DEOXYS_NORMAL("Deoxys", "386", "src/main/resources/pokemon/386.png", 50, Type.PSYCHIC),
    DEOXYS_ATTACK("Deoxys-Attack", "386", "src/main/resources/pokemon/386-attack.png", 50, Type.PSYCHIC),
    DEOXYS_DEFENSE("Deoxys-Defense", "386", "src/main/resources/pokemon/386-defense.png", 50, Type.PSYCHIC),
    DEOXYS_SPEED("Deoxys-Speed", "386", "src/main/resources/pokemon/386-speed.png", 50, Type.PSYCHIC);

    private final int HP;
    private final Type[] TYPE;
    private final String NAME, NAT_DEX_NUMBER;
    private ImageIcon IMG;

    Generation3(final String name, final String dexNumber, final String path, final int hp, final Type... type) {
        HP = hp;
        NAT_DEX_NUMBER = dexNumber;
        NAME = name;
        TYPE = type;
        IMG = new ImageIcon(new ImageIcon(path).getImage().getScaledInstance(180, 180, Image.SCALE_SMOOTH));
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
