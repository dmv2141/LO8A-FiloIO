package scoretrakker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class ScoreTrakker {
	
	private ArrayList<Student> students = new ArrayList<Student>();
	
	private void loadDataFile(String fileName) {
		
		Scanner inputStream;
		Student s;
		try {
			
			inputStream = new Scanner(new File(fileName));
			
			while (inputStream.hasNextLine()) {
				s = new Student(inputStream.next() + " " + inputStream.next(), inputStream.nextInt());
				students.add(s);
			}
			
		} catch(FileNotFoundException e) {
			System.out.println("Error: File " + fileName + " was not found.");
		}
		
		
	}
	
	private void printInOrder() {
		Collections.sort(students);
		
		for(Student student : students) {
			System.out.println(student);
		}
	}
	
	private void processFiles(String file){
		loadDataFile(file);
		printInOrder();
	}
	
	
	public static void main(String[] args) {
		ScoreTrakker s1 = new ScoreTrakker();
		s1.processFiles("scores.txt");
	}

}
