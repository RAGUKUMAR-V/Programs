package InterviewPreparationPrograms;

import java.io.File;

public class Demo {

	public static void main(String[] args) {
	
		System.out.println("File is Present");
		File file=new File("C:\\Users\\Ragukumar\\OneDrive\\Documents");
		
		File[] listfile=file.listFiles();
		
		for(File s:listfile) {
			if(s.getName().equals("Candidate.pptx")) {
				System.out.println("File is Present");
			}
		}
		
	}

}
