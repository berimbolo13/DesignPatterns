package com.lab111.labwork8;

/**
 * @author dima_
 * @version 1.0
 * Component interface
 */
public interface Component {
    /**
     *
     * @return size of object
     */
    boolean isCatalog();
    int getSize();
    void addComponent(Component component);
    void removeComponent(Component component);
    Component copy(int depth);
    Component copy();
}
