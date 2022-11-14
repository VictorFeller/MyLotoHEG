package ch.hegarc.ig;

import ch.hegarc.ig.business.Partie;

public class Main {
    public static void main(String[] args) {
        new Console().runCommand();
        new Partie().initPartie();
    }
}