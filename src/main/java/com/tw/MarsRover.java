package com.tw;

public class MarsRover {

    Direction direction;

    private Orientation orientation;
    private Integer x_coordinate;
    private Integer y_coordinate;
    private Coordinate coordinate;

    public  MarsRover(){
        this.orientation=new NorthOriented();
        this.coordinate=new Coordinate();
        coordinate.setY_coordinate(0);
        coordinate.setX_coordinate(0);
        this.direction=orientation.getDirection();
    }
    public String showStatus() {
        return String.format("%d:%d:",coordinate.getX_coordinate(),coordinate.getY_coordinate())+orientation.getDirection();
    }

    public String executeCommand(String command) {

        if(command.equals("L")){
            this.orientation=orientation.turnLeft();
        }else if(command.equals("R")){
            this.orientation=orientation.turnRight();
        }else if(command.equals("M")){
            if(orientation.getDirection()==Direction.N){
                y_coordinate+=1;
            }
            if(orientation.getDirection()==Direction.E){
                x_coordinate+=1;
            }
            if(orientation.getDirection()==Direction.W){
                x_coordinate-=1;
            }
            if(orientation.getDirection()==Direction.S){
                y_coordinate-=1;
            }

            return String.format("%d:%d:",coordinate.getX_coordinate(),coordinate.getY_coordinate())+orientation.getDirection()+orientation.getDirection();
        }


        return "";
    }
}
