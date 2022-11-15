package ch.hegarc.ig;

import ch.hegarc.ig.business.Partie;
import ch.hegarc.ig.util.Console;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        new Console().runCommand();
        new Partie().initPartie();
    }
}