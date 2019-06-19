package com.example.zadatak15.models;

public class Jelo {
    private int id;
    private String image;
    private String naziv;
    private String opis;
    private Sastojci sastojci;
    private double kalorije;
    private double cena;
    private float rating;
    private Category kategorija;

    public Jelo(){}

    public Jelo(int id,String image, String naziv, String opis, Sastojci sastojci, double kalorije, double cena, float rating, Category kategorija) {
        this.id = id;
        this.image = image;
        this.naziv = naziv;
        this.opis = opis;
        this.kategorija = kategorija;
        this.sastojci = sastojci;
        this.kalorije = kalorije;
        this.cena = cena;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public Category getKategorija() {
        return kategorija;
    }

    public void setKategorija(Category kategorija) {
        this.kategorija = kategorija;
    }

    public Sastojci getSastojci() {
        return sastojci;
    }

    public void setSastojci(Sastojci sastojci) {
        this.sastojci = sastojci;
    }

    public double getKalorije() {
        return kalorije;
    }

    public void setKalorije(double kalorije) {
        this.kalorije = kalorije;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Jelo{" +
                "id=" + id +
                ", image='" + image + '\'' +
                ", naziv='" + naziv + '\'' +
                ", opis='" + opis + '\'' +
                ", kategorija='" + kategorija + '\'' +
                ", sastojci='" + sastojci + '\'' +
                ", kalorije=" + kalorije +
                ", cena=" + cena +
                ", rating=" + rating +
                '}';
    }
}
