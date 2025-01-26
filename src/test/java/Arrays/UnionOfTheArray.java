package Arrays;

import java.util.*;

public class UnionOfTheArray {
	
	//Union of the array we have to take all the numbers from both the array without duplicate
	
	public static Set<Integer> solve(int[] arr1, int[] arr2) {
		
		
		Set<Integer>set=new HashSet<>();
		
		for(int i=0;i<arr1.length;i++) {
			set.add(arr1[i]);
		}
		
		for(int j=0;j<arr2.length;j++) {
			set.add(arr2[j]);
		}
		
		return set;
		
	}
	
	

	public static void main(String[] args) {
		
		int[] array1= {1,2,4,5,6,9};
		
		int[] array2= {1,3,4,6,7,7,8,8};
		
		Set<Integer>set=solve(array1, array2);
		
		for(int in:set) {
			System.out.print(in);
		}

	}

}
