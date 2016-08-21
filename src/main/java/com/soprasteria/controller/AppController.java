package com.soprasteria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.soprasteria.model.Post;
import com.soprasteria.service.DataService;

@Controller
public class AppController {

	@Autowired
	private DataService dataService;
	
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showIndex(Model model) {
    	
    	final String title = "May the force be with you";
    	final String footerTitle = "Sopra Steria © Thymeleaf example";
    	final String description = "Travel to Utapau";
    	
    	final List<Post> posts = dataService.getPosts();
    	final List<String> menuLinks = dataService.getMenuLinks();
    	final List<String> blogCategories = dataService.getBlogCategories();

    	model.addAttribute("title", title);
    	model.addAttribute("description", description);
    	model.addAttribute("posts", posts);
    	model.addAttribute("menuLinks", menuLinks);
    	model.addAttribute("blogCategories", blogCategories);
    	model.addAttribute("footerTitle", footerTitle);
    	return "index";
    }

}