package be.intecbrussel.splitinterfaces;

public class ExpandableRectangle implements Upscalable{
    private int length;
    private int width;

    public ExpandableRectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }


    public void scaleUp() {
        System.out.println("BIGGER");
    }


}
