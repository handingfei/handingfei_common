package com.handingfei.util;

import org.junit.Test;

public class RandomUtilTest {

	@Test
	public void testRandom() {
		for (int i = 0; i < 50; i++) {
			int random = RandomUtil.random(1, 3);
			System.out.println(random);
		}
	}

	@Test
	public void testSubRandom() {
		int[] random = RandomUtil.subRandom(1, 10, 3);
		System.out.println(random);
	}

	@Test
	public void testRandomCharacter() {
		
	}

	@Test
	public void testRandomString() {
		String string = RandomUtil.randomString(4);
		System.out.println(string);
	}

}
