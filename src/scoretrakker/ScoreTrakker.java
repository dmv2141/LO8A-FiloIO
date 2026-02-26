package scoretrakker;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class ScoreTrakker {
	
	private ArrayList<Student> students = new ArrayList<Student>();
	
	private void loadDataFile(String fileName) {
		Scanner inputStream;
		try {
		inputStream = new Scanner(new File(fileName));
		}catch(FileNotFoundException e) {
			System.out.println("Error: File " + fileName + " was not found.");
		}
		
		
		
		
		
	}
	
	private void printInOrder() {
		
	}
	
	private void processFiles(){
	//Calls loadDataFile passing in name of correctly formatted file
	//Calls printInOrderMethod
		
	}
	
	
	public static void main(String[] args) {
		ScoreTrakker s1 = new ScoreTrakker();
		s1.processFiles();
	}

}
