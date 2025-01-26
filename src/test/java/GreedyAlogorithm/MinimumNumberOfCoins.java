package GreedyAlogorithm;

import java.util.Vector;

public class MinimumNumberOfCoins {

public static void findmin(int [] arr, int value) {
	
	Vector<Integer> order=new Vector<>();
	
	for(int i=arr.length-1;i>=0;i--) {
		while(value>=arr[i]) {
			value=value-arr[i];
			order.add(arr[i]);
		}
	}
	
	for(int i=0;i<order.size();i++) {
		System.out.print(order.get(i)+ " ");
	}
	
}
	
	
	public static void main(String[] args) {
		
		
		int [] coins= {1,2,5,10,20,50,100,200,500,2000};
		int value=6;
		findmin(coins, value);

	}

}
