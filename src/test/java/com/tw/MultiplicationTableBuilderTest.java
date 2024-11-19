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





    // TODO: add more tests for isInRange
}
