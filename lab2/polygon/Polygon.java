class Polygon {
	private int cornersNr;
	private Point polyCorners[];

	Polygon(int n) {
		this.cornersNr = n;
		polyCorners = new Point[n];
	}

	Polygon(int[] coords) {
		this.cornersNr = coords.length / 2;
		int coordsSize = coords.length;
		this.polyCorners = new Point[this.cornersNr];

		int counter = 0;
		for(int i = 0; i < coordsSize; i= i + 2) {
			polyCorners[counter] = new Point(coords[i], coords[i+1]);
			counter++;
		}
	}

	void printCoords() {
		for(int i = 0; i < this.cornersNr; i++) {
			polyCorners[i].dispPoint();
		}
	}

	public static void main(String[] arsgs) {
		Polygon myPolygon1 = new Polygon(4);
		int[] myCoords = {2, 3, 4, 5, 6, 7, 8, 9};

		Polygon myPolygon2 = new Polygon(myCoords);

		myPolygon2.printCoords();
	}
}
