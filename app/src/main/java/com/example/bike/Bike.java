package com.example.bike;

public class Bike {
    private String name;
    private String recipe;
    private String date;
    private String time;

    public static final Bike[] bikes = {
            new Bike("TRASA 1 - MALTA", "Składniki: 40 ml wódki  10 ml soku z cytryny  120 ml soku pomidorowego  sos worchestershire sól pieprz tabasco gałązka selera naciowego Sposób przygotowania:  Wszystkie składniki wymieszać w szklance z lodem i ozdobić selerem naciowym","01-01-22", "21:04"),
            new Bike("TRASA 2 - CENTRUM", "Składniki: 40 ml wódki  10 ml soku z cytryny  120 ml soku pomidorowego  sos worchestershire sól pieprz tabasco gałązka selera naciowego Sposób przygotowania:  Wszystkie składniki wymieszać w szklance z lodem i ozdobić selerem naciowym","01-01-22", "21:04")

    };
    private Bike(String name, String recipe, String date, String time) {
        this.name = name;
        this.recipe = recipe;
        this.date = date;
        this.time = time;
    }
    public String getRecipe() {
        return recipe;
    }
    public String getName() {
        return name;
    }
    public String getDate() {
        return date;
    }
    public String getTime() {
        return time;
    }
    public String toString() {
        return this.name;
    }

}