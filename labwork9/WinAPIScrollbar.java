package com.lab111.labwork9;

public class WinAPIScrollbar implements Scrollbar{
    @Override
    public void scroll(int value) {
        if (value < 0) {
            System.out.println("Скролл вверх в WinAPI");
        } else if (value > 0) {
            System.out.println("Скролл вниз в WinAPI");
        } else {
            System.out.println("Клик по скролу в WinAPI");
        }
    }
}
