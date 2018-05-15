
package com.mariam.controller;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mariam.dao.agerepository;
import com.mariam.model.age;
import com.mariam.service.ageservice;

@Controller
public class agecontroller {

	@Autowired
	private agerepository agerepositoryo;

	@Autowired
	private ageservice ageserviceo;

	@GetMapping(value = "/")
        public String getAge(Model model)
    {
     
    model.addAttribute("age",agerepositoryo.findAll());
    return "age";
    }
	
	@PostMapping(value = "/")
	public String addage(@RequestParam("agemin") String agemin,@RequestParam("agemax") String agemax
			, Model model) {
		ageserviceo.addAage(agemin,agemax);
		System.out.println("agemin = " + agemin + ",agemax = " + agemax);
		return "redirect:/";
	}

	@PostMapping(value = "/delete")
	public String deleteage(@RequestParam("ageid") Integer ageid) {
		ageserviceo.deleteAage(ageid);
		System.out.println("Removed from database");
		return "redirect:/";

	}
	
//	@PostMapping(value = "/genkey")
//	public String genkey(@RequestParam("name") String name,
//			@RequestParam("rescued") @DateTimeFormat(pattern = "yyyy-MM-dd") Date rescued,
//			@RequestParam("vaccinated") Boolean vaccinated, Model model) {
//		dogservice.getGeneratedKey(name, rescued, vaccinated);
//		System.out.println("name = " + name + ",rescued = " + rescued + ", vaccinated = " + vaccinated);
//		return "redirect:/";
//	}

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
//import com.mariam.dao.agerepository;
//
///**
// *
// * @author maria
// */
//@Controller
//public class agecontroller {
//    private agerepository agerepositoryo;
//
//    public agecontroller(agerepository agerepositoryo) {
//        this.agerepositoryo = agerepositoryo;
//    }
//    @RequestMapping("/getage")
//    public String getAge(Model model)
//    {
//     
//    model.addAttribute("age",agerepositoryo.findAll());
//    return "age";
//    }
//}
//*/