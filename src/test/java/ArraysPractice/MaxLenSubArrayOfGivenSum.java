package ArraysPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxLenSubArrayOfGivenSum {

	public static List<int[]> maxLensubArrayForTheGivenSum(int [] arr,int k) {
		
	    List<int[]> list=new ArrayList<>();		
   
		for(int left=0;left<arr.length;left++) {
			int sum=0;
			for(int right=left;right<arr.length;right++) {
				sum=sum+arr[right];
				if(sum==k) {
					if(list.size()!=0) {
						int le=list.get(0).length;
						int len=(Arrays.copyOfRange(arr, left,right+1).length);
						if(le<len) {
							list.clear();
							list.add(Arrays.copyOfRange(arr, left,right+1));
						}
					}else {
						list.add(Arrays.copyOfRange(arr, left,right+1));
					}
				
					
				}
			}
		}
				
	return list;
	
}
	
	
	public static void main(String[] args) {
		int[] array= {1,2,2,0,3,4,5};
		int sum=5;
		
		List<int[]>ans=maxLensubArrayForTheGivenSum(array, sum);
		for(int[] a:ans) {
			System.out.println(Arrays.toString(a));
		}

	}

}
