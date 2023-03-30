package studio7;

public class Fraction {

	private double numerator;
	private double denominator;
	private double commonDenominator;

	public Fraction(double numerator, double denominator) {
		double min = Math.min(numerator, denominator);
		for (double i = 1; i <= min; i++) {
			if ((denominator / i) % 1 == 0 && (numerator / i) % 1 == 0) {
				this.commonDenominator = i;
			}

		}
		this.numerator = numerator / commonDenominator;
		this.denominator = denominator / commonDenominator;
	}
	
	public String printFraction() {
		return (this.numerator+" / "+this.denominator);
	}

	public Fraction sumFraction(Fraction f2) {
		double denominator = this.denominator * f2.denominator;
		double numerator = this.numerator * f2.denominator + f2.numerator * this.denominator;
		return new Fraction(numerator, denominator);
	}

	public static void main(String[] args) {
		Fraction f1 = new Fraction(2, 7);
		Fraction f2 = new Fraction(4, 8);
		System.out.print(f1.sumFraction(f2).printFraction());

	}

}
