package com.lab111.labwork4;

/**
 * @author dima_
 */
public class Line {
    private int startX, startY, finishX, finishY;
    private double opacity = 1;

    /**
     *
     * @param startX
     * @param startY
     * @param finishX
     * @param finishY
     */
    public Line(int startX, int startY, int finishX, int finishY) {
        this.startX = startX;
        this.startY = startY;
        this.finishX = finishX;
        this.finishY = finishY;
    }

    /**
     *
     * @param op opacity
     */
    public void setOpacity(double op) {
        this.opacity = op;
    }

    /**
     *
     * @return opacity
     */
    public double getOpacity() {
        return opacity;
    }
}
