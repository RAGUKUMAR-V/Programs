package Arrays;

public class MaxSumOfTheSubStrings {

	public static int solve(int[] array,int len) {
		int max=0;
		
		for(int i=0;i<len;i++) {
			for(int j=i;j<len;j++) {
				int sum=0;
				for(int k=i;k<j;k++) {
					sum=sum+array[k];
				}
				max=Math.max(max, sum);
			}
		}
		return max;
	}
	
	public static int solve2(int[] array,int len) {
		int max=0;
		int sum=0;
		
		for(int i=0;i<len;i++) {
			sum=sum+array[i];
			if(sum>max) {
				max=sum;
			}
			if(sum<0) {
				sum=0;
			}
		}
		return max;
	}
	
	public static int solve3(int[] array,int len) {
		int max=0;
		int sum=0;
		
		int ansStart=0,ansEnd=0;
		int start=0;
		
		for(int i=0;i<len;i++) {
			
			if(sum==0) {
				start=i;
			}
			sum=sum+array[i];
			if(sum>max) {
				max=sum;
				ansStart=start;
				ansEnd=i;
			}
			if(sum<0) {
				sum=0;
			}
		}
		
		for(int i=ansStart;i<=ansEnd;i++) {
			System.out.print(array[i]);
		}
		return max;
	}
	
	public static void main(String[] args) {
		int [] array= { -2, 1, -3, 4, -1, 2, 1, -5, 4};
		int len=array.length;
		int ans=solve3(array, len);
		System.out.println(ans);

	}

}
