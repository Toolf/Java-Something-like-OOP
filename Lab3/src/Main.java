import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Comparator;

public class Main {
	
	public static class WordComp implements Comparator<String> {

		public int compare(String first, String second) {
	        if (loudCount(first) > loudCount(second)) {
	            return 1;
	        } else if (loudCount(first) < loudCount(second)) {
	            return -1;
	        } else {
	            return 0;
	        }
	    }
	}
	
	
	public static int loudCount(String str){
		final char[] loud = "аеєиіїоуюя".toCharArray();
		str = str.toLowerCase();
		int count = 0;
		for(int i=0;i<loud.length;i++){
			if(str.indexOf(loud[i]) != -1){
				count++;
			}
		}
		return count;
	}
	
	
	public static void main(String[] args){
		StringBuffer sb = new StringBuffer("Відсортувати слова заданого тексту за зростанням кількості голосних літер");
		
		String[] arr = new String(sb).split(" ");
		
		Arrays.sort(arr,new WordComp());
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i] + ", ");
		}
	}
}
