package com.example.zadatak15.models;

import java.util.ArrayList;
import java.util.List;

public class Sastojci {
    private int id;
    private String prviS;
    private String drugiS;
    private List<Jelo> jeloList;

    public Sastojci() {
    }

    public Sastojci(int id, String prviS, String drugiS) {
        this.id = id;
        this.prviS = prviS;
        this.drugiS = drugiS;
        jeloList = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrviS() {
        return prviS;
    }

    public void setPrviS(String prviS) {
        this.prviS = prviS;
    }

    public String getDrugiS() {
        return drugiS;
    }

    public void setDrugiS(String drugiS) {
        this.drugiS = drugiS;
    }

    public List<Jelo> getJeloList() {
        return jeloList;
    }

    public void setJeloList(List<Jelo> jeloList) {
        this.jeloList = jeloList;
    }
    public void addJelo(Jelo jelo) {

        jeloList.add(jelo);
    }

    public void removeJelo(Jelo jelo) {

        jeloList.remove(jelo);
    }

    public Jelo getJelo(int position) {

        return jeloList.get(position);
    }
}
