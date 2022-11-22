package ch.hegarc.ig;

import ch.hegarc.ig.business.Partie;
import ch.hegarc.ig.util.Console;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        //Init la partie avant d'entrer les commandes sinon on est bloqué par la while()
        new Partie().lancerPartie();
        new Console().executerCommande();
    }
}