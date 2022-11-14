package ch.hegarc.ig.business;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.ArrayList;

// Ignorer les propriétés inconnues
@JsonIgnoreProperties(ignoreUnknown = true)

// Ne pas inclure les propriétés null pour cette class
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Carte {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private ArrayList<int[]> list;

    public ArrayList<int[]> getList() {
        return list;
    }

    public void setList(ArrayList<int[]> list) {
        this.list = list;
    }
}
