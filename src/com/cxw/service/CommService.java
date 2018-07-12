package com.cxw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cxw.mapper.TbCategoryMapper;
import com.cxw.mapper.TbItemMapper;
import com.cxw.pojo.TbCategory;
import com.cxw.pojo.TbCategoryExample;
import com.cxw.pojo.TbItem;
import com.cxw.pojo.TbItemExample;
import com.cxw.pojo.TbItemExample.Criteria;
@Service
public class CommService {
	
	@Autowired
	private TbItemMapper tbItemMapper;
	@Autowired
	private TbCategoryMapper tbCategoryMapper;
	
	public void testQueryUserById() {
		// 获取Mapper
		
	}
	public List<TbCategory> getCategoryList() {
		TbCategoryExample example=new TbCategoryExample();
		List<TbCategory> list = tbCategoryMapper.selectByExample(example);
		return list;
	}
	public List<TbItem> getProduct(String cid) {
		if(cid.equals("144130")){
			TbItemExample example=new TbItemExample();
			List<TbItem> list = tbItemMapper.selectByExample(example);
			return list;
		}
		TbItemExample example=new TbItemExample();
		Criteria criteria = example.createCriteria();
		criteria.andCarIdEqualTo(cid);
		List<TbItem> list = tbItemMapper.selectByExample(example);
		return list;
	}
	public void addpro(TbItem tbitem) {
		tbItemMapper.insert(tbitem);
	}
	public void addcat(TbCategory cat) {
		tbCategoryMapper.insert(cat);
	}
	public void delcat(String cid) {
		tbCategoryMapper.deleteByPrimaryKey(Long.valueOf(cid));
	}
	public void delitem(String itemId) {
		tbItemMapper.deleteByPrimaryKey(Long.valueOf(itemId));
	}
	public List<TbItem> getAllPro() {
		TbItemExample example = new TbItemExample();
		List<TbItem> list = tbItemMapper.selectByExample(example);
		return list;
	}
	public TbItem getProductbyid(Long valueOf) {
		TbItem item = tbItemMapper.selectByPrimaryKey(valueOf);
		return item;
	}

	
	
}
