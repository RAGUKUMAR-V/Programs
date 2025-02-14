package ArraysPractice;

import java.util.*;

public class SubArraysOfGivenArray {

	public static List<int[]> subArrays(int [] arr) {
		List<int[]>list=new ArrayList<>();
		
		for(int left=0;left<arr.length;left++) {
			for(int right=left;right<arr.length;right++) {
				list.add(Arrays.copyOfRange(arr, left, right+1));
			}
		}
		return list;
	}
	
	public static void main(String[] args) {
		int[] array= {1,2,3,4,5};
		List<int[]>ls=subArrays(array);
		for(int[] ans:ls) {
			System.out.println(Arrays.toString(ans));
		}
	}

}
