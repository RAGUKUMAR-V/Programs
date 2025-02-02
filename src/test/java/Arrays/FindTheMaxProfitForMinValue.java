package Arrays;

public class FindTheMaxProfitForMinValue {

	public static int maxProfit(int [] array) {
		int maxprofit=0;
		int minvalue=Integer.MAX_VALUE;
		
		for(int i=0;i<array.length;i++) {
			if(array[i]<minvalue) {
				minvalue=array[i];
			}
			if(array[i]-minvalue>maxprofit) {
				maxprofit=array[i]-minvalue;
			}
		}
		return maxprofit;
		
	}
	
	public static void main(String[] args) {
		
		int arr[] = {1,0,5,3,6,1};
		int ans=maxProfit(arr);
		System.out.println(ans);
	}

}
