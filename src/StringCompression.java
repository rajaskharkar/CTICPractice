
public class StringCompression {
	
	public String compressBad(String string){
		String compressedString="";
		int countConsecutive=0;
		for(int i=0;i<string.length();i++){
			countConsecutive++;
			if(i+1>=string.length() || 
					string.charAt(i) != string.charAt(i+1)){
				compressedString+= "" + string.charAt(i) + countConsecutive;
				countConsecutive=0;
			}
		}
		return compressedString.length()<string.length() ?
				compressedString : string;
	}
	
	//using StringBuilder
	String compress(String string){
		StringBuilder compressed= new StringBuilder();
		int countConsecutive=0;
		for(int i=0;i<string.length();i++){
			countConsecutive++;
			if(i+1>=string.length() ||
					string.charAt(i)!=string.charAt(i+1)){
				compressed.append(string.charAt(i));
				compressed.append(countConsecutive);
				countConsecutive=0;
			}
		}
		return compressed.length() < string.length() ?
				compressed.toString() : string;
	}
	
	//check which string to send first
	public static String compress_three(String string){
		int finalLength= countCompression(string);
		if(finalLength>string.length())
			return string;
		StringBuilder compressed= new StringBuilder(finalLength);
		int countConsecutive=0;
		for(int i=0;i<string.length();i++){
			countConsecutive++;
			if(i+1>=string.length() ||
					string.charAt(i) != string.charAt(i+1)){
				compressed.append(string.charAt(i));
				compressed.append(countConsecutive);
				countConsecutive=0;
			}
		}
		return compressed.toString();
	}

	private static int countCompression(String string) {
		int compressedLength=0;
		int countConsecutive=0;
		for(int i=0;i<string.length();i++){
			countConsecutive++;
			if(i+1 >= string.length() ||
					string.charAt(i) != string.charAt(i+1)){
				compressedLength += 1 + String.valueOf(countConsecutive).length();
				countConsecutive=0;
			}
		}
		return compressedLength;
	}
}





















