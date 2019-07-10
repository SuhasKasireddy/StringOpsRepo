package com.first;

public class StringOps {

	public String concat(String a, String b) {
		return a + b;
	}

	public int length(String a, String b) {
		return a.length() + b.length();
	}

	public boolean contains(String a, String b) {
		if (b.contains(a))
			return true;
		else
			return false;
	}

	public static void main(String[] args) {

		String s1 = "Hello";
		String s2 = "World Hello";
		System.out.println(s1);
		System.out.println(s2);
		StringOps so = new StringOps();
		System.out.println("\nConcat:\t\t" + so.concat(s1, s2));
		System.out.println("Length:\t\t" + so.length(s1, s2));
		System.out.println("Contains:\t" + so.contains(s1, s2));

	}
}