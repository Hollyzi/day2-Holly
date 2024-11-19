package com.tw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class MarsRoverTest {
    @Test
    void should_initialize_mars_rover(){
    //given
    MarsRover rover=new MarsRover();
    //when
    String report=rover.showStatus();
    //then
    assertEquals("0:0:N",report);

    }

    @Test
    public void should_face_west_when_orient_north_and_turn_left(){
        MarsRover rover=new MarsRover();
        String report=rover.executeCommand("L");
        assertEquals("0:0:W",report);
    }

    @Test
    public void should_face_south_when_orient_west_and_turn_left(){
        MarsRover rover=new MarsRover();
        rover.executeCommand("L");
        String report=rover.executeCommand("L");
        assertEquals("0:0:S",report);
    }

    @Test
    public void should_face_east_when_orient_south_and_turn_left(){
        MarsRover rover=new MarsRover();
        rover.executeCommand("L");
        rover.executeCommand("L");
        String report=rover.executeCommand("L");
        assertEquals("0:0:E",report);
    }

    @Test
    public void should_face_east_when_orient_north_and_turn_right(){
        MarsRover rover=new MarsRover();
        String report=rover.executeCommand("R");
        assertEquals("0:0:E",report);
    }

    @Test
    public void should_face_south_when_orient_east_and_turn_right(){
        MarsRover rover=new MarsRover();
        rover.executeCommand("R");
        String report=rover.executeCommand("R");
        assertEquals("0:0:S",report);
    }

    @Test
    public void should_face_west_when_orient_south_and_turn_right(){
        MarsRover rover=new MarsRover();
        rover.executeCommand("R");
        rover.executeCommand("R");
        String report=rover.executeCommand("R");
        assertEquals("0:0:W",report);
    }

    @Test
    public void should_face_north_when_orient_west_and_turn_right(){
        MarsRover rover=new MarsRover();
        rover.executeCommand("R");
        rover.executeCommand("R");
        String report=rover.executeCommand("R");
        assertEquals("0:0:N",report);

    }
    @Test
    public void should_retun_0_1_N_when_orient_south_and_turn_forward(){
        MarsRover rover=new MarsRover();
        String report=rover.executeCommand("M");
        assertEquals("0:1:N",report);
    }
    @Test
    public void should_retun_1_0_E_when_orient_east_and_turn_forward(){
        MarsRover rover=new MarsRover();
        rover.executeCommand("L");
        rover.executeCommand("L");
        rover.executeCommand("L");
        String report=rover.executeCommand("M");
        assertEquals("1:0:E",report);
    }

}

