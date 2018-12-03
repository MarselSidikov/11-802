package ru.itis;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 28.11.2018
 * MathExperienceTest
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class MathExperienceTest {

    private MathExperience testingMathExperience;

    @Before
    public void setUp() throws Exception {
        System.out.println("In Before");
        testingMathExperience = new MathExperience();
    }

    @Test
    public void testIsPrimeOn133() {
        boolean expected = false;
        boolean actual = testingMathExperience.isPrime(133);
        assertEquals(expected, actual);
    }

    @Test
    public void testIsPrimeOn169() {
        assertFalse(testingMathExperience.isPrime(169));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsPrimeOn1() {
        testingMathExperience.isPrime(1);
    }

    @Test
    public void testIsPrimeOn2() {
        assertTrue(testingMathExperience.isPrime(2));
    }

    @Test
    public void testIsPrimeOn997() {
        assertTrue(testingMathExperience.isPrime(997));
    }
}