package scoretrakker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class ScoreTrakker {
	
	private ArrayList<Student> students = new ArrayList<Student>();
	private String[] files = {"scores.txt", "badscore.txt", "nofile.txt" };
	
	private void loadDataFile(String fileName) throws FileNotFoundException{
		
		Student s;
		try (Scanner inputStream = new Scanner(new File(fileName))){ //Try Statement (with Resources) 
			
			while (inputStream.hasNextLine()) {
				String name = "";
                String scoreLine = "";
				int score;
				
				name = inputStream.nextLine();
				
				if (!inputStream.hasNextLine()) //Verify consistent input
                    break;
				
				scoreLine = inputStream.nextLine();
				
				try {
					score = Integer.parseInt(scoreLine);
					s = new Student(name, score);
					students.add(s);
				}
				catch(NumberFormatException e) {
					System.out.println("Incorrect Format for " + name + " not a valid score: " + scoreLine + "\n");
				}
				
			}
			
		}
		
	}
	
	private void printInOrder() {
		Collections.sort(students);
		
		for(Student student : students) {
			System.out.println(student);
		}
	}
	
	private void processFiles(){
		for (String file : files) {

            students.clear();

            try {
                loadDataFile(file);
                printInOrder();
            }
            catch (FileNotFoundException e) {
                System.out.println("Can't open file: " + file);
            }

            System.out.println();
        }
	}
	
	
	public static void main(String[] args) {
		ScoreTrakker s1 = new ScoreTrakker();
		s1.processFiles();
	}

}
