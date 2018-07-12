package com.cxw.conversion;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * 转换日期类型的数据
 * S : 页面传递过来的类型
 * T ： 转换后的类型
 * @author lx
 *
 */
public class DateConveter {

	public Date convert(String source) {
		// TODO Auto-generated method stub
		try {
			if(null != source){//2016:11-05 11_43-50
				DateFormat df = new SimpleDateFormat("yyyy:MM-dd HH_mm-ss");
				return df.parse(source);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}


}