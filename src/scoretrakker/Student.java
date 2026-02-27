package scoretrakker;

public class Student implements Comparable<Student>{
	private String name;
	private int score;
	
	
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	@Override
	public String toString() {
	return name + " " + score;	
	}
	
	public int compareTo(Student other) { //Structured for Descending Order
		if(this.score > other.score)	  //Students compared based on Grade
			return -1;
		else if(this.score < other.score)
			return 1;
		else
			return 0;
	}
	
	
}
