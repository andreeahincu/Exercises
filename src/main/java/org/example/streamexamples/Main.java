package org.example.streamexamples;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    // Create a list of cities with name and temperature for each city
    private static List<City> prepareTemperature(){
        List<City> cities = new ArrayList<>();
        cities.add(new City("New Delhi", 33.5));
        cities.add(new City("Mexico", 14));
        cities.add(new City("New York", 13));
        cities.add(new City("Dubai", 43));
        cities.add(new City("London", 15));
        cities.add(new City("Alaska", 1));
        cities.add(new City("Kolkata", 30));
        cities.add(new City("Sydney", 11));
        cities.add(new City("Mexico", 14));
        cities.add(new City("Dubai", 43));
        return cities;
    }
    public static void main(String[] args) {
       List<String> warmCities =  prepareTemperature().stream()
                .filter(f -> f.getTemperature() > 10)
                .map(f -> f.getName())
                .collect(Collectors.toList());

       Set<String> warmCities2 = prepareTemperature().stream()
                       .filter(f -> f.getTemperature() > 10)
                               .map(f -> f.getName())
                                       .collect(Collectors.toSet());
        System.out.println(warmCities);
        System.out.println(warmCities2);
    }
}
