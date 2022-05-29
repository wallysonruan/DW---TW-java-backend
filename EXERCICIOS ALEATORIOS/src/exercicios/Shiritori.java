package exercicios;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Shiritori {
	private Integer totalWords = 0;
	private List<String> words = new ArrayList<String>(totalWords);
	private boolean gameOver = false;
	
	public boolean getGameOver(){
		return gameOver;
	}
	public List<String> getWords() {
		return this.words;
	}
	public void play(String word) {	
		if(this.words.isEmpty()) {
			addToArray(word);
		}
		else {
			if(alreadySaid(word)){
				gameOver("already");
			}else {
				if(lastSameFirst(word)) {
					addToArray(word);
				}else {
					gameOver("no-match");
				}
			}
		}	
	}
	private boolean lastSameFirst(String input){
		int lastIndex = this.words.size() - 1;
		String lastWord = this.words.get(lastIndex);
		char lastChar = lastWord.charAt(lastWord.length() - 1);
		char inputFirstChar = input.charAt(0);
		
		if(lastChar == inputFirstChar){
			return true;
		}else{
			return false;
		}	
	}
	private boolean alreadySaid(String input) {
		boolean already = this.words.contains(input);
		return already;
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
			System.out.println("\nGAME OVER: Word already been said!");
			gameOver = true;
			break;
		case "no-match":
			System.out.println("\nGAME OVER: First letter doesn't match with the last word last letter.");
			gameOver = true;
			break;
		}
	}
	public void restart(){
		this.words.clear();
	}
	public void headline(){
		System.out.println("[            SHIRITORI           ]");
	}
	public void rules(){
		System.out.println("\nRULES:\n - You cannot repeat the words.\n- After the first,all the words must start with the same letter that the last one ended with.\n \n");
	}
	public void result(){
		System.out.printf("\nYou lost after %d words.\n%s", this.totalWords, this.words);
	}

	public static void main(String[] args) {
		Shiritori shiritori = new Shiritori();
		Scanner userInput = new Scanner(System.in);
		
		shiritori.headline();
		shiritori.rules();
		
		while(shiritori.getGameOver() == false){
			String input = userInput.nextLine();
			shiritori.play(input);
		}
		userInput.close();
		
		shiritori.result();
	}
}