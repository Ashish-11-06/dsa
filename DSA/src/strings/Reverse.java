package strings;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A string to reverse : ");
		String str = sc.nextLine();
		System.out.print("reversed string is : ");
		for(int i = str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
		sc.close();
	}

}
