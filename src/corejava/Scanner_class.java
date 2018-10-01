package corejava;

import java.util.Scanner;

public class Scanner_class {
	
	//We need to import Scanner class to accept input from the user
		
		public static void main(String [] args){
			// Creating an instance "userInput" of a Scanner class
			Scanner userInput = new Scanner(System.in);
			System.out.println("Learning Java from? :");
			// Using nextLine method to get the input and move the cursor to the new line
			/*nextLine() method Advances this scanner past the current line and returns the input that was skipped. 
			This method returns the rest of the current line, excluding any line separator at the end. 
			The position is set to the beginning of the next line. 
			Since this method continues to search through the input looking for a line separator, 
			it may buffer all of the input searching for the line to skip if no line separators are present.*/
			String website = userInput.nextLine();
			// Close the scanner object using close() method to prevent memory leak
			userInput.close();
			System.out.println("I am learning Java from "+ website);
		}

	}


