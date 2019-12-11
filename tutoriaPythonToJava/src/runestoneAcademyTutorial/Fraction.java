package runestoneAcademyTutorial;
import java.util.ArrayList;
import java.util.Collections;


public class Fraction extends Number implements Comparable<Fraction> {

    private Integer numerator;
    private Integer denominator;

    public double doubleValue() {
        return numerator.doubleValue() / denominator.doubleValue();
    }

    public float floatValue() {
        return numerator.floatValue() / denominator.floatValue();
    }

    public int intValue() {
        return numerator.intValue() / denominator.intValue();
    }

    public long longValue() {
        return numerator.longValue() / denominator.longValue();
    }

    public Integer getNumerator() {
        return numerator;
    }
    
    public void setNumerator(Integer numerator) {
        this.numerator = numerator;
    }
    
    public Integer getDenominator() {
        return denominator;
    }
    
    public void setDenominator(Integer denominator) {
        this.denominator = denominator;
    }

    public Fraction(Integer num, Integer den) {
        this.numerator = num;
        this.denominator = den;
    }

    public Fraction(Integer num) {
        this.numerator = num;
        this.denominator = 1;
    }

    public Fraction add(Fraction other) {
        Integer newNum, newDen, common;

        newNum = other.getDenominator()*this.numerator + this.denominator*other.getNumerator();
        newDen = this.denominator * other.getDenominator();
        common = gcd(newNum, newDen);
        return new Fraction (newNum / common, newDen / common);
    }

    public Fraction add(Integer other) {
        return add(new Fraction(other));
    }

    private static Integer gcd(Integer m, Integer n) {
        while (m % n != 0) {
            Integer oldm = m;
            Integer oldn = n;
            m = oldn;
            n = oldm % oldn;
        }
        return n;
    }

    public String toString() {
        return numerator.toString() + "/" + denominator.toString();
    }

    public boolean equals(Fraction other) {
        Integer num1 = this.numerator * other.getDenominator();
        Integer num2 = this.denominator * other.getNumerator();

        if (num1 == num2)
            return true;
        else
            return false;
    }

    public int compareTo(Fraction other) {
        Integer num1 = this.numerator * other.getDenominator();
        Integer num2 = this.denominator * other.getNumerator();
        return num1 - num2;
    }



    public static void main(String[] args) {
        // Fraction adding program
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(2, 3);
        Fraction f3 = new Fraction(1,4);

        System.out.println(f1);
        System.out.println(f1.add(1));
        System.out.println(f1);

        System.out.println();
        System.out.println(f1.intValue());
        System.out.println(f1.doubleValue());

        System.out.println();

        ArrayList<Fraction> myFracs = new ArrayList<Fraction>();
        myFracs.add(f1);
        myFracs.add(f2);
        myFracs.add(f3);

        Collections.sort(myFracs);

        for (Fraction f : myFracs) {
            System.out.println(f);
        }
    }

}