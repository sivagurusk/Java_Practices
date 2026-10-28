package oops;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstraction a1=new FirstClass();
		a1.Employee("Guru","Good");
		a1.Display("Guru","Bad");
		
		Abstraction a2=new Secondclass();
		a2.Employee("Guru","Good");
		a2.Display("Guru","bad");
	}

}
