package ch.hegarc.ig.business;

import ch.hegarc.ig.jackson.DataBinding.JacksonReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Partie {
    private static List<Carte> cartesList;
    public static List<Integer> listeNumeros = new ArrayList<>();

    public void initPartie() throws IOException {

        //Jackson reader
        cartesList = JacksonReader.creationCartes();

        //Afficher le contenu des cartes
        for(Carte carte : cartesList){
            if(carte.getId().equals("B5")) {
                System.out.println();
                for(int[] ligne : carte.getLignes()){
                for(int i = 0; i < ligne.length; i++){
                    System.out.print(ligne[i] + " ");
                }
                    System.out.println();
            }
            }
        }
    }

    public static void controlCarte(String idCarte){
        System.out.println("Control de la carte " + idCarte);

        for(Carte carte : cartesList){
            if(carte.getId().equals(idCarte)) {
                //Algo de comparaison
                System.out.println();
                for(int[] ligne : carte.getLignes()){
                    for(int i = 0; i < ligne.length; i++){
                        System.out.print(ligne[i] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }

    public List<Carte> getCartesList() {
        return cartesList;
    }

    public void setCartesList(List<Carte> cartesList) {
        this.cartesList = cartesList;
    }

    public List<Integer> getListeNumeros() {
        return listeNumeros;
    }

    public void setListeNumeros(List<Integer> listeNumeros) {
        this.listeNumeros = listeNumeros;
    }
}
