package ch.hegarc.ig.jackson.DataBinding;

import ch.hegarc.ig.business.Carte;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainReader {

    private static final Logger logger = Logger.getLogger(MainReader.class.getName());
    
    public static void main(String[] args) {
        try {

            // ObjectMapper - Ignorer les propriétés inconnues
            // TODO - Vérifier null pour écriture ou lecture ?
            ObjectMapper om = new ObjectMapper();//.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

            TypeFactory typeFactory = om.getTypeFactory();

            List<Carte> carteList = om.readValue(new File("data.json"), typeFactory.constructCollectionType(List.class, Carte.class));

            for(Carte carte : carteList) {
                logger.log(Level.INFO, carte.toString());
            }

        } catch (IOException ex) {
            logger.log(Level.SEVERE, null, ex);
        }
    }
}
