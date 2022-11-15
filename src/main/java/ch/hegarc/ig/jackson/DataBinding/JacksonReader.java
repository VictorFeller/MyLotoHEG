package ch.hegarc.ig.jackson.DataBinding;

import ch.hegarc.ig.business.Carte;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JacksonReader {

    private static ArrayList<Carte> carteList;

    // new methode
    public static ArrayList<Carte> creationCartes() throws IOException {
        try {

            ObjectMapper om = new ObjectMapper();

            TypeFactory typeFactory = om.getTypeFactory();

            carteList = om.readValue(new File("data.json"), typeFactory.constructCollectionType(List.class, Carte.class));

            for(Carte carte : carteList) {
                System.out.println("Création de la carte : " + carte.getId());
            }

        } catch (IOException ex) {
            throw new IOException("Erreur à la lecture du json " + ex);
        }

        return carteList;
    }
}