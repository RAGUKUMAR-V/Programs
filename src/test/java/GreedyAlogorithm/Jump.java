package GreedyAlogorithm;

public class Jump {
	
	
	public static boolean solve(int[] arr) {
		
		int maxindex=0;
		for(int i=0;i<arr.length;i++) {
			if(i>maxindex) {
				return false;
			}
			maxindex=Math.max(maxindex,i+arr[i]);			
		}
		return true;
	}

	public static void main(String[] args) {
		
		int[] steps= {1,2,1,2,0,4};
		boolean ans=solve(steps);
		if(ans) {
			System.out.println("Yes we can go till end with the given array");
		}else {
			System.out.println("No we can't go till end with the given array");
		}

	}

}
