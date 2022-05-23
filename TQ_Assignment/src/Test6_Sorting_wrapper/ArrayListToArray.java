package Test6_Sorting_wrapper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListToArray {

	public static void main(String[] args) {
		// convert array list to array
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(23);
		list.add(45);
		// method 1 using toArray()

		Integer[] nums = list.toArray(new Integer[list.size()]);
		System.out.println(Arrays.toString(nums));

		// method 2 manually
		Integer[] num = new Integer[list.size()];
		for(int i=0; i<list.size(); i++) {
			num[i] = list.get(i);
		}
		System.out.println(Arrays.toString(num));

		// convert array to array list
		// method 1 using asList()
		List<Integer> l =  Arrays.asList(num);
		System.out.println(l);
		
		// method 2 manually
		ArrayList<Integer> ls = new ArrayList<Integer>();
		for(Integer i : nums) {
			ls.add(i);
		}
		System.out.println(ls);

	}

}
