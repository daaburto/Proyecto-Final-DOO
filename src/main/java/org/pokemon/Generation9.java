package org.pokemon;

import javax.swing.*;
import java.awt.*;

/**
 * Enumeración que representa a la novena generación de Pokémon.
 * Cada Pokémon tiene nombre, número de Pokédex nacional, dirección de imagen, HP, y tipos.
 */
public enum Generation9 {
    SPRIGATITO("Sprigatito", "906", "src/main/resources/pokemon/906.png", 40, Type.GRASS),
    FLORAGATO("Floragato", "907", "src/main/resources/pokemon/907.png", 61, Type.GRASS),
    MEOWSCARADA("Meowscarada", "908", "src/main/resources/pokemon/908.png", 76, Type.GRASS, Type.DARK),
    FUECOCO("Fuecoco", "909", "src/main/resources/pokemon/909.png", 67, Type.FIRE),
    CROCALOR("Crocalor", "910", "src/main/resources/pokemon/910.png", 81, Type.FIRE),
    SKELEDIRGE("Skeledirge", "911", "src/main/resources/pokemon/911.png", 104, Type.FIRE, Type.GHOST),
    QUAXLY("Quaxly", "912", "src/main/resources/pokemon/912.png", 55, Type.WATER),
    QUAXWELL("Quaxwell", "913", "src/main/resources/pokemon/913.png", 70, Type.WATER),
    QUAQUAVAL("Quaquaval", "914", "src/main/resources/pokemon/914.png", 85, Type.WATER, Type.FIGHTING),
    LECHONK("Lechonk", "915", "src/main/resources/pokemon/915.png", 54, Type.NORMAL),
    OINKOLOGNE_MALE("Oinkologne (Male)", "916", "src/main/resources/pokemon/916.png", 110, Type.NORMAL),
    OINKOLOGNE_FEMALE("Oinkologne (Female)", "916", "src/main/resources/pokemon/10254.png", 115, Type.NORMAL),
    TAROUNTULA("Tarountula", "917", "src/main/resources/pokemon/917.png", 35, Type.BUG),
    SPIDOPS("Spidops", "918", "src/main/resources/pokemon/918.png", 60, Type.BUG),
    NYMBLE("Nymble", "919", "src/main/resources/pokemon/919.png", 33, Type.BUG),
    LOKIX("Lokix", "920", "src/main/resources/pokemon/920.png", 71, Type.BUG, Type.DARK),
    PAWMI("Pawmi", "921", "src/main/resources/pokemon/921.png", 45, Type.ELECTRIC),
    PAWMO("Pawmo", "922", "src/main/resources/pokemon/922.png", 60, Type.ELECTRIC, Type.FIGHTING),
    PAWMOT("Pawmot", "923", "src/main/resources/pokemon/923.png", 70, Type.ELECTRIC, Type.FIGHTING),
    TANDEMAUS("Tandemaus", "924", "src/main/resources/pokemon/924.png", 50, Type.NORMAL),
    MAUSHOLD("Maushold", "925", "src/main/resources/pokemon/925.png", 74, Type.NORMAL),
    FIDOUGH("Fidough", "926", "src/main/resources/pokemon/926.png", 37, Type.FAIRY),
    DACHSBUN("Dachsbun", "927", "src/main/resources/pokemon/927.png", 57, Type.FAIRY),
    SMOLIV("Smoliv", "928", "src/main/resources/pokemon/928.png", 41, Type.GRASS, Type.NORMAL),
    DOLLIV("Dolliv", "929", "src/main/resources/pokemon/929.png", 52, Type.GRASS, Type.NORMAL),
    ARBOLIVA("Arboliva", "930", "src/main/resources/pokemon/930.png", 78, Type.GRASS, Type.NORMAL),
    SQUAWKABILLY("Squawkabilly", "931", "src/main/resources/pokemon/931.png", 82, Type.NORMAL, Type.FLYING),
    NACLI("Nacli", "932", "src/main/resources/pokemon/932.png", 55, Type.ROCK),
    NACLSTACK("Naclstack", "933", "src/main/resources/pokemon/933.png", 60, Type.ROCK),
    GARGANACL("Garganacl", "934", "src/main/resources/pokemon/934.png", 100, Type.ROCK),
    CHARCADET("Charcadet", "935", "src/main/resources/pokemon/935.png", 40, Type.FIRE),
    ARMAROUGE("Armarouge", "936", "src/main/resources/pokemon/936.png", 85, Type.FIRE, Type.PSYCHIC),
    CERULEDGE("Ceruledge", "937", "src/main/resources/pokemon/937.png", 75, Type.FIRE, Type.GHOST),
    TADBULB("Tadbulb", "938", "src/main/resources/pokemon/938.png", 61, Type.ELECTRIC),
    BELLIBOLT("Bellibolt", "939", "src/main/resources/pokemon/939.png", 109, Type.ELECTRIC),
    WATTREL("Wattrel", "940", "src/main/resources/pokemon/940.png", 40, Type.ELECTRIC, Type.FLYING),
    KILOWATTREL("Kilowattrel", "941", "src/main/resources/pokemon/941.png", 70, Type.ELECTRIC, Type.FLYING),
    MASCHIFF("Maschiff", "942", "src/main/resources/pokemon/942.png", 60, Type.DARK),
    MABOSSTIFF("Mabosstiff", "943", "src/main/resources/pokemon/943.png", 80, Type.DARK),
    SHROODLE("Shroodle", "944", "src/main/resources/pokemon/944.png", 40, Type.POISON, Type.NORMAL),
    GRAFAIAI("Grafaiai", "945", "src/main/resources/pokemon/945.png", 63, Type.POISON, Type.NORMAL),
    BRAMBLIN("Bramblin", "946", "src/main/resources/pokemon/946.png", 40, Type.GRASS, Type.GHOST),
    BRAMBLEGHAST("Brambleghast", "947", "src/main/resources/pokemon/947.png", 55, Type.GRASS, Type.GHOST),
    TOEDSCOOL("Toedscool", "948", "src/main/resources/pokemon/948.png", 40, Type.GROUND, Type.GRASS),
    TOEDSCRUEL("Toedscruel", "949", "src/main/resources/pokemon/949.png", 80, Type.GROUND, Type.GRASS),
    KLAWF("Klawf", "950", "src/main/resources/pokemon/950.png", 70, Type.ROCK),
    CAPSAKID("Capsakid", "951", "src/main/resources/pokemon/951.png", 50, Type.GRASS),
    SCOVILLAIN("Scovillain", "952", "src/main/resources/pokemon/952.png", 65, Type.GRASS, Type.FIRE),
    RELLOR("Rellor", "953", "src/main/resources/pokemon/953.png", 41, Type.BUG),
    RABSCA("Rabsca", "954", "src/main/resources/pokemon/954.png", 75, Type.BUG, Type.PSYCHIC),
    FLITTLE("Flittle", "955", "src/main/resources/pokemon/955.png", 30, Type.PSYCHIC),
    ESPATHRA("Espathra", "956", "src/main/resources/pokemon/956.png", 95, Type.PSYCHIC),
    TINKATINK("Tinkatink", "957", "src/main/resources/pokemon/957.png", 50, Type.FAIRY, Type.STEEL),
    TINKATUFF("Tinkatuff", "958", "src/main/resources/pokemon/958.png", 65, Type.FAIRY, Type.STEEL),
    TINKATON("Tinkaton", "959", "src/main/resources/pokemon/959.png", 85, Type.FAIRY, Type.STEEL),
    WIGLETT("Wiglett", "960", "src/main/resources/pokemon/960.png", 10, Type.WATER),
    WUGTRIO("Wugtrio", "961", "src/main/resources/pokemon/961.png", 35, Type.WATER),
    BOMBIRDIER("Bombirdier", "962", "src/main/resources/pokemon/962.png", 70, Type.FLYING, Type.DARK),
    FINIZEN("Finizen", "963", "src/main/resources/pokemon/963.png", 70, Type.WATER),
    PALAFIN("Palafin", "964", "src/main/resources/pokemon/964.png", 100, Type.WATER),
    PALAFIN_HERO("Palafin-Hero", "964", "src/main/resources/pokemon/10256.png", 100, Type.WATER),
    VAROOM("Varoom", "965", "src/main/resources/pokemon/965.png", 45, Type.STEEL, Type.POISON),
    REVAVROOM("Revavroom", "966", "src/main/resources/pokemon/966.png", 80, Type.STEEL, Type.POISON),
    CYCLIZAR("Cyclizar", "967", "src/main/resources/pokemon/967.png", 70, Type.DRAGON, Type.NORMAL),
    ORTHWORM("Orthworm", "968", "src/main/resources/pokemon/968.png", 70, Type.STEEL),
    GLIMMET("Glimmet", "969", "src/main/resources/pokemon/969.png", 48, Type.ROCK, Type.POISON),
    GLIMMORA("Glimmora", "970", "src/main/resources/pokemon/970.png", 83, Type.ROCK, Type.POISON),
    GREAVARD("Greavard", "971", "src/main/resources/pokemon/971.png", 50, Type.GHOST),
    HOUNDSTONE("Houndstone", "972", "src/main/resources/pokemon/972.png", 72, Type.GHOST),
    FLAMIGO("Flamigo", "973", "src/main/resources/pokemon/973.png", 82, Type.FLYING, Type.FIGHTING),
    CETODDLE("Cetoddle", "974", "src/main/resources/pokemon/974.png", 108, Type.ICE),
    CETITAN("Cetitan", "975", "src/main/resources/pokemon/975.png", 170, Type.ICE),
    VELUZA("Veluza", "976", "src/main/resources/pokemon/976.png", 90, Type.WATER, Type.PSYCHIC),
    DONDOZO("Dondozo", "977", "src/main/resources/pokemon/977.png", 150, Type.WATER),
    TATSUGIRI("Tatsugiri", "978", "src/main/resources/pokemon/978.png", 68, Type.DRAGON, Type.WATER),
    ANNIHILAPE("Annihilape", "979", "src/main/resources/pokemon/979.png", 110, Type.FIGHTING, Type.GHOST),
    CLODSIRE("Clodsire", "980", "src/main/resources/pokemon/980.png", 130, Type.POISON, Type.GROUND),
    FARIGIRAF("Farigiraf", "981", "src/main/resources/pokemon/981.png", 120, Type.NORMAL, Type.PSYCHIC),
    DUDUNSPARCE("Dudunsparce", "982", "src/main/resources/pokemon/982.png", 125, Type.NORMAL),
    DUDUNSPARCE_THREE_SEGMENT("Dudunsparce (Three Segment)", "982", "src/main/resources/pokemon/10255.png", 125, Type.NORMAL),
    KINGAMBIT("Kingambit", "983", "src/main/resources/pokemon/983.png", 100, Type.DARK, Type.STEEL),
    GREATTUSK("Great Tusk", "984", "src/main/resources/pokemon/984.png", 115, Type.GROUND, Type.FIGHTING),
    SCREAMTAIL("Scream Tail", "985", "src/main/resources/pokemon/985.png", 115, Type.FAIRY, Type.PSYCHIC),
    BRUTEBONNET("Brute Bonnet", "986", "src/main/resources/pokemon/986.png", 111, Type.GRASS, Type.DARK),
    FLUTTERMANE("Flutter Mane", "987", "src/main/resources/pokemon/987.png", 55, Type.GHOST, Type.FAIRY),
    SLITHERWING("Slither Wing", "988", "src/main/resources/pokemon/988.png", 85, Type.BUG, Type.FIGHTING),
    SANDYSHOCKS("Sandy Shocks", "989", "src/main/resources/pokemon/989.png", 85, Type.ELECTRIC, Type.GROUND),
    IRONTREADS("Iron Treads", "990", "src/main/resources/pokemon/990.png", 90, Type.GROUND, Type.STEEL),
    IRONBUNDLE("Iron Bundle", "991", "src/main/resources/pokemon/991.png", 56, Type.ICE, Type.WATER),
    IRONHANDS("Iron Hands", "992", "src/main/resources/pokemon/992.png", 154, Type.FIGHTING, Type.ELECTRIC),
    IRONJUGULIS("Iron Jugulis", "993", "src/main/resources/pokemon/993.png", 94, Type.DARK, Type.FLYING),
    IRONMOTH("Iron Moth", "994", "src/main/resources/pokemon/994.png", 80, Type.FIRE, Type.POISON),
    IRONTHORNS("Iron Thorns", "995", "src/main/resources/pokemon/995.png", 100, Type.ROCK, Type.ELECTRIC),
    FRIGIBAX("Frigibax", "996", "src/main/resources/pokemon/996.png", 65, Type.DRAGON, Type.ICE),
    ARCTIBAX("Arctibax", "997", "src/main/resources/pokemon/997.png", 90, Type.DRAGON, Type.ICE),
    BAXCALIBUR("Baxcalibur", "998", "src/main/resources/pokemon/998.png", 115, Type.DRAGON, Type.ICE),
    GIMMIGHOUL("Gimmighoul", "999", "src/main/resources/pokemon/999.png", 45, Type.GHOST),
    GIMMIGHOUL_ROAMING("Gimmighoul (Roaming)", "999", "src/main/resources/pokemon/10263.png", 45, Type.GHOST),
    GHOLDENGO("Gholdengo", "1000", "src/main/resources/pokemon/1000.png", 87, Type.STEEL, Type.GHOST),
    WOCHIEN("Wo-Chien", "1001", "src/main/resources/pokemon/1001.png", 85, Type.DARK, Type.GRASS),
    CHIENPAO("Chien-Pao", "1002", "src/main/resources/pokemon/1002.png", 80, Type.DARK, Type.ICE),
    TINGLU("Ting-Lu", "1003", "src/main/resources/pokemon/1003.png", 155, Type.DARK, Type.GROUND),
    CHIYU("Chi-Yu", "1004", "src/main/resources/pokemon/1004.png", 55, Type.DARK, Type.FIRE),
    ROARINGMOON("Roaring Moon", "1005", "src/main/resources/pokemon/1005.png", 105, Type.DRAGON, Type.DARK),
    IRONVALIANT("Iron Valiant", "1006", "src/main/resources/pokemon/1006.png", 74, Type.FAIRY, Type.FIGHTING),
    KORAIDON("Koraidon", "1007", "src/main/resources/pokemon/1007.png", 100, Type.FIGHTING, Type.DRAGON),
    MIRAIDON("Miraidon", "1008", "src/main/resources/pokemon/1008.png", 100, Type.ELECTRIC, Type.DRAGON),
    WALKINGWAKE("Walking Wake", "1009", "src/main/resources/pokemon/1009.png", 99, Type.WATER, Type.DRAGON),
    IRONLEAVES("Iron Leaves", "1010", "src/main/resources/pokemon/1010.png", 90, Type.GRASS, Type.PSYCHIC),
    DIPPLIN("Dipplin", "1011", "src/main/resources/pokemon/1011.png", 80, Type.GRASS, Type.DRAGON),
    POLTCHAGEIST("Poltchageist", "1012", "src/main/resources/pokemon/1012.png", 40, Type.GRASS, Type.GHOST),
    SINISTCHA("Sinistcha", "1013", "src/main/resources/pokemon/1013.png", 71, Type.GRASS, Type.GHOST),
    OKIDOGI("Okidogi", "1014", "src/main/resources/pokemon/1014.png", 88, Type.POISON, Type.FIGHTING),
    MUNKIDORI("Munkidori", "1015", "src/main/resources/pokemon/1015.png", 88, Type.POISON, Type.PSYCHIC),
    FEZANDIPITI("Fezandipiti", "1016", "src/main/resources/pokemon/1016.png", 88, Type.POISON, Type.FAIRY),
    OGERPON("Ogerpon", "1017", "src/main/resources/pokemon/1017.png", 80, Type.GRASS),
    OGERPON_WELLSPRING("Ogerpon (Wellspring)", "1017", "src/main/resources/pokemon/10273.png", 80, Type.GRASS, Type.WATER),
    OGERPON_HEARTHFLAME("Ogerpon (Hearthflame)", "1017", "src/main/resources/pokemon/10274.png", 80, Type.GRASS, Type.FIRE),
    OGERPON_CORNERSTONE("Ogerpon (Cornerstone)", "1017", "src/main/resources/pokemon/10275.png", 80, Type.GRASS, Type.ROCK),
    ARCHALUDON("Archaludon", "1018", "src/main/resources/pokemon/1018.png", 90, Type.STEEL, Type.DRAGON),
    HYDRAPPLE("Hydrapple", "1019", "src/main/resources/pokemon/1019.png", 106, Type.GRASS, Type.DRAGON),
    GOUGINGFIRE("Gouging Fire", "1020", "src/main/resources/pokemon/1020.png", 105, Type.FIRE, Type.DRAGON),
    RAGINGBOLT("Raging Bolt", "1021", "src/main/resources/pokemon/1021.png", 125, Type.ELECTRIC, Type.DRAGON),
    IRONBOULDER("Iron Boulder", "1022", "src/main/resources/pokemon/1022.png", 90, Type.ROCK, Type.PSYCHIC),
    IRONCROWN("Iron Crown", "1023", "src/main/resources/pokemon/1023.png", 90, Type.STEEL, Type.PSYCHIC),
    TERAPAGOS("Terapagos", "1024", "src/main/resources/pokemon/1024.png", 90, Type.NORMAL),
    TERAPAGOS_TERASTAL("Terapagos (Terastal)", "1024", "src/main/resources/pokemon/10276.png", 95, Type.NORMAL),
    TERAPAGOS_STELLAR("Terapagos (Stellar)", "1024", "src/main/resources/pokemon/10277.png", 160, Type.NORMAL),
    PECHARUNT("Pecharunt", "1025", "src/main/resources/pokemon/1025.png", 88, Type.POISON, Type.GHOST),
    BLOODMOON_URSALUNA("Ursaluna (Bloodmoon)", "901", "src/main/resources/pokemon/10272.png", 113, Type.GROUND, Type.NORMAL),
    PALDEAN_TAUROS("Tauros", "128", "src/main/resources/pokemon/10250.png", 75, Type.FIGHTING),
    PALDEAN_TAUROS_BLAZE("Paldean Tauros (Blaze Breed)", "128", "src/main/resources/pokemon/10251.png", 75, Type.FIGHTING, Type.FIRE),
    PALDEAN_TAUROS_AQUA("Paldean Tauros (Aqua Breed)", "128", "src/main/resources/pokemon/10252.png", 75, Type.FIGHTING, Type.WATER),
    PALDEAN_WOOPER("Paldean Wooper", "194", "src/main/resources/pokemon/10253.png", 55, Type.GROUND, Type.POISON);


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
    Generation9(final String name, final String dexNumber, final String path, final int hp, final Type... type) {
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