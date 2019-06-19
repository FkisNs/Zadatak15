package com.example.zadatak15.providers;

import com.example.zadatak15.models.Category;
import com.example.zadatak15.models.Jelo;
import com.example.zadatak15.models.Sastojci;

import java.util.ArrayList;
import java.util.List;

public class JeloProvider {

 /*  public static List<Jelo> getJelos() {
        Category glavnoJelo = new Category(0, "Glavno jelo");
        Category prilog = new Category(1, "Prilog");
        Category dezert = new Category(2, "Dezert");

        List<Jelo>jeloList = new ArrayList<>();
        jeloList.add(new Jelo(0,"pljeskavica-u-lepinji.jpg","Pljeskavica","Pljeskavica ko pljeskavica", "meso",204.1,200,4.5f,glavnoJelo));
        jeloList.add(new Jelo(1,"Salata-cvekla.jpg","Salata sa cveklom","Salata","cvekla i zelena salata",54.1,100,3.0f,prilog));
        jeloList.add(new Jelo(2,"Palachinke.jpg","Palacinka","Palacinka ko palacinka","Palacinka sa slatkim",104.1,150,4.0f, dezert));
        return jeloList;
    } */
    public static List<String> getJeloNames() {

        List<String> names = new ArrayList<>();
        names.add("Pljeskavica");
        names.add("Salata sa cveklom");
        names.add("Palacinka");
        return names;
    }
    public static Jelo getJeloById(int id) {

        Category glavnoJelo = new Category(0, "Glavno jelo");
        Category prilog = new Category(1, "Prilog");
        Category dezert = new Category(2, "Dezert");

        Sastojci meso = new Sastojci(0,"Mleveno meso","Lepinja");
        Sastojci zelenaSalata = new Sastojci(1,"Zelena salata","Nesto");
        Sastojci palacinka = new Sastojci(2,"Nutela","Krem");

        switch (id) {
            case 0:
                return new Jelo(0,"pljeskavica-u-lepinji.jpg","Pljeskavica","Pljeskavica ko pljeskavica", meso,204.1,200,4.5f,glavnoJelo);
            case 1:
                return new Jelo(1,"Salata-cvekla.jpg","Salata sa cveklom","Salata",zelenaSalata,54.1,100,3.0f,prilog);
            case 2:
                return new Jelo(2,"Palachinke.jpg","Palacinka","Palacinka ko palacinka",palacinka,104.1,150,4.0f, dezert);
            default:
                return null;
        }
    }
}
