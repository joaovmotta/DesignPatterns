package br.com.pattern.factory.solution;

public class Mustang extends Car{

    @Override
    public void run() {
        this.speed+=3;
    }

    @Override
    public void brake() {
        this.speed-=3;
    }
}
