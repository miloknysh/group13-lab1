package com.example.mycalculator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class EvaluatorTest {

    @Test
    public void evaluateAddition() throws Exception {

        Evaluator eval = new Evaluator();

        //tests that should pass

        String actual = eval.evaluate("2.7+3.4");
        String expected = "6.10";
        assertEquals(expected, actual);

        actual = eval.evaluate("50.43+10.57");
        expected = "61";
        assertEquals(expected, actual);

        actual = eval.evaluate("-5.74+17.32");
        expected = "11.58";
        assertEquals(expected, actual);

        actual = eval.evaluate("-80+1");
        expected = "-79";
        assertEquals(expected, actual);

        actual = eval.evaluate("31.9+-6.38");
        expected = "25.52";
        assertEquals(expected, actual);

        actual = eval.evaluate("-74+-3");
        expected = "-77";
        assertEquals(expected, actual);

        //tests that should fail

        actual = eval.evaluate("2.5+3.5");
        expected = "6.0";
        assertEquals(expected, actual);

        actual = eval.evaluate("1.1+3.2");
        expected = "4.3";
        assertEquals(expected, actual);

    }



}