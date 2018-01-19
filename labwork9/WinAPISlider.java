package com.lab111.labwork9;

public class WinAPISlider implements Slider {
    @Override
    public void slide(int value) {
        if (value < 0) {
            System.out.println("Слайд влево в WinAPI");
        } else if (value > 0) {
            System.out.println("Слайд вправо в WinAPI");
        } else {
            System.out.println("Клик по слайдеру в WinAPI");
        }
    }
}
