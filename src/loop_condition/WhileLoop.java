package loop_condition;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=1;
		while(i<=20) {
			if(i%6==0) {
				i++;
				continue;
			}
			
			
			if(i==15) {
				break;
			}
			System.out.println(i++);
		}
		int j=0;
		while(j<=20) {
			j+=2;
			System.out.println(j);
		}
		
	}

}
