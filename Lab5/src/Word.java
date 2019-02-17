public class Word {
	Letter[] value;
	
	Word(Letter[] word){
		this.value = word;
	}
	
	Word(String word){
		char[] char_word = word.toCharArray();
		this.value = new Letter[char_word.length];
		for(int i=0;i<char_word.length;i++){
			this.value[i] = new Letter(char_word[i]);
			System.out.print(this.value[i].value);
		}
	}
	
	public static void main(String[] args){
		Word first = new Word("sad");
	}
}
