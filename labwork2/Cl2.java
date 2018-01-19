package com.lab111.labwork2;

/**
 * @author dima_
 * @since  11.10.2017
 * @version 1.0
 */
public class Cl2 implements If2 {
    /**
     * @see com.lab111.labwork2.If3
     */
    private If3 if3;

    /**
     *
     * @return link on if3
     */
    public If3 getIf3() {
        return if3;
    }

    public void setIf3(If3 if3) {
        this.if3 = if3;
    }

    @Override
    public void meth2() {
        System.out.println("Cl2.meth2()");
    }
}
