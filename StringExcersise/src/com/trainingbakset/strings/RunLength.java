package com.trainingbakset.strings;

import java.util.Scanner;

public class RunLength {

	public static String Length(String str) {
		char[] ch = str.toCharArray();
		int len = ch.length;
		System.out.println(len);
		String res = "";
		int start = 0;
		while (len > 0) {
			int count = 1;
			if(start==ch.length-1) {
				res=res+count+ch[start];
			}
			for (int i = start + 1; i < ch.length; i++) {

				System.out.println(ch[i - 1] + " " + ch[i]);
				if (ch[i - 1] == ch[i]) {
					count++;
				} 
				else {
					res = res + count + ch[i - 1];
					start = start + count;
					System.out.println(start);
					break;
				}
			}
			
			len = len - count;
		}
		return res;
	}

	public static void main(String[] args) {
		// keep this function call here
		Scanner s = new Scanner(System.in);
		System.out.print(Length(s.nextLine()));
	}
}
