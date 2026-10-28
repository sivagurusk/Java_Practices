package inherit;

class Add{
	void add(int a,int b) {
		System.out.println("Add: "+(a+b));
	}
}

class Sub extends Add{
	void sub(int a,int b) {
		System.out.println("Sub: "+(a-b));
	}
}

class Multi extends Sub{
	void multi(int a,int b) {
		System.out.println("Multiply: "+(a*b));
	}
}

class Div extends Multi{
	void div(int a,int b) {
		System.out.println("Division: "+(a/b));
	}
}



public class Inherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Div a1=new Div();
		a1.add(10, 10);
		a1.sub(10, 2);
		a1.multi(5, 2);
		a1.div(20, 5);
	}

}
