package com.baisalbek.pswds.controller;

import com.baisalbek.pswds.controller.modal.ListViewModel;
import com.baisalbek.pswds.entities.Item;
import com.baisalbek.pswds.repo.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.ArrayList;

@Controller
public class ListController {

    @Autowired
    private ItemRepository repository;

    @RequestMapping("/")
    public String home(Model model) {
//        ArrayList<Item> list = (ArrayList<Item>) repository.findAll();
//        //model.addAttribute("items", todoList);
//        model.addAttribute("newitem", new Item());
//        model.addAttribute("items", new ListViewModel(list));
        return "home";
    }
    @RequestMapping("/index")
    public String index(Model model) {
        ArrayList<Item> list = (ArrayList<Item>) repository.findAll();
        //model.addAttribute("items", todoList);
        model.addAttribute("newitem", new Item());
        model.addAttribute("items", new ListViewModel(list));
        return "index";
    }

    @RequestMapping("/add")
    public String addItem(@ModelAttribute Item requestItem) {
        Item item = new Item(requestItem.getTitle(), requestItem.getUserName(),requestItem.getPassword(),requestItem.getLink());
        repository.save(item);
        return "redirect:/";
    }

    @RequestMapping("/update")
    public String updateItem(@ModelAttribute ListViewModel requestItems) {
        for (Item requestItem : requestItems.getList() ) {
            Item item = new Item(requestItem.getTitle(), requestItem.getUserName(),requestItem.getPassword(),requestItem.getLink());
            item.setId(requestItem.getId());
            repository.save(item);
        }
        return "redirect:/";
    }
}
