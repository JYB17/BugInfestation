package edu.handong.csee.java.lab06;

import java.util.Scanner;

/**
 * This is a class named 'BugInfestation'!
 * It gets volume of your house and initial population of bugs as input, and calculates weeks, population of bugs, and total volume of bugs based on the input using loop!
 * @author JYB
 *
 */
public class BugInfestation {
	
	public static final double GROWTH_RATE = 0.95;					// setting the constant 'GROWTH_RATE' 0.95
	public static final double ONE_BUG_VOLUME = 0.002;				// setting the constant 'ONE_BUG_VOLUME' 0.002
	
	/**
	 * This is the main method!
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);		// create and object of 'Scanner' class, 'keyboard'
		
		System.out.print("Enter the total volume of your house in cubic feet: ");		
		int houseVolume = keyboard.nextInt();				// getting the first input 'houseVolume'
		
		System.out.print("Enter the estimated number of roaches in your house: ");
		int startPopulation = keyboard.nextInt();			// getting the second input 'startPopulation'
		
		double population = startPopulation;				// declare 'population' and initiate to 'startPopulation'
		
		double totalBugVolume = population * ONE_BUG_VOLUME;		// declare 'totalBugVolume' and initiate to 'population*ONE_BUG_VOLUME'
		
		int countWeeks = 0;					// declare 'countWeeks' and initiate to zero
		
		while(totalBugVolume < houseVolume) {					// repeat while (totalBugVolume < houseVolume)
			double newBugs = population * GROWTH_RATE;			// update 'newBugs'(population*GROWTH_RATE)
			double newBugVolume = newBugs * ONE_BUG_VOLUME;		// update 'newBugVolume'(newBugs*ONE_BUG_VOLUME)
			population += newBugs;								// update 'population'(population + newBugs)
			totalBugVolume += newBugVolume;						// update 'totalBugVolume'(totalBugVolume+newBugVolume)
			countWeeks++;										// increment 'countWeeks'
		}
		
		System.out.println("Starting with a roach population of " + startPopulation);
		System.out.println("and a house with a volume of " + houseVolume + " cubic feet,");
		System.out.println("after " + countWeeks + " weeks,");
		System.out.println("the house will be filled with " + (int)population + " roaches.");
		System.out.println("They will fill a volume of " + (int)totalBugVolume + " cubic feet.");
		System.out.println("Better call Debugging Experts Inc.");
		// print the result
	}

}