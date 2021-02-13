package com.techelevator;

import java.util.Scanner;

public class GuessingGameAppPhase1 {

	public static void main(String[] args) {
		int random = (int)(Math.random() * 100);
		
		System.out.println("*********************************");
		System.out.println("***           Bharath's Guessing Game        ***");
		System.out.println("*********************************");
		
		System.out.println("\nWelcome to my game! \nYou need to guess my number in order to win!");
		System.out.println("You get 5 chances");
		
		Scanner input = new Scanner(System.in);
		int count = 5;
		
		while (count > 0) { // infinite while loop
			System.out.println("Enter your guess: ");
			int number = Integer.parseInt(input.nextLine());  //nextInt() leaves an enter key in the keyboard buffer
			count--;
//			continue; // takes me up to the top of the loop
			
			if (number == random) {
				System.out.println("You win!");
				break;  // the word break takes you out of the loop
			}
			else if (number < random) {
				System.out.println("Number is too low! Guess again!");
				System.out.println("You have " + count + " guesses left");
			}
			else {
				System.out.println("Number is too high! Guess again!");
				System.out.println("You have " + count + " guesses left");
			}
			
			
		}
		if (count == 0) {
			System.out.println("You lose!!! The number was " + random);
		}
		
	}

}
