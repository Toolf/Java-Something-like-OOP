public class Main {
	public static void main(String[] args) {
		/*
			C2 = 1
			C3 = 1
			C5 = 0
			C7 = 5
		*/
		
		float a = 2,n = 2;
		float b = 3,m = 4;
		final float c = 1;
		
		float sum = 0;
		
		if(a <= c && c <= n){
			System.out.println("Err");
			return;
		}
		for (int i=(int)a;i<=n;i++){
			for (int j=(int)b;j<=m;j++){
				sum += (float)(i*j)/(i-c);
			}
		}
		System.out.println(sum);
	}
}
