import java.util.Arrays;

public class main {
	
	//Check if string has unique characters
	public static Boolean isUnique(String str){
		int[] counter = new int[128];
		for (int i=0; i<str.length(); i++){
			int c = str.charAt(i);
			if(counter[c] > 0){
				return false;
			}
			counter[c]++;
		}
		return true;
	}
	
	//without data structures
	public static Boolean isUniqueNoStructures(String str){
		char[] chars = str.toCharArray();
		Arrays.sort(chars);
		//O(n logn)
		for(int i=0; i<chars.length-1; i++){
			if(chars[i] == chars[i+1]){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args){
		System.out.println(isUniqueNoStructures("Apple"));
		System.out.println(isUniqueNoStructures("apple"));
		System.out.println(isUniqueNoStructures("aple"));
		System.out.println(isUnique("Apple"));
		System.out.println(isUnique("apple"));
		System.out.println(isUnique("aple"));
	}
}
