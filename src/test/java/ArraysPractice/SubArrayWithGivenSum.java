package ArraysPractice;

import java.util.*;

import javax.print.attribute.HashAttributeSet;

public class SubArrayWithGivenSum {
	
	
	public static List<int[]> subArrayForTheGivenSum(int [] arr,int k) {
		
		    List<int[]> list=new ArrayList<>();		
	   
			for(int left=0;left<arr.length;left++) {
				int sum=0;
				for(int right=left;right<arr.length;right++) {
					sum=sum+arr[right];
					if(sum==k) {
						list.add(Arrays.copyOfRange(arr, left,right+1));
						
					}
				}
			}
			
				
		return list;
		
	}

	public static void main(String[] args) {
		
		int[] array= {1,2,2,0,3,4,5};
		int sum=5;
		
		List<int[]>ans=subArrayForTheGivenSum(array, sum);
		for(int[] a:ans) {
			System.out.println(Arrays.toString(a));
		}

	}

}
