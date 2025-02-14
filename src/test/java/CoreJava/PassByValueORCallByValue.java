package CoreJava;

public class PassByValueORCallByValue {

	public int sum(int x,int y) {
        x=30; 
        y=40;
		
		int c=x+y;
		return c;
			
	}
	
	
	public static void main(String[] args) {
	
		PassByValueORCallByValue obj=new PassByValueORCallByValue();
		
		int x=10;int y=20;
		
		int ans=obj.sum(x, y);
		System.out.println(ans);
		System.out.println(x);
		System.out.println(y);
		
	}

}
