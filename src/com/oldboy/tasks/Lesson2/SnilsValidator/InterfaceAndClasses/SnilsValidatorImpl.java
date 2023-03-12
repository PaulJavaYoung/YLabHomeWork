package com.oldboy.tasks.Lesson2.SnilsValidator.InterfaceAndClasses;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SnilsValidatorImpl implements SnilsValidator{
    // Массив для хранения цифр СНИЛС
    private static int[] snilsNumber= new int[11];
    @Override
    public boolean validate(String snils) {
        boolean rightSnils = false;
        /*
        Полученные данные должны соответствовать
        жестким требованиям, одиннадцать цифр подряд
        без пробелов и других разделяющих символов,
        о чем упоминается в методе main.
        */
        String regexCorrectData = "\\d{11}";
        Pattern dataIsCorrect = Pattern.compile(regexCorrectData);
        Matcher matcherForCorrectData = dataIsCorrect.matcher(snils);
        /*
        Если полученная строка соответствует требованиям,
        она передается в метод конвертирующий ее в массив
        данных. Далее в работу включается метод расчета
        валидности.
        */
        if (matcherForCorrectData.matches()) {
            strToIntConvertor(snils);
            rightSnils = validateCalculation();
        }

        return rightSnils;
    }
    // Конвертор полученной строки в массив int
    private static void strToIntConvertor(String inputData){
        String[] snilsStrElement  = inputData.split("");
        for (var i = 0; i < snilsNumber.length; i++) {
            snilsNumber[i] = Integer.parseInt(snilsStrElement[i]);
        }
    }
    // Расчет валидности полученного СНИЛС
    private static boolean validateCalculation(){
        int sum = 0;
        int countLimit = snilsNumber.length-2;
        int controlNum;

        for(var i = 0; i < countLimit; i++){
            sum = sum + (snilsNumber[i] * (countLimit - i));
        }

        if (sum == 100) {
            controlNum = 0;
        } else if (sum < 100) {
            controlNum = sum;
        } else {
            controlNum = (sum % 101 == 100) ? 0 : sum % 101;
        }

        return snilsNumber[9] == controlNum / 10 &&
                snilsNumber[10] == controlNum % 10;
    }
}