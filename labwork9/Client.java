package com.lab111.labwork9;

public class Client {
    public static void main(String[] args) {
        ApiFactory winapifactory = new WinAPIFactory();
        ApiFactory gtkffactory = new GTKFactory();

        Button winapibutton = winapifactory.getButton();
        Button gtkbutton = gtkffactory.getButton();

        winapibutton.click();
        gtkbutton.click();
    }
}
