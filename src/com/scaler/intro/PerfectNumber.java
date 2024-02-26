package com.scaler.intro;

/*
    You are given an integer A. You have to tell whether it is a perfect number or not.
    Perfect number is a positive integer which is equal to the sum of its proper positive divisors.
    A proper divisor of a natural number is the divisor that is strictly less than the number.
*/

public class PerfectNumber {
    public static int solve(int A) {
        if (A == 1) {
            return 0;
        }

        int divisors = 1;

        for (int i = 2; i * i <= A; i++) {
            if (A % i == 0) {
                divisors += i;

                if ((i != A / i) && (A / i < A)) {
                    divisors += A / i;
                }
            }
        }

        return divisors == A ? 1 : 0;
    }
}


/*
    Hint:
    The solution can be optimised even further. If A is divisible by i, then i and A/i both are factors of A.
    The intended solution is in O(sqrt(A)).
*/
