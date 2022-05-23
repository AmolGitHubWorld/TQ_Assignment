package Test_7_Map_Set_Stack_Que;

import java.util.Scanner;
import java.util.Stack;

public class Number7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter one word to check pallindrome");
		String word = sc.next();
		sc.close();
		
		Stack<Character> chars = new Stack<>();
		char[] ch = word.toCharArray();
		for(char c : ch) {
			chars.push(c);
		}
		boolean isPallindrome = true;
		for(char c : ch) {
			if(c!=chars.peek()) {
				isPallindrome = false;
				break;
			}
			chars.pop();
		}
		if(isPallindrome) {
			System.out.println(word+" is pallindrome");
		}
		else {
			System.out.println(word+" is not pallindrome");
		}
		

	}

}
