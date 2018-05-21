package Lab_Lamda;

import java.util.*;
//********************************************************************
//  PhoneList.java       Author: Lewis/Loftus
//
//  Driver for testing a sorting algorithm.
//********************************************************************
import java.util.stream.Collectors;

public class StudentList
{
	//-----------------------------------------------------------------
	//  Creates an array of Contact objects, sorts them, then prints
	//  them.
	//-----------------------------------------------------------------
	public static void main (String[] args)
	{
		
		//Student[] friends = new Student[8];

		ArrayList<Student> friends = new ArrayList<Student>();

		friends.add(new Student ("John", "Smith", "610-555-7384"));
		friends.add(new Student ("Sarah", "Barnes", "610-555-7384"));
		friends.add(new Student ("Mark", "Riley", "733-555-2969"));
		friends.add(new Student ("Laura", "Getz", "663-555-3984"));
		friends.add(new Student ("Laura", "Apple", "663-555-3984"));
		friends.add(new Student ("Laura", "Zimmer", "663-555-3984"));
		friends.add(new Student ("Larry", "Barnes", "464-555-3489"));
		friends.add(new Student ("Mike", "Barnes", "610-555-7384"));
		friends.add(new Student ("Frank", "Phelps", "322-555-2284"));
		friends.add(new Student ("Mario", "Guzman", "804-555-9066"));
		friends.add(new Student ("Marsha", "Grant", "243-555-2837"));

		Collections.sort(friends);
	    Collections.sort(friends, new SortByPhoneNumber());
//		/*
//		 * TODO 1, above this line, the Collections.sort() has an error.  This 
//		 *  method should sort by phone number, it does not!  To correct the problem,
//		 * complete the compareTo method in the SortByPhoneNumber class. 
//		 */
//		System.out.println("Friends, sorted by Phone number\n" +friends);
//		
//		
//	    Collections.sort(friends, new Comparator<Student>() {
//			  /*
//			   * TO DO 2a:  Remove the comment markers on the lines above and below
//			   * and then Write a inner class to sort by phone number.  
//			   * 
//			   *  Code goes here
//			   */
//	    	 public int compare (Student o1, Student o2) {
//	    			
//	    			return o1.getPhone().compareTo(o2.getPhone());
//	    			
//	    			//return 0;
//	    			
//	    		   }
//	
////			   }
//		});
//		
////	    Collections.sort(friends, new Comparator<Student>() {
//			  /*
//			   * TO DO 2b:  Remove the comment markers on the lines above and below
//			   * and then Write a inner class to sort by last name (and first name if 
//			   * last name are the same).  
//			   * 
//			   *  Code goes here
//			   */
//	    	
//	
////			   }
////		});
//		System.out.println("Friends, sorted by first  name\n" +friends);
//		
//		
//		/*
//		 * TODO 3a, Write a Lamda function to sort by last name
//		 *  Code goes here
//		 */
//		
//		 Collections.sort(friends, (o1 ,o2) -> o1.getPhone().
//				 compareTo(o2.getPhone()));
//		System.out.println("Friends, sorted by last  name\n" +friends);
//		
//		/*
//		 * TODO 3b, Write a Lamda function to sort by phone number
//		 *  Code goes here
//		 */
//		System.out.println("Friends, sorted by last  name\n" +friends);
//		
//		/*
//		 * TODO 4a, Write a Stream function to filter by Barnes as the last name, I have 
//		 * started to write the stream line, your task is to complete the line. 
//		 */
//		ArrayList<Student> lista = (ArrayList<Student>) friends.stream()
//				.filter(arg -> arg.getFirstName().equals("Roger"))
//				
//				.collect(Collectors.toList());
//		
//				//.collect(collector);   // This line needs to be extended
//		System.out.println("Friends,  last  name is  Barnes" +lista);
//
//		/*
//		 * TODO 4b, Write a Stream function to filter by 610 as part of a phone number, I have 
//		 * started to write the stream line, your task is to complete the line. 
//		 */
//		ArrayList<Student> listb = (ArrayList<Student>) friends.stream();   // This line needs to be extended
//		System.out.println("Friends,  phone contains 610" +listb);
//		
//		/*
//		 * TODO 4c, Write a Stream function to capitalize all names. Difficult!
//		 */
		ArrayList<Student> listc = (ArrayList<Student>) friends.stream()
				.map(e->{e.setLastName(e.getLastName().toUpperCase());
							e.setFirstName(e.getFirstName().toUpperCase());
							return e;})
				.collect(Collectors.toList());
				
						
		// This line needs to be extended
		System.out.println("Friends,  Name in caps" +listc);
	}
}

