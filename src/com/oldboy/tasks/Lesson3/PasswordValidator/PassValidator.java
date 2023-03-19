package com.oldboy.tasks.Lesson3.PasswordValidator;

import com.oldboy.tasks.Lesson3.PasswordValidator.MyException.WrongLoginException;
import com.oldboy.tasks.Lesson3.PasswordValidator.MyException.WrongPasswordException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PassValidator {
    public static void main(String[] args) {
        System.out.println("----------------- ТЕСТ - Неверный логин -----------------");

        String login = "dwe34фы";
        String password = "eer_ger";
        String confirmPass = "eer_ger";

            System.out.println(passwordValidator(login,password,confirmPass));

        System.out.println("\n----------------- ТЕСТ - Неверный пароль -----------------");

        String login2 = "good_log";
        String password2 = "eerфы_ркger";
        String confirmPass2 = "eerфы_ркger";

            System.out.println(passwordValidator(login2,password2,confirmPass2));

        System.out.println("\n----------------- ТЕСТ - Неверное подтверждение пароля -----------------");

        String login3 = "good_log";
        String password3 = "good_password";
        String confirmPass3 = "не_good_password";

            System.out.println(passwordValidator(login3,password3,confirmPass3));

        System.out.println("\n----------------- ТЕСТ - Логин > 20 символов -----------------");

        String login4 = "very_good_and_long_login";
        String password4 = "eer_ger";
        String confirmPass4 = "eer_ger";

            System.out.println(passwordValidator(login4,password4,confirmPass4));

        System.out.println("\n----------------- ТЕСТ - Пароль > 20 символов -----------------");

        String login5 = "very_good_login";
        String password5 = "very_good_and_long_password";
        String confirmPass5 = "very_good_and_long_password";

        System.out.println(passwordValidator(login5,password5,confirmPass5));

        System.out.println("\n----------------- ТЕСТ - Пароль и подтверждение не совпадают -----------------");

        String login6 = "very_good_login";
        String password6 = "very_good_pass";
        String confirmPass6 = "very_long_pass";

        System.out.println(passwordValidator(login6,password6,confirmPass6));

        System.out.println("\n----------------- ТЕСТ - Успешная валидация -----------------");

        String login7 = "very_good_login";
        String password7 = "very_good_pass";
        String confirmPass7 = "very_good_pass";

        System.out.println(passwordValidator(login7,password7,confirmPass7));

    }

    private static boolean passwordValidator(String login, String password, String confirmPassword){

        boolean goodLog = false;
        boolean goodPass = false;
        boolean successfulValidation = false;

        // При изменении регулярного выражения на "\\w*" пустые строки тоже валидны.
        String regexCorrectFile = "\\w+";
        Pattern firstStr = Pattern.compile(regexCorrectFile);
        Matcher matcherLogin = firstStr.matcher(login.trim());
        Matcher matcherPassword = firstStr.matcher(password.trim());

        if (login.length() > 20) {
            try {
                throw new WrongLoginException("Логин слишком длинный");
            } catch (WrongLoginException e) {
                System.out.println(e.getMessage());
            }
        } else if (!matcherLogin.matches()) {
            try {
                throw new WrongLoginException("Логин содержит недопустимые символы");
            } catch (WrongLoginException e) {
                System.out.println(e.getMessage());
            }
        } else {
            goodLog = true;
        }

        if (password.length() > 20) {
            try {
                throw new WrongPasswordException("Пароль слишком длинный");
            } catch (WrongPasswordException e) {
                System.out.println(e.getMessage());
            }
        } else if (!matcherPassword.matches()) {
            try {
                throw new WrongPasswordException("Пароль содержит недопустимые символы");
            } catch (WrongPasswordException e) {
                System.out.println(e.getMessage());
            }
        } else if (!password.equals(confirmPassword)) {
            try {
                throw new WrongPasswordException("Пароль и подтверждение не совпадают");
            } catch (WrongPasswordException e) {
                System.out.println(e.getMessage());
            }
        } else {
            goodPass = true;
        }

        if (goodLog && goodPass) {
            successfulValidation = true;
        }
        return successfulValidation;
    }
}
