package com.lab111.labwork5;

public class Client {
    public static void main(String[] args) {
        Aggregate table1 = new Table();
        table1.addRecord(new Record("Dima", 20, "male", "Kiev"));
        table1.addRecord(new Record("Julia", 20, "female", "Lviv"));
        table1.addRecord(new Record("Ihor", 19, "male", "Kiev"));

        Iterator stIt = table1.getStraightIterator();
        Iterator bIt = table1.getBackIterator();
        stIt.setGenderFilter("male");
        bIt.setCityFilter("Lviv");

        while(bIt.hasNext()) {
            System.out.println(bIt.next());
        }


        stIt.tour();
        System.out.println();
        bIt.tour();
    }
}
