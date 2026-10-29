package interfaces;

public interface Interfaces
{
	public void add();
	public static final int a=10;
	public static final int b=2;
	private void sub() {
		
	}
	static void multiply() {
		System.out.println("multiply: "+(a*b));
	}
	default void div() {
		System.out.println("div: "+(a/b));
	}
}
