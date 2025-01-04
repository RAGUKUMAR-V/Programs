package Recurssion;

public class fibonaciSeries {
	
	
	public static int fibo(int n) {
		
		if(n==1 || n==0)
			return n;
		return fibo(n-1)+fibo(n-2);
		
		
	}
	

	public static void main(String[] args) {
		int n=10;
        System.out.println(fibo(n));
        
        for(int i=0;i<=n;i++) {
        	System.out.print(fibo(i)+ " ");
        }
        
       
	}

}
