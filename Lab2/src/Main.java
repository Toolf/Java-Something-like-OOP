
public class Main {

	public static void main(String[] args) {
		//start values (inputs) 
		int a = 5;
		char b[][] = {
				{1,2,3,4},
				{1,0,0,0},
				{2,1,1,5},
				{2,2,2,2}
		};
		
		//check b is empty
		if (b.length == 0 || b[0].length == 0){
			System.out.println("B is empty");
			//must return some Exception
			return;
		}
		
		//change matrix a*B a-const
		char c[][] = new char[b.length][b[0].length];
		double partialSums[] = new double[b.length];
		for(int i=0;i<b.length;i++){
			for(int j=0;j<b[i].length;j++){
				c[i][j]= (char)((int)b[i][j]*a);
				partialSums[i] += c[i][j];
			}
			partialSums[i]/=b[i].length;
		}
		
		System.out.print("Finish Matrix:\n");
		for(int i=0;i<c.length;i++){
			for(int j=0;j<c[i].length;j++){
				System.out.print((int)c[i][j] + " ");
			}
			System.out.print("\n");
		}
		
		double averagValue = 0;
		for(int i=0;i<partialSums.length;i++){
			averagValue += partialSums[i];
		}
		averagValue/=partialSums.length;
		System.out.println(averagValue);
		//must return 8.75
	}

}
