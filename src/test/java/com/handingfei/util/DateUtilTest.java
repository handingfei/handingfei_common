package com.handingfei.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class DateUtilTest {

	@Test
	public void testInitMonth() {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = DateUtil.initMonth(new Date());
		System.out.println(sdf.format(date));
	}

	@Test
	public void testEndMonth() {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = DateUtil.endMonth(new Date());
		System.out.println(sdf.format(date));
	}

	@Test
	public void testRandomDate() {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		for (int i = 0; i < 1000; i++) {
			Date date = DateUtil.randomDate(new Date(0), new Date());
			System.out.println(sdf.format(date));
		}
	}

}
