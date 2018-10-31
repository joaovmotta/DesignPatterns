package br.com.pattern.factory.problem;

import br.com.pattern.factory.solution.Mustang;
import br.com.pattern.factory.solution.Volvo;

public class Main {

    public static void main(String args[]){

        String carName = args[0];

        if(carName.equalsIgnoreCase("mustang")){
            new Mustang().run();
        }
        else if(carName.equalsIgnoreCase("volto")){
            new Volvo().run();
        }

        //TODO if in the future you need to add more cars here, you will need to add one condition and a new instance for each car
    }
}
