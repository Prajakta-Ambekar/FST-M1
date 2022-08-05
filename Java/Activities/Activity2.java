
import java.util.Arrays;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arrNum= {10, 77, 10, 54, -11, 10};
		 
		System.out.println("Oringinal Array: "+ Arrays.toString(arrNum)); 
		 
		int fixedSum=30;
		int searchNum=10;
		
		System.out.println("Result:"+ result(arrNum, searchNum, fixedSum));
		}

	private static boolean result(int[] Num, int searchNum, int fixedSum) {
		int temp_Sum=0;
		// TODO Auto-generated method stub
		for(int number:Num) {
			if(number==searchNum) {
				temp_Sum+=searchNum;
			}
			if(temp_Sum>30) {
				break;
			}
			
		}
		//System.out.println("Sum of all 10 number " +temp_Sum);
		return temp_Sum==fixedSum;
	}

}
