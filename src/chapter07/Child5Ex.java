package chapter07;

public class Child5Ex {

	public static void main(String[] args) {
//		Child5 c = new Child5();
//		c.field1 = "data1";
//		c.field2 = "data2";
//		System.out.println(c.field1);
//		System.out.println(c.field2);
//		c.method1();
//		c.method2();
//		c.method3();

//		부모 클래스인 Parent5 클래스 타입의 변수에 자식클래스인 Child5의 객체를 대입
		Parent5 parent = new Child5();
//		부모 클래스인 Parent가 가지고 있는 멤버는 정상적으로 사용이 가능
		parent.field1 = "data1";
		parent.method1();
		parent.method2();

//		자식 클래스 타입인 Child5 클래스의 전용 멤버인 field2 와 methid3 은 부모 클래스 타입의 멤버가 아니므로 현재 사용할 수 없음
//		parent.field2 = "data2";
//		parent.method3();

//		자식 클래스 타입의 전용 멤버를 사용하기 위해서는 다시 클래스 타입의 객체로 타입변환을 해야 함
//		부모 클래스 타입의 객체를 다시 자식 클래스 타입의 객체로 다시 타입 변환할 경우 자동 타입변환이 불가능 하므로 강제 타입변환을 해야 함
		Child5 child = (Child5) parent;
		child.field2 = "yyy";
		child.method3();
	}

}
