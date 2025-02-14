package Abstraction;

public class DummyCalculator extends Parent{

	int num;
	String msg;
	
	DummyCalculator(){
		this.num=super.numbers;
		this.msg=super.message;
		
		System.out.println(num +msg);
	}
	

	@Override
	void sum() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void sub() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void multi() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void divi() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	public static void main(String[] args) {
	

		
		DummyCalculator obj=new DummyCalculator();
		
	}


}
