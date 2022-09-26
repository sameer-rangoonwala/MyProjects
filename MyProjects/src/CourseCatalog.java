import java.util.Scanner;

public class CourseCatalog {
	public static void main(String []args) {
		Scanner bob = new Scanner(System.in);
		String[][] classes = {
	   {"CSC 1301", "ENGL 1101", "POLS 1101", "HIST 2110", "MATH 1111",},
	   {"Mon 9:00 AM", "Mon 12:00 PM" , "Tue 10:30 AM", "Tue 3:00 PM", "Fri 11:00 AM",},
	   {"Professor Gregory", "Professor Rodgers", "Professor Thomson", "Professor Khan", "Professor Douglas"},
					         };
		int i = 0;
		boolean status = false;
		System.out.println("Enter course title ");
		String course = bob.nextLine();
		while (i<=4) {
			if(course.equals(classes[0][i])) 
				{
				status = true;
				System.out.println("Course: "+classes[0][i]+", Time: "+classes[1][i]+", Instructor: "+classes[2][i]);
				} 
			 i++;
			}
		if(!status)
			System.out.println("INVALID ENTRY: "+course+" is not found in course listing");
	
			
		}
		
		}
	
		
		




