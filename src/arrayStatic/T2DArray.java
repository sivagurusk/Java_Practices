package arrayStatic;


public class T2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr= {{6,7,8,9},{3,4,5},{1,2},{0}};
		
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
				System.out.print(arr[row][col]+" ");
			}
			System.out.println();
		}
		
	}

}
