package com.bea.web;

import com.bea.pojo.Items;
import com.bea.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by fandi on 2020/5/1 0001.
 */
@Controller
@RequestMapping("/items")
public class ItemsController {
    @Autowired
    private ItemsService itemsService;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        List<Items> list = itemsService.findAll();
        model.addAttribute("list",list);
        return "list";
    }

    @RequestMapping("/insertItems")
    public String insertItems(Items items){
        itemsService.insertItems(items);
        return "success";
    }

    @RequestMapping("/updateItems")
    public String updateItems(Items items){
        itemsService.updateItems(items);
        return "success";
    }

    @RequestMapping("/deleteItems")
    public String deleteItems(Integer id){
        itemsService.deleteItems(id);
        return "success";
    }
}
