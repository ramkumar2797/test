package parallel_processing;

import java.util.Scanner;

public class Zohorecruitment2020 {

	public static void main(String args[]) {
		int middleChar = 0;
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
	//	char[]  chr = str.toCharArray();
		int len = str.length();
		for(int i=0; i<len; i++)
		{
			for(int j=2*(len-i); j>=0; j--)
			{
				System.out.print(" ");
			}
			middleChar =len / 2;
			for(int j=0; j<=i; j++)
			{
				System.out.print(str.charAt(middleChar++)+" ");
			}
			System.out.println();
		}
	}

}

