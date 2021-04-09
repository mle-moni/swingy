package fr.mle_moni;

import org.junit.Test;

import fr.mle_moni.helpers.NameGenerator;

public class AppTest {

    @Test
    public void randomVilainsNames() {
        for (int i = 0; i < 10; i++) {
            System.out.println(NameGenerator.generateVilainName());
        }
    }

    @Test
    public void randomWeaponsNames() {
        for (int i = 0; i < 10; i++) {
            System.out.println(NameGenerator.generateWeaponName());
        }
    }
}
