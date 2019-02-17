
public class Main {

	public static void main(String[] args) {
		float a = 4,n = 5;
		float b = 6,m = 10;
		final float c = 1;
		float sum = 0;
		
		for (int i=(int)a;i<n;i++){
			if(i>=b && i<m){
				System.out.println("Err");
				return;
			}
			for (int j=(int)b;j<m;j++){
				System.out.println(sum);
				sum += (i*j)/(float)(i-j);
			}
		}
		System.out.println(sum);
	}


}
