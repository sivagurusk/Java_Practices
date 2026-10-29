package polymorphism;

class A{
	public void method() {
		System.out.println("child 1 methods");
	}
}

class B extends A{
	public void method() {
		System.out.println("child 2 methods");
	}
}
public class Overrides {
	public static void main(String[] args) {
		B b=new B();
		b.method();
	}

}
