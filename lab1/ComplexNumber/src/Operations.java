
public class Operations {
	public ComplexNumber add(ComplexNumber a, ComplexNumber b) {
		ComplexNumber c = new ComplexNumber();
		c.re = a.re + b.re;
		c.im = a.im + b.im;

		return c;
	}

	public ComplexNumber multiply(ComplexNumber a, ComplexNumber b) {
		ComplexNumber c = new ComplexNumber();
		c.re = a.re * b.re - a.im * b.im;
		c.im = a.re * b.im + a.im * b.re;

		return c;
	}
}
