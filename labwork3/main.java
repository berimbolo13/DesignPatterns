package com.lab111.labwork3;

class main {
    public static void main(String[] args) {
        FileSystem fileSystem = new FileSystem();

        Component catalog1 = new Catalog();
        fileSystem.addComponent(catalog1);

        System.out.println(catalog1.getSize());

        Component file1 = new File(3);
        Component catalog2 = new Catalog();
        Component file2 = new File(2);
        catalog1.addComponent(file1);

        System.out.println(catalog1.getSize());

        catalog1.addComponent(catalog2);
        catalog2.addComponent(file2);

        System.out.println(catalog1.getSize());

        catalog1.removeComponent(catalog2);

        System.out.println(file2.getSize());
    }
}
