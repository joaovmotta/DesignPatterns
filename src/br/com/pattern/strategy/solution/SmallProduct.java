package br.com.pattern.strategy.solution;

public class SmallProduct extends ProductImpl implements Product {

    public SmallProduct() {
        super("SMALL");
    }

    @Override
    public Double calculateDelivery() {
        return this.getWeight() * 1.25;
    }

}
