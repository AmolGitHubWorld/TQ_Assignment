package Test6_Sorting_wrapper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class SortItem implements Comparator<Item>{
	public int compare(Item i1, Item i2) {
		if(i1.cost<i2.cost)
			return 1;
		else if(i1.cost == i2.cost)
			return 0;
		else
			return -1;
	}
}
class Item implements Comparable<Item>{
	int itemid;
	float cost;
	String name;
	Item(int itemid, float cost, String name) {
		this.itemid = itemid;
		this.cost = cost;
		this.name = name;
	}
	public int compareTo(Item o) {
		if(this.cost<o.cost)
			return -1;
		else if(this.cost == o.cost)
			return this.itemid-o.itemid;
		else
			return 1;
	}
	public String toString() {
		return "[itemid=" + itemid + ", cost=" + cost + ", name=" + name + "]";
	}	
}
public class ItemsList {
	
	public static void displayItems(ArrayList<Item> items) {
		for(Item item: items)
			System.out.println(item);
	}
	public static void main(String[] args) {
		ArrayList<Item> items = new ArrayList<Item>();
		items.add(new Item(1, 150, "grapes"));
		items.add(new Item(2, 250, "pomegranete"));
		items.add(new Item(3, 200, "avocado"));
		items.add(new Item(4, 150, "apple"));
		items.add(new Item(5, 50, "banana"));
		System.out.println("before sorting items in descending order of cost");
		displayItems(items);
		
		Collections.sort(items, new SortItem());
		System.out.println("after sorting items in descending order of cost");
		displayItems(items);
		
		System.out.println("before sorting items in ascending order of cost");
		displayItems(items);	
		Collections.sort(items);
		
		System.out.println("after sorting items in ascending order of cost");
		displayItems(items);
		
	}

}
