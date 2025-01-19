package Patterns;

public class patterns {


	public static void pattern1(int n) {

		for(int i=1;i<=n;i++) {		
			for(int j=1;j<=i;j++) {
				System.out.print(j +" ");
			}		
			System.out.println();
		}
	}

	public static void pattern2(int n) {

		for(int i=1;i<=n;i++) {					
			for(int j=1;j<=i;j++) {
				System.out.print(i +" ");
			}	
			System.out.println();
		}
	}

	public static void pattern3(int n) {

		for(int i=1;i<=n;i++) {					
			for(int j=n;j>=i;j--) {
				System.out.print("* ");
			}	
			System.out.println();
		}
	}

	public static void pattern4(int n) {

		for(int i=1;i<=n;i++) {		
			int k=1;
			for(int j=n;j>=i;j--) {
				System.out.print(k +" ");
				k++;
			}
			k=1;
			System.out.println();
		}
	}

	public static void pattern5(int n) {

		for(int i=0;i<n;i++) {		

			for(int j=0;j<n-i-1;j++) {
				System.out.print(" ");

			}
			for(int j=0;j<2*i+1;j++) {
				System.out.print("*");

			}
			for(int j=0;j<n-i-1;j++) {
				System.out.print(" ");

			}

			System.out.println();
		}


	}

	public static void pattern6(int n) {

		for(int i=0;i<n;i++) {		

			for(char j='A';j<='A'+n-i-1;j++) {
				System.out.print(j +" ");

			}


			System.out.println();
		}


	}

	public static void pattern7(int n) {

		for(int i=0;i<n;i++) {		
			char ch=(char) ('A'+i);
			for(char j=0;j<=i;j++) {
				System.out.print(ch);

			}


			System.out.println();
		}


	}
	public static void main(String[] args) {


		int n=5;
		pattern7(n);
	}

}
