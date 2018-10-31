package br.com.pattern.factory.solution;

public class Main {

    public static void main(String args[]){

        //TODO Based in the first args, you will get a new instance of a car;

        Car car = CarFactory.getCar(args[0]);

    }
}
