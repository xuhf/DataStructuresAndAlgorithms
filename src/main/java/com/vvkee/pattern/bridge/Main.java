package com.vvkee.pattern.bridge;

/**
 * Created by xuhaifei on 16/12/21.
 */
public class Main {

    public static void main(String[] args) {
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(100, 200, 20, new GreenCircle());
        redCircle.draw();
        greenCircle.draw();
    }

}
