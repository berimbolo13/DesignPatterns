package com.lab111.labwork4;

/**
 * @author dima_
 * @version 1.0
 */
public class Client {
    public static void main(String[] args) {
        Picture picture = new Picture(1, 4, 5, 2);
        picture.draw();

        picture.show(false);
        picture.draw();

        picture.show(true);
        picture.draw();

        picture.setBorderType("horizontal");
        picture.draw();
    }
}
