package shortestString;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * @author - wahid -date : 26-Apr-2019 10:15:18 pm
 *
 */
public class ShortestStringSet {
	
public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in); //to take input from the user
		
		System.out.print("Enter the String : ");  // sysout to ask input 
		String str=sc.next(); // declaring and initializing str with user input (note - the user can give any character)
		
		String[] ar= str.split(""); // spilt and made array
		List list= Arrays.asList(ar); //converted array to list
		Set set= new HashSet<>(); 
		set.addAll(list);   //passed list to set , as hashset does not allow duplicate , we get unique characters
		
		System.out.println("Output : "+set.size());  // final output 
		System.out.println(set);  // to show unique character set to verify , order might differ
		sc.close(); // closing the resource

	}
}
