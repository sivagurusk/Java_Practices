package arrayStatic;

public class StaticArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {8,7,4,5,7,3,6,1};
		
		for(int i : arr) {
			System.out.print(i+" ");
		}
		
		String[] name=new String[3];
		name[0]="Guru";
		name[1]="SK";
		
		for(String data:name) {
			System.out.print(data+" ");
		}
		
		int[] number=new int[5];
		number[0]=7;
		number[1]=2;
		number[4]=5;
		
		for(int datas:number) {
			System.out.print(datas+" ");
		}
	}

}
