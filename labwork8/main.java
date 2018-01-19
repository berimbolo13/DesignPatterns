package com.lab111.labwork8;

class main {
    public static void main(String[] args) {
        FileSystem fileSystem = new FileSystem();

        Component catalog = new Catalog("catalog");
        fileSystem.addComponent(catalog);

        Component file1_1 = new File(4, "file1_1");
        Component catalog1_1 = new Catalog("catalog1_1");
        Component file1_2 = new File(2, "file1_2");
        catalog.addComponent(file1_1);
        catalog.addComponent(catalog1_1);
        catalog.addComponent(file1_2);

        Component file2_1 = new File(3, "file2_1");
        Component catalog2_1 = new Catalog("catalog2_1");
        Component catalog2_2 = new Catalog("catalog2_2");
        catalog1_1.addComponent(file2_1);
        catalog1_1.addComponent(catalog2_1);
        catalog1_1.addComponent(catalog2_2);

        Component file3_1 = new File(5, "file3_1");
        Component file3_2 = new File(1, "file3_2");
        catalog2_1.addComponent(file3_1);
        catalog2_2.addComponent(file3_2);

        Component fullCopyCatalog = catalog.copy();
        System.out.println("Размер с полной глубиной: " + fullCopyCatalog.getSize());

        Component firstlvlCopyCatalog = catalog.copy(1);
        System.out.println("Размер с глубиной 1: " + firstlvlCopyCatalog.getSize());

        Component secondlvlCopyCatalog = catalog.copy(2);
        System.out.println("Размер с глубиной 2: " + secondlvlCopyCatalog.getSize());

        Component thirdlvlCopyCatalog = catalog.copy(3);
        System.out.println("Размер с глубиной 3: " + thirdlvlCopyCatalog.getSize());

    }
}
