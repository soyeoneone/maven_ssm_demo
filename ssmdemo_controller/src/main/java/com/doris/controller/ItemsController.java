package com.doris.controller;

import com.doris.entity.Items;
import com.doris.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * desc:
 * author: ailinxi
 * date: 2018/9/17.
 */
@Controller
@RequestMapping("/items")
public class ItemsController {
    @Autowired
    private ItemsService userService;
    @RequestMapping("/toindex")
    public String toindex(Model model) {
        Items items = userService.queryById(1);
        model.addAttribute("items",items);
        return "pages";
    }
}
