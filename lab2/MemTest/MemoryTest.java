class MemoryTest {

	public void showUsedMemory() {
	    long usedMem = Runtime.getRuntime().totalMemory() -
		Runtime.getRuntime().freeMemory();
	    System.out.println(usedMem);
	}

	public static void main(String[] args) {
		MemoryTest m = new MemoryTest();
		String a = "abc";
		m.showUsedMemory();
		a = new String("abc");
		m.showUsedMemory();
	}

}
