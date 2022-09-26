import java.util.Scanner;

public class GradeFeedback {
	public static void main(String[] args) {
		int grade;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your grade:  ");
		grade = in.nextInt();
		int category = grade / 10;
		switch (category)
		{
		case (10):
			System.out.println("Perfect score, exceptional job");
			break;
		case (9):
			System.out.println("Well above average, excellent");
			break;
		case (8):
			System.out.println("Above average, nice job");
			break;
		case (7):
			System.out.println("Average");
			break;
		case (6): case (5): case (4): case (3): case (2): case (1): case (0):
			System.out.println("Below average, you should see your professor");
				
		}
	}

}



