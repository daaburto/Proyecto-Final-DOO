package org.pokemon;

import javax.swing.*;
import java.awt.*;

public enum Generation5 {
    VICTINI("Victini", "494", "src/main/resources/494.png", 100, Type.PSYCHIC, Type.FIRE),
    SNIVY("Snivy", "495", "src/main/resources/495.png", 45, Type.GRASS),
    SERVINE("Servine", "496", "src/main/resources/496.png", 60, Type.GRASS),
    SERPERIOR("Serperior", "497", "src/main/resources/497.png", 75, Type.GRASS),
    TEPIG("Tepig", "498", "src/main/resources/498.png", 65, Type.FIRE),
    PIGNITE("Pignite", "499", "src/main/resources/499.png", 90, Type.FIRE, Type.FIGHTING),
    EMBOAR("Emboar", "500", "src/main/resources/500.png", 110, Type.FIRE, Type.FIGHTING),
    OSHAWOTT("Oshawott", "501", "src/main/resources/501.png", 55, Type.WATER),
    DEWOTT("Dewott", "502", "src/main/resources/502.png", 75, Type.WATER),
    SAMUROTT("Samurott", "503", "src/main/resources/503.png", 95, Type.WATER),
    PATRAT("Patrat", "504", "src/main/resources/504.png", 45, Type.NORMAL),
    WATCHOG("Watchog", "505", "src/main/resources/505.png", 60, Type.NORMAL),
    LILLIPUP("Lillipup", "506", "src/main/resources/506.png", 45, Type.NORMAL),
    HERDIER("Herdier", "507", "src/main/resources/507.png", 65, Type.NORMAL),
    STOUTLAND("Stoutland", "508", "src/main/resources/508.png", 85, Type.NORMAL),
    PURRLOIN("Purrloin", "509", "src/main/resources/509.png", 41, Type.DARK),
    LIEPARD("Liepard", "510", "src/main/resources/510.png", 64, Type.DARK),
    PANSAGE("Pansage", "511", "src/main/resources/511.png", 50, Type.GRASS),
    SIMISAGE("Simisage", "512", "src/main/resources/512.png", 75, Type.GRASS),
    PANSEAR("Pansear", "513", "src/main/resources/513.png", 50, Type.FIRE),
    SIMISEAR("Simisear", "514", "src/main/resources/514.png", 75, Type.FIRE),
    PANPOUR("Panpour", "515", "src/main/resources/515.png", 50, Type.WATER),
    SIMIPOUR("Simipour", "516", "src/main/resources/516.png", 75, Type.WATER),
    MUNNA("Munna", "517", "src/main/resources/517.png", 76, Type.PSYCHIC),
    MUSHARNA("Musharna", "518", "src/main/resources/518.png", 116, Type.PSYCHIC),
    PIDOVE("Pidove", "519", "src/main/resources/519.png", 50, Type.NORMAL, Type.FLYING),
    TRANQUILL("Tranquill", "520", "src/main/resources/520.png", 62, Type.NORMAL, Type.FLYING),
    UNFEZANT("Unfezant", "521", "src/main/resources/521.png", 80, Type.NORMAL, Type.FLYING),
    BLITZLE("Blitzle", "522", "src/main/resources/522.png", 45, Type.ELECTRIC),
    ZEBSTRIKA("Zebstrika", "523", "src/main/resources/523.png", 75, Type.ELECTRIC),
    ROGGENROLA("Roggenrola", "524", "src/main/resources/524.png", 55, Type.ROCK),
    BOLDORE("Boldore", "525", "src/main/resources/525.png", 70, Type.ROCK),
    GIGALITH("Gigalith", "526", "src/main/resources/526.png", 85, Type.ROCK),
    WOOBAT("Woobat", "527", "src/main/resources/527.png", 55, Type.PSYCHIC, Type.FLYING),
    SWOOBAT("Swoobat", "528", "src/main/resources/528.png", 67, Type.PSYCHIC, Type.FLYING),
    DRILBUR("Drilbur", "529", "src/main/resources/529.png", 60, Type.GROUND),
    EXCADRILL("Excadrill", "530", "src/main/resources/530.png", 110, Type.GROUND, Type.STEEL),
    AUDINO("Audino", "531", "src/main/resources/531.png", 103, Type.NORMAL),
    TIMBURR("Timburr", "532", "src/main/resources/532.png", 75, Type.FIGHTING),
    GURDURR("Gurdurr", "533", "src/main/resources/533.png", 85, Type.FIGHTING),
    CONKELDURR("Conkeldurr", "534", "src/main/resources/534.png", 105, Type.FIGHTING),
    TYMPOLE("Tympole", "535", "src/main/resources/535.png", 50, Type.WATER),
    PALPITOAD("Palpitoad", "536", "src/main/resources/536.png", 75, Type.WATER, Type.GROUND),
    SEISMITOAD("Seismitoad", "537", "src/main/resources/537.png", 105, Type.WATER, Type.GROUND),
    THROH("Throh", "538", "src/main/resources/538.png", 120, Type.FIGHTING),
    SAWK("Sawk", "539", "src/main/resources/539.png", 75, Type.FIGHTING),
    SEWADDLE("Sewaddle", "540", "src/main/resources/540.png", 45, Type.BUG, Type.GRASS),
    SWADLOON("Swadloon", "541", "src/main/resources/541.png", 55, Type.BUG, Type.GRASS),
    LEAVANNY("Leavanny", "542", "src/main/resources/542.png", 75, Type.BUG, Type.GRASS),
    VENIPEDE("Venipede", "543", "src/main/resources/543.png", 30, Type.BUG, Type.POISON),
    WHIRLIPEDE("Whirlipede", "544", "src/main/resources/544.png", 40, Type.BUG, Type.POISON),
    SCOLIPEDE("Scolipede", "545", "src/main/resources/545.png", 60, Type.BUG, Type.POISON),
    COTTONEE("Cottonee", "546", "src/main/resources/546.png", 40, Type.GRASS, Type.FAIRY),
    WHIMSICOTT("Whimsicott", "547", "src/main/resources/547.png", 60, Type.GRASS, Type.FAIRY),
    PETILIL("Petilil", "548", "src/main/resources/548.png", 45, Type.GRASS),
    LILLIGANT("Lilligant", "549", "src/main/resources/549.png", 70, Type.GRASS),
    BASCULIN("Basculin", "550", "src/main/resources/550.png", 70, Type.WATER),
    SANDILE("Sandile", "551", "src/main/resources/551.png", 50, Type.GROUND, Type.DARK),
    KROKOROK("Krokorok", "552", "src/main/resources/552.png", 60, Type.GROUND, Type.DARK),
    KROOKODILE("Krookodile", "553", "src/main/resources/553.png", 95, Type.GROUND, Type.DARK),
    DARUMAKA("Darumaka", "554", "src/main/resources/554.png", 70, Type.FIRE),
    DARMANITAN_STANDARD("Darmanitan", "555", "src/main/resources/555.png", 105, Type.FIRE),
    DARMANITAN_ZEN("Darmanitan", "555", "src/main/resources/555.png", 105, Type.FIRE, Type.PSYCHIC),
    MARACTUS("Maractus", "556", "src/main/resources/556.png", 75, Type.GRASS),
    DWEBBLE("Dwebble", "557", "src/main/resources/557.png", 50, Type.BUG, Type.ROCK),
    CRUSTLE("Crustle", "558", "src/main/resources/558.png", 70, Type.BUG, Type.ROCK),
    SCRAGGY("Scraggy", "559", "src/main/resources/559.png", 50, Type.DARK, Type.FIGHTING),
    SCRAFTY("Scrafty", "560", "src/main/resources/560.png", 65, Type.DARK, Type.FIGHTING),
    SIGILYPH("Sigilyph", "561", "src/main/resources/561.png", 72, Type.PSYCHIC, Type.FLYING),
    YAMASK("Yamask", "562", "src/main/resources/562.png", 38, Type.GHOST),
    COFAGRIGUS("Cofagrigus", "563", "src/main/resources/563.png", 58, Type.GHOST),
    TIRTOUGA("Tirtouga", "564", "src/main/resources/564.png", 54, Type.WATER, Type.ROCK),
    CARRACOSTA("Carracosta", "565", "src/main/resources/565.png", 74, Type.WATER, Type.ROCK),
    ARCHEN("Archen", "566", "src/main/resources/566.png", 55, Type.ROCK, Type.FLYING),
    ARCHEOPS("Archeops", "567", "src/main/resources/567.png", 75, Type.ROCK, Type.FLYING),
    TRUBBISH("Trubbish", "568", "src/main/resources/568.png", 50, Type.POISON),
    GARBODOR("Garbodor", "569", "src/main/resources/569.png", 80, Type.POISON),
    ZORUA("Zorua", "570", "src/main/resources/570.png", 40, Type.DARK),
    ZOROARK("Zoroark", "571", "src/main/resources/571.png", 60, Type.DARK),
    MINCCINO("Minccino", "572", "src/main/resources/572.png", 55, Type.NORMAL),
    CINCCINO("Cinccino", "573", "src/main/resources/573.png", 75, Type.NORMAL),
    GOTHITA("Gothita", "574", "src/main/resources/574.png", 45, Type.PSYCHIC),
    GOTHORITA("Gothorita", "575", "src/main/resources/575.png", 60, Type.PSYCHIC),
    GOTHITELLE("Gothitelle", "576", "src/main/resources/576.png", 70, Type.PSYCHIC),
    SOLOSIS("Solosis", "577", "src/main/resources/577.png", 45, Type.PSYCHIC),
    DUOSION("Duosion", "578", "src/main/resources/578.png", 65, Type.PSYCHIC),
    REUNICLUS("Reuniclus", "579", "src/main/resources/579.png", 110, Type.PSYCHIC),
    DUCKLETT("Ducklett", "580", "src/main/resources/580.png", 62, Type.WATER, Type.FLYING),
    SWANNA("Swanna", "581", "src/main/resources/581.png", 75, Type.WATER, Type.FLYING),
    VANILLITE("Vanillite", "582", "src/main/resources/582.png", 36, Type.ICE),
    VANILLISH("Vanillish", "583", "src/main/resources/583.png", 51, Type.ICE),
    VANILLUXE("Vanilluxe", "584", "src/main/resources/584.png", 71, Type.ICE),
    DEERLING("Deerling", "585", "src/main/resources/585.png", 60, Type.NORMAL, Type.GRASS),
    SAWSBUCK("Sawsbuck", "586", "src/main/resources/586.png", 80, Type.NORMAL, Type.GRASS),
    EMOLGA("Emolga", "587", "src/main/resources/587.png", 55, Type.ELECTRIC, Type.FLYING),
    KARRABLAST("Karrablast", "588", "src/main/resources/588.png", 50, Type.BUG),
    ESCAVALIER("Escavalier", "589", "src/main/resources/589.png", 70, Type.BUG, Type.STEEL),
    FOONGUS("Foongus", "590", "src/main/resources/590.png", 69, Type.GRASS, Type.POISON),
    AMOONGUSS("Amoonguss", "591", "src/main/resources/591.png", 114, Type.GRASS, Type.POISON),
    FRILLISH("Frillish", "592", "src/main/resources/592.png", 55, Type.WATER, Type.GHOST),
    JELLICENT("Jellicent", "593", "src/main/resources/593.png", 100, Type.WATER, Type.GHOST),
    ALOMOMOLA("Alomomola", "594", "src/main/resources/594.png", 165, Type.WATER),
    JOLTIK("Joltik", "595", "src/main/resources/595.png", 50, Type.BUG, Type.ELECTRIC),
    GALVANTULA("Galvantula", "596", "src/main/resources/596.png", 70, Type.BUG, Type.ELECTRIC),
    FERROSEED("Ferroseed", "597", "src/main/resources/597.png", 44, Type.GRASS, Type.STEEL),
    FERROTHORN("Ferrothorn", "598", "src/main/resources/598.png", 74, Type.GRASS, Type.STEEL),
    KLINK("Klink", "599", "src/main/resources/599.png", 40, Type.STEEL),
    KLANG("Klang", "600", "src/main/resources/600.png", 60, Type.STEEL),
    KLINKLANG("Klinklang", "601", "src/main/resources/601.png", 60, Type.STEEL),
    TYNAMO("Tynamo", "602", "src/main/resources/602.png", 35, Type.ELECTRIC),
    EELEKTRIK("Eelektrik", "603", "src/main/resources/603.png", 65, Type.ELECTRIC),
    EELEKTROSS("Eelektross", "604", "src/main/resources/604.png", 85, Type.ELECTRIC),
    ELGYEM("Elgyem", "605", "src/main/resources/605.png", 55, Type.PSYCHIC),
    BEHEEYEM("Beheeyem", "606", "src/main/resources/606.png", 75, Type.PSYCHIC),
    LITWICK("Litwick", "607", "src/main/resources/607.png", 50, Type.GHOST, Type.FIRE),
    LAMPENT("Lampent", "608", "src/main/resources/608.png", 60, Type.GHOST, Type.FIRE),
    CHANDELURE("Chandelure", "609", "src/main/resources/609.png", 60, Type.GHOST, Type.FIRE),
    AXEW("Axew", "610", "src/main/resources/610.png", 46, Type.DRAGON),
    FRAXURE("Fraxure", "611", "src/main/resources/611.png", 66, Type.DRAGON),
    HAXORUS("Haxorus", "612", "src/main/resources/612.png", 76, Type.DRAGON),
    CUBCHOO("Cubchoo", "613", "src/main/resources/613.png", 55, Type.ICE),
    BEARTIC("Beartic", "614", "src/main/resources/614.png", 95, Type.ICE),
    CRYOGONAL("Cryogonal", "615", "src/main/resources/615.png", 70, Type.ICE),
    SHELMET("Shelmet", "616", "src/main/resources/616.png", 50, Type.BUG),
    ACCELGOR("Accelgor", "617", "src/main/resources/617.png", 80, Type.BUG),
    STUNFISK("Stunfisk", "618", "src/main/resources/618.png", 109, Type.GROUND, Type.ELECTRIC),
    MIENFOO("Mienfoo", "619", "src/main/resources/619.png", 45, Type.FIGHTING),
    MIENSHAO("Mienshao", "620", "src/main/resources/620.png", 65, Type.FIGHTING),
    DRUDDIGON("Druddigon", "621", "src/main/resources/621.png", 77, Type.DRAGON),
    GOLETT("Golett", "622", "src/main/resources/622.png", 59, Type.GROUND, Type.GHOST),
    GOLURK("Golurk", "623", "src/main/resources/623.png", 89, Type.GROUND, Type.GHOST),
    PAWNIARD("Pawniard", "624", "src/main/resources/624.png", 45, Type.DARK, Type.STEEL),
    BISHARP("Bisharp", "625", "src/main/resources/625.png", 65, Type.DARK, Type.STEEL),
    BOUFFALANT("Bouffalant", "626", "src/main/resources/626.png", 95, Type.NORMAL),
    RUFFLET("Rufflet", "627", "src/main/resources/627.png", 70, Type.NORMAL, Type.FLYING),
    BRAVIARY("Braviary", "628", "src/main/resources/628.png", 100, Type.NORMAL, Type.FLYING),
    VULLABY("Vullaby", "629", "src/main/resources/629.png", 70, Type.DARK, Type.FLYING),
    MANDIBUZZ("Mandibuzz", "630", "src/main/resources/630.png", 110, Type.DARK, Type.FLYING),
    HEATMOR("Heatmor", "631", "src/main/resources/631.png", 85, Type.FIRE),
    DURANT("Durant", "632", "src/main/resources/632.png", 58, Type.BUG, Type.STEEL),
    DEINO("Deino", "633", "src/main/resources/633.png", 52, Type.DARK, Type.DRAGON),
    ZWEILOUS("Zweilous", "634", "src/main/resources/634.png", 72, Type.DARK, Type.DRAGON),
    HYDREIGON("Hydreigon", "635", "src/main/resources/635.png", 92, Type.DARK, Type.DRAGON),
    LARVESTA("Larvesta", "636", "src/main/resources/636.png", 55, Type.BUG, Type.FIRE),
    VOLCARONA("Volcarona", "637", "src/main/resources/637.png", 85, Type.BUG, Type.FIRE),
    COBALION("Cobalion", "638", "src/main/resources/638.png", 91, Type.STEEL, Type.FIGHTING),
    TERRAKION("Terrakion", "639", "src/main/resources/639.png", 91, Type.ROCK, Type.FIGHTING),
    VIRIZION("Virizion", "640", "src/main/resources/640.png", 91, Type.GRASS, Type.FIGHTING),
    TORNADUS_INCARNATE("Tornadus", "641", "src/main/resources/641.png", 79, Type.FLYING),
    TORNADUS_THERIAN("Tornadus", "641", "src/main/resources/641.png", 79, Type.FLYING),
    THUNDURUS_INCARNATE("Thundurus", "642", "src/main/resources/642.png", 79, Type.ELECTRIC, Type.FLYING),
    THUNDURUS_THERIAN("Thundurus", "642", "src/main/resources/642.png", 79, Type.ELECTRIC, Type.FLYING),
    RESHIRAM("Reshiram", "643", "src/main/resources/643.png", 100, Type.DRAGON, Type.FIRE),
    ZEKROM("Zekrom", "644", "src/main/resources/644.png", 100, Type.DRAGON, Type.ELECTRIC),
    LANDORUS_INCARNATE("Landorus", "645", "src/main/resources/645.png", 89, Type.GROUND, Type.FLYING),
    LANDORUS_THERIAN("Landorus", "645", "src/main/resources/645.png", 89, Type.GROUND, Type.FLYING),
    KYUREM("Kyurem", "646", "src/main/resources/646.png", 125, Type.DRAGON, Type.ICE),
    KYUREM_BLACK("Kyurem", "646", "src/main/resources/646.png", 125, Type.DRAGON, Type.ICE),
    KYUREM_WHITE("Kyurem", "646", "src/main/resources/646.png", 125, Type.DRAGON, Type.ICE),
    KELDEO("Keldeo", "647", "src/main/resources/647.png", 91, Type.WATER, Type.FIGHTING),
    KELDEO_RESOLUTE("Keldeo", "647", "src/main/resources/647.png", 91, Type.WATER, Type.FIGHTING),
    MELOETTA_ARIA("Meloetta", "648", "src/main/resources/648.png", 100, Type.NORMAL, Type.PSYCHIC),
    MELOETTA_PIROUETTE("Meloetta", "648", "src/main/resources/648.png", 100, Type.NORMAL, Type.FIGHTING),
    GENESECT("Genesect", "649", "src/main/resources/649.png", 71, Type.BUG, Type.STEEL);



    private final int HP;
    private final Type[] TYPE;
    private final String NAME, NAT_DEX_NUMBER;
    private ImageIcon IMG;

    Generation5(final String name, final String dexNumber, final String path, final int hp, final Type... type) {
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

