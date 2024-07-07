package org.pokemon;

import javax.swing.*;
import java.awt.*;

/**
 * Enumeración que representa a la séptima generación de Pokémon.
 * Cada Pokémon tiene nombre, número de Pokédex nacional, dirección de imagen, HP, y tipos.
 */
public enum Generation7 {
    ROWLET("Rowlet", "722", "src/main/resources/pokemon/722.png", 68, Type.GRASS, Type.FLYING),
    DARTRIX("Dartrix", "723", "src/main/resources/pokemon/723.png", 78, Type.GRASS, Type.FLYING),
    DECIDUEYE("Decidueye", "724", "src/main/resources/pokemon/724.png", 78, Type.GRASS, Type.GHOST),
    LITTEN("Litten", "725", "src/main/resources/pokemon/725.png", 45, Type.FIRE),
    TORRACAT("Torracat", "726", "src/main/resources/pokemon/726.png", 65, Type.FIRE),
    INCINEROAR("Incineroar", "727", "src/main/resources/pokemon/727.png", 95, Type.FIRE, Type.DARK),
    POPPLIO("Popplio", "728", "src/main/resources/pokemon/728.png", 50, Type.WATER),
    BRIONNE("Brionne", "729", "src/main/resources/pokemon/729.png", 60, Type.WATER),
    PRIMARINA("Primarina", "730", "src/main/resources/pokemon/730.png", 80, Type.WATER, Type.FAIRY),
    PIKIPEK("Pikipek", "731", "src/main/resources/pokemon/731.png", 35, Type.NORMAL, Type.FLYING),
    TRUMBEAK("Trumbeak", "732", "src/main/resources/pokemon/732.png", 55, Type.NORMAL, Type.FLYING),
    TOUCANNON("Toucannon", "733", "src/main/resources/pokemon/733.png", 80, Type.NORMAL, Type.FLYING),
    YUNGOOS("Yungoos", "734", "src/main/resources/pokemon/734.png", 48, Type.NORMAL),
    GUMSHOOS("Gumshoos", "735", "src/main/resources/pokemon/735.png", 88, Type.NORMAL),
    GRUBBIN("Grubbin", "736", "src/main/resources/pokemon/736.png", 47, Type.BUG),
    CHARJABUG("Charjabug", "737", "src/main/resources/pokemon/737.png", 57, Type.BUG, Type.ELECTRIC),
    VIKAVOLT("Vikavolt", "738", "src/main/resources/pokemon/738.png", 77, Type.BUG, Type.ELECTRIC),
    CRABRAWLER("Crabrawler", "739", "src/main/resources/pokemon/739.png", 47, Type.FIGHTING),
    CRABOMINABLE("Crabominable", "740", "src/main/resources/pokemon/740.png", 97, Type.FIGHTING, Type.ICE),
    ORICORIO_BAILE("Oricorio (Baile Style)", "741", "src/main/resources/pokemon/741.png", 75, Type.FIRE, Type.FLYING),
    CUTIEFLY("Cutiefly", "742", "src/main/resources/pokemon/742.png", 40, Type.BUG, Type.FAIRY),
    RIBOMBEE("Ribombee", "743", "src/main/resources/pokemon/743.png", 60, Type.BUG, Type.FAIRY),
    ROCKRUFF("Rockruff", "744", "src/main/resources/pokemon/744.png", 45, Type.ROCK),
    LYCANROC_MIDDAY("Lycanroc (Midday Form)", "745", "src/main/resources/pokemon/745.png", 75, Type.ROCK),
    WISHIWASHI_SOLO("Wishiwashi (Solo Form)", "746", "src/main/resources/pokemon/746.png", 45, Type.WATER),
    MAREANIE("Mareanie", "747", "src/main/resources/pokemon/747.png", 50, Type.POISON, Type.WATER),
    TOXAPEX("Toxapex", "748", "src/main/resources/pokemon/748.png", 50, Type.POISON, Type.WATER),
    MUDBRAY("Mudbray", "749", "src/main/resources/pokemon/749.png", 70, Type.GROUND),
    MUDSDALE("Mudsdale", "750", "src/main/resources/pokemon/750.png", 100, Type.GROUND),
    DEWPIDER("Dewpider", "751", "src/main/resources/pokemon/751.png", 38, Type.WATER, Type.BUG),
    ARAQUANID("Araquanid", "752", "src/main/resources/pokemon/752.png", 68, Type.WATER, Type.BUG),
    FOMANTIS("Fomantis", "753", "src/main/resources/pokemon/753.png", 40, Type.GRASS),
    LURANTIS("Lurantis", "754", "src/main/resources/pokemon/754.png", 70, Type.GRASS),
    MORELULL("Morelull", "755", "src/main/resources/pokemon/755.png", 40, Type.GRASS, Type.FAIRY),
    SHIINOTIC("Shiinotic", "756", "src/main/resources/pokemon/756.png", 60, Type.GRASS, Type.FAIRY),
    SALANDIT("Salandit", "757", "src/main/resources/pokemon/757.png", 48, Type.POISON, Type.FIRE),
    SALAZZLE("Salazzle", "758", "src/main/resources/pokemon/758.png", 68, Type.POISON, Type.FIRE),
    STUFFUL("Stufful", "759", "src/main/resources/pokemon/759.png", 70, Type.NORMAL, Type.FIGHTING),
    BEWEAR("Bewear", "760", "src/main/resources/pokemon/760.png", 120, Type.NORMAL, Type.FIGHTING),
    BOUNSWEET("Bounsweet", "761", "src/main/resources/pokemon/761.png", 42, Type.GRASS),
    STEENEE("Steenee", "762", "src/main/resources/pokemon/762.png", 52, Type.GRASS),
    TSAREENA("Tsareena", "763", "src/main/resources/pokemon/763.png", 72, Type.GRASS),
    COMFEY("Comfey", "764", "src/main/resources/pokemon/764.png", 51, Type.FAIRY),
    ORANGURU("Oranguru", "765", "src/main/resources/pokemon/765.png", 90, Type.NORMAL, Type.PSYCHIC),
    PASSIMIAN("Passimian", "766", "src/main/resources/pokemon/766.png", 100, Type.FIGHTING),
    WIMPOD("Wimpod", "767", "src/main/resources/pokemon/767.png", 25, Type.BUG, Type.WATER),
    GOLISOPOD("Golisopod", "768", "src/main/resources/pokemon/768.png", 75, Type.BUG, Type.WATER),
    SANDYGAST("Sandygast", "769", "src/main/resources/pokemon/769.png", 55, Type.GHOST, Type.GROUND),
    PALOSSAND("Palossand", "770", "src/main/resources/pokemon/770.png", 85, Type.GHOST, Type.GROUND),
    PYUKUMUKU("Pyukumuku", "771", "src/main/resources/pokemon/771.png", 55, Type.WATER),
    TYPE_NULL("Type: Null", "772", "src/main/resources/pokemon/772.png", 95, Type.NORMAL),
    SILVALLY("Silvally", "773", "src/main/resources/pokemon/773.png", 95, Type.NORMAL),
    MINIOR("Minior", "774", "src/main/resources/pokemon/774.png", 60, Type.ROCK, Type.FLYING),
    KOMALA("Komala", "775", "src/main/resources/pokemon/775.png", 65, Type.NORMAL),
    TURTONATOR("Turtonator", "776", "src/main/resources/pokemon/776.png", 60, Type.FIRE, Type.DRAGON),
    TOGEDEMARU("Togedemaru", "777", "src/main/resources/pokemon/777.png", 65, Type.ELECTRIC, Type.STEEL),
    MIMIKYU("Mimikyu", "778", "src/main/resources/pokemon/778.png", 55, Type.GHOST, Type.FAIRY),
    BRUXISH("Bruxish", "779", "src/main/resources/pokemon/779.png", 68, Type.WATER, Type.PSYCHIC),
    DRAMPA("Drampa", "780", "src/main/resources/pokemon/780.png", 78, Type.NORMAL, Type.DRAGON),
    DHELMISE("Dhelmise", "781", "src/main/resources/pokemon/781.png", 70, Type.GHOST, Type.GRASS),
    JANGMO_O("Jangmo-o", "782", "src/main/resources/pokemon/782.png", 45, Type.DRAGON),
    HAKAMO_O("Hakamo-o", "783", "src/main/resources/pokemon/783.png", 55, Type.DRAGON, Type.FIGHTING),
    KOMMO_O("Kommo-o", "784", "src/main/resources/pokemon/784.png", 75, Type.DRAGON, Type.FIGHTING),
    TAPU_KOKO("Tapu Koko", "785", "src/main/resources/pokemon/785.png", 70, Type.ELECTRIC, Type.FAIRY),
    TAPU_LELE("Tapu Lele", "786", "src/main/resources/pokemon/786.png", 70, Type.PSYCHIC, Type.FAIRY),
    TAPU_BULU("Tapu Bulu", "787", "src/main/resources/pokemon/787.png", 70, Type.GRASS, Type.FAIRY),
    TAPU_FINI("Tapu Fini", "788", "src/main/resources/pokemon/788.png", 70, Type.WATER, Type.FAIRY),
    COSMOG("Cosmog", "789", "src/main/resources/pokemon/789.png", 43, Type.PSYCHIC),
    COSMOEM("Cosmoem", "790", "src/main/resources/pokemon/790.png", 43, Type.PSYCHIC),
    SOLGALEO("Solgaleo", "791", "src/main/resources/pokemon/791.png", 137, Type.PSYCHIC, Type.STEEL),
    LUNALA("Lunala", "792", "src/main/resources/pokemon/792.png", 137, Type.PSYCHIC, Type.GHOST),
    NIHILEGO("Nihilego", "793", "src/main/resources/pokemon/793.png", 109, Type.ROCK, Type.POISON),
    BUZZWOLE("Buzzwole", "794", "src/main/resources/pokemon/794.png", 107, Type.BUG, Type.FIGHTING),
    PHEROMOSA("Pheromosa", "795", "src/main/resources/pokemon/795.png", 71, Type.BUG, Type.FIGHTING),
    XURKITREE("Xurkitree", "796", "src/main/resources/pokemon/796.png", 83, Type.ELECTRIC),
    CELESTEELA("Celesteela", "797", "src/main/resources/pokemon/797.png", 97, Type.STEEL, Type.FLYING),
    KARTANA("Kartana", "798", "src/main/resources/pokemon/798.png", 59, Type.GRASS, Type.STEEL),
    GUZZLORD("Guzzlord", "799", "src/main/resources/pokemon/799.png", 223, Type.DARK, Type.DRAGON),
    NECROZMA("Necrozma", "800", "src/main/resources/pokemon/800.png", 97, Type.PSYCHIC),
    MAGEARNA("Magearna", "801", "src/main/resources/pokemon/801.png", 80, Type.STEEL, Type.FAIRY),
    MARSHADOW("Marshadow", "802", "src/main/resources/pokemon/802.png", 90, Type.FIGHTING, Type.GHOST),
    POIPOLE("Poipole", "803", "src/main/resources/pokemon/803.png", 67, Type.POISON),
    NAGANADEL("Naganadel", "804", "src/main/resources/pokemon/804.png", 73, Type.POISON, Type.DRAGON),
    STAKATAKA("Stakataka", "805", "src/main/resources/pokemon/805.png", 61, Type.ROCK, Type.STEEL),
    BLACEPHALON("Blacephalon", "806", "src/main/resources/pokemon/806.png", 53, Type.FIRE, Type.GHOST),
    ZERAORA("Zeraora", "807", "src/main/resources/pokemon/807.png", 88, Type.ELECTRIC),
    MELTAN("Meltan", "808", "src/main/resources/pokemon/808.png", 46, Type.STEEL),
    MELMETAL("Melmetal", "809", "src/main/resources/pokemon/809.png", 135, Type.STEEL),

