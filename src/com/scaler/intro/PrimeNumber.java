package com.scaler.intro;

/*
    Given a number A. Return 1 if A is prime and return 0 if not.
    Note: The value of A can cross the range of Integer.
*/

public class PrimeNumber {
    public static boolean solve(int A) {
        int factors = Factor.factor(A);
        return factors == 2;
    }
}
