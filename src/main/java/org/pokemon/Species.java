package org.pokemon;

import javax.swing.*;

public enum Species {
    BULBASAUR(Generation1.BULBASAUR),
    IVYSAUR(Generation1.IVYSAUR),
    VENUSAUR(Generation1.VENUSAUR),
    CHARMANDER(Generation1.CHARMANDER),
    CHARMELEON(Generation1.CHARMELEON),
    CHARIZARD(Generation1.CHARIZARD),
    SQUIRTLE(Generation1.SQUIRTLE),
    WARTORTLE(Generation1.WARTORTLE),
    BLASTOISE(Generation1.BLASTOISE),
    CATERPIE(Generation1.CATERPIE),
    METAPOD(Generation1.METAPOD),
    BUTTERFREE(Generation1.BUTTERFREE),
    WEEDLE(Generation1.WEEDLE),
    KAKUNA(Generation1.KAKUNA),
    BEEDRILL(Generation1.BEEDRILL),
    PIDGEY(Generation1.PIDGEY),
    PIDGEOTTO(Generation1.PIDGEOTTO),
    PIDGEOT(Generation1.PIDGEOT),
    RATTATA(Generation1.RATTATA),
    RATICATE(Generation1.RATICATE),
    SPEAROW(Generation1.SPEAROW),
    FEAROW(Generation1.FEAROW),
    EKANS(Generation1.EKANS),
    ARBOK(Generation1.ARBOK),
    PIKACHU(Generation1.PIKACHU),
    RAICHU(Generation1.RAICHU),
    SANDSHREW(Generation1.SANDSHREW),
    SANDSLASH(Generation1.SANDSLASH),
    NIDORAN_FEMALE(Generation1.NIDORAN_FEMALE),
    NIDORINA(Generation1.NIDORINA),
    NIDOQUEEN(Generation1.NIDOQUEEN),
    NIDORAN_MALE(Generation1.NIDORAN_MALE),
    NIDORINO(Generation1.NIDORINO),
    NIDOKING(Generation1.NIDOKING),
    CLEFAIRY(Generation1.CLEFAIRY),
    CLEFABLE(Generation1.CLEFABLE),
    VULPIX(Generation1.VULPIX),
    NINETALES(Generation1.NINETALES),
    JIGGLYPUFF(Generation1.JIGGLYPUFF),
    WIGGLYTUFF(Generation1.WIGGLYTUFF),
    ZUBAT(Generation1.ZUBAT),
    GOLBAT(Generation1.GOLBAT),
    ODDISH(Generation1.ODDISH),
    GLOOM(Generation1.GLOOM),
    VILEPLUME(Generation1.VILEPLUME),
    PARAS(Generation1.PARAS),
    PARASECT(Generation1.PARASECT),
    VENONAT(Generation1.VENONAT),
    VENOMOTH(Generation1.VENOMOTH),
    DIGLETT(Generation1.DIGLETT),
    DUGTRIO(Generation1.DUGTRIO),
    MEOWTH(Generation1.MEOWTH),
    PERSIAN(Generation1.PERSIAN),
    PSYDUCK(Generation1.PSYDUCK),
    GOLDUCK(Generation1.GOLDUCK),
    MANKEY(Generation1.MANKEY),
    PRIMEAPE(Generation1.PRIMEAPE),
    GROWLITHE(Generation1.GROWLITHE),
    ARCANINE(Generation1.ARCANINE),
    POLIWAG(Generation1.POLIWAG),
    POLIWHIRL(Generation1.POLIWHIRL),
    POLIWRATH(Generation1.POLIWRATH),
    ABRA(Generation1.ABRA),
    KADABRA(Generation1.KADABRA),
    ALAKAZAM(Generation1.ALAKAZAM),
    MACHOP(Generation1.MACHOP),
    MACHOKE(Generation1.MACHOKE),
    MACHAMP(Generation1.MACHAMP),
    BELLSPROUT(Generation1.BELLSPROUT),
    WEEPINBELL(Generation1.WEEPINBELL),
    VICTREEBEL(Generation1.VICTREEBEL),
    TENTACOOL(Generation1.TENTACOOL),
    TENTACRUEL(Generation1.TENTACRUEL),
    GEODUDE(Generation1.GEODUDE),
    GRAVELER(Generation1.GRAVELER),
    GOLEM(Generation1.GOLEM),
    PONYTA(Generation1.PONYTA),
    RAPIDASH(Generation1.RAPIDASH),
    SLOWPOKE(Generation1.SLOWPOKE),
    SLOWBRO(Generation1.SLOWBRO),
    MAGNEMITE(Generation1.MAGNEMITE),
    MAGNETON(Generation1.MAGNETON),
    FARFETCH_D(Generation1.FARFETCH_D),
    DODUO(Generation1.DODUO),
    DODRIO(Generation1.DODRIO),
    SEEL(Generation1.SEEL),
    DEWGONG(Generation1.DEWGONG),
    GRIMER(Generation1.GRIMER),
    MUK(Generation1.MUK),
    SHELLDER(Generation1.SHELLDER),
    CLOYSTER(Generation1.CLOYSTER),
    GASTLY(Generation1.GASTLY),
    HAUNTER(Generation1.HAUNTER),
    GENGAR(Generation1.GENGAR),
    ONIX(Generation1.ONIX),
    DROWZEE(Generation1.DROWZEE),
    HYPNO(Generation1.HYPNO),
    KRABBY(Generation1.KRABBY),
    KINGLER(Generation1.KINGLER),
    VOLTORB(Generation1.VOLTORB),
    ELECTRODE(Generation1.ELECTRODE),
    EXEGGCUTE(Generation1.EXEGGCUTE),
    EXEGGUTOR(Generation1.EXEGGUTOR),
    CUBONE(Generation1.CUBONE),
    MAROWAK(Generation1.MAROWAK),
    HITMONLEE(Generation1.HITMONLEE),
    HITMONCHAN(Generation1.HITMONCHAN),
    LICKITUNG(Generation1.LICKITUNG),
    KOFFING(Generation1.KOFFING),
    WEEZING(Generation1.WEEZING),
    RHYHORN(Generation1.RHYHORN),
    RHYDON(Generation1.RHYDON),
    CHANSEY(Generation1.CHANSEY),
    TANGELA(Generation1.TANGELA),
    KANGASKHAN(Generation1.KANGASKHAN),
    HORSEA(Generation1.HORSEA),
    SEADRA(Generation1.SEADRA),
    GOLDEEN(Generation1.GOLDEEN),
    SEAKING(Generation1.SEAKING),
    STARYU(Generation1.STARYU),
    STARMIE(Generation1.STARMIE),
    MR_MIME(Generation1.MR_MIME),
    SCYTHER(Generation1.SCYTHER),
    JYNX(Generation1.JYNX),
    ELECTABUZZ(Generation1.ELECTABUZZ),
    MAGMAR(Generation1.MAGMAR),
    PINSIR(Generation1.PINSIR),
    TAUROS(Generation1.TAUROS),
    MAGIKARP(Generation1.MAGIKARP),
    GYARADOS(Generation1.GYARADOS),
    LAPRAS(Generation1.LAPRAS),
    DITTO(Generation1.DITTO),
    EEVEE(Generation1.EEVEE),
    VAPOREON(Generation1.VAPOREON),
    JOLTEON(Generation1.JOLTEON),
    FLAREON(Generation1.FLAREON),
    PORYGON(Generation1.PORYGON),
    OMANYTE(Generation1.OMANYTE),
    OMASTAR(Generation1.OMASTAR),
    KABUTO(Generation1.KABUTO),
    KABUTOPS(Generation1.KABUTOPS),
    AERODACTYL(Generation1.AERODACTYL),
    SNORLAX(Generation1.SNORLAX),
    ARTICUNO(Generation1.ARTICUNO),
    ZAPDOS(Generation1.ZAPDOS),
    MOLTRES(Generation1.MOLTRES),
    DRATINI(Generation1.DRATINI),
    DRAGONAIR(Generation1.DRAGONAIR),
    DRAGONITE(Generation1.DRAGONITE),
    MEWTWO(Generation1.MEWTWO),
    MEW(Generation1.MEW),
    CHIKORITA(Generation2.CHIKORITA),
    BAYLEEF(Generation2.BAYLEEF),
    MEGANIUM(Generation2.MEGANIUM),
    CYNDAQUIL(Generation2.CYNDAQUIL),
    QUILAVA(Generation2.QUILAVA),
    TYPHLOSION(Generation2.TYPHLOSION),
    TOTODILE(Generation2.TOTODILE),
    CROCONAW(Generation2.CROCONAW),
    FERALIGATR(Generation2.FERALIGATR),
    SENTRET(Generation2.SENTRET),
    FURRET(Generation2.FURRET),
    HOOTHOOT(Generation2.HOOTHOOT),
    NOCTOWL(Generation2.NOCTOWL),
    LEDYBA(Generation2.LEDYBA),
    LEDIAN(Generation2.LEDIAN),
    SPINARAK(Generation2.SPINARAK),
    ARIADOS(Generation2.ARIADOS),
    CROBAT(Generation2.CROBAT),
    CHINCHOU(Generation2.CHINCHOU),
    LANTURN(Generation2.LANTURN),
    PICHU(Generation2.PICHU),
    CLEFFA(Generation2.CLEFFA),
    IGGLYBUFF(Generation2.IGGLYBUFF),
    TOGEPI(Generation2.TOGEPI),
    TOGETIC(Generation2.TOGETIC),
    NATU(Generation2.NATU),
    XATU(Generation2.XATU),
    MAREEP(Generation2.MAREEP),
    FLAAFFY(Generation2.FLAAFFY),
    AMPHAROS(Generation2.AMPHAROS),
    BELLOSSOM(Generation2.BELLOSSOM),
    MARILL(Generation2.MARILL),
    AZUMARILL(Generation2.AZUMARILL),
    SUDOWOODO(Generation2.SUDOWOODO),
    POLITOED(Generation2.POLITOED),
    HOPPIP(Generation2.HOPPIP),
    SKIPLOOM(Generation2.SKIPLOOM),
    JUMPLUFF(Generation2.JUMPLUFF),
    AIPOM(Generation2.AIPOM),
    SUNKERN(Generation2.SUNKERN),
    SUNFLORA(Generation2.SUNFLORA),
    YANMA(Generation2.YANMA),
    WOOPER(Generation2.WOOPER),
    QUAGSIRE(Generation2.QUAGSIRE),
    ESPEON(Generation2.ESPEON),
    UMBREON(Generation2.UMBREON),
    MURKROW(Generation2.MURKROW),
    SLOWKING(Generation2.SLOWKING),
    MISDREAVUS(Generation2.MISDREAVUS),
    UNOWN(Generation2.UNOWN),
    WOBBUFFET(Generation2.WOBBUFFET),
    GIRAFARIG(Generation2.GIRAFARIG),
    PINECO(Generation2.PINECO),
    FORRETRESS(Generation2.FORRETRESS),
    DUNSPARCE(Generation2.DUNSPARCE),
    GLIGAR(Generation2.GLIGAR),
    STEELIX(Generation2.STEELIX),
    SNUBBULL(Generation2.SNUBBULL),
    GRANBULL(Generation2.GRANBULL),
    QWILFISH(Generation2.QWILFISH),
    SCIZOR(Generation2.SCIZOR),
    SHUCKLE(Generation2.SHUCKLE),
    HERACROSS(Generation2.HERACROSS),
    SNEASEL(Generation2.SNEASEL),
    TEDDIURSA(Generation2.TEDDIURSA),
    URSARING(Generation2.URSARING),
    SLUGMA(Generation2.SLUGMA),
    MAGCARGO(Generation2.MAGCARGO),
    SWINUB(Generation2.SWINUB),
    PILOSWINE(Generation2.PILOSWINE),
    CORSOLA(Generation2.CORSOLA),
    REMORAID(Generation2.REMORAID),
    OCTILLERY(Generation2.OCTILLERY),
    DELIBIRD(Generation2.DELIBIRD),
    MANTINE(Generation2.MANTINE),
    SKARMORY(Generation2.SKARMORY),
    HOUNDOUR(Generation2.HOUNDOUR),
    HOUNDOOM(Generation2.HOUNDOOM),
    KINGDRA(Generation2.KINGDRA),
    PHANPY(Generation2.PHANPY),
    DONPHAN(Generation2.DONPHAN),
    PORYGON2(Generation2.PORYGON2),
    STANTLER(Generation2.STANTLER),
    SMEARGLE(Generation2.SMEARGLE),
    TYROGUE(Generation2.TYROGUE),
    HITMONTOP(Generation2.HITMONTOP),
    SMOOCHUM(Generation2.SMOOCHUM),
    ELEKID(Generation2.ELEKID),
    MAGBY(Generation2.MAGBY),
    MILTANK(Generation2.MILTANK),
    BLISSEY(Generation2.BLISSEY),
    RAIKOU(Generation2.RAIKOU),
    ENTEI(Generation2.ENTEI),
    SUICUNE(Generation2.SUICUNE),
    LARVITAR(Generation2.LARVITAR),
    PUPITAR(Generation2.PUPITAR),
    TYRANITAR(Generation2.TYRANITAR),
    LUGIA(Generation2.LUGIA),
    HO_OH(Generation2.HO_OH),
    CELEBI(Generation2.CELEBI),
    TREECKO(Generation3.TREECKO),
    GROVYLE(Generation3.GROVYLE),
    SCEPTILE(Generation3.SCEPTILE),
    TORCHIC(Generation3.TORCHIC),
    COMBUSKEN(Generation3.COMBUSKEN),
    BLAZIKEN(Generation3.BLAZIKEN),
    MUDKIP(Generation3.MUDKIP),
    MARSHTOMP(Generation3.MARSHTOMP),
    SWAMPERT(Generation3.SWAMPERT),
    POOCHYENA(Generation3.POOCHYENA),
    MIGHTYENA(Generation3.MIGHTYENA),
    ZIGZAGOON(Generation3.ZIGZAGOON),
    LINOONE(Generation3.LINOONE),
    WURMPLE(Generation3.WURMPLE),
    SILCOON(Generation3.SILCOON),
    BEAUTIFLY(Generation3.BEAUTIFLY),
    CASCOON(Generation3.CASCOON),
    DUSTOX(Generation3.DUSTOX),
    LOTAD(Generation3.LOTAD),
    LOMBRE(Generation3.LOMBRE),
    LUDICOLO(Generation3.LUDICOLO),
    SEEDOT(Generation3.SEEDOT),
    NUZLEAF(Generation3.NUZLEAF),
    SHIFTRY(Generation3.SHIFTRY),
    TAILLOW(Generation3.TAILLOW),
    SWELLOW(Generation3.SWELLOW),
    WINGULL(Generation3.WINGULL),
    PELIPPER(Generation3.PELIPPER),
    RALTS(Generation3.RALTS),
    KIRLIA(Generation3.KIRLIA),
    GARDEVOIR(Generation3.GARDEVOIR),
    SURSKIT(Generation3.SURSKIT),
    MASQUERAIN(Generation3.MASQUERAIN),
    SHROOMISH(Generation3.SHROOMISH),
    BRELOOM(Generation3.BRELOOM),
    SLAKOTH(Generation3.SLAKOTH),
    VIGOROTH(Generation3.VIGOROTH),
    SLAKING(Generation3.SLAKING),
    NINCADA(Generation3.NINCADA),
    NINJASK(Generation3.NINJASK),
    SHEDINJA(Generation3.SHEDINJA),
    WHISMUR(Generation3.WHISMUR),
    LOUDRED(Generation3.LOUDRED),
    EXPLOUD(Generation3.EXPLOUD),
    MAKUHITA(Generation3.MAKUHITA),
    HARIYAMA(Generation3.HARIYAMA),
    AZURILL(Generation3.AZURILL),
    NOSEPASS(Generation3.NOSEPASS),
    SKITTY(Generation3.SKITTY),
    DELCATTY(Generation3.DELCATTY),
    SABLEYE(Generation3.SABLEYE),
    MAWILE(Generation3.MAWILE),
    ARON(Generation3.ARON),
    LAIRON(Generation3.LAIRON),
    AGGRON(Generation3.AGGRON),
    MEDITITE(Generation3.MEDITITE),
    MEDICHAM(Generation3.MEDICHAM),
    ELECTRIKE(Generation3.ELECTRIKE),
    MANECTRIC(Generation3.MANECTRIC),
    PLUSLE(Generation3.PLUSLE),
    MINUN(Generation3.MINUN),
    VOLBEAT(Generation3.VOLBEAT),
    ILLUMISE(Generation3.ILLUMISE),
    ROSELIA(Generation3.ROSELIA),
    GULPIN(Generation3.GULPIN),
    SWALOT(Generation3.SWALOT),
    CARVANHA(Generation3.CARVANHA),
    SHARPEDO(Generation3.SHARPEDO),
    WAILMER(Generation3.WAILMER),
    WAILORD(Generation3.WAILORD),
    NUMEL(Generation3.NUMEL),
    CAMERUPT(Generation3.CAMERUPT),
    TORKOAL(Generation3.TORKOAL),
    SPOINK(Generation3.SPOINK),
    GRUMPIG(Generation3.GRUMPIG),
    SPINDA(Generation3.SPINDA),
    TRAPINCH(Generation3.TRAPINCH),
    VIBRAVA(Generation3.VIBRAVA),
    FLYGON(Generation3.FLYGON),
    CACNEA(Generation3.CACNEA),
    CACTURNE(Generation3.CACTURNE),
    SWABLU(Generation3.SWABLU),
    ALTARIA(Generation3.ALTARIA),
    ZANGOOSE(Generation3.ZANGOOSE),
    SEVIPER(Generation3.SEVIPER),
    LUNATONE(Generation3.LUNATONE),
    SOLROCK(Generation3.SOLROCK),
    BARBOACH(Generation3.BARBOACH),
    WHISCASH(Generation3.WHISCASH),
    CORPHISH(Generation3.CORPHISH),
    CRAWDAUNT(Generation3.CRAWDAUNT),
    BALTOY(Generation3.BALTOY),
    CLAYDOL(Generation3.CLAYDOL),
    LILEEP(Generation3.LILEEP),
    CRADILY(Generation3.CRADILY),
    ANORITH(Generation3.ANORITH),
    ARMALDO(Generation3.ARMALDO),
    FEEBAS(Generation3.FEEBAS),
    MILOTIC(Generation3.MILOTIC),
    CASTFORM(Generation3.CASTFORM),
    CASTFORM_SUNNY(Generation3.CASTFORM_SUNNY),
    CASTFORM_RAINY(Generation3.CASTFORM_RAINY),
    CASTFORM_SNOWY(Generation3.CASTFORM_SNOWY),
    KECLEON(Generation3.KECLEON),
    SHUPPET(Generation3.SHUPPET),
    BANETTE(Generation3.BANETTE),
    DUSKULL(Generation3.DUSKULL),
    DUSCLOPS(Generation3.DUSCLOPS),
    TROPIUS(Generation3.TROPIUS),
    CHIMECHO(Generation3.CHIMECHO),
    ABSOL(Generation3.ABSOL),
    WYNAUT(Generation3.WYNAUT),
    SNORUNT(Generation3.SNORUNT),
    GLALIE(Generation3.GLALIE),
    SPHEAL(Generation3.SPHEAL),
    SEALEO(Generation3.SEALEO),
    WALREIN(Generation3.WALREIN),
    CLAMPERL(Generation3.CLAMPERL),
    HUNTAIL(Generation3.HUNTAIL),
    GOREBYSS(Generation3.GOREBYSS),
    RELICANTH(Generation3.RELICANTH),
    LUVDISC(Generation3.LUVDISC),
    BAGON(Generation3.BAGON),
    SHELGON(Generation3.SHELGON),
    SALAMENCE(Generation3.SALAMENCE),
    BELDUM(Generation3.BELDUM),
    METANG(Generation3.METANG),
    METAGROSS(Generation3.METAGROSS),
    REGIROCK(Generation3.REGIROCK),
    REGICE(Generation3.REGICE),
    REGISTEEL(Generation3.REGISTEEL),
    LATIAS(Generation3.LATIAS),
    LATIOS(Generation3.LATIOS),
    KYOGRE(Generation3.KYOGRE),
    GROUDON(Generation3.GROUDON),
    RAYQUAZA(Generation3.RAYQUAZA),
    JIRACHI(Generation3.JIRACHI),
    DEOXYS_NORMAL(Generation3.DEOXYS_NORMAL),
    DEOXYS_SPEED(Generation3.DEOXYS_SPEED),
    DEOXYS_ATTACK(Generation3.DEOXYS_ATTACK),
    DEOXYS_DEFENSE(Generation3.DEOXYS_DEFENSE);/*
    TURTWIG(Generation4.TURTWIG),
    GROTLE(Generation4.GROTLE),
    TORTERRA(Generation4.TORTERRA),
    CHIMCHAR(Generation4.CHIMCHAR),
    MONFERNO(Generation4.MONFERNO),
    INFERNAPE(Generation4.INFERNAPE),
    PIPLUP(Generation4.PIPLUP),
    PRINPLUP(Generation4.PRINPLUP),
    EMPOLEON(Generation4.EMPOLEON),
    STARLY(Generation4.STARLY),
    STARAVIA(Generation4.STARAVIA),
    STARAPTOR(Generation4.STARAPTOR),
    BIDOOF(Generation4.BIDOOF),
    BIBAREL(Generation4.BIBAREL),
    KRICKETOT(Generation4.KRICKETOT),
    KRICKETUNE(Generation4.KRICKETUNE),
    SHINX(Generation4.SHINX),
    LUXIO(Generation4.LUXIO),
    LUXRAY(Generation4.LUXRAY),
    BUDEW(Generation4.BUDEW),
    ROSERADE(Generation4.ROSERADE),
    CRANIDOS(Generation4.CRANIDOS),
    RAMPARDOS(Generation4.RAMPARDOS),
    SHIELDON(Generation4.SHIELDON),
    BASTIODON(Generation4.BASTIODON),
    BURMY(Generation4.BURMY),
    WORMADAM(Generation4.WORMADAM),
    MOTHIM(Generation4.MOTHIM),
    COMBEE(Generation4.COMBEE),
    VESPIQUEN(Generation4.VESPIQUEN),
    PACHIRISU(Generation4.PACHIRISU),
    BUIZEL(Generation4.BUIZEL),
    FLOATZEL(Generation4.FLOATZEL),
    CHERUBI(Generation4.CHERUBI),
    CHERRIM(Generation4.CHERRIM),
    SHELLOS(Generation4.SHELLOS),
    GASTRODON(Generation4.GASTRODON),
    AMBIPOM(Generation4.AMBIPOM),
    DRIFLOON(Generation4.DRIFLOON),
    DRIFBLIM(Generation4.DRIFBLIM),
    BUNEARY(Generation4.BUNEARY),
    LOPUNNY(Generation4.LOPUNNY),
    MISMAGIUS(Generation4.MISMAGIUS),
    HONCHKROW(Generation4.HONCHKROW),
    GLAMEOW(Generation4.GLAMEOW),
    PURUGLY(Generation4.PURUGLY),
    CHINGLING(Generation4.CHINGLING),
    STUNKY(Generation4.STUNKY),
    SKUNTANK(Generation4.SKUNTANK),
    BRONZOR(Generation4.BRONZOR),
    BRONZONG(Generation4.BRONZONG),
    BONSLY(Generation4.BONSLY),
    MIME_JR(Generation4.MIME_JR),
    HAPPINY(Generation4.HAPPINY),
    CHATOT(Generation4.CHATOT),
    SPIRITOMB(Generation4.SPIRITOMB),
    GIBLE(Generation4.GIBLE),
    GABITE(Generation4.GABITE),
    GARCHOMP(Generation4.GARCHOMP),
    MUNCHLAX(Generation4.MUNCHLAX),
    RIOLU(Generation4.RIOLU),
    LUCARIO(Generation4.LUCARIO),
    HIPPOPOTAS(Generation4.HIPPOPOTAS),
    HIPPOWDON(Generation4.HIPPOWDON),
    SKORUPI(Generation4.SKORUPI),
    DRAPION(Generation4.DRAPION),
    CROAGUNK(Generation4.CROAGUNK),
    TOXICROAK(Generation4.TOXICROAK),
    CARNIVINE(Generation4.CARNIVINE),
    FINNEON(Generation4.FINNEON),
    LUMINEON(Generation4.LUMINEON),
    MANTYKE(Generation4.MANTYKE),
    SNOVER(Generation4.SNOVER),
    ABOMASNOW(Generation4.ABOMASNOW),
    WEAVILE(Generation4.WEAVILE),
    MAGNEZONE(Generation4.MAGNEZONE),
    LICKILICKY(Generation4.LICKILICKY),
    RHYPERIOR(Generation4.RHYPERIOR),
    TANGROWTH(Generation4.TANGROWTH),
    ELECTIVIRE(Generation4.ELECTIVIRE),
    MAGMORTAR(Generation4.MAGMORTAR),
    TOGEKISS(Generation4.TOGEKISS),
    YANMEGA(Generation4.YANMEGA),
    LEAFEON(Generation4.LEAFEON),
    GLACEON(Generation4.GLACEON),
    GLISCOR(Generation4.GLISCOR),
    MAMOSWINE(Generation4.MAMOSWINE),
    PORYGON_Z(Generation4.PORYGON_Z),
    GALLADE(Generation4.GALLADE),
    PROBOPASS(Generation4.PROBOPASS),
    DUSKNOIR(Generation4.DUSKNOIR),
    FROSLASS(Generation4.FROSLASS),
    ROTOM(Generation4.ROTOM),
    ROTOM_FAN(Generation4.ROTOM_FAN),
    ROTOM_FROST(Generation4.ROTOM_FROST),
    ROTOM_HEAT(Generation4.ROTOM_HEAT),
    ROTOM_MOW(Generation4.ROTOM_MOW),
    ROTOM_WASH(Generation4.ROTOM_WASH),
    UXIE(Generation4.UXIE),
    MESPRIT(Generation4.MESPRIT),
    AZELF(Generation4.AZELF),
    DIALGA(Generation4.DIALGA),
    PALKIA(Generation4.PALKIA),
    HEATRAN(Generation4.HEATRAN),
    REGIGIGAS(Generation4.REGIGIGAS),
    GIRATINA_ALTERED(Generation4.GIRATINA_ALTERED),
    GIRATINA_ORIGIN(Generation4.GIRATINA_ORIGIN),
    CRESSELIA(Generation4.CRESSELIA),
    PHIONE(Generation4.PHIONE),
    MANAPHY(Generation4.MANAPHY),
    DARKRAI(Generation4.DARKRAI),
    SHAYMIN_LAND(Generation4.SHAYMIN_LAND),
    SHAYMIN_SKY(Generation4.SHAYMIN_SKY),
    ARCEUS(Generation4.ARCEUS),
    VICTINI(Generation5.VICTINI),
    SNIVY(Generation5.SNIVY),
    SERVINE(Generation5.SERVINE),
    SERPERIOR(Generation5.SERPERIOR),
    TEPIG(Generation5.TEPIG),
    PIGNITE(Generation5.PIGNITE),
    EMBOAR(Generation5.EMBOAR),
    OSHAWOTT(Generation5.OSHAWOTT),
    DEWOTT(Generation5.DEWOTT),
    SAMUROTT(Generation5.SAMUROTT),
    PATRAT(Generation5.PATRAT),
    WATCHOG(Generation5.WATCHOG),
    LILLIPUP(Generation5.LILLIPUP),
    HERDIER(Generation5.HERDIER),
    STOUTLAND(Generation5.STOUTLAND),
    PURRLOIN(Generation5.PURRLOIN),
    LIEPARD(Generation5.LIEPARD),
    PANSAGE(Generation5.PANSAGE),
    SIMISAGE(Generation5.SIMISAGE),
    PANSEAR(Generation5.PANSEAR),
    SIMISEAR(Generation5.SIMISEAR),
    PANPOUR(Generation5.PANPOUR),
    SIMIPOUR(Generation5.SIMIPOUR),
    MUNNA(Generation5.MUNNA),
    MUSHARNA(Generation5.MUSHARNA),
    PIDOVE(Generation5.PIDOVE),
    TRANQUILL(Generation5.TRANQUILL),
    UNFEZANT(Generation5.UNFEZANT),
    BLITZLE(Generation5.BLITZLE),
    ZEBSTRIKA(Generation5.ZEBSTRIKA),
    ROGGENROLA(Generation5.ROGGENROLA),
    BOLDORE(Generation5.BOLDORE),
    GIGALITH(Generation5.GIGALITH),
    WOOBAT(Generation5.WOOBAT),
    SWOOBAT(Generation5.SWOOBAT),
    DRILBUR(Generation5.DRILBUR),
    EXCADRILL(Generation5.EXCADRILL),
    AUDINO(Generation5.AUDINO),
    TIMBURR(Generation5.TIMBURR),
    GURDURR(Generation5.GURDURR),
    CONKELDURR(Generation5.CONKELDURR),
    TYMPOLE(Generation5.TYMPOLE),
    PALPITOAD(Generation5.PALPITOAD),
    SEISMITOAD(Generation5.SEISMITOAD),
    THROH(Generation5.THROH),
    SAWK(Generation5.SAWK),
    SEWADDLE(Generation5.SEWADDLE),
    SWADLOON(Generation5.SWADLOON),
    LEAVANNY(Generation5.LEAVANNY),
    VENIPEDE(Generation5.VENIPEDE),
    WHIRLIPEDE(Generation5.WHIRLIPEDE),
    SCOLIPEDE(Generation5.SCOLIPEDE),
    COTTONEE(Generation5.COTTONEE),
    WHIMSICOTT(Generation5.WHIMSICOTT),
    PETILIL(Generation5.PETILIL),
    LILLIGANT(Generation5.LILLIGANT),
    BASCULIN(Generation5.BASCULIN),
    SANDILE(Generation5.SANDILE),
    KROKOROK(Generation5.KROKOROK),
    KROOKODILE(Generation5.KROOKODILE),
    DARUMAKA(Generation5.DARUMAKA),
    DARMANITAN_STANDARD(Generation5.DARMANITAN_STANDARD),
    DARMANITAN_ZEN(Generation5.DARMANITAN_ZEN),
    MARACTUS(Generation5.MARACTUS),
    DWEBBLE(Generation5.DWEBBLE),
    CRUSTLE(Generation5.CRUSTLE),
    SCRAGGY(Generation5.SCRAGGY),
    SCRAFTY(Generation5.SCRAFTY),
    SIGILYPH(Generation5.SIGILYPH),
    YAMASK(Generation5.YAMASK),
    COFAGRIGUS(Generation5.COFAGRIGUS),
    TIRTOUGA(Generation5.TIRTOUGA),
    CARRACOSTA(Generation5.CARRACOSTA),
    ARCHEN(Generation5.ARCHEN),
    ARCHEOPS(Generation5.ARCHEOPS),
    TRUBBISH(Generation5.TRUBBISH),
    GARBODOR(Generation5.GARBODOR),
    ZORUA(Generation5.ZORUA),
    ZOROARK(Generation5.ZOROARK),
    MINCCINO(Generation5.MINCCINO),
    CINCCINO(Generation5.CINCCINO),
    GOTHITA(Generation5.GOTHITA),
    GOTHORITA(Generation5.GOTHORITA),
    GOTHITELLE(Generation5.GOTHITELLE),
    SOLOSIS(Generation5.SOLOSIS),
    DUOSION(Generation5.DUOSION),
    REUNICLUS(Generation5.REUNICLUS),
    DUCKLETT(Generation5.DUCKLETT),
    SWANNA(Generation5.SWANNA),
    VANILLITE(Generation5.VANILLITE),
    VANILLISH(Generation5.VANILLISH),
    VANILLUXE(Generation5.VANILLUXE),
    DEERLING(Generation5.DEERLING),
    SAWSBUCK(Generation5.SAWSBUCK),
    EMOLGA(Generation5.EMOLGA),
    KARRABLAST(Generation5.KARRABLAST),
    ESCAVALIER(Generation5.ESCAVALIER),
    FOONGUS(Generation5.FOONGUS),
    AMOONGUSS(Generation5.AMOONGUSS),
    FRILLISH(Generation5.FRILLISH),
    JELLICENT(Generation5.JELLICENT),
    ALOMOMOLA(Generation5.ALOMOMOLA),
    JOLTIK(Generation5.JOLTIK),
    GALVANTULA(Generation5.GALVANTULA),
    FERROSEED(Generation5.FERROSEED),
    FERROTHORN(Generation5.FERROTHORN),
    KLINK(Generation5.KLINK),
    KLANG(Generation5.KLANG),
    KLINKLANG(Generation5.KLINKLANG),
    TYNAMO(Generation5.TYNAMO),
    EELEKTRIK(Generation5.EELEKTRIK),
    EELEKTROSS(Generation5.EELEKTROSS),
    ELGYEM(Generation5.ELGYEM),
    BEHEEYEM(Generation5.BEHEEYEM),
    LITWICK(Generation5.LITWICK),
    LAMPENT(Generation5.LAMPENT),
    CHANDELURE(Generation5.CHANDELURE),
    AXEW(Generation5.AXEW),
    FRAXURE(Generation5.FRAXURE),
    HAXORUS(Generation5.HAXORUS),
    CUBCHOO(Generation5.CUBCHOO),
    BEARTIC(Generation5.BEARTIC),
    CRYOGONAL(Generation5.CRYOGONAL),
    SHELMET(Generation5.SHELMET),
    ACCELGOR(Generation5.ACCELGOR),
    STUNFISK(Generation5.STUNFISK),
    MIENFOO(Generation5.MIENFOO),
    MIENSHAO(Generation5.MIENSHAO),
    DRUDDIGON(Generation5.DRUDDIGON),
    GOLETT(Generation5.GOLETT),
    GOLURK(Generation5.GOLURK),
    PAWNIARD(Generation5.PAWNIARD),
    BISHARP(Generation5.BISHARP),
    BOUFFALANT(Generation5.BOUFFALANT),
    RUFFLET(Generation5.RUFFLET),
    BRAVIARY(Generation5.BRAVIARY),
    VULLABY(Generation5.VULLABY),
    MANDIBUZZ(Generation5.MANDIBUZZ),
    HEATMOR(Generation5.HEATMOR),
    DURANT(Generation5.DURANT),
    DEINO(Generation5.DEINO),
    ZWEILOUS(Generation5.ZWEILOUS),
    HYDREIGON(Generation5.HYDREIGON),
    LARVESTA(Generation5.LARVESTA),
    VOLCARONA(Generation5.VOLCARONA),
    COBALION(Generation5.COBALION),
    TERRAKION(Generation5.TERRAKION),
    VIRIZION(Generation5.VIRIZION),
    TORNADUS_INCARNATE(Generation5.TORNADUS_INCARNATE),
    TORNADUS_THERIAN(Generation5.TORNADUS_THERIAN),
    THUNDURUS_INCARNATE(Generation5.THUNDURUS_INCARNATE),
    THUNDURUS_THERIAN(Generation5.THUNDURUS_THERIAN),
    RESHIRAM(Generation5.RESHIRAM),
    ZEKROM(Generation5.ZEKROM),
    LANDORUS_INCARNATE(Generation5.LANDORUS_INCARNATE),
    LANDORUS_THERIAN(Generation5.LANDORUS_THERIAN),
    KYUREM(Generation5.KYUREM),
    KYUREM_BLACK(Generation5.KYUREM_BLACK),
    KYUREM_WHITE(Generation5.KYUREM_WHITE),
    KELDEO(Generation5.KELDEO),
    KELDEO_RESOLUTE(Generation5.KELDEO_RESOLUTE),
    MELOETTA_ARIA(Generation5.MELOETTA_ARIA),
    MELOETTA_PIROUETTE(Generation5.MELOETTA_PIROUETTE),
    GENESECT(Generation5.GENESECT);*/



