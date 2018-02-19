public class Form {

	String Color;

	public Form() {
		this.Color = null;
	}

	public Form(String newColor) {
		this.Color = newColor;
	}

	public float getArea() {
		return 0;
	}

	public String toString(){
		return this.Color;
	}

	void printDimensions() {}
}

class Triangle extends Form {
	float height;
	float base;

	Triangle() {
		super();
		this.height = 0;
		this.base = 0;
	}
	Triangle(float newHeight, float newBase, String newColor){
		super(newColor);
		this.height = newHeight;
		this.base = newBase;
	}
	public float getArea(){
		return this.height * this.base / 2;
	}

	public String toString() {
		String output = "Triunghi: ";
		output = output + super.toString() + " ";
		String areaStr = String.valueOf(this.getArea());
		output = output + areaStr;
		return output;
	}

	@Override public boolean equals(Object other) {
		boolean result = false;
		if (other instanceof Triangle) {
			Triangle that = (Triangle) other;
			String thatTSOutput = that.toString();
			String thisTSOutput = this.toString();
			result = (that.canEqual(this) &&
			this.height == that.height &&
			this.base == that.base &&
			thatTSOutput.equals(thisTSOutput));
		}
		return result;
	}

	@Override public int hashCode() {
		return (41 * (41 + (int)this.height + (int)this.base));
	}

	public boolean canEqual(Object other) {
		return (other instanceof Triangle);
	}

	void printTriangleDimensions() {
		System.out.println("Dimensions: "+this.base+" "+this.height);
	}
	void printDimensions() {
		System.out.println("Dimensions: "+this.base+" "+this.height);
	}
}

class Circle extends Form {
	float radius;

	Circle() {
		super();
		this.radius = 0;
	}
	Circle(float newRadius, String newColor) {
		super(newColor);
		this.radius = newRadius;
	}

	public float getArea() {
		return 2 * (float)3.1415 * this.radius;
	}

	public String toString() {
		String output = "Cerc: ";
		output = output + super.toString() + " ";
		String areaStr = String.valueOf(this.getArea());
		output = output + areaStr;
		return output;
	}
	public void printCircleDimensions() {
		System.out.println("Dimensions: "+this.radius);
	}
	public void printDimensions() {
		System.out.println("Dimensions: "+this.radius);
	}
}

class Testing {

	public static void main(String[] args) {
		Triangle myTriangle = new Triangle(3, 4, "red");
		Circle myCircle = new Circle(5, "green");

		String myTriangleColor = myTriangle.toString();
		System.out.println(myTriangleColor);
		float triangleArea = myTriangle.getArea();
		System.out.println(triangleArea);

		String myCircleColor = myCircle.toString();
		System.out.println(myCircleColor);
		float circleArea = myCircle.getArea();
		System.out.println(circleArea);

		Triangle testTr1 = new Triangle(1, 2, "blue");
		Triangle testTr2 = new Triangle(1, 2, "blue");
		Triangle testTr3 = new Triangle(1,5, "red");

		System.out.println(testTr1.equals(testTr1));
		System.out.println(testTr1.equals(testTr2));
		System.out.println(testTr2.equals(testTr3));

		Form[] myForms = new Form[2];
		myForms[0] = new Triangle(6, 7, "green");
		myForms[1] = new Circle(12, "fuchsia");

		for(int i = 0; i < 2; i++ ) {
			String outStr = myForms[i].toString();
			System.out.println(outStr);
		}

		System.out.println("USING INSTANCE OF:");
		for(int i = 0; i < 2; i++ ) {
			if(myForms[i] instanceof Triangle)
				((Triangle)myForms[i]).printTriangleDimensions();
			else
				((Circle)myForms[i]).printCircleDimensions();
		}
		System.out.println("CASTING CIRCLE TO TRIANGLE THROWS NULL POINTER EXCEPTION");

		System.out.println("NOT USING INSTANCE OF:");
		for(int i = 0; i < 2; i++ ) {
			if(myForms[i] instanceof Triangle)
				myForms[i].printDimensions();
			else
				myForms[i].printDimensions();
		}
	}
}
