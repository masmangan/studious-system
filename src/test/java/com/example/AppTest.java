package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private static final String FORMATTER = "%.3f";

    @Test
    public void test1()
    {
        double actual = Main.solve(10, 85);
        double expected = 70.833;
        String actualFormatted = String.format(FORMATTER, actual);
        String expectFormatted = String.format(FORMATTER, expected);
        assertEquals(expectFormatted, actualFormatted);
    }

    @Test
    public void test2()
    {
        double actual = Main.solve(2, 92);
        double expected = 15.333;
        String actualFormatted = String.format(FORMATTER, actual);
        String expectFormatted = String.format(FORMATTER, expected);
        assertEquals(expectFormatted, actualFormatted);
    }   

    @Test
    public void test3()
    {
        double actual = Main.solve(22,67);
        double expected = 122.833;
        String actualFormatted = String.format(FORMATTER, actual);
        String expectFormatted = String.format(FORMATTER, expected);
        assertEquals(expectFormatted, actualFormatted);
    }    
}