    Species(Generation1 g) {
        EVOLUTION = null;
        HP = g.getHP();
        NAME = g.getName();
        NAT_DEX_NUMBER = g.getDexNumber();
        TYPE = g.getType();
        IMG = g.getImg();
    }

    Species(Generation2 g) {
        EVOLUTION = null;
        HP = g.getHP();
        NAME = g.getName();
        NAT_DEX_NUMBER = g.getDexNumber();
        TYPE = g.getType();
        IMG = g.getImg();
    }

    Species(Generation3 g) {
        EVOLUTION = null;
        HP = g.getHP();
        NAME = g.getName();
        NAT_DEX_NUMBER = g.getDexNumber();
        TYPE = g.getType();
        IMG = g.getImg();
    }

    /*Species(Generation4 g) {
        EVOLUTION = null;
        HP = g.getHP();
        NAME = g.getName();
        NAT_DEX_NUMBER = g.getDexNumber();
        TYPE = g.getType();
        IMG = g.getImg();
    }

    Species(Generation5 g) {
        EVOLUTION = null;
        HP = g.getHP();
        NAME = g.getName();
        NAT_DEX_NUMBER = g.getDexNumber();
        TYPE = g.getType();
        IMG = g.getImg();
    }*/

    private final Species[] EVOLUTION;
    private final int HP;
    private final Type[] TYPE;
    private final String NAME, NAT_DEX_NUMBER;
    private ImageIcon IMG;
    public boolean hasEvolutions() {
        return EVOLUTION != null;
    }

    public String getDexNumber()
    {
        return NAT_DEX_NUMBER;
    }


    public String getName()
    {
        return NAME;
    }

    public int getHP(){
        return HP;
    }

    public Type[] getType()
    {
        return TYPE;
    }

    public ImageIcon getImg(){
        return IMG;
    }
}
