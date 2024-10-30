package identifyChar;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char c = s.charAt(0);
		if (isAlphabet(c)) {
			System.out.print("Is alphabet");
		} else {
			System.out.print("Is non-alphabet");
		}
				
	}

	private static boolean isAlphabet(char c) {
		// TODO Auto-generated method stub
		//return (c>='a' && c<='z') || (c>='A' && c<='Z');
		return Character.isAlphabetic(c);
	}

}
