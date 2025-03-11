package InterviewPreparationPrograms;

import java.util.*;

public class SumProblemWithoutOperators {

	public static int solve(int a, int b) {
		
		while(b!=0) {
			int carry = a & b;
			
			a= a ^ b;
			
			b= carry << 1;
		}
		
		return a;
	
	}
	
	public static void main(String[] args) {
		
		int a=-2;
		int  b=-3;
		
          int ans=solve(a, b);
          System.out.println(ans);
	}

}
