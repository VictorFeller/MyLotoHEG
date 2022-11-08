package ch.hegarc.ig;

import java.util.ArrayList;

public class Partie {
    //TODO map contenant toutes les cartes

    public void initPartie(){
        //Initialiser les cartes
        Carte carte1 = new Carte();

        int[] ligne1 = {1,2,3,4,5};
        int[] ligne2 = {10,12,13,14,15};
        int[] ligne3 = {12,22,32,42,52};

        ArrayList<int[]> lignes = new ArrayList();
        lignes.set(0, ligne1);
        lignes.set(1, ligne2);
        lignes.set(2, ligne3);

        carte1.setList(lignes);

        for(int[] tab : carte1.getList()){
            System.out.println(tab);
        }
    }


}
