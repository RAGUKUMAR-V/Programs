package CoreJava;

public class Immutables {


	public static void main(String[] args) {

		String a="ragu";	
		a="kumar"; 
		//only pointer "a" is now pointing 
		//to new value "kumar". The "ragu" is eligible for garbage collection"
		System.out.println(a);

		//Integer,Float, Double, Long also immutable in java


	}

}
