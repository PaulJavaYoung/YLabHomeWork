package com.oldboy.tasks.Lesson3.PasswordValidator.MyException;

public class WrongPasswordException extends Exception{
    public WrongPasswordException() {
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}
