package com.lab111.labwork8;

/**
 * @author dima_
 * @version 1.0
 * Leaf class
 */
public class File implements Component {
    private String name;
    /**
     * size of File
     */
    private int size;

    /**
     * Constructor for File
     * @param size of File
     */
    File(int size, String name){
        this.size = size;
        this.name = name;
    }

    @Override
    public boolean isCatalog() {
        return false;
    }

    /**
     *
     * @return size of file
     */
    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public Component copy(int depth) {
        Component copy = new File(size, name);
        return copy;
    }

    @Override
    public Component copy() {
        Component copy = new File(size, name);
        return copy;
    }

    @Override
    public void addComponent(Component component) {
        System.out.println("Данный объект не является каталогом");
    }

    @Override
    public void removeComponent(Component component) {
        System.out.println("Данный объект не является каталогом");
    }

    @Override
    public String toString() {
        return "File{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}
