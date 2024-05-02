package org.example;

public class IntNumber {
    private int value;

    public IntNumber(int value) {
        this.value = value;
    }

    public IntNumber() {
        this.value = 0;
    }

    public boolean isPair() {
        return value % 2 == 0;
    }

    public boolean isOdd() {
        return value % 2 != 0;
    }

    public boolean isPrime() {
        if (value <= 1) {
            return false;
        }
        for (int i = 2; i * i <= value; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }
}
