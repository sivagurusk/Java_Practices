package polymorphism;

public class Overload {

	public void add(int a,int b) {
		System.out.println(a+b);
	}
	
	public void add(short a,int b) {
		System.out.println(a-b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overload over=new Overload();
		over.add(2,2);
		over.add(4, 1);
	}

}
