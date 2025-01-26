package Arrays;

import java.util.*;

public class IntersectionOfTheArrays {
	
	public static List<Integer> solve(int [] arr1, int[] arr2, int m, int n) {
		int i=0,j=0;
		List<Integer>list=new ArrayList<>();
		
		
		while(i<n && j <m ) {
			if(arr1[i]<arr2[j]) {
				i++;
			}else if(arr1[i]>arr2[j]) {
				j++;
			}else {
				list.add(arr1[i]);
				i++;
				j++;
			}
		}
		
		return list;
	}
	

	public static void main(String[] args) {
				
		int[] array1= {1,1,1,2,2,3,4,4,5,5,6,7,8,9,9};
		int n=array1.length;
		
		int[] array2= {1,1,2,2,3,3,4,4,5,6,7,7,8,8,8,9,9};
		int m=array2.length;
		List<Integer> list=solve(array1, array2, m, n);
		
		for(int in:list) {
			System.out.print(in);
		}
	}

}
