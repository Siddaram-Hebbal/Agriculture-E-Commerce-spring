package com.ecommerce.agriculture.Controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ecommerce.agriculture.entity.Admin;
import com.ecommerce.agriculture.entity.Item;
import com.ecommerce.agriculture.service.AdminServiceImplementation;

/**
 * 
 * @author Soumyadip Chowdhury
 *
 */
@Controller
@RequestMapping("/seller")
public class SellerController {


	private AdminServiceImplementation adminServiceImplementation;
	
	
	@Autowired
	public SellerController(AdminServiceImplementation obj) {
	
		adminServiceImplementation=obj;
	}
	
	
	@RequestMapping("/index")
	public String index(Model model){

		this.lastseen();
			
		Item admin=new Item();
		// create model attribute to bind form data
	
		model.addAttribute("item", admin);
		
		return "seller/addItems";
	}
	
	
	
	
	
	
	public void lastseen()
	{
		String username="";
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		if (principal instanceof UserDetails) {
		   username = ((UserDetails)principal).getUsername();
		  String Pass = ((UserDetails)principal).getPassword();
		  System.out.println("One + "+username+"   "+Pass);
		  	} else {
		 username = principal.toString();
		  System.out.println("Two + "+username);
		}
		Admin admin1 = adminServiceImplementation.findByEmail(username);
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
		Date now = new Date();  
		String log=now.toString();
		admin1.setLastseen(log);
		adminServiceImplementation.save(admin1);
	
	}
	
}
