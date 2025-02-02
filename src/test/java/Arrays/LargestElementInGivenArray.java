package Arrays;

public class LargestElementInGivenArray {

	public static int  solve(int [] array) {
		
		int max=Integer.MIN_VALUE;
		for(int i=0;i<array.length;i++) {
			if(array[i]>max) {
				//max=array[i];
				max=Math.max(max, array[i]);
			}
		}
		return max;
	}
	
	public static int  solve2(int [] array) {
		
		int max=Integer.MIN_VALUE;
	    int right=0, left=array.length, mid=0 ;
		mid=(left+right)/2;
		for(int i=mid; i<left;i++) {
			if(array[i]>max) {
				//max=array[i];
				max=Math.max(max, array[i]);
			}	  		  
	  }
	return max;
	}	
	
	public static void main(String[] args) {
		
		int [] array= {-5,-1,2,5,6,7,8,23,54,68,25,-34,-99,0};
		int ans=solve2(array);
		System.out.println(ans);
	}

}
