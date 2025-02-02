package Arrays;

import java.util.HashMap;
import java.util.* ;

import javax.print.attribute.HashAttributeSet;

public class TwoSumProblem {

	public static String solve(int[] array, int len, int target) {
		
		//****if it's a sorted array we can use this or else we have to sort the array*****//
		
		int left=0,right=len-1;
		int sum=0;
		while(left<right) {
			sum=array[left]+array[right];
			if(sum==target) {
				return "Yes";
			}
			else if(sum<target) {
				left++;
				
			}else {
				right--;
			}
		}
		return "No";
	}
	
	public static int[] solve2(int[] array, int len, int target) {
		
		//****it will work for non sorted the array as well*****//
		
		int[] ans=new int[2];
		ans[0]=ans[1]=-1;
		Map<Integer, Integer>map=new HashMap<>();
		for(int i=0;i<len;i++) {
			int num=array[i];
			int remaining=target-num;
			
			if(map.containsKey(remaining)) {
				ans[0]=i;
				ans[1]=map.get(remaining);
				return ans;
			}
			map.put(array[i], i);
		}
		return ans;
	
	}
	
	public static void main(String[] args) {
		
		int[] array= {1,2,3,4,6,7,7,8};
		int len=array.length;
		int target=10;
		int[] ans=solve2(array, len,target );
		System.out.println(ans[0]+ " "+ans[1]);
		
		
		

	}

}
