package br.com.pattern.builder.problem;

import br.com.pattern.builder.solution.Cake;

public class Main {

    public static void main(String args[]){

        Cake cake = new Cake();

        cake.setName("Birthday Cake");
        cake.setChocolate(Boolean.TRUE);
        cake.setStrawberry(Boolean.TRUE);
        cake.setSize(2D);
    }
}
