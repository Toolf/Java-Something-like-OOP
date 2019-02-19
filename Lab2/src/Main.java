
public class Main {

	public static void main(String[] args) {
		int a = 5,sum=0;
		char b[] = {1,1,2,2};
		
		char c[] = new char[b.length];
		
		for(int i =0;i<b.length;i++){
			c[i] = (char)(b[i]*(char)a);
			sum+=c[i];
			System.out.print((int)c[i]);
			System.out.print(" ");
		} System.out.print("\n");
		
		if(b.length == 0){
			System.out.println("b is empty");
		} else {
			System.out.println((double)sum/b.length);
		}
		
	}

}
