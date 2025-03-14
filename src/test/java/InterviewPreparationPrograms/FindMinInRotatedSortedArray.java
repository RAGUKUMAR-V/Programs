package InterviewPreparationPrograms;

public class FindMinInRotatedSortedArray {

	public static int solve(int[] array) {
		
		int left=0;
		int right=array.length-1;
		
		while(left<right) {
			
			int mid=left+(right-left)/2;
			
			if(array[mid]>array[right]) {
				left=mid+1;
			}else {
				right=mid;
			}
		}
		return array[left];
	}
	
	public static void main(String[] args) {
		
		
		int[] array= {3,4,5,1,2};
		int ans=solve(array);
		System.out.println(ans);

	}

}
