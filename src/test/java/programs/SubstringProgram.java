package programs;

import  java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SubstringProgram {
	
	
	
	public static void substring(String name) {
		
		//List<String> sub=new ArrayList<String>();
		
		int count=0;
		 
		HashSet <String>subb=new HashSet<String>();
		
		for(int i=0;i<=name.length();i++) {
			for(int j=i+1;j<=name.length();j++) {
				subb.add(name.substring(i,j));
				count++;
			}
		}
		
		if(count==subb.size()) {
			System.out.println("Unique");
		}else {
			System.out.println("Duplicate");
		}
		
		
	}
	
	

	public static void main(String[] args) {


		String given ="ragukumar";
		
		
		SubstringProgram.substring(given);
		

	}

}
