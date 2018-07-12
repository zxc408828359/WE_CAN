package com.cxw.controller;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cxw.pojo.TbCategory;
import com.cxw.pojo.TbItem;
import com.cxw.service.CommService;


@Controller
public class IndexController {
    @Autowired
    private CommService commService;

    private int i = 0;

    @RequestMapping("/pro/index")
    public String page(Model model) {
        List<TbItem> list = commService.getAllPro();
        List<TbCategory> catlist = commService.getCategoryList();
        model.addAttribute("list", list);
        model.addAttribute("catlist", catlist);
        return "index";
    }

    @RequestMapping("/pro/category")
    public String page(Model model, @RequestParam(value = "cid", defaultValue = "144130") String cid) {
        List<TbItem> prolist = commService.getProduct(cid);
        String cname = "";
        List<TbCategory> catlist = commService.getCategoryList();
        for (int i = 0; i < catlist.size(); i++) {
            if (catlist.get(i).getCategoryId() == Long.valueOf(cid))
                cname = catlist.get(i).getCategoryName();
        }
        model.addAttribute("cname", cname);
        model.addAttribute("prolist", prolist);
        model.addAttribute("catlist", catlist);

        i++;
        System.out.println("" + i);


        return "index_pro";
    }

    @RequestMapping("/pro/product")
    public String page2(Model model, String pid) {
        TbItem item = commService.getProductbyid(Long.valueOf(pid));
        List<String> images = new ArrayList<>();
        String image2 = item.getImage2();
        String[] split = image2.split(",");
        if (split.length > 0) {
            for (String string : split) {
                if (!string.equals("null") && string != null) {
                    images.add(string);
                }
            }
        }
        List<TbCategory> catlist = commService.getCategoryList();
        model.addAttribute("proname", item.getItemName());
        model.addAttribute("image1", item.getImage1());
        model.addAttribute("images", images);
        model.addAttribute("text",item.getItemInfo());
        model.addAttribute("catlist", catlist);
        return "index_pro_mo";
    }

    @RequestMapping("/pro/about_us")
    public String page2(Model model) {
        List<TbItem> list = commService.getAllPro();
        List<TbCategory> catlist = commService.getCategoryList();
        model.addAttribute("list", list);
        model.addAttribute("catlist", catlist);
        return "index_about_us";
    }

    @RequestMapping("/pro/contant_us")
    public String page3(Model model) {
        List<TbItem> list = commService.getAllPro();
        List<TbCategory> catlist = commService.getCategoryList();
        model.addAttribute("list", list);
        model.addAttribute("catlist", catlist);
        return "index_contant";
    }
}
