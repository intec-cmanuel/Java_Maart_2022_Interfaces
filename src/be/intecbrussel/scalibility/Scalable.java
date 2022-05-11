package be.intecbrussel.scalibility;

public interface Scalable {
    int DOUBLE = 100;
    int TRIPLE = 200;
    int QUADRUPLE = 300;
    int HALF = 50;
    int QUARTER = 75;

    // public abstract
    void scaleUp(int percentGrowth);
    void scaleDown(int percentGrowth);

    // public
    default void scaleDouble() {
        scaleUp(DOUBLE);
    }

    default void scaleHalf() {
        scaleDown(HALF);
    }

    // inherently public, can be private if specified
    static String getScalingFactors() {
        return "DOUBLE = 100" + " - " +
        "TRIPLE = 200"  + " - " +
        "QUADRUPLE = 300"  + " - " +
        "HALF = 50"  + " - " +
        "QUARTER = 75";
    }
}
