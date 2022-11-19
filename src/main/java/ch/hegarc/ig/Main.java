package ch.hegarc.ig;

import ch.hegarc.ig.business.Partie;
import ch.hegarc.ig.util.Console;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        //Init la partie avant d'entrer les commandes sinon on est bloqué par la while()
        new Partie().initPartie();
        new Console().runCommand();

//        //Alimenter la Partie.listNumeros
//        Partie.listeNumeros.add(77);
//        Partie.listeNumeros.add(99);
//        Partie.listeNumeros.add(48);
//        Partie.listeNumeros.add(16);
//        Partie.listeNumeros.add(10);
//        Partie.listeNumeros.add(26);
//        Partie.listeNumeros.add(7);
//        Partie.listeNumeros.add(61);
//        Partie.listeNumeros.add(58);
//        Partie.listeNumeros.add(17);
//        Partie.listeNumeros.add(32);
//        Partie.listeNumeros.add(37);
//        Partie.listeNumeros.add(41);
//        Partie.listeNumeros.add(65);
//        Partie.listeNumeros.add(80);
//        Partie.listeNumeros.add(21);
//        Partie.listeNumeros.add(53);
//        Partie.listeNumeros.add(1);
//
        System.out.println("Liste num");
        System.out.println(Partie.listeNumeros);
//
//        Partie.controlCarte("B5");

    }
}