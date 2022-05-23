package Test_7_Map_Set_Stack_Que;

import java.util.ArrayList;
import java.util.HashSet;

class Student{
	int roll;
	String name;
	int phymarks;
	int chemmarks;
	Student(int roll, String name, int phymarks, int chemmarks) {
		this.roll = roll;
		this.name = name;
		this.phymarks = phymarks;
		this.chemmarks = chemmarks;
	}
	public String toString() {
		return "[ " + roll + ", " + name + ", " + phymarks + ", " + chemmarks + " ]";
	}
	
	
}
public class Number6 {

	public static void main(String[] args) {
		ArrayList<Student> arraylist1 = new ArrayList<Student>();
		arraylist1.add(new Student(1, "steven", 68, 0));
		arraylist1.add(new Student(2, "sara", 72, 0));
		arraylist1.add(new Student(3, "emma", 84, 0));
		
		ArrayList<Student> arraylist2 = new ArrayList<Student>();
		arraylist2.add(new Student(1, "steven", 0, 75));
		arraylist2.add(new Student(2, "sara", 0, 83));
		arraylist2.add(new Student(3, "emma", 0, 80));
		
		HashSet<Student> set = new HashSet<Student>();
		for(int i=0; i<arraylist1.size(); i++) {
			Student s = arraylist1.get(i);
			for(int j=0; j<arraylist2.size(); j++) {
				Student temp = arraylist2.get(j);
				if(temp==null)
					continue;
				if(s.roll==temp.roll && s.name.equals(temp.name)) {
					s.phymarks+=temp.phymarks;
					s.chemmarks+=temp.chemmarks;
					temp=null;
					set.add(s);
				}
			}
		}
		System.out.println("students with marks");
		for(Student s : set) {
			System.out.println(s);
		}

	}

}
