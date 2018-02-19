
public class Main {
	public static void main(String args[]) {
		ComplexNumber nr1 = new ComplexNumber();
		ComplexNumber nr2 = new ComplexNumber();

		nr1.re = 2; nr1.im = 3;
		nr2.re = 3; nr2.im = 8;

		Operations operation = new Operations();

		ComplexNumber res1 = operation.add(nr1, nr2);
		ComplexNumber res2 = operation.multiply(nr1, nr2);

		System.out.println("(2 + 3i) + (3 + 8i) = " + res1.re + " + " + res1.im
		+ "i");
		System.out.println("(2 + 3i) * (3 + 8i) = " + res2.re + " + " + res2.im
		+ "i");
	}
}
