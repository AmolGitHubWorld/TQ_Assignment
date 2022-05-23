package Test_7_Map_Set_Stack_Que;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
class Author{
	int aId;
	String aName;
	Author(int aId, String aName) {
		this.aId = aId;
		this.aName = aName;
	}
	public String toString() {
		return "[ " + aId + ", " + aName + " ]";
	}
	
	
}
class Book{
	int bookId;
	String bookName;
	float bookPrice;
	Author bookAuthor;
	Book(int bookId, String bookName, float bookPrice, Author bookAuthor) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.bookAuthor = bookAuthor;
	}
	public String toString() {
		return "[ " + bookId + ", " + bookName + ", " + bookPrice + ", "+ bookAuthor + " ]";
	}
}
public class Number4 {

	public static void main(String[] args) {

		// create linked list of book
		LinkedList<Book> books = new LinkedList<Book>();
		books.add(new Book(1,"Half Girlfriend",143f,new Author(11,"Chetan Bhagat")));
		books.add(new Book(4,"Atomic habits",99f,new Author(15,"James Clear")));
		books.add(new Book(7,"The God of Small Things",165f,new Author(12,"Arundhati Roy")));
		books.add(new Book(3,"Wings of Fire",98f,new Author(14,"A. P. J. Abdul Kalam")));
		
		// 1) 
		HashMap<Integer,String> hmap = new HashMap<Integer, String>();
		for(Book book : books) {
			hmap.put(book.bookId, book.bookName);
		}
		System.out.println("all books with id and name");
		Set<Map.Entry<Integer,String>> entryset = hmap.entrySet();
		for(Map.Entry<Integer, String> entry : entryset) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
		// 2)
		HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
		for(Book book : books) {
			Integer val = map.getOrDefault(book.bookAuthor.aId, 0);
			map.put(book.bookAuthor.aId, val+1);
		}
		System.out.println("no of books written by authors");
		Collection<Integer> values = map.values();
		for(Integer val : values) {
			System.out.println(val);
		}
		
		// 3)
		TreeMap<Integer,String> tmap = new TreeMap<>(Collections.reverseOrder());
		for(Map.Entry<Integer, String> entry : entryset) {
			tmap.put(entry.getKey(), entry.getValue());
		}
		System.out.println("all books with id and name in descending order");
		Set<Map.Entry<Integer,String>> entryset1 = tmap.entrySet();
		for(Map.Entry<Integer, String> entry : entryset1) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
		// 4)
		LinkedHashMap<Integer,String> lmap = new LinkedHashMap<>(hmap);
		System.out.println("all books as per insertion order");
		Set<Map.Entry<Integer,String>> entryset2 = lmap.entrySet();
		for(Map.Entry<Integer, String> entry : entryset2) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		

	}

}
