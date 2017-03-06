
public class main {
	//checks if a string is a permutation of a palindrome. - same forward and back
	//using bit vector. ignoring non alphabet characters. all letters to lowercase
	public static Boolean checker(String str){
		int counter = 0;
		for (int i=0; i<str.length(); i++){
			int val = Character.toLowerCase(str.charAt(i))- 'a';
			if(val >= 0 && val <= 25){
				counter ^=  (1 << val);
			}
		}
		
		if(counter==0)
			return true;
		else{
			return (counter & (counter-1)) == 0;
			
		}
	}
	
	public static void main(String args[]){
		System.out.println((checker("abba")));
		System.out.println((checker("abcba")));
		System.out.println((checker("abzbya")));
	}
}
