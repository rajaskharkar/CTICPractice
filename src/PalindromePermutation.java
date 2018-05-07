
public class PalindromePermutation {
	
	public boolean isPermutationOfPalindrome_one(String string){
		int[] table= buildFrequencyTable(string);
		return checkMaxOneOdd(table);
	}

	private boolean checkMaxOneOdd(int[] table) {
		boolean foundOdd=false;
		for(int count: table){
			if(count%2==1){
				if(foundOdd)
					return false;
				foundOdd=true;
			}
		}
		return true;
	}

	private int[] buildFrequencyTable(String string) {
		int[] table= new int[Character.getNumericValue('z')-
		                     Character.getNumericValue('a')+1];
		for(char c: string.toCharArray()){
			int x=getCharNumber(c);
			if(x!=-1)
				table[x]++;
		}
		return table;
	}

	private int getCharNumber(char c) {
		int a=Character.getNumericValue('a');
		int z=Character.getNumericValue('z');
		int val=Character.getNumericValue(c);
		if(a<=val&&val<=z)
			return val-a;
		return -1;
	}
	
	public boolean isPermutationOfPalindrome(String string){
		int countOdd=0;
		int[] table= new int[Character.getNumericValue('z')-
		                     Character.getNumericValue('a')+1];
		for(char c: string.toCharArray()){
			int x= getCharNumber(c);
			if(x!=-1){
				table[x]++;
				if(table[x]%2==1)
					countOdd++;
				else
					countOdd--;
			}
		}
		return countOdd<=1;
	}
}














