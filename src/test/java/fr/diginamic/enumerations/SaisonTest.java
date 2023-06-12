package fr.diginamic.enumerations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SaisonTest {

    @Test
    public void testValueOfLibelle() {
        Saison printemps = Saison.valueOfLibelle("Printemps");
        Assertions.assertEquals(Saison.PRINTEMPS, printemps);

        Saison ete = Saison.valueOfLibelle("Été");
        Assertions.assertEquals(Saison.ETE, ete);

        Saison automne = Saison.valueOfLibelle("Automne");
        Assertions.assertEquals(Saison.AUTOMNE, automne);

        Saison hiver = Saison.valueOfLibelle("Hiver");
        Assertions.assertEquals(Saison.HIVER, hiver);
    }
}
