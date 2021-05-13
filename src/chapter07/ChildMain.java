package chapter07;

public class ChildMain {

	public static void main(String[] args) {
		Parent p = new Parent();

		p.method1();
		p.method2();

		System.out.println("-----------");

		child c = new child();

		c.method1();
		c.method2();
		c.method3();

	}

}
