package programs;

public class Armstrongnumber {
	
	
	public static void armstrong(int num) {
		int cube=0;
		int r;
		int t;
		t=num;
		while(num>0) {
			r=num%10;
			num=num/10;
			cube=cube+(r*r*r);
		}
		if(t==cube) {
			System.out.println("armstrong number");
		}else {
			System.out.println("not armstrong number");
		}
		
		
	}

	public static void main(String[] args) {
		Armstrongnumber.armstrong(1);

	}

}
