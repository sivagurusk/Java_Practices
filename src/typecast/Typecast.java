package typecast;

public class Typecast {
	
	public void Cast() {
		System.out.println("<==Type casting==>");
		String number="100";
		int value=Integer.parseInt(number);
		System.out.println(value+10);
		
		float digit=value;
		System.out.println(digit);
		
		short a=10;
		int ain=(int)a;
		System.out.println(ain);
		
		
		
	}
	
	public static void Return() {
		System.out.println("return");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Typecast cast=new Typecast();
		cast.Cast();
		Return();
		Typecast.Return();
	}

}
