package com.lab111.labwork9;

public class GTKScrollbar implements Scrollbar {
    @Override
    public void scroll(int value) {
        if (value < 0) {
            System.out.println("Скролл вверх в GTK");
        } else if (value > 0) {
            System.out.println("Скролл вниз в GTK");
        } else {
            System.out.println("Клик по скролу в GTK");
        }
    }
}
