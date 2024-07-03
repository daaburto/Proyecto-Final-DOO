package org.pokemon;

import javax.swing.*;
import java.awt.*;

public enum Generation5 {
    VICTINI("Victini", "494", "src/main/resources/pokemon/494.png", 100, Type.PSYCHIC, Type.FIRE),
    SNIVY("Snivy", "495", "src/main/resources/pokemon/495.png", 45, Type.GRASS),
    SERVINE("Servine", "496", "src/main/resources/pokemon/496.png", 60, Type.GRASS),
    SERPERIOR("Serperior", "497", "src/main/resources/pokemon/497.png", 75, Type.GRASS),
    TEPIG("Tepig", "498", "src/main/resources/pokemon/498.png", 65, Type.FIRE),
    PIGNITE("Pignite", "499", "src/main/resources/pokemon/499.png", 90, Type.FIRE, Type.FIGHTING),
    EMBOAR("Emboar", "500", "src/main/resources/pokemon/500.png", 110, Type.FIRE, Type.FIGHTING),
    OSHAWOTT("Oshawott", "501", "src/main/resources/pokemon/501.png", 55, Type.WATER),
    DEWOTT("Dewott", "502", "src/main/resources/pokemon/502.png", 75, Type.WATER),
    SAMUROTT("Samurott", "503", "src/main/resources/pokemon/503.png", 95, Type.WATER),
    PATRAT("Patrat", "504", "src/main/resources/pokemon/504.png", 45, Type.NORMAL),
    WATCHOG("Watchog", "505", "src/main/resources/pokemon/505.png", 60, Type.NORMAL),
    LILLIPUP("Lillipup", "506", "src/main/resources/pokemon/506.png", 45, Type.NORMAL),
    HERDIER("Herdier", "507", "src/main/resources/pokemon/507.png", 65, Type.NORMAL),
    STOUTLAND("Stoutland", "508", "src/main/resources/pokemon/508.png", 85, Type.NORMAL),
    PURRLOIN("Purrloin", "509", "src/main/resources/pokemon/509.png", 41, Type.DARK),
    LIEPARD("Liepard", "510", "src/main/resources/pokemon/510.png", 64, Type.DARK),
    PANSAGE("Pansage", "511", "src/main/resources/pokemon/511.png", 50, Type.GRASS),
    SIMISAGE("Simisage", "512", "src/main/resources/pokemon/512.png", 75, Type.GRASS),
    PANSEAR("Pansear", "513", "src/main/resources/pokemon/513.png", 50, Type.FIRE),
    SIMISEAR("Simisear", "514", "src/main/resources/pokemon/514.png", 75, Type.FIRE),
    PANPOUR("Panpour", "515", "src/main/resources/pokemon/515.png", 50, Type.WATER),
    SIMIPOUR("Simipour", "516", "src/main/resources/pokemon/516.png", 75, Type.WATER),
    MUNNA("Munna", "517", "src/main/resources/pokemon/517.png", 76, Type.PSYCHIC),
    MUSHARNA("Musharna", "518", "src/main/resources/pokemon/518.png", 116, Type.PSYCHIC),
    PIDOVE("Pidove", "519", "src/main/resources/pokemon/519.png", 50, Type.NORMAL, Type.FLYING),
    TRANQUILL("Tranquill", "520", "src/main/resources/pokemon/520.png", 62, Type.NORMAL, Type.FLYING),
    UNFEZANT("Unfezant", "521", "src/main/resources/pokemon/521.png", 80, Type.NORMAL, Type.FLYING),
    BLITZLE("Blitzle", "522", "src/main/resources/pokemon/522.png", 45, Type.ELECTRIC),
    ZEBSTRIKA("Zebstrika", "523", "src/main/resources/pokemon/523.png", 75, Type.ELECTRIC),
    ROGGENROLA("Roggenrola", "524", "src/main/resources/pokemon/524.png", 55, Type.ROCK),
    BOLDORE("Boldore", "525", "src/main/resources/pokemon/525.png", 70, Type.ROCK),
    GIGALITH("Gigalith", "526", "src/main/resources/pokemon/526.png", 85, Type.ROCK),
    WOOBAT("Woobat", "527", "src/main/resources/pokemon/527.png", 55, Type.PSYCHIC, Type.FLYING),
    SWOOBAT("Swoobat", "528", "src/main/resources/pokemon/528.png", 67, Type.PSYCHIC, Type.FLYING),
    DRILBUR("Drilbur", "529", "src/main/resources/pokemon/529.png", 60, Type.GROUND),
    EXCADRILL("Excadrill", "530", "src/main/resources/pokemon/530.png", 110, Type.GROUND, Type.STEEL),
    AUDINO("Audino", "531", "src/main/resources/pokemon/531.png", 103, Type.NORMAL),
    TIMBURR("Timburr", "532", "src/main/resources/pokemon/532.png", 75, Type.FIGHTING),
    GURDURR("Gurdurr", "533", "src/main/resources/pokemon/533.png", 85, Type.FIGHTING),
    CONKELDURR("Conkeldurr", "534", "src/main/resources/pokemon/534.png", 105, Type.FIGHTING),
    TYMPOLE("Tympole", "535", "src/main/resources/pokemon/535.png", 50, Type.WATER),
    PALPITOAD("Palpitoad", "536", "src/main/resources/pokemon/536.png", 75, Type.WATER, Type.GROUND),
    SEISMITOAD("Seismitoad", "537", "src/main/resources/pokemon/537.png", 105, Type.WATER, Type.GROUND),
    THROH("Throh", "538", "src/main/resources/pokemon/538.png", 120, Type.FIGHTING),
    SAWK("Sawk", "539", "src/main/resources/pokemon/539.png", 75, Type.FIGHTING),
    SEWADDLE("Sewaddle", "540", "src/main/resources/pokemon/540.png", 45, Type.BUG, Type.GRASS),
    SWADLOON("Swadloon", "541", "src/main/resources/pokemon/541.png", 55, Type.BUG, Type.GRASS),
    LEAVANNY("Leavanny", "542", "src/main/resources/pokemon/542.png", 75, Type.BUG, Type.GRASS),
    VENIPEDE("Venipede", "543", "src/main/resources/pokemon/543.png", 30, Type.BUG, Type.POISON),
    WHIRLIPEDE("Whirlipede", "544", "src/main/resources/pokemon/544.png", 40, Type.BUG, Type.POISON),
    SCOLIPEDE("Scolipede", "545", "src/main/resources/pokemon/545.png", 60, Type.BUG, Type.POISON),
    COTTONEE("Cottonee", "546", "src/main/resources/pokemon/546.png", 40, Type.GRASS, Type.FAIRY),
    WHIMSICOTT("Whimsicott", "547", "src/main/resources/pokemon/547.png", 60, Type.GRASS, Type.FAIRY),
    PETILIL("Petilil", "548", "src/main/resources/pokemon/548.png", 45, Type.GRASS),
    LILLIGANT("Lilligant", "549", "src/main/resources/pokemon/549.png", 70, Type.GRASS),
    BASCULIN("Basculin", "550", "src/main/resources/pokemon/550.png", 70, Type.WATER),
    SANDILE("Sandile", "551", "src/main/resources/pokemon/551.png", 50, Type.GROUND, Type.DARK),
    KROKOROK("Krokorok", "552", "src/main/resources/pokemon/552.png", 60, Type.GROUND, Type.DARK),
    KROOKODILE("Krookodile", "553", "src/main/resources/pokemon/553.png", 95, Type.GROUND, Type.DARK),
    DARUMAKA("Darumaka", "554", "src/main/resources/pokemon/554.png", 70, Type.FIRE),
    DARMANITAN_STANDARD("Darmanitan", "555", "src/main/resources/pokemon/555.png", 105, Type.FIRE),
    DARMANITAN_ZEN("Darmanitan", "555", "src/main/resources/pokemon/555-zen.png", 105, Type.FIRE, Type.PSYCHIC),
    MARACTUS("Maractus", "556", "src/main/resources/pokemon/556.png", 75, Type.GRASS),
    DWEBBLE("Dwebble", "557", "src/main/resources/pokemon/557.png", 50, Type.BUG, Type.ROCK),
    CRUSTLE("Crustle", "558", "src/main/resources/pokemon/558.png", 70, Type.BUG, Type.ROCK),
    SCRAGGY("Scraggy", "559", "src/main/resources/pokemon/559.png", 50, Type.DARK, Type.FIGHTING),
    SCRAFTY("Scrafty", "560", "src/main/resources/pokemon/560.png", 65, Type.DARK, Type.FIGHTING),
    SIGILYPH("Sigilyph", "561", "src/main/resources/pokemon/561.png", 72, Type.PSYCHIC, Type.FLYING),
    YAMASK("Yamask", "562", "src/main/resources/pokemon/562.png", 38, Type.GHOST),
    COFAGRIGUS("Cofagrigus", "563", "src/main/resources/pokemon/563.png", 58, Type.GHOST),
    TIRTOUGA("Tirtouga", "564", "src/main/resources/pokemon/564.png", 54, Type.WATER, Type.ROCK),
    CARRACOSTA("Carracosta", "565", "src/main/resources/pokemon/565.png", 74, Type.WATER, Type.ROCK),
    ARCHEN("Archen", "566", "src/main/resources/pokemon/566.png", 55, Type.ROCK, Type.FLYING),
    ARCHEOPS("Archeops", "567", "src/main/resources/pokemon/567.png", 75, Type.ROCK, Type.FLYING),
    TRUBBISH("Trubbish", "568", "src/main/resources/pokemon/568.png", 50, Type.POISON),
    GARBODOR("Garbodor", "569", "src/main/resources/pokemon/569.png", 80, Type.POISON),
    ZORUA("Zorua", "570", "src/main/resources/pokemon/570.png", 40, Type.DARK),
    ZOROARK("Zoroark", "571", "src/main/resources/pokemon/571.png", 60, Type.DARK),
    MINCCINO("Minccino", "572", "src/main/resources/pokemon/572.png", 55, Type.NORMAL),
    CINCCINO("Cinccino", "573", "src/main/resources/pokemon/573.png", 75, Type.NORMAL),
    GOTHITA("Gothita", "574", "src/main/resources/pokemon/574.png", 45, Type.PSYCHIC),
    GOTHORITA("Gothorita", "575", "src/main/resources/pokemon/575.png", 60, Type.PSYCHIC),
    GOTHITELLE("Gothitelle", "576", "src/main/resources/pokemon/576.png", 70, Type.PSYCHIC),
    SOLOSIS("Solosis", "577", "src/main/resources/pokemon/577.png", 45, Type.PSYCHIC),
    DUOSION("Duosion", "578", "src/main/resources/pokemon/578.png", 65, Type.PSYCHIC),
    REUNICLUS("Reuniclus", "579", "src/main/resources/pokemon/579.png", 110, Type.PSYCHIC),
    DUCKLETT("Ducklett", "580", "src/main/resources/pokemon/580.png", 62, Type.WATER, Type.FLYING),
    SWANNA("Swanna", "581", "src/main/resources/pokemon/581.png", 75, Type.WATER, Type.FLYING),
    VANILLITE("Vanillite", "582", "src/main/resources/pokemon/582.png", 36, Type.ICE),
    VANILLISH("Vanillish", "583", "src/main/resources/pokemon/583.png", 51, Type.ICE),
    VANILLUXE("Vanilluxe", "584", "src/main/resources/pokemon/584.png", 71, Type.ICE),
    DEERLING("Deerling", "585", "src/main/resources/pokemon/585.png", 60, Type.NORMAL, Type.GRASS),
    SAWSBUCK("Sawsbuck", "586", "src/main/resources/pokemon/586.png", 80, Type.NORMAL, Type.GRASS),
    EMOLGA("Emolga", "587", "src/main/resources/pokemon/587.png", 55, Type.ELECTRIC, Type.FLYING),
    KARRABLAST("Karrablast", "588", "src/main/resources/pokemon/588.png", 50, Type.BUG),
    ESCAVALIER("Escavalier", "589", "src/main/resources/pokemon/589.png", 70, Type.BUG, Type.STEEL),
    FOONGUS("Foongus", "590", "src/main/resources/pokemon/590.png", 69, Type.GRASS, Type.POISON),
    AMOONGUSS("Amoonguss", "591", "src/main/resources/pokemon/591.png", 114, Type.GRASS, Type.POISON),
    FRILLISH("Frillish", "592", "src/main/resources/pokemon/592.png", 55, Type.WATER, Type.GHOST),
    JELLICENT("Jellicent", "593", "src/main/resources/pokemon/593.png", 100, Type.WATER, Type.GHOST),
    ALOMOMOLA("Alomomola", "594", "src/main/resources/pokemon/594.png", 165, Type.WATER),
    JOLTIK("Joltik", "595", "src/main/resources/pokemon/595.png", 50, Type.BUG, Type.ELECTRIC),
    GALVANTULA("Galvantula", "596", "src/main/resources/pokemon/596.png", 70, Type.BUG, Type.ELECTRIC),
    FERROSEED("Ferroseed", "597", "src/main/resources/pokemon/597.png", 44, Type.GRASS, Type.STEEL),
    FERROTHORN("Ferrothorn", "598", "src/main/resources/pokemon/598.png", 74, Type.GRASS, Type.STEEL),
    KLINK("Klink", "599", "src/main/resources/pokemon/599.png", 40, Type.STEEL),
    KLANG("Klang", "600", "src/main/resources/pokemon/600.png", 60, Type.STEEL),
    KLINKLANG("Klinklang", "601", "src/main/resources/pokemon/601.png", 60, Type.STEEL),
    TYNAMO("Tynamo", "602", "src/main/resources/pokemon/602.png", 35, Type.ELECTRIC),
    EELEKTRIK("Eelektrik", "603", "src/main/resources/pokemon/603.png", 65, Type.ELECTRIC),
    EELEKTROSS("Eelektross", "604", "src/main/resources/pokemon/604.png", 85, Type.ELECTRIC),
    ELGYEM("Elgyem", "605", "src/main/resources/pokemon/605.png", 55, Type.PSYCHIC),
    BEHEEYEM("Beheeyem", "606", "src/main/resources/pokemon/606.png", 75, Type.PSYCHIC),
    LITWICK("Litwick", "607", "src/main/resources/pokemon/607.png", 50, Type.GHOST, Type.FIRE),
    LAMPENT("Lampent", "608", "src/main/resources/pokemon/608.png", 60, Type.GHOST, Type.FIRE),
    CHANDELURE("Chandelure", "609", "src/main/resources/pokemon/609.png", 60, Type.GHOST, Type.FIRE),
    AXEW("Axew", "610", "src/main/resources/pokemon/610.png", 46, Type.DRAGON),
    FRAXURE("Fraxure", "611", "src/main/resources/pokemon/611.png", 66, Type.DRAGON),
    HAXORUS("Haxorus", "612", "src/main/resources/pokemon/612.png", 76, Type.DRAGON),
    CUBCHOO("Cubchoo", "613", "src/main/resources/pokemon/613.png", 55, Type.ICE),
    BEARTIC("Beartic", "614", "src/main/resources/pokemon/614.png", 95, Type.ICE),
    CRYOGONAL("Cryogonal", "615", "src/main/resources/pokemon/615.png", 70, Type.ICE),
    SHELMET("Shelmet", "616", "src/main/resources/pokemon/616.png", 50, Type.BUG),
    ACCELGOR("Accelgor", "617", "src/main/resources/pokemon/617.png", 80, Type.BUG),
    STUNFISK("Stunfisk", "618", "src/main/resources/pokemon/618.png", 109, Type.GROUND, Type.ELECTRIC),
    MIENFOO("Mienfoo", "619", "src/main/resources/pokemon/619.png", 45, Type.FIGHTING),
    MIENSHAO("Mienshao", "620", "src/main/resources/pokemon/620.png", 65, Type.FIGHTING),
    DRUDDIGON("Druddigon", "621", "src/main/resources/pokemon/621.png", 77, Type.DRAGON),
    GOLETT("Golett", "622", "src/main/resources/pokemon/622.png", 59, Type.GROUND, Type.GHOST),
    GOLURK("Golurk", "623", "src/main/resources/pokemon/623.png", 89, Type.GROUND, Type.GHOST),
    PAWNIARD("Pawniard", "624", "src/main/resources/pokemon/624.png", 45, Type.DARK, Type.STEEL),
    BISHARP("Bisharp", "625", "src/main/resources/pokemon/625.png", 65, Type.DARK, Type.STEEL),
    BOUFFALANT("Bouffalant", "626", "src/main/resources/pokemon/626.png", 95, Type.NORMAL),
    RUFFLET("Rufflet", "627", "src/main/resources/pokemon/627.png", 70, Type.NORMAL, Type.FLYING),
    BRAVIARY("Braviary", "628", "src/main/resources/pokemon/628.png", 100, Type.NORMAL, Type.FLYING),
    VULLABY("Vullaby", "629", "src/main/resources/pokemon/629.png", 70, Type.DARK, Type.FLYING),
    MANDIBUZZ("Mandibuzz", "630", "src/main/resources/pokemon/630.png", 110, Type.DARK, Type.FLYING),
    HEATMOR("Heatmor", "631", "src/main/resources/pokemon/631.png", 85, Type.FIRE),
    DURANT("Durant", "632", "src/main/resources/pokemon/632.png", 58, Type.BUG, Type.STEEL),
    DEINO("Deino", "633", "src/main/resources/pokemon/633.png", 52, Type.DARK, Type.DRAGON),
    ZWEILOUS("Zweilous", "634", "src/main/resources/pokemon/634.png", 72, Type.DARK, Type.DRAGON),
    HYDREIGON("Hydreigon", "635", "src/main/resources/pokemon/635.png", 92, Type.DARK, Type.DRAGON),
    LARVESTA("Larvesta", "636", "src/main/resources/pokemon/636.png", 55, Type.BUG, Type.FIRE),
    VOLCARONA("Volcarona", "637", "src/main/resources/pokemon/637.png", 85, Type.BUG, Type.FIRE),
    COBALION("Cobalion", "638", "src/main/resources/pokemon/638.png", 91, Type.STEEL, Type.FIGHTING),
    TERRAKION("Terrakion", "639", "src/main/resources/pokemon/639.png", 91, Type.ROCK, Type.FIGHTING),
    VIRIZION("Virizion", "640", "src/main/resources/pokemon/640.png", 91, Type.GRASS, Type.FIGHTING),
    TORNADUS_INCARNATE("Tornadus", "641", "src/main/resources/pokemon/641.png", 79, Type.FLYING),
    TORNADUS_THERIAN("Therian Tornadus", "641", "src/main/resources/pokemon/641-therian.png", 79, Type.FLYING),
    THUNDURUS_INCARNATE("Thundurus", "642", "src/main/resources/pokemon/642.png", 79, Type.ELECTRIC, Type.FLYING),
    THUNDURUS_THERIAN("Therian Thundurus", "642", "src/main/resources/pokemon/642-therian.png", 79, Type.ELECTRIC, Type.FLYING),
    RESHIRAM("Reshiram", "643", "src/main/resources/pokemon/643.png", 100, Type.DRAGON, Type.FIRE),
    ZEKROM("Zekrom", "644", "src/main/resources/pokemon/644.png", 100, Type.DRAGON, Type.ELECTRIC),
    LANDORUS_INCARNATE("Landorus", "645", "src/main/resources/pokemon/645.png", 89, Type.GROUND, Type.FLYING),
    LANDORUS_THERIAN("Therian Landorus", "645", "src/main/resources/pokemon/645-therian.png", 89, Type.GROUND, Type.FLYING),
    KYUREM("Kyurem", "646", "src/main/resources/pokemon/646.png", 125, Type.DRAGON, Type.ICE),
    KYUREM_BLACK("Kyurem", "646", "src/main/resources/pokemon/646-black.png", 125, Type.DRAGON, Type.ICE),
    KYUREM_WHITE("Kyurem", "646", "src/main/resources/pokemon/646-white.png", 125, Type.DRAGON, Type.ICE),
    KELDEO("Keldeo", "647", "src/main/resources/pokemon/647.png", 91, Type.WATER, Type.FIGHTING),
    KELDEO_RESOLUTE("Keldeo", "647", "src/main/resources/pokemon/647-resolute.png", 91, Type.WATER, Type.FIGHTING),
    MELOETTA_ARIA("Meloetta", "648", "src/main/resources/pokemon/648.png", 100, Type.NORMAL, Type.PSYCHIC),
    MELOETTA_PIROUETTE("Meloetta", "648", "src/main/resources/pokemon/648-pirouette.png", 100, Type.NORMAL, Type.FIGHTING),
    GENESECT("Genesect", "649", "src/main/resources/pokemon/649.png", 71, Type.BUG, Type.STEEL);



    private final int HP;
    private final Type[] TYPE;
    private final String NAME, NAT_DEX_NUMBER;
    private ImageIcon IMG;

    Generation5(final String name, final String dexNumber, final String path, final int hp, final Type... type) {
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

