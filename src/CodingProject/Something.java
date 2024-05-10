package CodingProject;

import java.util.Arrays;

public class Something {
	public static void main(String[] args) {
		
		/*
		 * 1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		 */
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		int lengthOfArr = ages.length;
		/*
		 * a. Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.
		 */
		int difference = Math.abs(ages[0] - ages[ages.length - 1]);
		System.out.println("Difference of first and last element in ages[] = " + difference);
		/*
		 * b. Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages array, and have more elements).
		 */
		int[] ages2 = {3, 9, 23, 64, 2, 8, 28, 93, difference};
		/*
		 * i. Make sure that there are 9 elements of type int in this new array.
		 */
		System.out.println("The length of array ages2 is " + ages2.length);
		/*
		 * ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the value of the first element in the new array ages2 from the last element of ages2).
		 * iii. Show that using the index values for the elements is dynamic (works for arrays of different lengths).
		 */
		int difference2 = Math.abs(ages2[0] - ages2[ages2.length - 1]);
		System.out.println("Difference of first and last element in ages2[] = " + difference2);
		/*
		 * c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		 */
		int sum = 0;
		for (int i = 0; i < ages2.length; i++) {
			sum += ages2[i];
		}
		double average = sum / lengthOfArr;
		System.out.println("The average age in ages2[] = " + average );
		/*
		 * 2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		 */
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		/*
		 * a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		 */
		sum = 0;
		for (int i = 0; i < names.length; i++) {
			sum += names[i].length();
		}
		average = sum / names.length;
		System.out.println("The average number of letters per name in names[] = " + average );
		/*
		 * b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
		 */
		String allNames = "";
		for (int i = 0; i < names.length; i++) {
			allNames += names[i] + " ";
		}
		System.out.println(allNames);
		/*
		 * 3. How do you access the last element of any array?
		 */
		System.out.println("Use array[arr.length - 1] to access the last element of an array");
		/*
		 * 4. How do you access the first element of any array?
		 */
		System.out.println("Use array[0] to access the first element of an array");
		/*
		 * 5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
		 */
		int[] nameLengths = new int[names.length];
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		/*
		 * 6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
		 */
		sum = 0;
		for (int i = 0; i < nameLengths.length; i++) {
			sum += nameLengths[i];
		}
		System.out.println("The sum of all lengths in nameLengths[] = " + sum);
	}
	/*
	 * 7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
	 */
	private static String duplicateWord(String word, int n) {
		String duplicatedWord = "";
		for (int i = 0; i < n; i++) {
			duplicatedWord += word;
		}
		return "duplicatedWord() returns => " + duplicatedWord;
	}
	/*
	 * 8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
	 */
	private static String getFullName(String firstName, String lastName) {
		return "getFullName() returns => " + firstName + " " + lastName;
	}
	/*
	 * 9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
	 */
	private static Boolean checkIfSumGreaterThan100(int[] arr) {
		return Arrays.stream(arr).sum() > 100;
	}
	/*
	 * 10. Write a method that takes an array of double and returns the average of all the elements in the array.
	 */
	private static double getAverageOfDoubleArr(double[] arr) {
		// We need to use .orElse() in case an empty array is passed in
		return Arrays.stream(arr).average().orElse(Double.NaN);
	}
	/*
	 * 11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
	 */
	private static boolean isFirstArrAvgGreater(double[] firstArr, double[] secondArr) {
		return getAverageOfDoubleArr(firstArr) > getAverageOfDoubleArr(secondArr); 
	}
	/*
	 * 12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
	 */
	private static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		return isHotOutside = true && moneyInPocket > 10.50 ;
	}
}
