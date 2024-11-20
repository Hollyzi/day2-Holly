package com.tw;

public class EastOriented implements Orientation {
    private Direction direction;

    @Override
    public Direction getDirection() {
        return direction.E;
    }

    @Override
    public Orientation turnLeft() {
        return new NorthOriented();
    }

    @Override
    public Orientation turnRight() {
        return new SouthOriented();
    }
}
