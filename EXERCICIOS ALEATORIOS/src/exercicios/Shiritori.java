package exercicios;

/* 
 * This challenge is an English twist on the Japanese word game Shiritori. The basic premise is to follow two rules:

First character of next word must match last character of previous word.
The word must not have already been said.

ATRIBUTES:
words: an array of words already said.
game_over: a boolean that is true if the game is over.

METHODS:
and three instance methods:

play: a method that takes in a word as an argument and checks if it is valid (the word should follow rules #1 and #2 above).

If it is valid, it adds the word to the words array, and returns the words array.
If it is invalid (either rule is broken), it returns "game over" and sets the game_over boolean to true.
restart: a method that sets the words array to an empty one [] and sets the game_over boolean to false. It should return "game restarted".
getWords: a method that returns the words array.
*/

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.ArrayList;

public class Shiritori {
	private Integer totalWords = 0;
	private List<String> words = new ArrayList<String>(totalWords);
	
	public List<String> getWords() {
		return this.words;
	}
	public void play(String word) {
		if(this.words.isEmpty()) {
			addToArray(word);
		}else {
			if(alreadySaid(word)) {
				gameOver("already");
			}else {
				addToArray(word);
			}
		}
	}
	
	private boolean alreadySaid(String input) {
		boolean already = false;
		
		List<String> a = this.words.stream().filter(word -> word == input).collect(Collectors.toList());
		
		if(a.isEmpty()) {
			return already;
		}else {
			already = true;
			return already;
		}
	}	
	private void addToArray(String word) {
		if(alreadySaid(word)) {
			gameOver("already");
		}else {
			totalWords++;
			this.words.add(word);
		}
	}
	private void gameOver(String status) {
		
		switch(status) {
		case "already":
			System.out.println("GAME OVER: Word already been said!");
			break;
		case "no-match":
			System.out.println("GAME OVER: First letter doesn't match with the last word last letter");
			break;
		}
	}

	public static void main(String[] args) {
		Shiritori shiritori = new Shiritori();
		
		shiritori.play("oi");
		shiritori.play("oi");
		shiritori.play("ALOHA");
		System.out.println(shiritori.getWords());
	}

}
