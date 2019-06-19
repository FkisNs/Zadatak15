package com.example.zadatak15.providers;

import com.example.zadatak15.models.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryProvider {
  /*  public static List<Category> getCategories() {

        List<Category> categories = new ArrayList<>();
        categories.add(new Category(0, "Glavno jelo"));
        categories.add(new Category(1, "Prilog"));
        categories.add(new Category(2, "Dezert"));
        return categories;
    } */
    public static List<String> getCategoryNames() {
        List<String> names = new ArrayList<>();
        names.add("Glavno jelo");
        names.add("Prilog");
        names.add("Dezert");
        return names;
    }
  /*  public static Category getCategoryById(int id) {
        switch (id) {
            case 0:
                return new Category(0, "Glavno jelo");
            case 1:
                return new Category(1, "Prilog");
            case 2:
                return new Category(2, "Dezert");
            default:
                return null;
        }
    }
    */
}
