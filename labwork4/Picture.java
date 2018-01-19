package com.lab111.labwork4;

/**
 * @author dima_
 * Facade class
 */
public class Picture {
    private RasterImage image;
    private Line topLine;
    private Line rightLine;
    private Line downLine;
    private Line leftLine;

    /**
     *
     * @param startX
     * @param startY
     * @param finishX
     * @param finishY
     */
    public Picture(int startX, int startY, int finishX, int finishY) {
        this.image = new RasterImage(startX, startY, finishX, finishY);

        this.topLine = new Line(image.getStartX() - 1,
                image.getStartY() + 1,
                image.getFinishX() + 1,
                image.getStartY() + 1);

        this.leftLine = new Line(image.getStartX() - 1,
                image.getStartY(),
                image.getStartX() - 1,
                image.getFinishY());

        this.downLine = new Line(image.getStartX() - 1,
                image.getFinishY() - 1,
                image.getFinishX() + 1,
                image.getFinishY() -1);

        this.rightLine = new Line(image.getFinishX() + 1,
                image.getStartY(),
                image.getFinishX() + 1,
                image.getFinishY());
    }

    /**
     *
     * @param vis
     */
    public void show(boolean vis) {
        if (vis) {
            this.image.setTransparency(0);
            this.topLine.setOpacity(1);
            this.rightLine.setOpacity(1);
            this.leftLine.setOpacity(1);
            this.downLine.setOpacity(1);
        } else {
            this.image.setTransparency(1);
            this.topLine.setOpacity(0);
            this.rightLine.setOpacity(0);
            this.leftLine.setOpacity(0);
            this.downLine.setOpacity(0);
        }
    }

    /**
     *
     * @param type of border
     */
    public void setBorderType(String type) {
        switch(type) {
            case "horizontal":
                this.topLine.setOpacity(1);
                this.rightLine.setOpacity(0);
                this.leftLine.setOpacity(0);
                this.downLine.setOpacity(1);
                break;
            case "vertical":
                this.topLine.setOpacity(0);
                this.rightLine.setOpacity(1);
                this.leftLine.setOpacity(1);
                this.downLine.setOpacity(0);
                break;
            case "left":
                this.topLine.setOpacity(0);
                this.rightLine.setOpacity(0);
                this.leftLine.setOpacity(1);
                this.downLine.setOpacity(0);
                break;
            case "right":
                this.topLine.setOpacity(0);
                this.rightLine.setOpacity(1);
                this.leftLine.setOpacity(0);
                this.downLine.setOpacity(0);
                break;
            case "full":
                this.topLine.setOpacity(1);
                this.rightLine.setOpacity(1);
                this.leftLine.setOpacity(1);
                this.downLine.setOpacity(1);
                break;
            default:
                this.topLine.setOpacity(0);
                this.rightLine.setOpacity(0);
                this.leftLine.setOpacity(0);
                this.downLine.setOpacity(0);
                break;
        }
    }

    /**
     * draw Picture
     */
    void draw() {
        System.out.println("Рисование картины...");
        System.out.println("RasterImage with transparency = " + this.image.getTransparency());
        System.out.println("TopLine with opacity = " + this.topLine.getOpacity());
        System.out.println("RightLine with opacity = " + this.rightLine.getOpacity());
        System.out.println("DownLine with opacity = " + this.downLine.getOpacity());
        System.out.println("LeftLine with opacity = " + this.leftLine.getOpacity());
        System.out.println();
    }
}
