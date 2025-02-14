package ArraysPractice;

import java.util.*;

public class MaxLenSubStringWithoutDuplicate {

	public static int maxSubString(int [] arr) {
		int le=arr.length;		
		int left=0, right=0,maxlen=0;	
		
		Map<Integer,Integer>map=new HashMap<>();			
		while(right<le) {			
			if(map.containsKey(arr[right])) {
				if(map.get(arr[right])+1>left )
					//System.out.println(map.get(arr[right])+1);
				    left=map.get(arr[right])+1;
				}											
				map.put(arr[right], right);
				if((right-left+1)>maxlen) {
					maxlen=right-left+1;
				}
				right++;						
		}
		return maxlen;
	}
	
	public static void main(String[] args) {
		
		int[] array= {1,1,1,1};
		int ans=maxSubString(array);
		System.out.println(ans);

	}

}
