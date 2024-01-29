package course_by_CN.OOPS.ClassesAndObjects;
// Day 6(29-01-2024)
// Fraction class
class Fraction {
    int numerator;
    int denominator;

    public Fraction() {
        this.numerator = 1;
        this.denominator = 1;
    }

    // constructor
    public Fraction(int numerator, int denominator) {
        if (denominator == 0)
            denominator = 1;

        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }

    private void simplify() {
        int gcd = 1;
        int smaller = Math.min(numerator, denominator);

        for (int i = 2; i <= smaller; i++) {
            if (numerator % i == 0 && denominator % i == 0)
                gcd = i;
        }

        numerator = numerator / gcd;
        denominator = denominator / gcd;
    }

    // printing the fraction
    public void print() {
        System.out.println(this.numerator + "/" + this.denominator);
    }

    // setting the numerator
    public void setNumerator(int num) {
        numerator = num;
        simplify();
    }

    // getting the numerator of the fraction
    public int getNumertor() {
        return this.numerator;
    }

    // setting the denominator
    public void setDenominator(int den) {
        if (den == 0)
            return;
        denominator = den;
        simplify();
    }

    // getting denominator
    public int getDenominator() {
        return this.denominator;
    }

    // increamenting the fraction by 1
    public void increament() {
        numerator = (numerator + denominator);
        simplify();
    }

    // adding 2 fraction;
    public void add(Fraction f1, Fraction f2) {
        this.numerator = (f1.numerator * f2.denominator) + (f2.numerator * f1.denominator);
        this.denominator = f1.denominator * f2.denominator;
        simplify();
    }
}

public class FractionUse {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(2, 3);
        f1.print();
        // System.out.println(f1.getNumertor());
        // System.out.println(f1.getDenominator());
        // f1.increament();
        // f1.print();

        Fraction f2 = new Fraction(1, 2);
        f2.print();

        Fraction f3 = new Fraction();

        f3.add(f1, f2);
        f3.print();

    }

}
