//Score Grade classwork

/* 
1. Prompt the user for 10 valid scores. 
	1b. The valid inputs must fall within 0 to 100. (Use if statement to deterrmine valid inputs). 
		- Use loop to keep iterating till valid score is complete.
		- There should be a counter that is counting the number of 10 valid inputs. 
		- If the valid input is complete, it shouldn't prompt the user for input again. Rather other sequence in the code should follow.
		- There should be a variable that is counting the number of valid scores
	1c. If the score is an invalid score prompt the user to enter a valid score again, keep prompting him till the valid score is up to 10.

2. Display the score the user enters immeditely he enters it (Indicating if it is a valid score).
	- Save all scores in different variables

3. Determine whether a score is within 80 - 100, grade it as A. Divide gardes by 10 then pass it into the switch case. (Display it with that particular valid score the user entered). USE SWITCH CASE.
	- If a score is within 70 - 79, grade it as B.
	- If a score is within 60 - 69, grade it as C
	- If a score is within 50 - 59, grade it as D
	- If a score is within any number that is above 100 or below 0, grade it as F. 
	(Use switch case to deteremine the grade that should be given to each scores).

4. Print and show him a list of all scores entered and the grade.

5. Calculate the numbers of A's, B's and C's. 
	- Create individual variables for A, B and C. Store the total number of each scores there. 

6. Also print out the number of invalid scores.
	- Keep counting the number of invalid scores that the user entered then total it and save it in a variable called invalid scores. 

*/

import java.util.Scanner;
public class GradeClasswork {
	public static void main (String[] args) { 
	Scanner keyboardInput = new Scanner(System.in); 

	int score = 0, aCount = 0, bCount = 0, cCount = 0, dCount = 0, fCount = 0;
	int validScoreCounter = 0, invalidScoreCounter = 0;

	while (validScoreCounter < 10) {
	System.out.print("Enter valid scores within 0 to 100: ");
	score = keyboardInput.nextInt();

	validScoreCounter = validScoreCounter + 1;

		if (score < 0 || score > 100) {
		System.out.print("You entered an invalid score, kindly enter a valid score within 0 to 100: ");
		score = keyboardInput.nextInt();
		invalidScoreCounter = invalidScoreCounter + 1;
		continue;
		}
	
	switch (score / 10) {
		case 8, 9, 10: System.out.println(aCount);
			++aCount; 
			break;
		case 7: System.out.println(bCount);
			++bCount;
			break;
		case 6: System.out.println(cCount);
			++cCount;
			break;
		case 5: System.out.println(dCount);
			++dCount;
			break;
		default: System.out.println(fCount);
			++fCount;
			break;
			}

		}

System.out.println("The numbers of A entered is: " + aCount);
System.out.println("The numbers of B entered is: " + bCount);
System.out.println("The numbers of c entered is: " + cCount);
System.out.println("The numbers of D entered is: " + dCount);
System.out.println("The numbers of F entered is: " + fCount);

System.out.println("The numbers of invalid scores entered is: " + invalidScoreCounter);

	}


}