package ch.hegarc.ig.business;

import ch.hegarc.ig.jackson.DataBinding.JacksonReader;

import java.io.IOException;
import java.util.*;

public class Partie {
    //Utilisation d'une HashMap pour simplifier le contrôle de la carte
    //On évite d'itérer sur toute les cartes pour pointer sur la bonne
    private static HashMap<String, Carte> carteHashMap = new HashMap<>();
    private static List<Integer> listeNumeros = new ArrayList<>();

    public void lancerPartie() throws IOException {

        //Jackson reader
        JacksonReader.creationCartes();

    }

    public static void controlerCarte(String idCarte){
        int tempControle = 0;
        //Algo de comparaison
        try{
            for(int[] ligne : carteHashMap.get(idCarte).getLignes()) { // Parcours chaque ligne de la carte
                if (isLigneOK(ligne)) {
                    tempControle++;
                }
            }

            switch (tempControle) {
                case 0 :
                    System.out.println("Rien.");
                    break;
                case 1 :
                    System.out.println("Quine validée.");
                    break;
                case 2 :
                    System.out.println("Double-quine validée.");
                    break;
                case 3 :
                    System.out.println("Carton validé.");
                    break;
            }
        }catch (Exception e){
            System.out.println("id carte non valide");
        }
    }

    private static boolean isLigneOK(int[] ligne) {
        int tempLigne = 0;
        for(int i = 0; i < ligne.length; i++){ // Parcours chaque numéro d'un tableau ligne
            for(int j = 0; j < listeNumeros.size(); j++) {
                if (ligne[i] == listeNumeros.get(j)) {
                    tempLigne++;
                    break;
                }
            }
        }
        if (tempLigne == 5) {
            return true;
        }
        else {
            return false;
        }
    }

    public static List<Integer> getListeNumeros() {
        return listeNumeros;
    }

    public static HashMap<String, Carte> getCarteHashMap() {
        return carteHashMap;
    }

}