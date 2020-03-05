package com.trainingbakset.strings;
import java.util.*;
import java.io.*;

public class CamelCase {

	public static String CamelCasee(String str) {
		str = str.replaceAll("\\p{Punct}", " ");
		System.out.println(str);
		String[] starr = str.split(" ");
		String res = starr[0];
		for (int i = 1; i < starr.length; i++) {
			String temp = "";
			char[] ch = starr[i].toCharArray();
			if (ch[0] >= 'a' && ch[0] <= 'z') {
				ch[0] = (char) (ch[0] - 32);
				temp = temp + ch[0];
			} else {
				temp = temp + ch[0];
			}
			for (int j = 1; j < ch.length; j++) {
				if (ch[j] >= 'A' && ch[j] <= 'Z') {
					ch[j] = (char) (ch[j] + 32);
					temp = temp + ch[j];
				} else {
					temp = temp + ch[j];
				}
			}
			res += temp;
		}
		return res;
	}

	public static void main(String[] args) {
		// keep this function call here
		Scanner s = new Scanner(System.in);
		System.out.print(CamelCasee(s.nextLine()));
	}

}