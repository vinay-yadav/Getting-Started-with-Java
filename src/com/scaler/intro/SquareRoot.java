package com.scaler.intro;

public class SquareRoot {
    public static int solve(int A) {
        int answer = -1;

        for (int i = 1; i*i <= A; i++) {
            if (i*i == A) {
                answer = i;
            }
        }

        return answer;
    }
}
