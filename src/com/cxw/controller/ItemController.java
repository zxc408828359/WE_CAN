package com.cxw.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cxw.conversion.DateConveter;
import com.cxw.service.testService;
/**
 * 商品管理
 * 
 * @author lx
 *
 */
@Controller
public class ItemController {
	@Autowired
	private testService ts;
	
	@RequestMapping(value = "success",method = RequestMethod.GET)
	public ModelAndView itemList(){
		//从Mysql中查询
		List<Integer> list =new ArrayList<>();
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				list.add(i*10+j);
			}
		}
		ts.testQueryUserById();
		DateConveter c = new DateConveter();
		Date date = c.convert("1996:03-16 22_22-22");
		System.out.println(date);
		ModelAndView mav = new ModelAndView();
		//数据
		mav.addObject("itemList",list);
		mav.setViewName("success");
		return mav;
	}	
	@RequestMapping(value = "success1",method = RequestMethod.GET)
	public String itemList1(){
		//从Mysql中查询
		List<Integer> list =new ArrayList<>();
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				list.add(i*10+j);
			}
		}
		ts.testQueryUserById();
		DateConveter c = new DateConveter();
		Date date = c.convert("1996:03-16 22_22-22");
		System.out.println(date);
		//数据
		return "redirect:/success.action?itemId=" ;
	}	
	@RequestMapping(value = "login",method = RequestMethod.GET)
	public String ss(){
		return "login";
		
	}
	/*	@Autowired
	private ItemService itemService;
	//入门程序 第一   包类 + 类包 + 方法名
	@RequestMapping(value = "/item/itemlist.action")
	public ModelAndView itemList(){
		//从Mysql中查询
		List<Items> list = itemService.selectItemsList();
		
		ModelAndView mav = new ModelAndView();
		//数据
		mav.addObject("itemList", list);
		mav.setViewName("itemList");
		return mav;
	}
	//去修改页面 入参 id
	@RequestMapping(value = "/itemEdit.action")
//	public ModelAndView toEdit(@RequestParam(value = "id",required = false,defaultValue = "1") Integer idaaq,
	public ModelAndView toEdit(Integer id,
			HttpServletRequest request,HttpServletResponse response
			,HttpSession session,Model model){
		
		//Servlet时代开发
//		String id = request.getParameter("id");
		
		//查询一个商品
//		Items items = itemService.selectItemsById(Integer.parseInt(id));
		Items items = itemService.selectItemsById(id);
		ModelAndView mav = new ModelAndView();
		//数据
		mav.addObject("item", items);
		mav.setViewName("editItem");
		return mav;
		
	}
	//提交修改页面 入参  为 Items对象  
	@RequestMapping(value = "/updateitem.action")
//	public ModelAndView updateitem(Items items){
	public ModelAndView updateitem(QueryVo vo){

		//修改
		itemService.updateItemsById(vo.getItems());
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("success");
		return mav;
		
	}*/
	
	
	
	
	
	
	
	
}
