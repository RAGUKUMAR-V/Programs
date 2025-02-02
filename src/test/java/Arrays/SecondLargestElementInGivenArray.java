package Arrays;

public class SecondLargestElementInGivenArray {

	public static int solve(int[] array) {
		
		int length=array.length;
		int max=Integer.MIN_VALUE, secMax=Integer.MIN_VALUE;
		
		for(int i=0;i<length;i++) {
			if(array[i]>max){
				secMax=max;
				max=Math.max(max, array[i]);
				//or we can use like
				//max=array[i];
			}else if(array[i]>secMax && array[i]!=max) {
					secMax=Math.max(secMax, array[i]);
				}
			
		}
		
		return secMax;
	}
	
	public static void main(String[] args) {
		int [] array= {2,1,3};
		int ans=solve(array);
		System.out.println(ans);
		
	}

}
