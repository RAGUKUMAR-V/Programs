package ArraysPractice;

public class MaxSumAndMinSumForTheGivenSubstringSize {

    public static void findMaxMinSum(int[] arr, int k) {
        int n = arr.length;

        if (n < k) {
            System.out.println("Array size is smaller than window size");
            return;
        }

        // Calculate the sum of the first window of size k
        int maxSum = 0, minSum = 0, windowSum = 0;
        
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        
        maxSum = windowSum;
        minSum = windowSum;

        // Slide the window over the rest of the array
        for (int i = k; i < n; i++) {
            // Slide the window to the right: subtract the leftmost element, and add the new element
            windowSum = windowSum - arr[i - k] + arr[i];
            
            // Update max and min sums
            if (windowSum > maxSum) {
                maxSum = windowSum;
            }
            if (windowSum < minSum) {
                minSum = windowSum;
            }
        }

        // Print the results
        System.out.println("Maximum sum of a subarray of size " + k + ": " + maxSum);
        System.out.println("Minimum sum of a subarray of size " + k + ": " + minSum);
    }
    
    public static void solve(int[] arr, int k) {
    	
    	int le=arr.length;
    	
    	int right=0, left=0;
    	int windowSum=0,maxSum=0;
    	int minSum=Integer.MAX_VALUE;
    	int  count=0;
    	
    	for(right=0;right<le;right++) {   
    		windowSum=windowSum+arr[right];
    		count++;   		
    		if(count==k) {
    			
    			if(windowSum>maxSum) {
    				maxSum=windowSum;
    			}
    			
    			if(windowSum<minSum) {
    				minSum=windowSum;
    			}
    			windowSum=0;
    			left++;
    			right=left;
    			count=0;
    		}    		
    	} 
    	System.out.println("MaxSum For the given SubString Length="+k+" is : " +maxSum);
    	System.out.println("MinSum For the given SubString Length="+k+" is : " +minSum);
    		
    }		
	public static void main(String[] args) {
		
		  int[] arr = {1,3,4,6,7};
	        int k = 2;
	        solve(arr, k);
	     
		
	}

}
