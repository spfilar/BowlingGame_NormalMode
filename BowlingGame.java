package com.stuart.bowling;

public class BowlingGame {

	public static void main(String[] args) {

		int numPins = 11;
		int totalScore = 0;
		int secondRoll = 0;
		int firstRoll = 0;
		int frameScore = 0;
		
		for (int i = 1; i <= 10; i++) {
			
			System.out.println("Frame #" + (i));
			
			firstRoll = (int)((Math.random() * numPins));
			int numPinsAfterFirst = numPins - firstRoll - 1;
		
			if (firstRoll == 10) {
				frameScore = firstRoll;
				System.out.println("You hit all the pins and got a strike!");
				System.out.println("Your frame score is " + frameScore + "\n");
				
			} else {
				
				secondRoll = (int)(Math.random() * (numPinsAfterFirst) + 1);			
				frameScore = firstRoll + secondRoll;
				System.out.println("Your first roll was " + firstRoll + " pins.");
				System.out.println("Your second roll was " + secondRoll + " pins.");
				
				if (frameScore == 10) {
					System.out.println("You got a spare!");
					
				}
				System.out.println("Your frame score is " + frameScore + "\n");
			}
			
			totalScore += frameScore;
		
			if (i == 10) {
				System.out.println("Your total score is " + totalScore);
			}
		}
	}
}
