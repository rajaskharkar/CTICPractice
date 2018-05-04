
public class CheckPermutation {
	
	private String sort(String string){
		char[] content=string.toCharArray();
		java.util.Arrays.sort(content);
		return new String(content);
	}
	
	//sort and compare
	public boolean permutation_one(String s, String t){
		if(s.length()!=t.length())
			return false;
		return sort(s).equals(sort(t));
	}
	
	//check if character counts are identical
	public boolean permutation_two(String s, String t){
		if(s.length()!=t.length()) return false;
		int[] letters=new int[128];
		char[] sArray=s.toCharArray();
		for(char c: sArray){
			letters[c]++;
		}
		for(int i=0;i<t.length();i++){
			int c=(int) t.charAt(i);
			letters[c]--;
			if(letters[c]<0)
				return false;
		}
		return true;
	}
}
