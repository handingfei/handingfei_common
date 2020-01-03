package com.handingfei.util;

import org.junit.Test;

public class StringUtilTest {

	@Test
	public void testHasLength() {
		boolean length = StringUtil.hasLength(" ");
		System.out.println(length);
	}

	@Test
	public void testHasText() {
		boolean text = StringUtil.hasText(".");
		System.out.println(text);
	}

	@Test
	public void testRandomChineseString() {
		String chineseString = StringUtil.randomChineseString();
		System.out.println(chineseString);
	}
	
	@Test
	public void testRandomChineseString2() {
		String chineseString = StringUtil.randomChineseString(1000);
		System.out.println(chineseString);
	}

	@Test
	public void testGenerateChineseName() {
		String name = StringUtil.generateChineseName();
		System.out.println(name);
	}

	@Test
	public void testIsPhoneNumber() {
		boolean number = StringUtil.isPhoneNumber("13812456201");
		System.out.println(number);
	}

	@Test
	public void testIsEMail() {
		//boolean eMail = StringUtil.isEMail("number2000@163.com");
		boolean eMail = StringUtil.isEMail("123456@qqcom");
		System.out.println(eMail);
	}

}