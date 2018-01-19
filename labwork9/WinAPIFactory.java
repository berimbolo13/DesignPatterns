package com.lab111.labwork9;

public class WinAPIFactory implements ApiFactory{

    @Override
    public Button getButton() {
        return new WinAPIButton();
    }

    @Override
    public Scrollbar getScrollbar() {
        return new WinAPIScrollbar();
    }

    @Override
    public Slider getSlider() {
        return new WinAPISlider();
    }
}
