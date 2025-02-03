package Arrays;

import java.util.*;

public class PossibleSubArraysFortheGivenSum {

	public static int solve (int[] array, int k) {
		int count=0;
		
		for(int i=0;i<array.length;i++) {
			
			int sum=0;
			for(int j=i;j<array.length;j++) {
				sum=sum+array[j];
				if(sum==k) {
					count++;
				}
			}
			
			
		}
		
		return count;
	}
	
	public static int solve2 (int[] array, int k) {
		int presum=0, count=0;
		
		Map<Integer,Integer>map=new HashMap<>();
		
		map.put(0,1);
		
		for(int i=0;i<array.length;i++) {
			
			presum=presum+array[i];
			
			int remove=presum-k;
			 count=count+map.getOrDefault(remove, 0);
			map.put(presum, map.getOrDefault(presum, 0)+1);
		}
		
		return count;
	}
	
	
	
	public static void main(String[] args) {
		
		int [] array= {1,1,1,1,1};
		int sum=3;
		int ans=solve2(array, sum);
		System.out.println(ans);

	}

}
