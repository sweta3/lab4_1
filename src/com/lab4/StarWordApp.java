package com.lab4;
import java.util.*;

public class StarWordApp {

	public static void main(String[] args) {
		//declare local variables
		String word, startteWord;
		int method;
		char answer = ' ';
		
		
		//declare objects
		StarWord myStarWord = new StarWord();
		Scanner sc = new Scanner(System.in);
		
		//input 
		do {
		word = "";
		System.out.println("Please enter a word: ");
		word = sc.next();
		word = word.toLowerCase();
		myStarWord.setWord(word);
		
		do {
			System.out.println("Please choose which method to use(1->Encoder, 2->LinesPrinter, 3->PigLatin, 4->reverseWord): ");
		method= sc.nextInt();
		
		//process
		switch(method){
			case 1:
				myStarWord.computeVowels();
			break;
			case 2:
				myStarWord.computeStars();
			break;
			case 3:
				myStarWord.computePigLatin();
			break;
			case 4:
				myStarWord.reverseWord();
			break;
			default:
			System.out.println("Please enter one of the numbers suggested");
			}//end switch
		}while(method !=1 && method != 2 && method !=3 && method != 4);
		
		//output
		startteWord = myStarWord.getWord();
		//"The word: " +word + with STARTED compute method is + startteWord
		System.out.println("The word: " + word + " with "+ method + " method is " + startteWord);
		
		System.out.println("Do you wish to continue? y/n");
		answer = sc.next().charAt(0);
		}while(answer =='y');
		
	}//end main
}//end class
