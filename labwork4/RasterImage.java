package com.lab111.labwork4;

/**
 * @author dima_
 */
public class RasterImage {
    private int startX, startY, finishX, finishY;
    private double transparency = 0;

    /**
     *
     * @param startX
     * @param startY
     * @param finishX
     * @param finishY
     */
    public RasterImage(int startX, int startY, int finishX, int finishY) {
        this.startX = startX;
        this.startY = startY;
        this.finishX = finishX;
        this.finishY = finishY;
    }

    /**
     *
     * @param tr transparency
     */
    public void setTransparency (double tr) {
        this.transparency = tr;
    }

    public int getStartX() {
        return startX;
    }

    public int getStartY() {
        return startY;
    }

    public int getFinishX() {
        return finishX;
    }

    public int getFinishY() {
        return finishY;
    }

    /**
     *
     * @return transparency
     */
    public double getTransparency() {
        return transparency;
    }
}
