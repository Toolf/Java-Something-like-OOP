public class Main {
	public static void main(String[] args) {
		float a = 2,n = 5;
		float b = 6,m = 10;
		final float c = 1;
		float sum = 0;
		
		if((n>=b && a<=b) || (a>=b && a<=m)){
			System.out.println("Err");
			return;
		}
		for (int i=(int)a;i<=n;i++){
			for (int j=(int)b;j<=m;j++){
				sum += (i*j)/(float)(i-j);
			}
		}
		System.out.println(sum);
	}
}
