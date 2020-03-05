package com.trainingbakset.strings;

import java.util.*;
import java.io.*;

public class Palindrome {

	public static boolean PalindromeTwo(String str) {
	    str=str.toLowerCase();
	    String st=str.replaceAll("\\p{Punct}","");
	    st=st.replaceAll(" ", "");
	    String[] starr=st.split(" ");
	    String temp="";
	    for(int i=0;i<starr.length;i++) {
	    char[] ch=starr[i].toCharArray();
	    for(int j=ch.length-1;j>=0;j--){
	        temp=temp+ch[j];
	      }
	    }
	  //  System.out.println(temp);
	  //  System.out.println(st);
	      if(st.equals(temp)) {
	    	  return true;
	      }
	    return false;
	  }

	public static void main(String[] args) {
		// keep this function call here
		Scanner s = new Scanner(System.in);
		System.out.print(PalindromeTwo(s.nextLine()));
	}

}
