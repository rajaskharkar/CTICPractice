
public class IsUniqueChars {
	
	public boolean isUniqueChars(String string){
		if(string.length()>128) return false;
		boolean[] charSet=new boolean[128];
		for(int i=0;i<string.length();i++){
			int val=string.charAt(i);
			if(charSet[val]){
				return false;
			}
			charSet[val]=true;
		}
		return true;
	}
}