    ALOLAN_RATTATA("Alolan Rattata", "019", "src/main/resources/pokemon/10091.png", 30, Type.NORMAL, Type.DARK),
    ALOLAN_RATICATE("Alolan Raticate", "020", "src/main/resources/pokemon/10092.png", 75, Type.NORMAL, Type.DARK),
    ALOLAN_RAICHU("Alolan Raichu", "026", "src/main/resources/pokemon/10100.png", 60, Type.ELECTRIC, Type.PSYCHIC),
    ALOLAN_SANDSHREW("Alolan Sandshrew", "027", "src/main/resources/pokemon/10101.png", 50, Type.ICE, Type.STEEL),
    ALOLAN_SANDSLASH("Alolan Sandslash", "028", "src/main/resources/pokemon/10102.png", 75, Type.ICE, Type.STEEL),
    ALOLAN_VULPIX("Alolan Vulpix", "037", "src/main/resources/pokemon/0103.png", 38, Type.ICE, Type.FAIRY),
    ALOLAN_NINETALES("Alolan Ninetales", "038", "src/main/resources/pokemon/10104.png", 73, Type.ICE, Type.FAIRY),
    ALOLAN_DIGLETT("Alolan Diglett", "050", "src/main/resources/pokemon/10105.png", 10, Type.GROUND, Type.STEEL),
    ALOLAN_DUGTRIO("Alolan Dugtrio", "051", "src/main/resources/pokemon/10106.png", 35, Type.GROUND, Type.STEEL),
    ALOLAN_MEOWTH("Alolan Meowth", "052", "src/main/resources/pokemon/10107.png", 40, Type.DARK),
    ALOLAN_PERSIAN("Alolan Persian", "053", "src/main/resources/pokemon/10108.png", 75, Type.DARK),
    ALOLAN_GEODUDE("Alolan Geodude", "074", "src/main/resources/pokemon/10109.png", 40, Type.ROCK, Type.ELECTRIC),
    ALOLAN_GRAVELER("Alolan Graveler", "075", "src/main/resources/pokemon/10110.png", 55, Type.ROCK, Type.ELECTRIC),
    ALOLAN_GOLEM("Alolan Golem", "076", "src/main/resources/pokemon/10111.png", 80, Type.ROCK, Type.ELECTRIC),
    ALOLAN_GRIMER("Alolan Grimer", "088", "src/main/resources/pokemon/10112.png", 80, Type.POISON, Type.DARK),
    ALOLAN_MUK("Alolan Muk", "089", "src/main/resources/pokemon/10103.png", 105, Type.POISON, Type.DARK),
    ALOLAN_EXEGGUTOR("Alolan Exeggutor", "103", "src/main/resources/pokemon/10114.png", 95, Type.GRASS, Type.DRAGON),
    ALOLAN_MAROWAK("Alolan Marowak", "105", "src/main/resources/pokemon/10115.png", 60, Type.FIRE, Type.GHOST),
    ASH_GRENINJA("Ash's Greninja", "658", "src/main/resources/pokemon/10116.png", 72, Type.WATER, Type.DARK),
    ZYGARDE_10("Zygarde (10% Forme)", "718", "src/main/resources/pokemon/10118.png", 54, Type.DRAGON, Type.GROUND),
    ZYGARDE_100("Zygarde (Complete Forme)", "718", "src/main/resources/pokemon/10120.png", 216, Type.DRAGON, Type.GROUND),
    ORICORIO_POMPOM("Oricorio (Pom Pom Style)", "741", "src/main/resources/pokemon/10123.png", 75, Type.ELECTRIC, Type.FLYING),
    ORICORIO_PAU("Oricorio (Pa'u Style)", "741", "src/main/resources/pokemon/10124.png", 75, Type.PSYCHIC, Type.FLYING),
    ORICORIO_SENSU("Oricorio (Sensu Style)", "741", "src/main/resources/pokemon/10125.png", 75, Type.GHOST, Type.FLYING),
    LYCANROC_MIDNIGHT("Lycanroc (Midnight Form)", "745", "src/main/resources/pokemon/10126.png", 85, Type.ROCK),
    WISHIWASHI_SCHOOL("Wishiwashi (School Form)", "746", "src/main/resources/pokemon/10127.png", 45, Type.WATER),
    MINIOR_CORE("Minior (Core form)", "774", "src/main/resources/pokemon/10136.png", 60, Type.ROCK, Type.FLYING),
    LYCANROC_CREPUSCULAR("Lycanroc (Crepuscular Form)", "745", "src/main/resources/pokemon/10152.png", 75, Type.ROCK),
    DUSK_MANE_NECROZMA("Dusk Mane Necrozma", "800", "src/main/resources/pokemon/10155.png", 97, Type.PSYCHIC,Type.STEEL),
    DAWN_WINGS_NECROZMA("Dawn Wings Necrozma", "800", "src/main/resources/pokemon/10156.png", 97, Type.PSYCHIC, Type.GHOST),
    ULTRA_NECROZMA("Ultra Necrozma", "800", "src/main/resources/pokemon/10157.png", 97, Type.PSYCHIC, Type.DRAGON);


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
    Generation7(final String name, final String dexNumber, final String path, final int hp, final Type... type) {
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