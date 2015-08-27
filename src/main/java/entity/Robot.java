package entity;

/**
 * Created by Hongquan Long on 8/27/2015.
 */
public class Robot {
    public static double ROBOT_RADIUS = 10.0;
    public static int[] DEFAULT_STARTING_POINT = {1,1};
    public static int DEFAULT_ORIENTATION = 0;
    public static String DEFAULT_NAME = "DRACO";

    private String name;
    private double radius;
    private int[] currentLocation;
    private int orientation;///TODO: make it as a enum, [0 - NORTH, 1 - EAST, 2 - SOUTH, 3 - WEST]
    private int status;//TODO: make it as a enum, [0 - REST, 1 - ADJUSTING, 2 - EXPLORE_FIND_WALL, 3 - EXPLORE_FOLLOW_WALL, 4 - EXPLORE_RETURN, 5 - FAST_PATH]

    public Robot() {
        new Robot(DEFAULT_NAME);
    }

    public Robot(String name) {
        new Robot(name, DEFAULT_STARTING_POINT, DEFAULT_ORIENTATION);
    }

    public Robot(String name, int[] currentLocation, int orientation) {
        this.name = name;
        this.currentLocation = currentLocation;
        this.orientation = orientation;
        this.radius = ROBOT_RADIUS;
        this.status = 0; //set to resting state
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRadius() {
        return radius;
    }

    public int getOrientation() {
        return orientation;
    }

    public void setOrientation(int orientation) {
        this.orientation = orientation;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int[] getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(int[] currentLocation) {
        this.currentLocation = currentLocation;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

}
