package com.scaler.intro;

/*
    Given an integer A, you need to find the count of it's answer.
    com.scaler.intro.Factor of a number is the number which divides it perfectly leaving no remainder.
    Example : 1, 2, 3, 6 are answer of 6
*/

public class Factor {
    public static int factor(int n) {
        int answer = 0;

        for (int i = 1; i*i <= n; i++) {
            if (n % i == 0) {
                if (i == n/i) {
                    answer++;
                } else {
                    answer += 2;
                }
            }
        }

        return answer;
    }
}