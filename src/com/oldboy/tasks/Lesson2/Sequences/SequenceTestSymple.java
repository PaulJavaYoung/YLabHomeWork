package com.oldboy.tasks.Lesson2.Sequences;
/*
Вывод членов последовательности в столбец
*/
import com.oldboy.tasks.Lesson2.Sequences.InterfaceAndClasses.SequenceImpl;
import com.oldboy.tasks.Lesson2.Sequences.InterfaceAndClasses.Sequences;

public class SequenceTestSymple {
    public static void main(String[] args) {
        Sequences sequenceGenerator = new SequenceImpl();

        int numberOfElement = 15; // Число членов последовательности выводимых на экран

        sequenceGenerator.seqA(numberOfElement);
        sequenceGenerator.seqB(numberOfElement);
        sequenceGenerator.seqC(numberOfElement);
        sequenceGenerator.seqD(numberOfElement);
        sequenceGenerator.seqE(numberOfElement);
        sequenceGenerator.seqF(numberOfElement);
        sequenceGenerator.seqG(numberOfElement);
        sequenceGenerator.seqH(numberOfElement);
        sequenceGenerator.seqI(numberOfElement);
        sequenceGenerator.seqJ(numberOfElement);
    }
}
