package com.primeFactorKata.tdd;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorKata {


    public List<Integer> getPrimeFactor(int value) {

        List<Integer> number = new ArrayList<Integer>();

        int factor = 2;

        while (value > 1) {

            while (value % factor == 0) {
                number.add(factor);
                value = value/ factor;
            }
            factor ++;
        }
        return number;
    }
}
