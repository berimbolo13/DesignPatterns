package com.lab111.labwork8;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dima_
 * @version 1.0
 * Composite class
 */
public class Catalog implements Component {
    private String name;
    Catalog(String name){
        this.name = name;
    }
    /**
     * List with all catalog components
     */
    private List<Component> components = new ArrayList<>();

    /**
     *
     * @param component is catalog or file
     * add component to list
     */
    public void addComponent(Component component) {
        components.add(component);
    }

    /**
     *
     * @param component is catalog or file
     * remove component from list
     */
    public void removeComponent(Component component) {
        components.remove(component);
    }

    @Override
    public boolean isCatalog() {
        return true;
    }

    /**
     *
     * @return size of catalog
     */
    @Override
    public int getSize() {
        int size = 0;
        for (Component component : components) {
            size += component.getSize();
        }
        return size;
    }

    @Override
    public Component copy(int depth) {
        Catalog catalog = new Catalog(name);
        for (Component component : components) {
            if (depth == 1 && component.isCatalog()) {
                continue;
            } else {
                int i = depth;
                catalog.components.add(component.copy(--i));
            }
        }
        return catalog;
    }

    @Override
    public Component copy() {
        Catalog catalog = new Catalog(name);
        for (Component component : components) {
            catalog.components.add(component.copy());
        }
        return catalog;
    }

    @Override
    public String toString() {
        return "Catalog{" +
                "name='" + name + '\'' +
                ", components=" + components +
                ", size=" + this.getSize() +
                '}';
    }
}
