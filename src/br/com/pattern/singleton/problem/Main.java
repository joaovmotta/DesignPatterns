package br.com.pattern.singleton.problem;

public class Main {

    public static void main(String args[]){

        Window window1 = new Window();
        window1.open();
        window1.close();

        Window window2 = new Window();
        window2.open();
        window2.close();
    }
}
