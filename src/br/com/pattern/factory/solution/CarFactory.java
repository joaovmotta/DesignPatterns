package br.com.pattern.factory.solution;

public class CarFactory {

    public static Car getCar(String name){

        if(name.equalsIgnoreCase("Mustang")){
            return new Mustang();
        }

        if(name.equalsIgnoreCase("Volvo")){
            return new Volvo();
        }

        return null;
    }
}
