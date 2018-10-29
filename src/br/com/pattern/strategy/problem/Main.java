package br.com.pattern.strategy.problem;

import br.com.pattern.strategy.solution.ProductImpl;

public class Main {

    public static void main(String... args){

        ProductImpl productImpl = null; //TODO suppose that here you got dynamically the product
        Double deliveryPrice;

        if(productImpl.getType().equals("LARGE")){
            deliveryPrice = productImpl.getWeight() * 1.75;
        }
        else if(productImpl.getType().equals("MEDIUM")){
            deliveryPrice = productImpl.getWeight() * 1.5;
        }else{
            deliveryPrice = productImpl.getWeight() * 1.25;
        }

        /*
        * For every new type of product you will need to add another condition
        * */

        System.out.println("The price to delivery the product is: " + deliveryPrice);
    }
}
