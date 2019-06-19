package com.example.zadatak15.providers;

import com.example.zadatak15.models.Sastojci;

import java.util.ArrayList;
import java.util.List;

public class SastojciProvider {
    public static List<String> getSastojciNames() {
        List<String> names = new ArrayList<>();
        names.add("Meso");
        names.add("Zelena salata");
        names.add("Krem");
        return names;
    }

    public static List<Sastojci> getSastojci() {

        List<Sastojci> sastojci = new ArrayList<>();
        sastojci.add(new Sastojci(0, "Mleveno meso", "Lepinja"));
        sastojci.add(new Sastojci(1, "Zelena salata", "Nesto"));
        sastojci.add(new Sastojci(2, "Nutela", "Krem"));
        return sastojci;
    }
    public static Sastojci getSastojciById(int id) {
        switch (id) {
            case 0:
                return new Sastojci(0, "Mleveno meso", "Lepinja");
            case 1:
                return new Sastojci(1, "Zelena salata", "Nesto");
            case 2:
                return new Sastojci(2, "Nutela", "Krem");
            default:
                return null;
        }
    }
}
