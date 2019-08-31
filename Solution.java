import java.util.Scanner;

public class Solution {
	
	/*
	 * Reverse the specified string.
	 */
	static String reverse1(String str) {
				
		// **** no need to reverse ****
		if (str.length() <= 1)
			return str;
		
		// **** array or characters ****
		char[] ar1 = str.toCharArray();
		
		// **** reverse array of characters ****
		char[] ar2 = new char[ar1.length];
		
		// **** reverse the array ****
		for (int i = 0, j = ar2.length - 1; i < ar1.length; i++, j--)
			ar2[i] = ar1[j];
		
		// **** return the reverse string ****
		return new String(ar2);
	}

	/*
	 * Reverse a string using StringBuilder.
	 */
	static String reverse2(String str) {
		
//		// **** a one liner ****
//		return new StringBuilder(str)
//						.reverse()
//						.toString();
		
		// **** no need to reverse ****
		if (str.length() <= 1)
			return str;

		// **** make a StringBuilder with the specified string ****
		StringBuilder sb = new StringBuilder(str);
				
		// **** reverse the string ****
		sb.reverse();
		
		// **** return the reverse string ****
		return sb.toString();
	}
	
	/*
	 * Reverse the stirng using StringBuilder one character at a time.
	 */
	static String reverse3(String str) {
		
		// **** no need to reverse ****
		if (str.length() <= 1)
			return str;

		// **** ****
		StringBuilder sb = new StringBuilder();
		
		// **** ****
		for (int i = str.length() - 1; i >= 0; i--)
			sb.append(str.charAt(i));
		
		// **** return the reversed string ****
		return sb.toString();
	}
	
	/*
	 * Test scaffolding.
	 */
	public static void main(String[] args) {
	
		// **** open scaneer ****
		Scanner sc = new Scanner(System.in);
		
		// **** prompt and read string ****
		System.out.print(">>> str: ");
		String str = sc.nextLine();
		
		// ???? ????
		System.out.println("main <<<    str ==>" + str + "<==");
		
		// **** reverse the string ****
		String revStr = reverse1(str) ;
		
		// **** ****
		System.out.println("main <<< revStr ==>" + revStr + "<==");
		
		// **** reverse the string ****
		revStr = reverse2(str);
		
		// **** ****
		System.out.println("main <<< revStr ==>" + revStr + "<==");
		
		// **** reverse the string ****
		revStr = reverse3(str);
		
		// **** ****
		System.out.println("main <<< revStr ==>" + revStr + "<==");

		// **** close scanner ****
		sc.close();
	}

}
