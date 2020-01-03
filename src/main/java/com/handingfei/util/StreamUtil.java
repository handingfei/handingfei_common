package com.handingfei.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @ClassName: StreamUtil 
 * @Description: TODO
 * @author: Dell
 * @date: 2020年1月3日 下午2:50:58
 */
public class StreamUtil {

	/**
	 * 
	 * @Title: readLine 
	 * @Description: 读取文件
	 * @param ins
	 * @return
	 * @return: List<String>
	 * @throws UnsupportedEncodingException 
	 */
	public static List<String> readLine(InputStream in) throws UnsupportedEncodingException{
		
		List<String> list = new ArrayList<String>();
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(in,"UTF-8"));
		
		String str = null;
		try {
			while ((str = reader.readLine())!=null) {
				list.add(str);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
}
