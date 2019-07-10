package test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.first.StringOps;

public class TestStringOps {
	String s1 = "Hello";
	String s2 = "World Hello";

	@Test
	public void testConcat() {
		StringOps so = new StringOps();
		String actual = so.concat(s1, s2);
		String expected = "HelloWorld Hello";
		assertEquals(actual, expected);
	}

	@Test
	public void testLength() {
		StringOps so = new StringOps();
		int actual = so.length(s1, s2);
		int expected = 16;
		assertEquals(actual, expected);
	}

	@Test
	public void testContains() {
		StringOps so = new StringOps();
		boolean actual = so.contains(s1, s2);
		boolean expected = true;
		assertEquals(actual, expected);

	}

}
