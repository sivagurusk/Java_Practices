package Logic_operator;

public class Logic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		int b=7;
		//8421
		//-----
		//0101
		//0111
		//-----
		//0010
		
		//logical
		System.out.println(a==5 && b!=6);
		System.out.println(a==5 || b!=6);
		
		//bitwise
		System.out.println(a^b);
		System.out.println(a&b); //bitwise and
		System.out.println(a|b);
		System.out.println(~-7);//6
		System.out.println(~6);//-7
		
		//ternary
		int age=21;
		String vote=age>=18? "Eligible": "Not Eligible";
		System.out.println(vote);
		
	}

}
