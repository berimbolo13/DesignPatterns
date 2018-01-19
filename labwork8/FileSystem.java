package com.lab111.labwork8;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dima_
 * @version 1.0
 * FileSystem class
 */
public class FileSystem {
    /**
     * List with all filesystem’s components
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
}
