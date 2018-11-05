package br.com.pattern.singleton.solution;

public class Main {

    public static void main(String args[]){

        Window.getWindowInstance().open();

        Window.getWindowInstance().close();
    }
}
