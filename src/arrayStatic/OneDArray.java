package arrayStatic;
import java.util.*;

public class OneDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the size: ");
		int size=in.nextInt();
		
		int[] arr=new int[size];
		
		for(int i=0;i<size;i++) {
			System.out.print("Enter the array value index["+i+"]:");
			arr[i]=in.nextInt();
		}
		
		for(int array : arr) {
			System.out.print(array+" ");
		}
		System.out.println();
		System.out.println("===========================================");
		String[] name=new String[size];
		in.nextLine();
		
		for(int i=0;i<size;i++) {
			System.out.print("Enter the array value index["+i+"]:");
			name[i]=in.nextLine();	
		}
		
		for(String names : name) {
			System.out.print(names+" ");
		}
		
	}

}
