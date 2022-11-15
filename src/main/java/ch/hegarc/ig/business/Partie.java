package ch.hegarc.ig.business;

import ch.hegarc.ig.jackson.DataBinding.JacksonReader;

import java.io.IOException;
import java.util.List;

public class Partie {
    private List<Carte> cartesList;

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
}
