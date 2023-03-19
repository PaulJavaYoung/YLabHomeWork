package com.oldboy.tasks.Lesson2.ComplexNumbers;

public class ComplexNumber {
    private double realPart = 0.0;
    private double supposedPart = 0.0;

    public ComplexNumber(double realPart) {
        this.realPart = realPart;
    }

    public ComplexNumber(double realPart, double supposedPart) {
        this.realPart = realPart;
        this.supposedPart = supposedPart;
    }

    /*
    Сложение комплексных чисел.
    Для того чтобы сложить два комплексных числа,
    нужно сложить их действительные и мнимые части:
    z1 = 1 + 3i и z2 = 4 - 5i
    z3 = z1 + z2 = 1 + 4 + 3i - 5i = 5 - 2i
    */
    public ComplexNumber sum(ComplexNumber other) {
        double real = this.realPart + other.realPart;
        double supposed = this.supposedPart + other.supposedPart;
        return new ComplexNumber(real, supposed);
    }

    /*
    Вычитание комплексных чисел.
    Действие аналогично сложению, единственная особенность состоит в том,
    что вычитаемое нужно взять в скобки, а затем – стандартно раскрыть
    эти скобки со сменой знака:
    z1 = 1 + 3i и z2 = 4 - 5i
    z3 = z1 + z2 = 1 - 4 + 3i + 5i = -3 + 8i
    */
    public ComplexNumber subtract(ComplexNumber other) {
        double real = this.realPart - other.realPart;
        double supposed = this.supposedPart - other.supposedPart;
        return new ComplexNumber(real, supposed);
    }

    /*
    Умножение комплексных чисел.
    Необходимо помнить о знаменитом равенстве: i^2=-1
    Далее максимально внимательно, z1 = 1 + 3i и z2 = 4 - 5i
    z1 * z2 = (1 + 3i) * (4 - 5i) = 1*4 + 4*3i + 1*(-5i) + (-5i * 3i) =>
    4 + 12i - 5i + (-15 * -1) => 19 + 7i
    */
    public ComplexNumber multiply(ComplexNumber other) {
        double real = this.realPart * other.realPart - this.supposedPart * other.supposedPart;
        double supposed = this.realPart * other.supposedPart + this.supposedPart * other.realPart;
        return new ComplexNumber(real, supposed);
    }

    /*
    Модуль комплексного числа z = a + bi стандартно обозначают: |z|
    И вычисляется он как корень из (a^2 + b^2) или в JAVA метод
    Math.sqrt(a*a + b*b)
    */
    public double modulus() {
        return Math.sqrt(this.realPart * this.realPart +
                this.supposedPart * this.supposedPart);
    }

    @Override
    public String toString() {
        String complexNum;
        if (this.realPart == 0 && this.supposedPart == 0) {
            complexNum = "0.0";
        } else if (this.realPart == 0 && (this.supposedPart > 0 || this.supposedPart < 0)) {
            complexNum = String.format("%.1fi", this.supposedPart);
        } else if ((this.realPart < 0 || this.realPart > 0) && this.supposedPart > 0) {
            complexNum = String.format("%.1f+%.1fi", this.realPart, this.supposedPart);
        } else if ((this.realPart < 0 || this.realPart > 0) && this.supposedPart == 0) {
            complexNum = String.format("%.1f", this.realPart);
        } else {
            complexNum = String.format("%.1f%.1fi", this.realPart, this.supposedPart);
        }
        return complexNum;
    }
}