package com.oldboy.tasks.Lesson2.Sequences.InterfaceAndClasses;

public class SequenceImpl implements Sequences {
    @Override
    public void seqA(int n) {
        if (n > 1) {
            System.out.println("\nSequence A");
            for (var i = 1; i <= n; i++) {
                System.out.println(i * 2);
            }
        } else {
            System.out.println("seqA: Значение введенного параметра должно быть больше 1");
        }
    }

    @Override
    public void seqB(int n) {
        if (n > 1) {
            System.out.println("\nSequence B");
            for (var i = 1; i <= n; i++) {
                System.out.println((i * 2L) - 1);
            }
        } else {
            System.out.println("seqB: Значение введенного параметра должно быть больше 1");
        }
    }

    @Override
    public void seqC(int n) {
        if (n > 1) {
            System.out.println("\nSequence C");
            for (var i = 1; i <= n; i++) {
                System.out.println(i * i);
            }
        } else {
            System.out.println("seqC: Значение введенного параметра должно быть больше 1");
        }
    }

    @Override
    public void seqD(int n) {
        if (n > 1) {
            System.out.println("\nSequence D");
            for (var i = 1; i <= n; i++) {
                System.out.println(i * i * i);
            }
        } else {
            System.out.println("seqD: Значение введенного параметра должно быть больше 1");
        }
    }

    @Override
    public void seqE(int n) {
        if (n > 1) {
            System.out.println("\nSequence E");
            for (var i = 1; i <= n; i++) {
                System.out.println((i % 2 == 0) ? -1 : 1);
            }
        } else {
            System.out.println("seqE: Значение введенного параметра должно быть больше 1");
        }
    }

    @Override
    public void seqF(int n) {
        if (n > 1) {
            System.out.println("\nSequence F");
            for (var i = 1; i <= n; i++) {
                System.out.println((i % 2 == 0) ? i * -1 : i);
            }
        } else {
            System.out.println("seqF: Значение введенного параметра должно быть больше 1");
        }
    }

    @Override
    public void seqG(int n) {
        if (n > 1) {
            System.out.println("\nSequence G");
            for (var i = 1; i <= n; i++) {
                System.out.println((i % 2 == 0) ? (i * i) * -1 : i * i);
            }
        } else {
            System.out.println("seqG: Значение введенного параметра должно быть больше 1");
        }
    }

    @Override
    public void seqH(int n) {
        if (n > 1) {
            System.out.println("\nSequence H");
            for (var i = 1; i <= n; i++) {
                System.out.println((i % 2 == 0) ? 0 : (i - 1) / 2 + 1);
            }
        } else {
            System.out.println("seqH: Значение введенного параметра должно быть больше 1");
        }
    }

    @Override
    public void seqI(int n) {
        if (n > 1 && n < 20) {
            System.out.println("\nSequence I");
            long perevElement = 1L;
            for (var i = 1; i <= n; i++) {
                var curElement = perevElement * i;
                perevElement = curElement;
                var countIn = curElement;
                System.out.println(countIn);
            }
        } else {
            System.out.println("seqI: Значение введенного параметра должно " +
                               "находится в передал от 1 до 20");
        }
    }

    @Override
    public void seqJ(int n) {
        if (n > 1) {
            System.out.println("\nSequence J");
            var stepBuckElement = 1L;
            var twoStepBuckElement = 1L;
            var curElement = 1L;
            for (var i = 1; i <= n; i++) {
                if (i > 2) {
                    curElement = stepBuckElement + twoStepBuckElement;
                    twoStepBuckElement = stepBuckElement;
                    stepBuckElement = curElement;
                }
                long countJn = curElement;
                System.out.println(countJn);
            }
        } else {
            System.out.println("seqJ: Значение введенного параметра должно быть больше 1");
        }
    }
}
