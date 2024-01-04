package org.example.streamexamples;

public class City {
    // properties of the City class
    private String name;
    private double temperature;

    // Parameterized constructor
    public City(String name, double temperature){
        this.name = name;
        this.temperature = temperature;
    }

    // Getters
    public String getName(){
        return name;
    }
    public double getTemperature(){
        return temperature;
    }

    // Setters
    public void setName(String name){
        this.name = name;
    }
    public void setTemperature(double temperature){
        this.temperature = temperature;
    }

    // Overriding the toString method to return name and temperature
    @Override
    public String toString(){
        return name + "-->" + temperature;
    }
}
