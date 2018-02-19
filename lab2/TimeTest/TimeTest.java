class TimeTest {
	private long run1() {
    	long start = System.nanoTime();
		addType1();
    	return System.nanoTime() - start;
	}

	private void addType1() {
		int nr = new Integer(2 + 3);
	}

	private long run2() {
		long start = System.nanoTime();
		addType2();
		return System.nanoTime() - start;
	}
	private void addType2() {
		int nr = 2 + 3;
	}

	public static void main(String[] args) {
		TimeTest t= new TimeTest();
		long time1 = t.run1();
		long time2 = t.run2();

		System.out.println(time1 + " " + time2);
	}
}
