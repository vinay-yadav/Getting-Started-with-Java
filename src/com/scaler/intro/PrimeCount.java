package com.scaler.intro;

/*
    You will be given an integer n.
    You need to return the count of prime numbers less than or equal to n.

    * 19 -> 8
    * 1  -> 0
*/

public class PrimeCount {
    public static int solve(int A) {
        int count = 0;

        for (int i = 1; i <= A; i++) {
            if (PrimeNumber.solve(i)) {
                count++;
            }
        }

        return count;
    }
}
