package com.velocity;


public class StringReverse {
	public String getReverseString(String pune) {
		String reverse=" ";
		for(int i=pune.length()-1; i>=0;i--) {
			reverse=reverse+pune.charAt(i);
			}
		return reverse;
	}
public static void main(String[] args) {
	System.out.println("enter the name");
	StringReverse reverse=new StringReverse();
	java.util.Scanner  scanner =new java.util.Scanner(System.in);
	String a=scanner.next();
	System.out.println("reverse of "+ a+" is "+reverse.getReverseString(a));

	
}

}
