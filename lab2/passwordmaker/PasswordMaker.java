import java.util.Scanner;
class PasswordMaker {

	private static int MAGIC_NUMBER = 8;
	private static String MAGIC_STRING = "12345qwertasdfgzxcvb";
	private String fName;
	private String lName;
	private int age;
	PasswordMaker(String firstName, String lastName, int age) {
		this.fName = firstName;
		this.lName = lastName;
		this.age = age;
	}

	String getPassword() {
		String output = this.fName.substring(this.fName.length() -
		this.age % 3);

		RandomStringGenerator rs = new RandomStringGenerator(20, MAGIC_STRING);
		String buffer = rs.next();
		String res = buffer.substring(12);
		output += res;
		Integer intBuffer = age + this.lName.length();
		buffer = intBuffer.toString();
		output += buffer;

		return output;
	}

	public static void main(String[] args) {

		PasswordMaker pm = new PasswordMaker("razvan", "radoi", 20);
		System.out.println(pm.getPassword());
	}
}
