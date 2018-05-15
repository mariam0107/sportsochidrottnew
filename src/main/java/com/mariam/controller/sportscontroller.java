package com.mariam.controller;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mariam.dao.sportsrepository;
import com.mariam.model.sports;
import com.mariam.service.sportsservice;

@Controller
public class sportscontroller {

	@Autowired
	private sportsrepository sportsrepositoryo;

	@Autowired
	private sportsservice sportsserviceo;

	@GetMapping(value = "/")
        public String getsport(Model model)
    {
     
    model.addAttribute("sports",sportsrepositoryo.findAll());
    return "sport";
    }
	
	@PostMapping(value = "/")
	public String addsport(@RequestParam("sportsitem") String sportsitem) 
            {	
                sportsserviceo.addAsport(sportsitem);
		System.out.println("sports = " + sportsitem);
		return "redirect:/";
	}
            

	@PostMapping(value = "/delete")
	public String deletesport(@RequestParam("sportsid") Integer sportsid) {
		sportsserviceo.deleteAsport(sportsid);
		System.out.println("Removed from database");
		return "redirect:/";

	}
}



///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.mariam.controller;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import com.mariam.dao.sportsrepository;
//
///**
// *
// * @author maria
// */
//@Controller
//public class sportscontroller {
//    private sportsrepository sportsrepositoryo;
//
//    public sportscontroller(sportsrepository sportsrepositoryo) {
//        this.sportsrepositoryo = sportsrepositoryo;
//    }
//    @RequestMapping("/sports")
//    public String getSports(Model model)
//    {
//     
//    model.addAttribute("sports",sportsrepositoryo.findAll());
//    return "sports";
//    }
//}
