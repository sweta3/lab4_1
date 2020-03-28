package com.lab4;


public class StarWord {
	//declare data members
	private String word;
	private StringBuffer starWord;

	
	//constructor
	//sb
	public StarWord() {
		this.word = new String();
		this.starWord = new StringBuffer ();
	}

	//setMethod
	public void setWord(String word) {
		this.word=word;	
	}
	
	//compute methods	
	//computeVowels
	public void computeVowels() {
		for(int i = 0; i<word.length(); i++) {
			//retrieve the char from the word located at the index i, and store in it in the variable l
			char l = word.charAt(i);
			if (l=='a'||l=='A') {
				//and 1 to the encoded word
				starWord.append(1);	
			}else if(l=='i'||l=='I') {
				starWord.append(9);
			}else if(l=='e'||l=='E') {
				starWord.append(5);
			}else if(l=='o'||l=='O') {
				starWord.append(15);
			}else if(l=='u'||l=='U') {
				starWord.append(21);
			}else{
				//if the letter is not vowels then add the letter itself to encoded word
				starWord.append(l);				
			}
		}//for
	}
	
	//computeStars
	public void computeStars() {
		int len = word.length();
		for(int i = 0; i<len; i++) {
			//retrieves the letter from at index i
			char l = word.charAt(i);
			starWord.append('*');
			}
		}
	//computePigLatin
	public void computePigLatin(){
		starWord = new StringBuffer();
		int i = 1;
		while(i<word.length()) {
			char c = word.charAt(i);
			starWord.append(c);
			i++;
		}//end while
		starWord.append(word.charAt(0));
		starWord.append("ay");
		
	}
	//reverseWord
	public void reverseWord() {
	int len = word.length();
	for(int i= len-1; i>=0;i--) {
		//retrieve the letter from at index i
		char w = word.charAt(i); 
		starWord.append(w);
		}
	}
	//get method
	//.toString();
	public String getWord() {
		return starWord.toString();
	}
	

}
