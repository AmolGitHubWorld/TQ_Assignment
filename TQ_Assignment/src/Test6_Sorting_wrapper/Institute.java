package Test6_Sorting_wrapper;

import java.util.ArrayList;
import java.util.Arrays;

class Subject{
	String subjectName;
	
	Subject(String subjectName){
		this.subjectName = subjectName;
	}
	public String toString() {
		return "\n[subjectName=" + subjectName + "]";
	}	
}
class Course{
	int cId;
	String cName;
	Subject[] subjects;
	
	Course(int cId, String cName, Subject[] subjects) {
		this.cId = cId;
		this.cName = cName;
		this.subjects = subjects;
	}
	public String toString() {
		return "[cId=" + cId + ", cName=" + cName + ", subjects=" +
				Arrays.toString(subjects) + "]";
	}	
}
public class Institute {

	public static void main(String[] args) {
		ArrayList<Course> cources = new ArrayList<Course>();
		Subject[] s1 = new Subject[3];
		s1[0] = new Subject("html");
		s1[1] = new Subject("css");
		s1[2] = new Subject("javascript");
		cources.add(new Course(1201, "frontend development", s1));
		Subject[] s2 = new Subject[3];
		s2[0] = new Subject("java");
		s2[1] = new Subject("sql");
		s2[2] = new Subject("springboot");
		cources.add(new Course(1202, "backend development", s2));
		for(int i=0; i<cources.size(); i++) {
			System.out.println(cources.get(i));
		}

	}

}
