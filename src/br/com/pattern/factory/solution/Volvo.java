package br.com.pattern.factory.solution;

public class Volvo extends Car{

    @Override
    public void run() {
        this.speed+=1;
    }

    @Override
    public void brake() {
        this.speed-=1;
    }
}
