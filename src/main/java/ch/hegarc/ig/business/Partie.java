package ch.hegarc.ig.business;

import ch.hegarc.ig.jackson.DataBinding.JacksonReader;

import java.io.IOException;
import java.util.*;

public class Partie {
    //Utilisation d'une HashMap pour simplifier le contrôle de la carte
    //On évite d'itérer sur toute les cartes pour pointer sur la bonne
    private static HashMap<String, Carte> carteHashMap;
    public static List<Integer> listeNumeros = new ArrayList<>();

    public void initPartie() throws IOException {

        //Jackson reader
        carteHashMap = JacksonReader.creationCartes();

        //Affiche le contenu des cartes
        // Iterating HashMap through for loop
        for (Map.Entry<String, Carte> set : carteHashMap.entrySet()) {
            // Printing all elements of a Map
            System.out.println(set.getKey() + " : ");
            for(int[] ligne : set.getValue().getLignes()){
                    for(int i = 0; i < ligne.length; i++){
                        System.out.print(ligne[i] + " ");
                    }
                    System.out.println();
                }
        }

        //Affiche le contenu d'une carte spécifique
        System.out.println("Affiche B5");
        for(int[] ligne : carteHashMap.get("B5").getLignes()){
            for(int i = 0; i < ligne.length; i++){
                System.out.print(ligne[i] + " ");
            }
            System.out.println();
        }
    }

    public static void controlCarte(String idCarte){
        System.out.println("Control de la carte " + idCarte);

//        for(Carte carte : cartesList){
//            if(carte.getId().equals(idCarte)) {
//                //Algo de comparaison
//                System.out.println();
//                for(int[] ligne : carte.getLignes()){
//                    for(int i = 0; i < ligne.length; i++){
//                        System.out.print(ligne[i] + " ");
//                    }
//                    System.out.println();
//                }
//            }
//        }
    }

//    public List<Carte> getCartesList() {
//        return cartesList;
//    }
//
//    public void setCartesList(List<Carte> cartesList) {
//        this.cartesList = cartesList;
//    }

    public List<Integer> getListeNumeros() {
        return listeNumeros;
    }

    public void setListeNumeros(List<Integer> listeNumeros) {
        this.listeNumeros = listeNumeros;
    }
}
