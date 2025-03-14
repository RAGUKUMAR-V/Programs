package InterviewPreparationPrograms;

public class LongestPolindromicSubSeq {

	public static int solve (String s) {
		
		int n=s.length();
		
		int[][] dp=new int[n][n];
		
		for(int i=0;i<n;i++) {
			dp[i][i]=1;
		}
		
		for(int length=2;length<=n;length++) {
			for(int i=0;i<=n-length;i++) {
				int j=i+length-1;
				
				if(s.charAt(i) == s.charAt(j)) {
					dp[i][j]=dp[i+1][j-1]+2;
				}else {
					dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]); 
				}
			}
			
						
		}
		 return dp[0][n - 1];
		
	}
	
	public static void main(String[] args) {
	
		String s="ragukumar";
		
		int ans=solve(s);
		System.out.println(ans);
		

	}

}
