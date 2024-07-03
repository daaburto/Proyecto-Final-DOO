package org.pokemon;

import javax.swing.*;
import java.awt.*;

public enum Generation2 {
    CHIKORITA("Chikorita", "152", "src/main/resources/pokemon/152.png", 45, Type.GRASS),
    BAYLEEF("Bayleef", "153", "src/main/resources/pokemon/153.png", 60, Type.GRASS),
    MEGANIUM("Meganium", "154", "src/main/resources/pokemon/154.png", 80, Type.GRASS),
    CYNDAQUIL("Cyndaquil", "155", "src/main/resources/pokemon/155.png", 39, Type.FIRE),
    QUILAVA("Quilava", "156", "src/main/resources/pokemon/156.png", 58, Type.FIRE),
    TYPHLOSION("Typhlosion", "157", "src/main/resources/pokemon/157.png", 78, Type.FIRE),
    TOTODILE("Totodile", "158", "src/main/resources/pokemon/158.png", 50, Type.WATER),
    CROCONAW("Croconaw", "159", "src/main/resources/pokemon/159.png", 65, Type.WATER),
    FERALIGATR("Feraligatr", "160", "src/main/resources/pokemon/160.png", 85, Type.WATER),
    SENTRET("Sentret", "161", "src/main/resources/pokemon/161.png", 35, Type.NORMAL),
    FURRET("Furret", "162", "src/main/resources/pokemon/162.png", 85, Type.NORMAL),
    HOOTHOOT("Hoothoot", "163", "src/main/resources/pokemon/163.png", 60, Type.NORMAL, Type.FLYING),
    NOCTOWL("Noctowl", "164", "src/main/resources/pokemon/164.png", 100, Type.NORMAL, Type.FLYING),
    LEDYBA("Ledyba", "165", "src/main/resources/pokemon/165.png", 40, Type.BUG, Type.FLYING),
    LEDIAN("Ledian", "166", "src/main/resources/pokemon/166.png", 55, Type.BUG, Type.FLYING),
    SPINARAK("Spinarak", "167", "src/main/resources/pokemon/167.png", 40, Type.BUG, Type.POISON),
    ARIADOS("Ariados", "168", "src/main/resources/pokemon/168.png", 70, Type.BUG, Type.POISON),
    CROBAT("Crobat", "169", "src/main/resources/pokemon/169.png", 85, Type.POISON, Type.FLYING),
    CHINCHOU("Chinchou", "170", "src/main/resources/pokemon/170.png", 75, Type.WATER, Type.ELECTRIC),
    LANTURN("Lanturn", "171", "src/main/resources/pokemon/171.png", 125, Type.WATER, Type.ELECTRIC),
    PICHU("Pichu", "172", "src/main/resources/pokemon/172.png", 20, Type.ELECTRIC),
    CLEFFA("Cleffa", "173", "src/main/resources/pokemon/173.png", 50, Type.FAIRY),
    IGGLYBUFF("Igglybuff", "174", "src/main/resources/pokemon/174.png", 90, Type.NORMAL, Type.FAIRY),
    TOGEPI("Togepi", "175", "src/main/resources/pokemon/175.png", 35, Type.FAIRY),
    TOGETIC("Togetic", "176", "src/main/resources/pokemon/176.png", 55, Type.FAIRY, Type.FLYING),
    NATU("Natu", "177", "src/main/resources/pokemon/177.png", 40, Type.PSYCHIC, Type.FLYING),
    XATU("Xatu", "178", "src/main/resources/pokemon/178.png", 65, Type.PSYCHIC, Type.FLYING),
    MAREEP("Mareep", "179", "src/main/resources/pokemon/179.png", 55, Type.ELECTRIC),
    FLAAFFY("Flaaffy", "180", "src/main/resources/pokemon/180.png", 70, Type.ELECTRIC),
    AMPHAROS("Ampharos", "181", "src/main/resources/pokemon/181.png", 90, Type.ELECTRIC),
    BELLOSSOM("Bellossom", "182", "src/main/resources/pokemon/182.png", 75, Type.GRASS),
    MARILL("Marill", "183", "src/main/resources/pokemon/183.png", 70, Type.WATER, Type.FAIRY),
    AZUMARILL("Azumarill", "184", "src/main/resources/pokemon/184.png", 100, Type.WATER, Type.FAIRY),
    SUDOWOODO("Sudowoodo", "185", "src/main/resources/pokemon/185.png", 70, Type.ROCK),
    POLITOED("Politoed", "186", "src/main/resources/pokemon/186.png", 90, Type.WATER),
    HOPPIP("Hoppip", "187", "src/main/resources/pokemon/187.png", 35, Type.GRASS, Type.FLYING),
    SKIPLOOM("Skiploom", "188", "src/main/resources/pokemon/188.png", 55, Type.GRASS, Type.FLYING),
    JUMPLUFF("Jumpluff", "189", "src/main/resources/pokemon/189.png", 75, Type.GRASS, Type.FLYING),
    AIPOM("Aipom", "190", "src/main/resources/pokemon/190.png", 55, Type.NORMAL),
    SUNKERN("Sunkern", "191", "src/main/resources/pokemon/191.png", 30, Type.GRASS),
    SUNFLORA("Sunflora", "192", "src/main/resources/pokemon/192.png", 75, Type.GRASS),
    YANMA("Yanma", "193", "src/main/resources/pokemon/193.png", 65, Type.BUG, Type.FLYING),
    WOOPER("Wooper", "194", "src/main/resources/pokemon/194.png", 55, Type.WATER, Type.GROUND),
    QUAGSIRE("Quagsire", "195", "src/main/resources/pokemon/195.png", 95, Type.WATER, Type.GROUND),
    ESPEON("Espeon", "196", "src/main/resources/pokemon/196.png", 65, Type.PSYCHIC),
    UMBREON("Umbreon", "197", "src/main/resources/pokemon/197.png", 95, Type.DARK),
    MURKROW("Murkrow", "198", "src/main/resources/pokemon/198.png", 60, Type.DARK, Type.FLYING),
    SLOWKING("Slowking", "199", "src/main/resources/pokemon/199.png", 95, Type.WATER, Type.PSYCHIC),
    MISDREAVUS("Misdreavus", "200", "src/main/resources/pokemon/200.png", 60, Type.GHOST),
    UNOWN("Unown", "201", "src/main/resources/pokemon/201.png", 48, Type.PSYCHIC),
    WOBBUFFET("Wobbuffet", "202", "src/main/resources/pokemon/202.png", 190, Type.PSYCHIC),
    GIRAFARIG("Girafarig", "203", "src/main/resources/pokemon/203.png", 70, Type.NORMAL, Type.PSYCHIC),
    PINECO("Pineco", "204", "src/main/resources/pokemon/204.png", 50, Type.BUG),
    FORRETRESS("Forretress", "205", "src/main/resources/pokemon/205.png", 75, Type.BUG, Type.STEEL),
    DUNSPARCE("Dunsparce", "206", "src/main/resources/pokemon/206.png", 100, Type.NORMAL),
    GLIGAR("Gligar", "207", "src/main/resources/pokemon/207.png", 65, Type.GROUND, Type.FLYING),
    STEELIX("Steelix", "208", "src/main/resources/pokemon/208.png", 75, Type.STEEL, Type.GROUND),
    SNUBBULL("Snubbull", "209", "src/main/resources/pokemon/209.png", 60, Type.FAIRY),
    GRANBULL("Granbull", "210", "src/main/resources/pokemon/210.png", 90, Type.FAIRY),
    QWILFISH("Qwilfish", "211", "src/main/resources/pokemon/211.png", 65, Type.WATER, Type.POISON),
    SCIZOR("Scizor", "212", "src/main/resources/pokemon/212.png", 70, Type.BUG, Type.STEEL),
    SHUCKLE("Shuckle", "213", "src/main/resources/pokemon/213.png", 20, Type.BUG, Type.ROCK),
    HERACROSS("Heracross", "214", "src/main/resources/pokemon/214.png", 80, Type.BUG, Type.FIGHTING),
    SNEASEL("Sneasel", "215", "src/main/resources/pokemon/215.png", 55, Type.DARK, Type.ICE),
    TEDDIURSA("Teddiursa", "216", "src/main/resources/pokemon/216.png", 60, Type.NORMAL),
    URSARING("Ursaring", "217", "src/main/resources/pokemon/217.png", 90, Type.NORMAL),
    SLUGMA("Slugma", "218", "src/main/resources/pokemon/218.png", 40, Type.FIRE),
    MAGCARGO("Magcargo", "219", "src/main/resources/pokemon/219.png", 50, Type.FIRE, Type.ROCK),
    SWINUB("Swinub", "220", "src/main/resources/pokemon/220.png", 50, Type.ICE, Type.GROUND),
    PILOSWINE("Piloswine", "221", "src/main/resources/pokemon/221.png", 100, Type.ICE, Type.GROUND),
    CORSOLA("Corsola", "222", "src/main/resources/pokemon/222.png", 55, Type.WATER, Type.ROCK),
    REMORAID("Remoraid", "223", "src/main/resources/pokemon/223.png", 35, Type.WATER),
    OCTILLERY("Octillery", "224", "src/main/resources/pokemon/224.png", 75, Type.WATER),
    DELIBIRD("Delibird", "225", "src/main/resources/pokemon/225.png", 45, Type.ICE, Type.FLYING),
    MANTINE("Mantine", "226", "src/main/resources/pokemon/226.png", 65, Type.WATER, Type.FLYING),
    SKARMORY("Skarmory", "227", "src/main/resources/pokemon/227.png", 65, Type.STEEL, Type.FLYING),
    HOUNDOUR("Houndour", "228", "src/main/resources/pokemon/228.png", 45, Type.DARK, Type.FIRE),
    HOUNDOOM("Houndoom", "229", "src/main/resources/pokemon/229.png", 75, Type.DARK, Type.FIRE),
    KINGDRA("Kingdra", "230", "src/main/resources/pokemon/230.png", 75, Type.WATER, Type.DRAGON),

