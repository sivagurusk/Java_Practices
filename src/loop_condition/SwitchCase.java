package loop_condition;
import java.util.*;
public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Value 1 : ");
		int value1=in.nextInt();
		System.out.println("Enter the Value 2 : ");
		int value2=in.nextInt();
		
		System.out.println("Enter the choice : ");
		System.out.println("1.Add");
		System.out.println("2.Sub");
		System.out.println("3.Multi");
		System.out.println("4.Div");
		int choice=in.nextInt();
		
		switch(choice) {
		case 1:
			value1+=value2;
			System.out.println(value1);
			break;
		
		case 2:
			value1-=value2;
			System.out.println(value1);
			break;
		
		case 3:
			value1*=value2;
			System.out.println(value1);
			break;
		
		case 4:
			value1/=value2;
			System.out.println(value1);
			break;
		
		default:
			System.out.println("invalid input...");
		
		}

	}
}
