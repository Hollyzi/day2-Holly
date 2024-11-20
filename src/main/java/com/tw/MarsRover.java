package com.tw;

public class MarsRover {

    public static final String LEFT = "L";
    public static final String RIGHT = "R";
    public static final String MOVEFORWARD = "M";
    Direction direction;

    private Orientation orientation;
    private Coordinate coordinate;

    public MarsRover() {
        this.orientation = new NorthOriented();
        this.coordinate = new Coordinate();
        coordinate.setY_coordinate(0);
        coordinate.setX_coordinate(0);
        this.direction = orientation.getDirection();
    }

    public String showStatus() {
        return String.format("%d:%d:", coordinate.getX_coordinate(), coordinate.getY_coordinate()) + orientation.getDirection();
    }

    public void executeCommand(String command) {

        if (command.equals(LEFT)) {
            this.orientation = orientation.turnLeft();
        } else if (command.equals(RIGHT)) {
            this.orientation = orientation.turnRight();
        } else if (command.equals(MOVEFORWARD)) {
            moveForward();
        }

    }

    private void moveForward() {
        if (orientation.getDirection() == Direction.N) {
            coordinate.addY_coordinate();
        }
        if (orientation.getDirection() == Direction.E) {
            coordinate.addX_coordinate();
        }
        if (orientation.getDirection() == Direction.W) {
            coordinate.reduceX_coordinate();
        }
        if (orientation.getDirection() == Direction.S) {
            coordinate.reduceY_coordinate();
        }
    }
}
