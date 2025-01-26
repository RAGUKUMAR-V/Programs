package GreedyAlogorithm;

import java.util.Arrays;

public class MinPlatformNeededForTrain {
	
	public static int solve(int[] arrival, int[] departure) {
		
	    Arrays.sort(arrival);
	    Arrays.sort(departure);
		int i=1, j=0, platformNeeded=1, result=1; 
		while(i<arrival.length && j<departure.length) {
			if(arrival[i]<=departure[j]) {
				platformNeeded++;
				i++;
			}else if (arrival[i]>departure[j]){
				platformNeeded--;
				j++;
			}
			
			if(platformNeeded>result) {
				result=platformNeeded;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] arr ={900,945,955,1100,1500,1800};
		int[] dep={920,1200,1130,1150,1900,2000};
		
		int platformneeded=solve(arr, dep);
		
		System.out.println(platformneeded);

	}

}
