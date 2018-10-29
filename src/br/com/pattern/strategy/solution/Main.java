package br.com.pattern.strategy.solution;

public class Main {

    public static void main(String... args){
        Product product = getProductType();

        System.out.println("The price to delivery this product is: " + getDeliveryPrice(product));
    }

    private static Product getProductType(){
        //TODO here you will get and instantiate your product type from payload or from args parameter (may you use the factory design to do it
        return null;
    }

    private static Double getDeliveryPrice(Product product){
        return product.calculateDelivery();
    }
}
