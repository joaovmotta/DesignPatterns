package br.com.pattern.strategy.solution;

public class LargeProduct extends ProductImpl implements Product {

    public LargeProduct() {
        super("LARGE");
    }

    @Override
    public Double calculateDelivery() {
        return this.getWeight() * 1.75;
    }
}
