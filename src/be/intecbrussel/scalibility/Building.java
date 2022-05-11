package be.intecbrussel.scalibility;

public class Building implements Scalable{
    public int widthInBricks;
    public int heightInBricks;

    public Building(int widthInBricks, int heightInBricks) {
        this.widthInBricks = widthInBricks;
        this.heightInBricks = heightInBricks;
    }

    public int getWidthInBricks() {
        return widthInBricks;
    }

    public void setWidthInBricks(int widthInBricks) {
        this.widthInBricks = widthInBricks;
    }

    public int getHeightInBricks() {
        return heightInBricks;
    }

    public void setHeightInBricks(int heightInBricks) {
        this.heightInBricks = heightInBricks;
    }

    @Override
    public void scaleUp(int percentGrowth) {
        this.heightInBricks = this.heightInBricks + (this.heightInBricks*percentGrowth)/100;
        this.widthInBricks = this.widthInBricks + (this.widthInBricks*percentGrowth)/100;
    }

    @Override
    public void scaleDown(int percentGrowth) {
        this.heightInBricks = this.heightInBricks - (this.heightInBricks*percentGrowth)/100;
        this.widthInBricks = this.widthInBricks - (this.widthInBricks*percentGrowth)/100;
    }
}
