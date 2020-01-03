package com.handingfei.util;

/**
 * 
 * @ClassName: NumberUtil 
 * @Description: TODO
 * @author: Dell
 * @date: 2020年1月3日 下午2:17:28
 */
public class NumberUtil {

	/**
	 * 
	 * @Title: isNumber 
	 * @Description: 判断是否是数字
	 * @param src
	 * @return
	 * @return: boolean
	 */
	public static boolean isNumber(String src) {
		
		String reg = "^(-)?[0-9]+(\\.[0-9]+)?$";
		return src.matches(reg);
	}
}
