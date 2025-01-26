package Arrays;

public class MaxConsequetiveOnesInTheArray {

	public static int solve1(int [] arr) {
		int count=0, max=0;		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==1) {
				count++;
			}
			else {
				    count=0;
			}			
			max=Math.max(max, count);				
		}		
		return max;		
	}
	
	public static int solve2(int [] arr) {
		int count=0, max=0;		
		for(int i=0;i<arr.length;i++) {	
			if(arr[i]==1) {
				count++;
				if(count>max) {
					max=count;
				}
			}
			
			else{
				count=0;
			}
						
		}		
		return max;		
	}
	
	public static void main(String[] args) {
		
		int [] array= {1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1};
		
		int maximunOnes=solve2(array);
		System.out.println(maximunOnes);
		
	}

}
