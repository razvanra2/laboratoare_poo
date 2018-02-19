class Point {
	private float xCoord;
	private float yCoord;

	Point(float x, float y) {
		this.xCoord = x;
		this.yCoord = y;
	}

	void changeCoords(float newX, float newY) {
		this.xCoord = newX;
		this.yCoord = newY;
	}

	void dispPoint() {
		System.out.println("Coords are: " +  this.xCoord + " " + this.yCoord);
	}

	public static void main(String[] arsgs) {
		Point myPoint = new Point(2,3);
		myPoint.dispPoint();
		myPoint.changeCoords(4,5);
		System.out.println("Point coordinates have been changed");
		myPoint.dispPoint();
	}
}
