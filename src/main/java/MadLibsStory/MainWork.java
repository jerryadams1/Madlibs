package MadLibsStory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MainWork {
//need 3 adjectives, 1 adverb, 6 nouns,1 plaural noun
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Welcome to Mad Libs!");
		System.out.println("The rules are simple. Just follow along and have fun!");

		List<String> adjective = new ArrayList<String>();
		List<String> adverb = new ArrayList<String>();
		List<String> noun = new ArrayList<String>();
		List<String> pNoun = new ArrayList<String>();

//get the input of adjectives

		System.out.println("Please enter 3 adjectives (seperated by a space) : ");
		String adjectiveInput = userInput.nextLine();
		String[] adjSplit = adjectiveInput.split(" ");
		for (int i = 0; i < adjSplit.length; i++) {
			adjective.add(adjSplit[i]);
		}
		Collections.shuffle(adjective);



		// get input of adverb
		System.out.println("Please enter 1 adverb: ");
		String adverbInput = userInput.nextLine();

		String[] adverSplit = adverbInput.split(" ");
		for (int i = 0; i < adverSplit.length; i++) {
			adverb.add(adverSplit[i]);
		}
		Collections.shuffle(adverb);

		//get input of noun
		System.out.println("Please enter 6 nouns: ");
		String nounInput = userInput.nextLine();
		
		String[] nounSplit = nounInput.split(" ");
		for (int i = 0; i < nounSplit.length; i++) {
			noun.add(nounSplit[i]);
		}
		Collections.shuffle(noun);

		
		//get plural noun
		System.out.println("Last one I promise. Please enter 1 plural noun: ");
		String pNounInput = userInput.nextLine();
		String[] pNounSplit = pNounInput.split(" ");
		for (int i = 0; i < pNounSplit.length; i++) {
			pNoun.add(pNounSplit[i]);
		}
		Collections.shuffle(pNoun);

System.out.println("Driving a car can be fun if you follow this " + adjective.get(0) + " advice: " +
"When approaching a " + noun.get(0)  + " on the right, always blow your " + noun.get(1)+ "." + 
" Before making an " +adjective.get(1)+ " turn, always stick your " + noun.get(2) + " out of the window" + 
" Every 2000 miles, have your " + noun.get(3) + " inspected and your " + noun.get(4) + " checked." +
" When approaching a school, watch out for " + adjective.get(2) + " " +pNoun.get(0) +
". Above all, drive " + adverb.get(0) + " The " + noun.get(5) + " you save may be your own!");

	}

}