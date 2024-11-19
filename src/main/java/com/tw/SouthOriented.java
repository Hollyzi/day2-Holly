package com.tw;

public class SouthOriented implements Orientation{
    private Direction direction;
    @Override
    public Direction getDirection() {
        return direction.S;
    }

    @Override
    public Orientation turnLeft() {
        return new EastOriented();
    }

    @Override
    public Orientation turnRight() {
        return new WestOriented();
    }
}
