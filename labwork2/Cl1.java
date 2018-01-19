package com.lab111.labwork2;

/**
 * @author dima_
 * @since  11.10.2017
 * @version 1.0
 * @see com.lab111.labwork2.Cl2
 */
public class Cl1 extends Cl2 implements If1 {
    /**
     * link on Cl3
     */
    private Cl3 cl3;

    /**
     * @return return cl3
     */
    public Cl3 getCl3() {
        return cl3;
    }

    /**
     * making cl3
     */
    public void setCl3(Cl3 cl3) {
        this.cl3 = cl3;
    }

    @Override
    public void meth1() {
        System.out.println("Cl1.meth1()");
    }

    @Override
    public void meth3() {
        System.out.println("Cl1.meth2()");
    }

    @Override
    public void meth2() {
        System.out.println("Cl1.meth3()");
    }
}
