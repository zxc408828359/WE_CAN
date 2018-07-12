package com.cxw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.cxw.mapper.TbItemMapper;
import com.cxw.pojo.Orders;
import com.cxw.pojo.TbItemExample;
@Service
public class testService {
	@Autowired
	private TbItemMapper s;
	public void testQueryUserById() {
		// 获取Mapper
	}

	
	
}
