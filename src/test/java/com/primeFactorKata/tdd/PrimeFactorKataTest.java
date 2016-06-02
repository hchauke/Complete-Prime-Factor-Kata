package com.primeFactorKata.tdd;


import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class PrimeFactorKataTest {

    private PrimeFactorKata primes;

    @Before
    public void setUp() {
        primes = new PrimeFactorKata();
    }

    private List<Integer> expectedList(int... values){
        List<Integer> primes = new ArrayList<Integer>();

        for (int number: values){
            primes.add(number);
        }
        return primes;
    }

    @Test
    public void testTwoReturnPrimeFactors() {
        assertEquals(expectedList(2), primes.getPrimeFactor(2));
    }

    @Test
    public void testFourPrimeFactors() {
        assertEquals(expectedList(2, 2), primes.getPrimeFactor(4));
    }

    @Test
    public void testSixPrimeFactors() {
        assertEquals(expectedList(2, 3), primes.getPrimeFactor(6));
    }

    @Test
    public void testEightPrimeFactors() {
        assertEquals(expectedList(2, 2, 2), primes.getPrimeFactor(8));
    }

    @Test
    public void testNinePrimeFactors() {
        assertEquals(expectedList(3, 3), primes.getPrimeFactor(9));
    }

    @Test
    public void testTenPrimeFactors() {
        assertEquals(expectedList(2, 5), primes.getPrimeFactor(10));
    }

    @Test
    public void testTwelvePrimeFactors() {
        assertEquals(expectedList(2, 2, 3), primes.getPrimeFactor(12));
    }
}
