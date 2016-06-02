package com.primeFactorKata.tdd;

public class main {
    public static void main(String args[]){

        PrimeFactorKata primeFactorKata = new PrimeFactorKata();

        System.out.printf("Prime factors of number '%d' are : %s %n", 2, primeFactorKata.getPrimeFactor(2));
        System.out.printf("Prime factors of number '%d' are : %s %n", 3, primeFactorKata.getPrimeFactor(3));
        System.out.printf("Prime factors of number '%d' are : %s %n", 4, primeFactorKata.getPrimeFactor(4));
        System.out.printf("Prime factors of number '%d' are : %s %n", 6, primeFactorKata.getPrimeFactor(6));
        System.out.printf("Prime factors of number '%d' are : %s %n", 8, primeFactorKata.getPrimeFactor(8));
        System.out.printf("Prime factors of number '%d' are : %s %n", 9, primeFactorKata.getPrimeFactor(9));
        System.out.printf("Prime factors of number '%d' are : %s %n", 10, primeFactorKata.getPrimeFactor(10));

        //others
        System.out.println("\n");
        System.out.printf("Prime factors of number '%d' are : %s %n", 12,primeFactorKata.getPrimeFactor(12));
        System.out.printf("Prime factors of number '%d' are : %s %n", 24,primeFactorKata.getPrimeFactor(24));

    }
}
