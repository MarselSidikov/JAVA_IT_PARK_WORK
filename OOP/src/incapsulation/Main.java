package incapsulation;

public class Main {
    public static void main(String[] args) {
        RationalNumber number = new RationalNumber(7, 0);

        // number.numerator = 7;
        // number.denominator = 0;

        number.setNumerator(7);
        number.setDenominator(0);
        double norm = number.normalize();
        System.out.println(norm);
        System.out.println(number.getDenominator());
    }
}
