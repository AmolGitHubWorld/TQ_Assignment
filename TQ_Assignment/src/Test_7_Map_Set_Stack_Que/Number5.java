package Test_7_Map_Set_Stack_Que;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class Actor{
	int actorId;
	String actorName;
	Actor(int actorId, String actorName) {
		this.actorId = actorId;
		this.actorName = actorName;
	}
	public String toString() {
		return "[ " + actorId + ", " + actorName + " ]";
	}
	
}
class Movie{
	String movieName;
	String producer;
	float budget;
	Actor actor;
	Movie(String movieName, String producer, float budget, Actor actor) {
		this.movieName = movieName;
		this.producer = producer;
		this.budget = budget;
		this.actor = actor;
	}
	public String toString() {
		return "[ " + movieName + ", " + producer + ", " + budget + ", " + actor+ " ]";
	}
	
	
}
public class Number5 {

	public static void main(String[] args) {
		// create list of movie type objects
		
		Actor tiger = new Actor(1, "Tiger Shroff");
		Actor kartik = new Actor(2, "Kartik Aaryan");
		Actor shraddha = new Actor(3, "Shraddha Kapoor");
		Actor deepika = new Actor(4, "Deepika Padukone");
		Movie m1 = new Movie("Heropanti 2", "Sajid Nadiadwala", 70f, tiger);
		Movie m2 = new Movie("Bhool Bhulaiyaa 2", "Bhushan Kumar", 75f, kartik);
		Movie m3 = new Movie("Ok Jaanu", "Mani Ratnam", 27f, shraddha);
		Movie m4 = new Movie("Baaghi", "Sajid Nadiadwala", 37f, tiger);
		Movie m5 = new Movie("Yeh Jawaani Hai Deewani", "Karan Johar", 40f, deepika);
		
		
		ArrayList<Movie> movies = new ArrayList<Movie>();
		movies.add(m1);
		movies.add(m2);
		movies.add(m3);
		movies.add(m4);
		movies.add(m5);
		
		// a) 
		TreeMap<String,String> tmap = new TreeMap<>(Collections.reverseOrder());
		for(Movie m : movies) {
			tmap.put(m.movieName, m.actor.actorName);
		}
		System.out.println("movie names in descending order");
		Set<Map.Entry<String,String>> entryset = tmap.entrySet();
		for(Map.Entry<String, String> entry : entryset) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
		// b)
		LinkedHashMap<String,ArrayList<Movie>> lmap = new LinkedHashMap<>();
		for(Movie m : movies) {
			ArrayList<Movie> list = lmap.get(m.actor.actorName);
			if(list==null) {
				list = new ArrayList<Movie>();
			}
			list.add(m);
			lmap.put(m.actor.actorName, list);		
		}
		System.out.println("actors and his/her movies list");
		Set<Map.Entry<String, ArrayList<Movie>>> entryset1 = lmap.entrySet();
		for(Map.Entry<String, ArrayList<Movie>> entry : entryset1) {
			System.out.println(entry.getKey());
			for(Movie m : entry.getValue()) {
				System.out.println("\t"+m);
			}
		}
		
		// c)
		Collection<String> actors = tmap.values();
		
		int max = 0;
		String actor = null;
		for(String key : new HashSet<String>(actors)){
			int occurence = Collections.frequency(actors, key);
			if(occurence>max) {
				max = occurence;
				actor = key;
			}
		}
		System.out.println(actor+" has played role in maximum movies");
		
	}

}
