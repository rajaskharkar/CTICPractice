import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args){
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		String first=sc.nextLine();
		System.out.println("Enter another string");
		String second=sc.nextLine();
		sc.close();
	}
}