    PHANPY("Phanpy", "231", "src/main/resources/pokemon/231.png", 90, Type.GROUND),
    DONPHAN("Donphan", "232", "src/main/resources/pokemon/232.png", 90, Type.GROUND),
    PORYGON2("Porygon2", "233", "src/main/resources/pokemon/233.png", 85, Type.NORMAL),
    STANTLER("Stantler", "234", "src/main/resources/pokemon/234.png", 73, Type.NORMAL),
    SMEARGLE("Smeargle", "235", "src/main/resources/pokemon/235.png", 55, Type.NORMAL),
    TYROGUE("Tyrogue", "236", "src/main/resources/pokemon/236.png", 35, Type.FIGHTING),
    HITMONTOP("Hitmontop", "237", "src/main/resources/pokemon/237.png", 50, Type.FIGHTING),
    SMOOCHUM("Smoochum", "238", "src/main/resources/pokemon/238.png", 45, Type.ICE, Type.PSYCHIC),
    ELEKID("Elekid", "239", "src/main/resources/pokemon/239.png", 45, Type.ELECTRIC),
    MAGBY("Magby", "240", "src/main/resources/pokemon/240.png", 45, Type.FIRE),
    MILTANK("Miltank", "241", "src/main/resources/pokemon/241.png", 95, Type.NORMAL),
    BLISSEY("Blissey", "242", "src/main/resources/pokemon/242.png", 255, Type.NORMAL),
    RAIKOU("Raikou", "243", "src/main/resources/pokemon/243.png", 90, Type.ELECTRIC),
    ENTEI("Entei", "244", "src/main/resources/pokemon/244.png", 115, Type.FIRE),
    SUICUNE("Suicune", "245", "src/main/resources/pokemon/245.png", 100, Type.WATER),
    LARVITAR("Larvitar", "246", "src/main/resources/pokemon/246.png", 50, Type.ROCK, Type.GROUND),
    PUPITAR("Pupitar", "247", "src/main/resources/pokemon/247.png", 70, Type.ROCK, Type.GROUND),
    TYRANITAR("Tyranitar", "248", "src/main/resources/pokemon/248.png", 100, Type.ROCK, Type.DARK),
    LUGIA("Lugia", "249", "src/main/resources/pokemon/249.png", 106, Type.PSYCHIC, Type.FLYING),
    HO_OH("Ho-Oh", "250", "src/main/resources/pokemon/250.png", 106, Type.FIRE, Type.FLYING),
    CELEBI("Celebi", "251", "src/main/resources/pokemon/251.png", 100, Type.PSYCHIC, Type.GRASS);

    private final int HP;
    private final Type[] TYPE;
    private final String NAME, NAT_DEX_NUMBER;
    private ImageIcon IMG;

    Generation2(final String name, final String dexNumber, final String path, final int hp, final Type... type) {
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
