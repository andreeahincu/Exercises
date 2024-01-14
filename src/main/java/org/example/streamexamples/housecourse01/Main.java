package org.example.streamexamples.housecourse01;

public class Main {

    public static void main(String[] args){
        Couch couch1 = new Couch("Ador Mobila", "gray", 2.3 );
//        System.out.println(couch1.getBrand());
//        System.out.println(couch1.getColor());
//        System.out.println(couch1.getSize());
        couch1.cleanCouch();
        couch1.foldOutBed();
        couch1.toString();
    }
}
