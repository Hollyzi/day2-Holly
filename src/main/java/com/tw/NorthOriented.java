package com.tw;

public class NorthOriented implements Orientation {
    private Direction direction;

    @Override
    public Direction getDirection() {
        return direction.N;
    }

    @Override
    public Orientation turnLeft() {
        return new WestOriented();
    }

    @Override
    public Orientation turnRight() {
        return new EastOriented();
    }
}
