package br.com.pattern.strategy.solution;

public class MediumProduct extends ProductImpl implements Product {

    public MediumProduct(){
        super("MEDIUM");
    }

    @Override
    public Double calculateDelivery() {
        return this.getWeight() * 1.5;
    }
}
