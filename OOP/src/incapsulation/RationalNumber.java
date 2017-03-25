package incapsulation;


public class RationalNumber {
    private int numerator;
    private int denominator;

    public RationalNumber() {
        numerator = 0;
        denominator = 1;
    }

    public RationalNumber(int numerator, int denominator) {
        this.setNumerator(numerator);
        this.setDenominator(denominator);
    }

    public double normalize() {
        return numerator/(denominator * 1.0);
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        if (denominator == 0) {
            this.denominator = 1;
        } else {
            this.denominator = denominator;
        }
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }
}
