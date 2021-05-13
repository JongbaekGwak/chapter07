package chapter07;

public class Parent3 {
	public void method1() {
		System.out.println("Parent3 클래스의 method1() 호출");
	}
	
//	메서드에 final 키워드를 사용
//	해당 메서드는 오버라이드 되지 않음
//	상속은 문제없이 잘됨
	public final void method2() {
		System.out.println("Parent3 클래스의 final method2() 호출");
	}
}
