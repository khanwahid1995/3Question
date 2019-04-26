package shortestString;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author - wahid -date : 26-Apr-2019 9:54:55 pm
 *
 */
public class ShortestString {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in); //to take input from the user
		
		System.out.print("Enter the String : ");  // sysout to ask input 
		String str=sc.next(); // declaring and initializing str with user input (note - the user can give any character)
		
		List<Character> list= new ArrayList<>(); //ArrayList to hold the encounters of characters

		
		for(int i=0;i<str.length();i++) {    //to iterate through characters in string
			if(!list.contains(str.charAt(i))) {
				list.add(str.charAt(i));
			}
		}
		System.out.println("Output : "+list.size());  // final output 
		System.out.println(list);  // to show unique character list to verify
		sc.close(); // closing the resource

	}

}
