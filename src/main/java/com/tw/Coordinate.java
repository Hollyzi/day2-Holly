package com.tw;

public class Coordinate {
    private Integer x_coordinate;
    private Integer y_coordinate;

    public Integer getX_coordinate() {
        return x_coordinate;
    }

    public Integer getY_coordinate() {
        return y_coordinate;
    }

    public void setX_coordinate(Integer x_coordinate) {
        this.x_coordinate = x_coordinate;
    }

    public void setY_coordinate(Integer y_coordinate) {
        this.y_coordinate = y_coordinate;
    }

    public void addX_coordinate() {
        this.x_coordinate++;
    }

    public void addY_coordinate() {
        this.y_coordinate++;
    }

    public void reduceX_coordinate() {
        this.x_coordinate--;
    }

    public void reduceY_coordinate() {
        this.y_coordinate--;
    }

}
