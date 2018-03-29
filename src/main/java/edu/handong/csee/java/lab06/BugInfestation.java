package edu.handong.csee.java.lab06;

import java.util.Scanner;

/**
 * This is a class named 'BugInfestation'!
 * @author JYB
 *
 */
public class BugInfestation {
	
	public static final double GROWTH_RATE = 0.95;
	public static final double ONE_BUG_VOLUME = 0.002;
	
	/**
	 * This is the main method!
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the total volume of your house in cubic feet: ");
		int houseVolume = keyboard.nextInt();
		
		System.out.print("Enter the estimated number of roaches in your house: ");
		int startPopulation = keyboard.nextInt();
		
		double population = startPopulation;
		
		double totalBugVolume = population * ONE_BUG_VOLUME;
		
		int countWeeks = 0;
		
		while(totalBugVolume < houseVolume) {
			double newBugs = population * GROWTH_RATE;
			double newBugVolume = newBugs * ONE_BUG_VOLUME;
			population += newBugs;
			totalBugVolume += newBugVolume;
			countWeeks += 1;
		}
		
		System.out.println("Starting with a roach population of " + startPopulation);
		System.out.println("and a house with a volume of " + houseVolume + " cubic feet,");
		System.out.println("after " + countWeeks + " weeks,");
		System.out.println("the house will be filled with " + (int)population + " roaches.");
		System.out.println("They will fill a volume of " + (int)totalBugVolume + " cubic feet.");
		System.out.println("Better call Debugging Experts Inc.");
	}

}