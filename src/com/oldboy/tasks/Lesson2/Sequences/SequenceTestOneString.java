package com.oldboy.tasks.Lesson2.Sequences;
/*
Вывод членов последовательности в строку,
как в примере:
A. 2, 4, 6, 8, 10...
B. 1, 3, 5, 7, 9...
C. 1, 4, 9, 16, 25...
D. 1, 8, 27, 64, 125...
E. 1, -1, 1, -1, 1, -1...
F. 1, -2, 3, -4, 5, -6...
G. 1, -4, 9, -16, 25....
H. 1, 0, 2, 0, 3, 0, 4....
I. 1, 2, 6, 24, 120, 720...
J. 1, 1, 2, 3, 5, 8, 13, 21...
*/
import com.oldboy.tasks.Lesson2.Sequences.InterfaceAndClasses.SequenceCalculator;
import com.oldboy.tasks.Lesson2.Sequences.InterfaceAndClasses.Sequences;

public class SequenceTestOneString {
    public static void main(String[] args) {
        Sequences sc = new SequenceCalculator();

        int numberOfElement = 15; // Число членов последовательности выводимых на экран

        sc.seqA(numberOfElement);
        sc.seqB(numberOfElement);
        sc.seqC(numberOfElement);
        sc.seqD(numberOfElement);
        sc.seqE(numberOfElement);
        sc.seqF(numberOfElement);
        sc.seqG(numberOfElement);
        sc.seqH(numberOfElement);
        sc.seqI(numberOfElement);
        sc.seqJ(numberOfElement);
    }
}
