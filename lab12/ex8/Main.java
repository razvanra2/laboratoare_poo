class Parent {
    public Parent() {
        System.out.println("Parent 0");
    }
 
    public Parent(int x) {
        System.out.println("Parent 1");
    }
}
 
class Child extends Parent {
    public Child(int x) {
        System.out.println("Child 1");
    }
}

public class Main {
	public static void main(String[] args) {
		Child c = new Child(2);
	}
}
