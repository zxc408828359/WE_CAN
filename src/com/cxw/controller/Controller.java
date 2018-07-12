package com.cxw.controller;

import java.io.File;

import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.cxw.pojo.TbCategory;
import com.cxw.pojo.TbItem;
import com.cxw.service.CommService;


@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    private CommService commService;

    @RequestMapping("/admin/category")
    public String page(Model model) {
        List<TbCategory> list = commService.getCategoryList();
        model.addAttribute("list", list);
        return "category";
    }

    @RequestMapping("/admin/item")
    public String getProduct(Model model, String cid) {
        List<TbItem> list = commService.getProduct(cid);
        model.addAttribute("list", list);
        model.addAttribute("cid", cid);
        return "product";
    }

    /**
     * 进入商品
     *
     * @param cid
     * @return
     */
    @RequestMapping("/admin/itemadd/{cid}")
    public String getxProduct(@PathVariable String cid) {
        System.out.println(cid);
        return "additem";
    }

    /**
     * 添加商品
     *
     * @param
     * @return
     */
    @RequestMapping("/admin/additem")
    public String addProduct(HttpServletRequest request, TbItem tbitem, MultipartFile file1, @RequestParam("file2") List<MultipartFile> file2) throws Exception {
        // 图片上传
        // 设置图片名称，不能重复，可以使用uuid
        if (!file1.isEmpty()) {
            String picName = UUID.randomUUID().toString();
            // 获取文件名
            String oriName = file1.getOriginalFilename();
            // 获取图片后缀
            String extName = oriName.substring(oriName.lastIndexOf("."));
            // 开始上传
            file1.transferTo(new File(request.getSession().getServletContext().getRealPath("/upload") + "/" + picName + extName));
            // 设置图片名到商品中
            tbitem.setImage1("/upload/" + picName + extName);
            // ---------------------------------------------
            // 更新商品
            //this.itemService.updateItemById(item);
        }
        if (!file2.isEmpty()) {
            // 图片上传
            // 设置图片名称，不能重复，可以使用uuid
            for (MultipartFile multipartFile : file2) {
                String picName = UUID.randomUUID().toString();
                // 获取文件名
                String oriName = multipartFile.getOriginalFilename();
                // 获取图片后缀
                String extName = oriName.substring(oriName.lastIndexOf("."));
                // 开始上传
                multipartFile.transferTo(new File(request.getSession().getServletContext().getRealPath("/temp") + "/" + picName + extName));
                // 设置图片名到商品中
                tbitem.setImage2(tbitem.getImage2() + "," + "/temp/" + picName + extName);
                // ---------------------------------------------
            }
        }
        commService.addpro(tbitem);
        return "success";
    }

    @RequestMapping("/admin/addcategory")
    public String addcategory(String categoryName) {
        TbCategory cat = new TbCategory();
        cat.setCategoryName(categoryName);
        commService.addcat(cat);
        return "success";
    }

    @RequestMapping("/admin/categoryDel")
    public String delcategory(String cid) {
        commService.delcat(cid);
        return "success";
    }

    @RequestMapping("/admin/itemDel")
    public String delitem(String itemId) {
        commService.delitem(itemId);
        return "success";
    }

    @RequestMapping("/admin/product")
    public String product(Model model) {
        List<TbItem> list = commService.getAllPro();
        model.addAttribute("list", list);
        return "product2";
    }

    @RequestMapping("/admin/catadd/")
    public String product2(Model model) {

        return "categoryadd";
    }


}
