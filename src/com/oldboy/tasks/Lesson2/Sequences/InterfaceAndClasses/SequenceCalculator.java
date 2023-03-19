package com.oldboy.tasks.Lesson2.Sequences.InterfaceAndClasses;

public class SequenceCalculator implements Sequences {
    @Override
    public void seqA(int n) {
        if (n > 1) {
            System.out.print("A. ");
            for (int i = 1; i <= n; i++) {
                long countAn = i * 2L;
                printSequenceToScreen(countAn, i, n);
            }
        } else {
            System.out.println("seqA: Значение введенного параметра должно быть больше 1");
        }
    }

    @Override
    public void seqB(int n) {
        if (n > 1) {
            System.out.print("B. ");
            for (int i = 1; i <= n; i++) {
                long countBn = (i * 2L) - 1;
                printSequenceToScreen(countBn, i, n);
            }
        } else {
            System.out.println("seqB: Значение введенного параметра должно быть больше 1");
        }
    }

    @Override
    public void seqC(int n) {
        if (n > 1) {
            System.out.print("C. ");
            for (int i = 1; i <= n; i++) {
                long countCn = (long) i * i;
                printSequenceToScreen(countCn, i, n);
            }
        } else {
            System.out.println("seqC: Значение введенного параметра должно быть больше 1");
        }
    }

    @Override
    public void seqD(int n) {
        if (n > 1) {
            System.out.print("D. ");
            for (int i = 1; i <= n; i++) {
                long countDn = (long) i * i * i;
                printSequenceToScreen(countDn, i, n);
            }
        } else {
            System.out.println("seqD: Значение введенного параметра должно быть больше 1");
        }
    }

    @Override
    public void seqE(int n) {
        if (n > 1) {
            System.out.print("E. ");
            for (int i = 1; i <= n; i++) {
                long countEn = (i % 2 == 0) ? -1L : 1L;
                printSequenceToScreen(countEn, i, n);
            }
        } else {
            System.out.println("seqE: Значение введенного параметра должно быть больше 1");
        }
    }

    @Override
    public void seqF(int n) {
        if (n > 1) {
            System.out.print("F. ");
            for (int i = 1; i <= n; i++) {
                long countFn = (i % 2 == 0) ? (long) i * -1 : (long) i;
                printSequenceToScreen(countFn, i, n);
            }
        } else {
            System.out.println("seqF: Значение введенного параметра должно быть больше 1");
        }
    }

    @Override
    public void seqG(int n) {
        if (n > 1) {
            System.out.print("G. ");
            for (int i = 1; i <= n; i++) {
                long countGn = (i % 2 == 0) ? ((long) i * i) * -1 : (long) i * i;
                printSequenceToScreen(countGn, i, n);
            }
        } else {
            System.out.println("seqG: Значение введенного параметра должно быть больше 1");
        }
    }

    @Override
    public void seqH(int n) {
        if (n > 1) {
            System.out.print("H. ");
            for (int i = 1; i <= n; i++) {
                long countHn = (i % 2 == 0) ? 0 : (i - 1) / 2 + 1;
                printSequenceToScreen(countHn, i, n);
            }
        } else {
            System.out.println("seqH: Значение введенного параметра должно быть больше 1");
        }
    }

    @Override
    public void seqI(int n) {
        if (n > 1 && n < 20) {
            System.out.print("I. ");
            long perevElement = 1L;
            for (int i = 1; i <= n; i++) {
                long curElement = perevElement * i;
                perevElement = curElement;
                long countIn = curElement;
                printSequenceToScreen(countIn, i, n);
            }
        } else {
            System.out.println("seqI: Значение введенного параметра должно " +
                               "находится в передал от 1 до 20");
        }
    }

    @Override
    public void seqJ(int n) {
        if (n > 1) {
            System.out.print("J. ");
            long stepBuckElement = 1L;
            long twoStepBuckElement = 1L;
            long curElement = 1L;
            for (int i = 1; i <= n; i++) {
                if (i > 2) {
                    curElement = stepBuckElement + twoStepBuckElement;
                    twoStepBuckElement = stepBuckElement;
                    stepBuckElement = curElement;
                }
                long countJn = curElement;
                printSequenceToScreen(countJn, i, n);
            }
        } else {
            System.out.println("seqJ: Значение введенного параметра должно быть больше 1");
        }
    }

    private static void printSequenceToScreen(long countXn, int i, int n) {
        if (i < n) {
            System.out.printf("%d, ", countXn);
        } else {
            System.out.printf("%d...\n", countXn);
        }
    }
}
