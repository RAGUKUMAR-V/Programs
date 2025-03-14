package InterviewPreparationPrograms;

public class JustTry {
	
	public static int solve(int[] array) {
		
	int	longest=1;
	for(int i=0;i<array.length;i++) {
		int x=array[i];
		int count=1;
		while(ls(array,x+1)==true) {
			x=x+1;
			count=count+1;
		}
		if(count>longest) {
			longest=count;
		}
	}
		
	return longest;
	}
	
	public static boolean ls(int[] array, int n) {
		
		for(int i=0;i<array.length;i++) {
			if(array[i]==n) {
				return true;
			}
		}
		
		return false;
	}

	public static void main(String[] args) {
		
		int[] array= {2,8,6,4,100,1, 55};
		int ans=solve(array);
		System.out.println(ans);
		

	}

}
