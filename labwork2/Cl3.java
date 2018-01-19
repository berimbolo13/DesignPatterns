package com.lab111.labwork2;

/**
 * @author dima_
 * @version 1.0
 * @since 11-10-2017
 */
public class Cl3 implements If3{
    /**
     * @see com.lab111.labwork2.If2
     */
    private If2 if2;

    /**
     *
     * @return link on if2
     */
    public If2 getIf2() {
        return if2;
    }

    /**
     * set if2
     */
    public void setIf2(If2 if2) {
        this.if2 = if2;
    }

    @Override
    public void meth3() {
        System.out.println("Cl3.meth3()");
    }

    @Override
    public void meth2() {
        System.out.println("Cl3.meth3()");
    }
}
