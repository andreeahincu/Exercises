package org.example.streamexamples.housecourse01;

public class Couch {

    private String brand;
    private String color;
    private double size;
    private int weight;
    private int nrOfPeople;
    private boolean isConfy;
    public Couch(String brand, String color, double size){
        this.brand = brand;
        this.color = color;
        this.size = size;
        this.nrOfPeople=0;
        this.isConfy=true;
    }
    // Getters
    public String getBrand(){
        return brand;
    }
    public String getColor(){
        return color;
    }
    public double getSize(){
        return size;
    }
    public int getWeight(){
        return weight;
    }
    public int getNrOfPeople(){
        return nrOfPeople;
    }
    public boolean getIsConfy(){
        return isConfy;
    }

    // Setters
    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setSize(int size){
        this.size = size;
    }
    public void setNrOfPeople(int nrOfPeople){
        this.nrOfPeople = nrOfPeople;
    }
    public void setIsConfy(){
        this.isConfy = isConfy;
    }

    // Methods
    public void sitOnCouch(){
        if(nrOfPeople<=3){
            System.out.println("Please have a seat");
        } else{
            System.out.println("Sorry. There is not enough space on the couch");
        }
    }
    public void cleanCouch(){
        System.out.println("The couch is being cleaned");
    }
    public void foldOutBed(){
        System.out.println("The bed is being unfolded");
    }
    public double calculateShippingCost(int size){
        return 0.0789*size;
    }
    @Override
    public String toString(){
        return "Couch:" +
                "\nBrand: " + brand +
                "\nColor: " + color +
                "\nSize:  " + size +
                "\nNumber of people: " + nrOfPeople +
                "\nIs confortable: " + isConfy;
    }
}
