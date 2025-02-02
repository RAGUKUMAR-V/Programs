package Recurssion;

public class ReverseArray {


	static void reverse(int l, int r, int[] arr ) {

		if(l>=r) {
			return;
		}
		swap(l,r, arr);
		reverse(l+1, r-1, arr);


	}

	static void reverseWithSinglePointer(int l, int r, int[] arr ) {

		if(l>=r/2) {
			return;
		}
		swap(l,r-l-1, arr);
		reverseWithSinglePointer(l+1, r, arr);


	}



	public static void swap(int i, int j, int[] a) {


		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;


	}

	public static void main(String[] args) {

		int[] array= {1,2,3,4,5};
		int last=array.length;
		int first=0;

		//reverse(first,last,array);
		reverseWithSinglePointer(first,last,array);

		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}

}
