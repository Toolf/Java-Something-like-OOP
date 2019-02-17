public class Letter {
	char value;
	Letter(char value){
		this.value = value;
	}
	
	Letter(Letter letter){
		this.value = letter.value;
	}
	
	public static void main(String[] args){
		char a = 'a';
		Letter first = new Letter(a);
		System.out.println(first.value);
	}
}
