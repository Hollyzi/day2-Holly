package com.tw;

public class WestOriented implements Orientation{
    private Direction direction;
    @Override
    public Direction getDirection() {
        return direction.W;
    }

    @Override
    public Orientation turnLeft() {
        return new SouthOriented();
    }

    @Override
    public Orientation turnRight() {
        return new NorthOriented();
    }
}
