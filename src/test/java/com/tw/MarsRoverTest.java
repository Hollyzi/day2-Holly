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
}

