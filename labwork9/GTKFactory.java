package com.lab111.labwork9;

public class GTKFactory implements ApiFactory{
    @Override
    public Button getButton() {
        return new GTKButton();
    }

    @Override
    public Scrollbar getScrollbar() {
        return new GTKScrollbar();
    }

    @Override
    public Slider getSlider() {
        return new GTKSlider();
    }
}
