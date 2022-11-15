package ch.hegarc.ig.business;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.ArrayList;
import java.util.List;

// Ignorer les propriétés inconnues
@JsonIgnoreProperties(ignoreUnknown = true)

// Ne pas inclure les propriétés null pour cette class
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Carte {
    private String id;
    private List<int[]> lignes = new ArrayList<>();

    public Carte(){
    }

    public Carte(String id, List<int[]> lignes) {
        this.id = id;
        this.lignes = lignes;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<int[]> getLignes() {
        return lignes;
    }

    public void setLignes(List<int[]> lignes) {
        this.lignes = lignes;
    }
}
