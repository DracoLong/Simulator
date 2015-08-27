package entity;

/**
 * Created by Hongquan Long on 8/27/2015.
 */
public class Sensor {
    private static final int DEFAULT_INDEX = 0;
    private static final String DEFAULT_NAME = "FC";
    private int index;
    private String name;
    private double lowerBound;
    private double higherBound;
    private boolean isShort = true;
    private int[][] relevantPosition;

    public Sensor() {
        new Sensor(DEFAULT_INDEX, DEFAULT_NAME);
    }

    public Sensor(int index, String name) {
        new Sensor(index, name, true);
    }

    public Sensor(int index, String name, boolean isShort) {
        this.index = index;
        this.name = name;
        this.isShort = isShort;
        if (this.isShort){
            this.lowerBound = 10.0;
            this.higherBound = 20.0;
        }
        else{
            this.lowerBound = 20.0;
            this.higherBound = 40.0;
        }
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLowerBound() {
        return lowerBound;
    }

    public void setLowerBound(double lowerBound) {
        this.lowerBound = lowerBound;
    }

    public double getHigherBound() {
        return higherBound;
    }

    public void setHigherBound(double higherBound) {
        this.higherBound = higherBound;
    }

    public boolean isShort() {
        return isShort;
    }

    public void setShort(boolean isShort) {
        this.isShort = isShort;
    }

    public int[][] getRelevantPosition() {
        return relevantPosition;
    }

    public void setRelevantPosition(int[][] relevantPosition) {
        this.relevantPosition = relevantPosition;
    }

    public boolean isFront() {
        if (this.index < 3){
            return true;
        }
        else{
            return false;
        }
    }
}
