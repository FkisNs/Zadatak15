package com.example.zadatak15.models;

import java.util.ArrayList;
import java.util.List;

public class Category {

    private int id;
    private String naziv;
    private List<Jelo> jeloList;

    public Category(){

    }

    public Category(int id, String naziv) {
        this.id = id;
        this.naziv = naziv;

        jeloList = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
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
