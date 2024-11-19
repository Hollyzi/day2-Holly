package com.tw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MultiplicationTableBuilderTest {
    @Test
    void should_return_true_when_isInRange_given_a_number_5() {
        // Given
        MultiplicationTableBuilder multiplicationTableBuilder = new MultiplicationTableBuilder();
        int number = 5;

        // When
        boolean isInRange = multiplicationTableBuilder.isInRange(number);

        // Then
        assertTrue(isInRange);
    }

    @Test
    void should_return_false_when_isInRange_given_a_number_0(){
        //Given
        MultiplicationTableBuilder multiplicationTableBuilder=new MultiplicationTableBuilder();
        int number=0;

        //When
        boolean isInRange=multiplicationTableBuilder.isInRange(number);

        //Then
        assertFalse(isInRange);
    }

    @Test
    void should_return_false_when_isInRange_given_a_number_1001(){
        //Given
        MultiplicationTableBuilder multiplicationTableBuilder=new MultiplicationTableBuilder();
        int number=1001;

        //When
        boolean isInRange=multiplicationTableBuilder.isInRange(number);

        //Then
        assertFalse(isInRange);
    }

    @Test
    void should_return_true_when_isStarterNotBiggerthanEnd_given_start_2_end_3(){
        //Given
        MultiplicationTableBuilder multiplicationTableBuilder=new MultiplicationTableBuilder();
        int start=2;
        int end=3;

        //When
        boolean isStarterNotBiggerthanEnd=multiplicationTableBuilder.isStarterNoBiggerthanEnd(start,end);

        //Then
        assertTrue(isStarterNotBiggerthanEnd);
    }

    @Test
    void should_return_true_when_isStarterNotBiggerthanEnd_given_start_2_end_2(){
        //Given
        MultiplicationTableBuilder multiplicationTableBuilder=new MultiplicationTableBuilder();
        int start=2;
        int end=2;

        //When
        boolean isStarterNotBiggerthanEnd=multiplicationTableBuilder.isStarterNoBiggerthanEnd(start,end);

        //Then
        assertTrue(isStarterNotBiggerthanEnd);
    }

    @Test
    void should_return_false_when_isStarterNotBiggerthanEnd_given_start_3_end_2(){
        //Given
        MultiplicationTableBuilder multiplicationTableBuilder=new MultiplicationTableBuilder();
        int start=3;
        int end=2;

        //When
        boolean isStarterNotBiggerthanEnd=multiplicationTableBuilder.isStarterNoBiggerthanEnd(start,end);

        //Then
        assertFalse(isStarterNotBiggerthanEnd);
    }

    @Test
    void should_return_true_when_isValid_given_start_2_end_3(){
        //Given
        MultiplicationTableBuilder multiplicationTableBuilder=new MultiplicationTableBuilder();
        int start=2;
        int end=3;

        //When
        boolean isValid=multiplicationTableBuilder.isValid(start,end);

        //Then
        assertTrue(isValid);
    }

    @Test
    void should_return_false_when_isValid_given_start_2_end_1(){
        //Given
        MultiplicationTableBuilder multiplicationTableBuilder=new MultiplicationTableBuilder();
        int start=2;
        int end=1;

        //When
        boolean isValid=multiplicationTableBuilder.isValid(start,end);

        //Then
        assertFalse(isValid);
    }

}
