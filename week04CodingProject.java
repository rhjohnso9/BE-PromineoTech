package Week04;

import java.util.*;
import java.util.Scanner;
import java.io.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;



public class week04CodingProject {

private static int[] nameLengths;

public static void main(String[] args) {
	
//Prompt 1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.	
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
	
//	a. Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
		int result = ages[ages.length - 1] - ages[0];
		System.out.println("Last element - First element: " + result);
	
	
//	b. Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages array, and have more elements). 
		int[] ages2 = {3, 9, 23, 64, 2, 8, 28, 93, 26};
		

//	i. Make sure that there are 9 elements of type int in this new array.  
//	ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the value of the first element in the new array ages2 from the last element of ages2). 
		int result1 = ages2[ages2.length - 1] - ages2[0];
		
		
//	iii. Show that using the index values for the elements is dynamic (works for arrays of different lengths).
		int[] newAges = new int[ages.length + 1];
		System.arraycopy(ages, 0, newAges, 0, ages.length);
		int newAge = 0;
		newAges[newAges.length - 1] = newAge;
    
//	c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
	
		double sum = 0;
		for (int age : newAges) {
			sum += age;
		}
		double average = sum / ages.length;
			System.out.println("Average age: " + average);
	
	
//Prompt 2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
			ArrayList<String> names = new ArrayList<String>();
			    names.add("Sam");
				names.add("Tommy");
				names.add("Tim");
				names.add("Sally");
				names.add("Buck");
				names.add("Bob");
				System.out.println(" ");
				System.out.println("Names : " + names);
				
//a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		int total = 0;
		for (int i = 0 ; i < names.size() - 1 ; i++) {
			//for (String name : names) {
				//total += name.length();
			}
			
		//double averageLetters = totalLetters / names.length; 
		//System.out.println("Average number of letters per name: " + averageLetters);

//b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
	    String allNames = String.join(" ", names); 
	    System.out.println(allNames);

//Prompt 3. How do you access the last element of any array?
	    System.out.println("Last Element : " + (names.get(names.size() - 1)));

//Prompt 4. How do you access the first element of any array?
    	System.out.println("First element : " + (names.get(0)));
		
		
		
		
//Prompt 5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
    	String[] names1 = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

    		int[] nameLengths = new int[names1.length]; {
    		for (int i = 0; i < names1.length; i++) 
    		{
    			nameLengths[i] = names1[i].length(); 
    			}
    		}
		
						
//Prompt 6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
	      int sumOfNameLengths = 0;
		  for (int individualLength : nameLengths) 
		  {
			  sumOfNameLengths += individualLength;
		   } 
		   System.out.println("Sum of all elements: " + sumOfNameLengths); {
		   }
		
		}
		

//Prompt 7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
		public static String repeatWordNTimes (String word, int n) 
		{
			String result = "";
			for (int i = 0; i < n; i++)
			{	
				result += word;
			}	
			return result;
				//System.out.println("Prompt 7: " + repeatWordNTimes("Hello", 4));
			}
	
  
//8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
		public static String makeFullName (String firstName, String lastName)
		{
			return firstName + " " + lastName;
		}
		
	
	
	
//9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
		    public static boolean isSumGreaterThan100(int[] numbers) 
				{			    	
					int sum = 0;
					for (int number : numbers) 
					{	
						sum += number;
					}
					if (sum > 100) 
						return true; 
				 else 
						return false; 
				}
					
				  	
//10. Write a method that takes an array of double and returns the average of all the elements in the array.
             public static double findAverage (double [] numbers){ 
         	   	double sum = 0.0;
				for (double number : numbers)
				{
					sum += number;
					{
					return sum / numbers.length;
					}
					
				}
				return sum;
             }
          
//11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
             public static boolean isFirstArrayGreater (double[] a, double[] b)
             {
            	double averageA = findAverage(a);
            	double averageB = findAverage(b);
            	if (averageA > averageB)
            	{
            		return true;
            	}
            	else
            	{
            		return false;
            	}
             }

	            
//12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
             public static boolean willBuyDrink(boolean isHotOutside , double moneyInPocket) 
             {
         		if (isHotOutside == true && moneyInPocket > 10.50); 
         			return true; 
         		//se
         			//turn false;
         		}
		               
             
//13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.    
             public class week04CodingProjectQ7 {

            	//This method calculates the users age based on the date of birth entered.  
            		public static void main(String args[])  
            		{  
            		//user enters date of birth by year, month and date  
            		LocalDate dob = LocalDate.of(1977, 1, 30);  
            		
            		//this obtains the current date from the system clock  
            		LocalDate curDate = LocalDate.now();  
            		
            		//calculates the difference between the two dates  
            		Period period = Period.between(dob, curDate);
            		
            		//prints the difference in years  
            		System.out.printf("You are %d years old.", period.getYears());  
            			}  
             		}
             	}
