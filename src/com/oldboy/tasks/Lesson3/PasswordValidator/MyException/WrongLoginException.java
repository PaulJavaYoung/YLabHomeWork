package com.oldboy.tasks.Lesson3.PasswordValidator.MyException;

public class WrongLoginException extends Exception{
    public WrongLoginException() {
    }

    public WrongLoginException(String message) {
        super(message);
    }
}
