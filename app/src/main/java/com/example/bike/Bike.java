package com.example.bike;

public class Bike {
    private String name;
    private String recipe;

    public static final Bike[] bikes = {
            new Bike("TRASA 1 - MALTA", "Składniki: 40 ml wódki  10 ml soku z cytryny  120 ml soku pomidorowego  sos worchestershire sól pieprz tabasco gałązka selera naciowego Sposób przygotowania:  Wszystkie składniki wymieszać w szklance z lodem i ozdobić selerem naciowym"),
            new Bike("TRASA 2 - CENTRUM", "Składniki: 40 ml wódki  10 ml soku z cytryny  120 ml soku pomidorowego  sos worchestershire sól pieprz tabasco gałązka selera naciowego Sposób przygotowania:  Wszystkie składniki wymieszać w szklance z lodem i ozdobić selerem naciowym"),
            new Bike("TRASA 2 - CENTRUM", "Składniki: 40 ml wódki  10 ml soku z cytryny  120 ml soku pomidorowego  sos worchestershire sól pieprz tabasco gałązka selera naciowego Sposób przygotowania:  Wszystkie składniki wymieszać w szklance z lodem i ozdobić selerem naciowym"),
            new Bike("TRASA 2 - CENTRUM", "Składniki: 40 ml wódki  10 ml soku z cytryny  120 ml soku pomidorowego  sos worchestershire sól pieprz tabasco gałązka selera naciowego Sposób przygotowania:  Wszystkie składniki wymieszać w szklance z lodem i ozdobić selerem naciowym"),
            new Bike("TRASA 2 - CENTRUM", "Składniki: 40 ml wódki  10 ml soku z cytryny  120 ml soku pomidorowego  sos worchestershire sól pieprz tabasco gałązka selera naciowego Sposób przygotowania:  Wszystkie składniki wymieszać w szklance z lodem i ozdobić selerem naciowym"),
            new Bike("TRASA 2 - CENTRUM", "Składniki: 40 ml wódki  10 ml soku z cytryny  120 ml soku pomidorowego  sos worchestershire sól pieprz tabasco gałązka selera naciowego Sposób przygotowania:  Wszystkie składniki wymieszać w szklance z lodem i ozdobić selerem naciowym"),
            new Bike("TRASA 2 - CENTRUM", "Składniki: 40 ml wódki  10 ml soku z cytryny  120 ml soku pomidorowego  sos worchestershire sól pieprz tabasco gałązka selera naciowego Sposób przygotowania:  Wszystkie składniki wymieszać w szklance z lodem i ozdobić selerem naciowym"),
            new Bike("TRASA 2 - CENTRUM", "Składniki: 40 ml wódki  10 ml soku z cytryny  120 ml soku pomidorowego  sos worchestershire sól pieprz tabasco gałązka selera naciowego Sposób przygotowania:  Wszystkie składniki wymieszać w szklance z lodem i ozdobić selerem naciowym"),
            new Bike("TRASA 2 - CENTRUM", "Składniki: 40 ml wódki  10 ml soku z cytryny  120 ml soku pomidorowego  sos worchestershire sól pieprz tabasco gałązka selera naciowego Sposób przygotowania:  Wszystkie składniki wymieszać w szklance z lodem i ozdobić selerem naciowym"),
            new Bike("TRASA 2 - CENTRUM", "Składniki: 40 ml wódki  10 ml soku z cytryny  120 ml soku pomidorowego  sos worchestershire sól pieprz tabasco gałązka selera naciowego Sposób przygotowania:  Wszystkie składniki wymieszać w szklance z lodem i ozdobić selerem naciowym"),
            new Bike("TRASA 2 - CENTRUM", "Składniki: 40 ml wódki  10 ml soku z cytryny  120 ml soku pomidorowego  sos worchestershire sól pieprz tabasco gałązka selera naciowego Sposób przygotowania:  Wszystkie składniki wymieszać w szklance z lodem i ozdobić selerem naciowym"),
            new Bike("TRASA 2 - CENTRUM", "Składniki: 40 ml wódki  10 ml soku z cytryny  120 ml soku pomidorowego  sos worchestershire sól pieprz tabasco gałązka selera naciowego Sposób przygotowania:  Wszystkie składniki wymieszać w szklance z lodem i ozdobić selerem naciowym"),
            new Bike("TRASA 2 - CENTRUM", "Składniki: 40 ml wódki  10 ml soku z cytryny  120 ml soku pomidorowego  sos worchestershire sól pieprz tabasco gałązka selera naciowego Sposób przygotowania:  Wszystkie składniki wymieszać w szklance z lodem i ozdobić selerem naciowym"),
            new Bike("TRASA 2 - CENTRUM", "Składniki: 40 ml wódki  10 ml soku z cytryny  120 ml soku pomidorowego  sos worchestershire sól pieprz tabasco gałązka selera naciowego Sposób przygotowania:  Wszystkie składniki wymieszać w szklance z lodem i ozdobić selerem naciowym"),
            new Bike("TRASA 2 - CENTRUM", "Składniki: 40 ml wódki  10 ml soku z cytryny  120 ml soku pomidorowego  sos worchestershire sól pieprz tabasco gałązka selera naciowego Sposób przygotowania:  Wszystkie składniki wymieszać w szklance z lodem i ozdobić selerem naciowym"),
            new Bike("TRASA 2 - CENTRUM", "Składniki: 40 ml wódki  10 ml soku z cytryny  120 ml soku pomidorowego  sos worchestershire sól pieprz tabasco gałązka selera naciowego Sposób przygotowania:  Wszystkie składniki wymieszać w szklance z lodem i ozdobić selerem naciowym"),
            new Bike("TRASA 2 - CENTRUM", "Składniki: 40 ml wódki  10 ml soku z cytryny  120 ml soku pomidorowego  sos worchestershire sól pieprz tabasco gałązka selera naciowego Sposób przygotowania:  Wszystkie składniki wymieszać w szklance z lodem i ozdobić selerem naciowym"),
            new Bike("TRASA 2 - CENTRUM", "Składniki: 40 ml wódki  10 ml soku z cytryny  120 ml soku pomidorowego  sos worchestershire sól pieprz tabasco gałązka selera naciowego Sposób przygotowania:  Wszystkie składniki wymieszać w szklance z lodem i ozdobić selerem naciowym"),
            new Bike("TRASA 2 - CENTRUM", "Składniki: 40 ml wódki  10 ml soku z cytryny  120 ml soku pomidorowego  sos worchestershire sól pieprz tabasco gałązka selera naciowego Sposób przygotowania:  Wszystkie składniki wymieszać w szklance z lodem i ozdobić selerem naciowym")
    };
    private Bike(String name, String recipe) {
        this.name = name;
        this.recipe = recipe;
    }
    public String getRecipe() {
        return recipe;
    }
    public String getName() {
        return name;
    }
    public String toString() {
        return this.name;
    }

}