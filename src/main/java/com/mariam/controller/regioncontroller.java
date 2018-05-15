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

import com.mariam.dao.regionrepository;
import com.mariam.model.region;
import com.mariam.service.regionservice;

@Controller
public class regioncontroller {

	@Autowired
	private regionrepository regionrepositoryo;

	@Autowired
	private regionservice regionserviceo;

	@GetMapping(value = "/")
        public String getregion(Model model)
    {
     
    model.addAttribute("region",regionrepositoryo.findAll());
    return "region";
    }
	
	@PostMapping(value = "/")
	public String addregion(@RequestParam("regionname") String regionname) 
            {	
                regionserviceo.addAregion(regionname);
		System.out.println("region = " + regionname);
		return "redirect:/";
	}
            

	@PostMapping(value = "/delete")
	public String deleteregion(@RequestParam("regionid") Integer regionid) {
		regionserviceo.deleteAregion(regionid);
		System.out.println("Removed from database");
		return "redirect:/";

	}
}
        
	
//package com.mariam.controller;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import com.mariam.dao.regionrepository;
//
///**
// *
// * @author maria
// */
//@Controller
//public class regioncontroller {
//    private regionrepository regionrepositoryo;
//
//    public regioncontroller(regionrepository regionrepositoryo) {
//        this.regionrepositoryo = regionrepositoryo;
//    }
//    @RequestMapping("/region")
//    public String getRegion(Model model)
//    {
//     
//    model.addAttribute("region",regionrepositoryo.findAll());
//    return "region";
//    }
//}
        