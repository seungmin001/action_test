package com.example.project;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator cal;
    @BeforeEach
    void setUp() {
        cal=new Calculator();
    }

    @Test
    void add() {
        assertAll(
                ()->assertEquals(3,cal.add(1,2)));
    }

    @Test
    void sub() {
        assertAll(
                ()->assertEquals(-1,cal.sub(1,2)));
    }


}