package CoreJava;

public class PassByReferenceORCallByReference {

	int a;
	int b;
	
	public void swap(PassByReferenceORCallByReference t) {
		
		int temp=t.a;
		t.a=t.b;
		t.b=temp;
	}
	
	public static void main(String[] args) {
		PassByReferenceORCallByReference obj=new PassByReferenceORCallByReference();
		obj.a=10;
		obj.b=20;
		System.out.println(obj.a);
		System.out.println(obj.b);
		obj.swap(obj);
		System.out.println(obj.a);
		System.out.println(obj.b);

	}

}
