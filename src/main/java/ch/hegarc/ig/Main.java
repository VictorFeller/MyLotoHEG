package ch.hegarc.ig;

import ch.hegarc.ig.business.Partie;
import ch.hegarc.ig.util.Console;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        new Console().runCommand();
        new Partie().initPartie();


        //Alimenter la Partie.listNumeros
        Partie.listeNumeros.add(17);
        Partie.listeNumeros.add(21);
        Partie.listeNumeros.add(32);
        Partie.listeNumeros.add(58);
        Partie.listeNumeros.add(77);

        Partie.controlCarte("B5");
    }
}