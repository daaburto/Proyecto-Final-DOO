package org.pokemon;

import javax.swing.*;
import java.awt.*;

public enum Generation4 {
    TURTWIG("Turtwig", "387", "src/main/resources/pokemon/387.png", 55, Type.GRASS),
    GROTLE("Grotle", "388", "src/main/resources/pokemon/388.png", 75, Type.GRASS),
    TORTERRA("Torterra", "389", "src/main/resources/pokemon/389.png", 95, Type.GRASS, Type.GROUND),
    CHIMCHAR("Chimchar", "390", "src/main/resources/pokemon/390.png", 44, Type.FIRE),
    MONFERNO("Monferno", "391", "src/main/resources/pokemon/391.png", 64, Type.FIRE, Type.FIGHTING),
    INFERNAPE("Infernape", "392", "src/main/resources/pokemon/392.png", 76, Type.FIRE, Type.FIGHTING),
    PIPLUP("Piplup", "393", "src/main/resources/pokemon/393.png", 53, Type.WATER),
    PRINPLUP("Prinplup", "394", "src/main/resources/pokemon/394.png", 64, Type.WATER),
    EMPOLEON("Empoleon", "395", "src/main/resources/pokemon/395.png", 84, Type.WATER, Type.STEEL),
    STARLY("Starly", "396", "src/main/resources/pokemon/396.png", 40, Type.NORMAL, Type.FLYING),
    STARAVIA("Staravia", "397", "src/main/resources/pokemon/397.png", 55, Type.NORMAL, Type.FLYING),
    STARAPTOR("Staraptor", "398", "src/main/resources/pokemon/398.png", 85, Type.NORMAL, Type.FLYING),
    BIDOOF("Bidoof", "399", "src/main/resources/pokemon/399.png", 59, Type.NORMAL),
    BIBAREL("Bibarel", "400", "src/main/resources/pokemon/400.png", 79, Type.NORMAL, Type.WATER),
    KRICKETOT("Kricketot", "401", "src/main/resources/pokemon/401.png", 37, Type.BUG),
    KRICKETUNE("Kricketune", "402", "src/main/resources/pokemon/402.png", 77, Type.BUG),
    SHINX("Shinx", "403", "src/main/resources/pokemon/403.png", 45, Type.ELECTRIC),
    LUXIO("Luxio", "404", "src/main/resources/pokemon/404.png", 60, Type.ELECTRIC),
    LUXRAY("Luxray", "405", "src/main/resources/pokemon/405.png", 80, Type.ELECTRIC),
    BUDEW("Budew", "406", "src/main/resources/pokemon/406.png", 40, Type.GRASS, Type.POISON),
    ROSERADE("Roserade", "407", "src/main/resources/pokemon/407.png", 60, Type.GRASS, Type.POISON),
    CRANIDOS("Cranidos", "408", "src/main/resources/pokemon/408.png", 67, Type.ROCK),
    RAMPARDOS("Rampardos", "409", "src/main/resources/pokemon/409.png", 97, Type.ROCK),
    SHIELDON("Shieldon", "410", "src/main/resources/pokemon/410.png", 30, Type.ROCK, Type.STEEL),
    BASTIODON("Bastiodon", "411", "src/main/resources/pokemon/411.png", 60, Type.ROCK, Type.STEEL),
    BURMY("Burmy", "412", "src/main/resources/pokemon/412.png", 40, Type.BUG),
    WORMADAM("Wormadam", "413", "src/main/resources/pokemon/413.png", 60, Type.BUG, Type.GRASS),
    MOTHIM("Mothim", "414", "src/main/resources/pokemon/414.png", 70, Type.BUG, Type.FLYING),
    COMBEE("Combee", "415", "src/main/resources/pokemon/415.png", 30, Type.BUG, Type.FLYING),
    VESPIQUEN("Vespiquen", "416", "src/main/resources/pokemon/416.png", 70, Type.BUG, Type.FLYING),
    PACHIRISU("Pachirisu", "417", "src/main/resources/pokemon/417.png", 60, Type.ELECTRIC),
    BUIZEL("Buizel", "418", "src/main/resources/pokemon/418.png", 55, Type.WATER),
    FLOATZEL("Floatzel", "419", "src/main/resources/pokemon/419.png", 85, Type.WATER),
    CHERUBI("Cherubi", "420", "src/main/resources/pokemon/420.png", 45, Type.GRASS),
    CHERRIM("Cherrim", "421", "src/main/resources/pokemon/421.png", 70, Type.GRASS),
    SHELLOS("Shellos", "422", "src/main/resources/pokemon/422.png", 76, Type.WATER),
    GASTRODON("Gastrodon", "423", "src/main/resources/pokemon/423.png", 111, Type.WATER, Type.GROUND),
    AMBIPOM("Ambipom", "424", "src/main/resources/pokemon/424.png", 75, Type.NORMAL),
    DRIFLOON("Drifloon", "425", "src/main/resources/pokemon/425.png", 90, Type.GHOST, Type.FLYING),
    DRIFBLIM("Drifblim", "426", "src/main/resources/pokemon/426.png", 150, Type.GHOST, Type.FLYING),
    BUNEARY("Buneary", "427", "src/main/resources/pokemon/427.png", 55, Type.NORMAL),
    LOPUNNY("Lopunny", "428", "src/main/resources/pokemon/428.png", 65, Type.NORMAL),
    MISMAGIUS("Mismagius", "429", "src/main/resources/pokemon/429.png", 60, Type.GHOST),
    HONCHKROW("Honchkrow", "430", "src/main/resources/pokemon/430.png", 100, Type.DARK, Type.FLYING),
    GLAMEOW("Glameow", "431", "src/main/resources/pokemon/431.png", 49, Type.NORMAL),
    PURUGLY("Purugly", "432", "src/main/resources/pokemon/432.png", 71, Type.NORMAL),
    CHINGLING("Chingling", "433", "src/main/resources/pokemon/433.png", 45, Type.PSYCHIC),
    STUNKY("Stunky", "434", "src/main/resources/pokemon/434.png", 63, Type.POISON, Type.DARK),
    SKUNTANK("Skuntank", "435", "src/main/resources/pokemon/435.png", 103, Type.POISON, Type.DARK),
    BRONZOR("Bronzor", "436", "src/main/resources/pokemon/436.png", 57, Type.STEEL, Type.PSYCHIC),
    BRONZONG("Bronzong", "437", "src/main/resources/pokemon/437.png", 67, Type.STEEL, Type.PSYCHIC),
    BONSLY("Bonsly", "438", "src/main/resources/pokemon/438.png", 50, Type.ROCK),
    MIME_JR("Mime Jr.", "439", "src/main/resources/pokemon/439.png", 20, Type.PSYCHIC, Type.FAIRY),
    HAPPINY("Happiny", "440", "src/main/resources/pokemon/440.png", 100, Type.NORMAL),
    CHATOT("Chatot", "441", "src/main/resources/pokemon/441.png", 76, Type.NORMAL, Type.FLYING),
    SPIRITOMB("Spiritomb", "442", "src/main/resources/pokemon/442.png", 50, Type.GHOST, Type.DARK),
    GIBLE("Gible", "443", "src/main/resources/pokemon/443.png", 58, Type.DRAGON, Type.GROUND),
    GABITE("Gabite", "444", "src/main/resources/pokemon/444.png", 68, Type.DRAGON, Type.GROUND),
    GARCHOMP("Garchomp", "445", "src/main/resources/pokemon/445.png", 108, Type.DRAGON, Type.GROUND),
    MUNCHLAX("Munchlax", "446", "src/main/resources/pokemon/446.png", 135, Type.NORMAL),
    RIOLU("Riolu", "447", "src/main/resources/pokemon/447.png", 40, Type.FIGHTING),
    LUCARIO("Lucario", "448", "src/main/resources/pokemon/448.png", 70, Type.FIGHTING, Type.STEEL),
    HIPPOPOTAS("Hippopotas", "449", "src/main/resources/pokemon/449.png", 68, Type.GROUND),
    HIPPOWDON("Hippowdon", "450", "src/main/resources/pokemon/450.png", 108, Type.GROUND),
    SKORUPI("Skorupi", "451", "src/main/resources/pokemon/451.png", 40, Type.POISON, Type.BUG),
    DRAPION("Drapion", "452", "src/main/resources/pokemon/452.png", 70, Type.POISON, Type.DARK),
    CROAGUNK("Croagunk", "453", "src/main/resources/pokemon/453.png", 48, Type.POISON, Type.FIGHTING),
    TOXICROAK("Toxicroak", "454", "src/main/resources/pokemon/454.png", 83, Type.POISON, Type.FIGHTING),
    CARNIVINE("Carnivine", "455", "src/main/resources/pokemon/455.png", 74, Type.GRASS),
    FINNEON("Finneon", "456", "src/main/resources/pokemon/456.png", 49, Type.WATER),
    LUMINEON("Lumineon", "457", "src/main/resources/pokemon/457.png", 69, Type.WATER),
    MANTYKE("Mantyke", "458", "src/main/resources/pokemon/458.png", 45, Type.WATER, Type.FLYING),
    SNOVER("Snover", "459", "src/main/resources/pokemon/459.png", 60, Type.GRASS, Type.ICE),
    ABOMASNOW("Abomasnow", "460", "src/main/resources/pokemon/460.png", 90, Type.GRASS, Type.ICE),
    WEAVILE("Weavile", "461", "src/main/resources/pokemon/461.png", 70, Type.DARK, Type.ICE),
    MAGNEZONE("Magnezone", "462", "src/main/resources/pokemon/462.png", 70, Type.ELECTRIC, Type.STEEL),
    LICKILICKY("Lickilicky", "463", "src/main/resources/pokemon/463.png", 110, Type.NORMAL),
    RHYPERIOR("Rhyperior", "464", "src/main/resources/pokemon/464.png", 115, Type.GROUND, Type.ROCK),
    TANGROWTH("Tangrowth", "465", "src/main/resources/pokemon/465.png", 100, Type.GRASS),
    ELECTIVIRE("Electivire", "466", "src/main/resources/pokemon/466.png", 75, Type.ELECTRIC),
    MAGMORTAR("Magmortar", "467", "src/main/resources/pokemon/467.png", 75, Type.FIRE),
    TOGEKISS("Togekiss", "468", "src/main/resources/pokemon/468.png", 85, Type.FAIRY, Type.FLYING),
    YANMEGA("Yanmega", "469", "src/main/resources/pokemon/469.png", 86, Type.BUG, Type.FLYING),
    LEAFEON("Leafeon", "470", "src/main/resources/pokemon/470.png", 65, Type.GRASS),
    GLACEON("Glaceon", "471", "src/main/resources/pokemon/471.png", 65, Type.ICE),
    GLISCOR("Gliscor", "472", "src/main/resources/pokemon/472.png", 75, Type.GROUND, Type.FLYING),
    MAMOSWINE("Mamoswine", "473", "src/main/resources/pokemon/473.png", 110, Type.ICE, Type.GROUND),
    PORYGON_Z("Porygon-Z", "474", "src/main/resources/pokemon/474.png", 85, Type.NORMAL),
    GALLADE("Gallade", "475", "src/main/resources/pokemon/475.png", 68, Type.PSYCHIC, Type.FIGHTING),
    PROBOPASS("Probopass", "476", "src/main/resources/pokemon/476.png", 60, Type.ROCK, Type.STEEL),
    DUSKNOIR("Dusknoir", "477", "src/main/resources/pokemon/477.png", 45, Type.GHOST),
    FROSLASS("Froslass", "478", "src/main/resources/pokemon/478.png", 70, Type.ICE, Type.GHOST),
    ROTOM("Rotom", "479", "src/main/resources/pokemon/479.png", 50, Type.ELECTRIC, Type.GHOST),
    ROTOM_HEAT("Rotom Heat", "479", "src/main/resources/pokemon/479-heat.png", 50, Type.ELECTRIC, Type.FIRE),
    ROTOM_WASH("Rotom Wash", "479", "src/main/resources/pokemon/479-wash.png", 50, Type.ELECTRIC, Type.WATER),
    ROTOM_FROST("Rotom Frost", "479", "src/main/resources/pokemon/479-frost.png", 50, Type.ELECTRIC, Type.ICE),
    ROTOM_FAN("Rotom Fan", "479", "src/main/resources/pokemon/479-fan.png", 50, Type.ELECTRIC, Type.FLYING),
    ROTOM_MOW("Rotom Mow", "479", "src/main/resources/pokemon/479-mow.png", 50, Type.ELECTRIC, Type.GRASS),
    UXIE("Uxie", "480", "src/main/resources/pokemon/480.png", 75, Type.PSYCHIC),
    MESPRIT("Mesprit", "481", "src/main/resources/pokemon/481.png", 80, Type.PSYCHIC),
    AZELF("Azelf", "482", "src/main/resources/pokemon/482.png", 75, Type.PSYCHIC),
    DIALGA("Dialga", "483", "src/main/resources/pokemon/483.png", 100, Type.STEEL, Type.DRAGON),
    PALKIA("Palkia", "484", "src/main/resources/pokemon/484.png", 90, Type.WATER, Type.DRAGON),
    HEATRAN("Heatran", "485", "src/main/resources/pokemon/485.png", 91, Type.FIRE, Type.STEEL),
    REGIGIGAS("Regigigas", "486", "src/main/resources/pokemon/486.png", 110, Type.NORMAL),
    GIRATINA_ALTERED("Giratina Altered", "487", "src/main/resources/pokemon/487.png", 150, Type.GHOST, Type.DRAGON),
    GIRATINA_ORIGIN("Giratina Origin", "487", "src/main/resources/pokemon/487-origin.png", 150, Type.GHOST, Type.DRAGON),
    CRESSELIA("Cresselia", "488", "src/main/resources/pokemon/488.png", 120, Type.PSYCHIC),
    PHIONE("Phione", "489", "src/main/resources/pokemon/489.png", 80, Type.WATER),
    MANAPHY("Manaphy", "490", "src/main/resources/pokemon/490.png", 100, Type.WATER),
    DARKRAI("Darkrai", "491", "src/main/resources/pokemon/491.png", 70, Type.DARK),
    SHAYMIN_LAND("Shaymin Land", "492", "src/main/resources/pokemon/492.png", 100, Type.GRASS),
    SHAYMIN_SKY("Shaymin Sky", "492", "src/main/resources/pokemon/492-sky.png", 100, Type.GRASS, Type.FLYING),
    ARCEUS("Arceus", "493", "src/main/resources/pokemon/493.png", 120, Type.NORMAL);


    private final int HP;
    private final Type[] TYPE;
    private final String NAME, NAT_DEX_NUMBER;
    private ImageIcon IMG;

    Generation4(final String name, final String dexNumber, final String path, final int hp, final Type... type) {
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
