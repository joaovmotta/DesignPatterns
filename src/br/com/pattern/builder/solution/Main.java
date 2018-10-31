package br.com.pattern.builder.solution;

public class Main {

    public void main(String args[]){

        //TODO this way is easier to create a object

        Cake cake = new Cake.Builder().setName("Birthday Cake")
                                      .setSize(1D)
                                      .withChocolate(Boolean.TRUE)
                                      .withStrawberrys(Boolean.TRUE).build();
    }
}
