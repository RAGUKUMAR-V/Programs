package InterviewPreparationPrograms;

import java.util.*;

public class TwoSumProblem {
	
	
	public static int[] solve(int[] array, int target, int n) {
		
		Map<Integer, Integer>map=new HashMap<>();
		
		int[] ans=new int[2];
		ans[0]=ans[1]=-1;
		
		for(int i=0;i<n;i++) {
			int num=array[i];
			int remain=target-num;
			if(map.containsKey(remain)) {
				ans[0]=map.get(remain);
				ans[1]=i;
				return ans;
			}
			
			map.put(array[i], i);
		}
		return ans;
		
	}

	public static void main(String[] args) {
		
		int [] arr= {1,3,4,2,8};
		          // 0,1,2,3,4       
		int target=5;
		int n=arr.length;
		int[] ans=solve(arr, target, n);
		
		System.out.println(ans[0] +","+ ans[1]);
		
		

	}

}
