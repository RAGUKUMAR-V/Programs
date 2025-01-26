package Arrays;

import java.util.*;

public class LongestSubArrayForTheGivenSum {
	
	
	public static int solve(int [] arr, int sum) {
		
		
		int len=0;
		
		for(int i=0;i<arr.length;i++) {
			int s=0;
			for(int j=i;j<arr.length;j++) {
				
				s=s+arr[j];
				if(s==sum) {
					len=Math.max(len,j-i+1);
				}
								
			}
		}
		return len;
		
	}
	
	public static int solve2(int [] arr, int k) {
		
		Map<Integer, Integer>map=new HashMap<>();
		int sum=0,Maxlen=0;
		
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			if(sum==k) {
				Maxlen=Math.max(Maxlen, i+1);
			}
			
			int rem=sum-k;
			
			if(map.containsKey(rem)) {
				int len=i-map.get(rem);
				Maxlen=Math.max(Maxlen, len);
			}
			
			if(!map.containsKey(sum)) {
				map.put(sum,1);
			}
			
		}
		return Maxlen;
		
	}

	public static void main(String[] args) {
		
		int[] array= {1,-1,1,-1,1};
		int maxlen=solve(array, 1);
		System.out.println(maxlen);
		
		

	}

}
