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

import com.mariam.dao.clubdetailsrepository;
import com.mariam.model.clubdetails;
import com.mariam.service.clubdetailsservice;

@Controller
public class clubcontroller {

	@Autowired
	private clubdetailsrepository clubrepositoryo;

	@Autowired
	private clubdetailsservice clubserviceo;

	@GetMapping(value = "/")
        public String getsport(Model model)
    {
     
    model.addAttribute("clubdetails",clubrepositoryo.findAll());
    return "clubdetails";
    }
	
	@PostMapping(value = "/")
	public String addclub(@RequestParam("OrgNumber") String OrgNumber,
                @RequestParam("clubname") String clubname,
                @RequestParam("clubemail") String clubemail,
                @RequestParam("clubpwd") String clubpwd,
                @RequestParam("clubphone") String clubphone,
                @RequestParam("clubwebsite") String clubwebsite)
            {	
                clubserviceo.addAclub(OrgNumber,clubname,clubemail,clubpwd,clubphone,clubwebsite);
		System.out.println("New club added" );
		return "redirect:/";
	}
            

	@PostMapping(value = "/delete")
	public String deletesport(@RequestParam("clubid") Integer clubid) {
		clubserviceo.deleteAclub(clubid);
		System.out.println("Removed from database");
		return "redirect:/";

	}
}


//package com.mariam.controller;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import com.mariam.dao.clubdetailsrepository;
//
///**
// *
// * @author maria
// */
//@Controller
//public class clubcontroller {
//    private clubdetailsrepository clubdetailsrepositoryo;
//
//    public clubcontroller(clubdetailsrepository clubdetailsrepositoryo) {
//        this.clubdetailsrepositoryo = clubdetailsrepositoryo;
//    }
//    @RequestMapping("/clubdetails")
//    public String getClubdetails(Model model)
//    {
//     
//    model.addAttribute("sports",clubdetailsrepositoryo.findAll());
//    return "sports";
//    }
//}
