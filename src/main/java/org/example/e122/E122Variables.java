package org.example.e122;

public class E122Variables {
    // Declare 3 instance variables: name of the countryName, capital, and populationSize
    String countryName;
    String capital;
    int populationSize;

    // Create a method to display values of instance variables

    public void display(){
        System.out.println("The capital of " + countryName + " is " + capital + " and population is " + populationSize);
    }



    public static void main(String[] args) {
        E122Variables country1 = new E122Variables();
        E122Variables country2 = new E122Variables();

        country1.countryName = "USA";
        country1.capital = "Washington DC";
        country1.populationSize = 330000000;

        country2.countryName = "Kazakhstan";
        country2.capital = "Astana";
        country2.populationSize = 18500000;

        country1.display();
        country2.display();
    }
}
