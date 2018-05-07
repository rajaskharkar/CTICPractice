
public class StringRotation {
	
	public boolean isRotation(String s1, String s2){
		int length=s1.length();
		//check if s1 and s2 are equal and not empty
		if(length==s2.length()&&length>0){
			//Concatenate s1 and s2
			String s1s1=s1+s1;
			return s1s1.contains(s2);
		}
		return false;
	}
}
