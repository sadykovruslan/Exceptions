package org.example;

public class OutOfMoneyException extends Exception {
    public OutOfMoneyException() {
    }

    public OutOfMoneyException(String message) {
        super(message);
    }
}