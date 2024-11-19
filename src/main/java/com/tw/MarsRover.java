package com.tw;

public class MarsRover {

    Direction direction;

    private Orientation orientation;
    private Integer x_coordinate;
    private Integer y_coordinate;
    private String coordinate;

    public  MarsRover(){
//        this.direction=direction.N;
        this.orientation=new NorthOriented();
        this.x_coordinate=0;
        this.y_coordinate=0;
        this.coordinate=String.format("%d:%d:",x_coordinate,y_coordinate);
        this.direction=orientation.getDirection();
    }
    public String showStatus() {
//        String status="0:0:"+direction;
        return coordinate+direction;
    }

    public String executeCommand(String command) {

        if(command.equals("L")){
            this.orientation=orientation.turnLeft();
            return "0:0:"+orientation.getDirection();

        }else if(command.equals("R")){
            this.orientation=orientation.turnRight();
            return "0:0:"+orientation.getDirection();
        }


        return "";
    }
}
