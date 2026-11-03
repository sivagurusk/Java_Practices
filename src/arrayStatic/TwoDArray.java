package arrayStatic;
import java.util.*;
public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size : ");
		int size=in.nextInt();
		int[][] arr=new int[size][size];
		
		for(int row=0;row<size;row++) {
			for(int col=0;col<size;col++) {
				System.out.print("Enter the value: ");
				arr[row][col]=in.nextInt();
			}
		}
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr.length;col++) {
				System.out.print(arr[row][col]+" ");
			}
			System.out.println();
			
		}
	}

}
