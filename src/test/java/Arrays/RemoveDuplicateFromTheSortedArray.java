package Arrays;

public class RemoveDuplicateFromTheSortedArray {

	public static int solve(int [] array) {
		
		int i=0;
		for(int j=1;j<array.length;j++) {
			if(array[i]!=array[j]) {
				i++;
				array[i]=array[j];
			}
		}
		return i+1;
	}
	public static void main(String[] args) {
		int [] array= {1,2,2,3,4,5,6};
		int k=solve(array);
		for(int i=0;i<k;i++) {
			System.out.println(array[i]);
		}

	}

}
