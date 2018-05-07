
public class OneAway {
	
	public boolean oneEditAway_one(String first, String second){
		if(first.length()==second.length())
			return replace(first,second);
		else if(first.length()+1==second.length())
			return insert(first,second);
		else if(first.length()-1==second.length())
			return insert(second,first);
		return false;
	}

	private boolean insert(String first, String second) {
		int index1=0, index2=0;
		while(index1<first.length() && index2<second.length()){
			if(first.charAt(index1)!=second.charAt(index2)){
				if(index1!=index2)
					return false;
				index2++;
			}
			else{
				index1++;
				index2++;
			}
		}
		return true;
	}

	private boolean replace(String first, String second) {
		boolean foundDifference=false;
		for(int i=0;i<first.length();i++){
			if(first.charAt(i)!=second.charAt(i)){
				if(foundDifference)
					return false;
				foundDifference=true;
			}
		}
		return true;
	}
	
	//merging both methods in one method
	public boolean oneEditAway_two(String first, String second){
		if(Math.abs(first.length()-second.length())>1) 
			return false;
		//get shorter and longer string
		String s1=first.length()<second.length() ?
				first : second;
		String s2=first.length()<second.length() ?
				second : first;
		int index1=0, index2=0;
		boolean foundDifference=false;
		while(index2<s2.length() && index1<s1.length()){
			if(s1.charAt(index1)!=s2.charAt(index2)){
				if(foundDifference)
					return false;
				foundDifference=true;
				if(s1.length()==s2.length()){
					index1++;
				}
			}
			else{
				index1++;
			}
			index2++;
		}
		return true;
	}
}















