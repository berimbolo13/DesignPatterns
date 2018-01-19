package com.lab111.labwork9;

public class GTKSlider implements Slider {
    @Override
    public void slide(int value) {
        if (value < 0) {
            System.out.println("Слайд влево в GTK");
        } else if (value > 0) {
            System.out.println("Слайд вправо в GTK");
        } else {
            System.out.println("Клик по слайдеру в GTK");
        }
    }
}
