package br.com.pattern.singleton.solution;

final class Window {

    private static Window WINDOW_INSTANCE;


    //Private constructor for only instantiate this class by getWindowInstance method.
    private Window(){};

    static Window getWindowInstance(){

        return WINDOW_INSTANCE == null ? new Window() : WINDOW_INSTANCE;
    }

    void open(){}

    void close(){}
}
