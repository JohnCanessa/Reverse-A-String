import java.util.Scanner;

public class Solution {
	
	/*
	 * Reverse the specified string.
	 */
	static String reverse(String str) {
				
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
		String revStr = reverse(str) ;
		
		// **** ****
		System.out.println("main <<< revStr ==>" + revStr + "<==");
		
		// **** close scanner ****
		sc.close();
	}

}
