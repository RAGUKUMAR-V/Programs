package Arrays;

public class CheckIfTheArrayIsSorted {
	
	public static boolean solve(int [] array) {
	
		
		for(int i=1;i<array.length;i++) {
			if(array[i]<array[i-1] ) {
				
				return false;
			}
			
		}
		
		return true;
	}

	public static void main(String[] args) {
		int [] array= {5,4,3,2,1};
		boolean ans=solve(array);
		System.out.println(ans);
	}

}
