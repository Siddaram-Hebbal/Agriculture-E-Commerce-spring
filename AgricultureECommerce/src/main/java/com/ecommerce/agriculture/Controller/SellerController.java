package com.ecommerce.agriculture.Controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ecommerce.agriculture.entity.Admin;
import com.ecommerce.agriculture.entity.Item;
import com.ecommerce.agriculture.service.AdminServiceImplementation;
import com.ecommerce.agriculture.service.ItemServiceImplementation;

/**
 * 
 * @author Soumyadip Chowdhury
 *
 */
@Controller
@RequestMapping("/seller")
public class SellerController {


	private ItemServiceImplementation itemServiceImplementation;
	private AdminServiceImplementation adminServiceImplementation;
	
	
	@Autowired
	public SellerController(ItemServiceImplementation objA, AdminServiceImplementation adminServiceImplementation) {
	
		this.itemServiceImplementation=objA;
		this.adminServiceImplementation=adminServiceImplementation;
	}
	
	
	@GetMapping("/index")
	public String index(Model model){

		this.lastseen();
			
		Item item=new Item();
		
		model.addAttribute("item", item);
		
		return "seller/addItems";
	}
	
	@PostMapping("/index")
	public String update(@ModelAttribute("item") Item item) {
		
		this.lastseen();
		System.out.println(item);
		
		itemServiceImplementation.save(item);
		
		return "redirect:/admin/admin-details";
	}
	
	@PostMapping("/update")
	public String update(@ModelAttribute("admin") Admin admin) {
		
		this.lastseen();
		System.out.println(admin);
		
		adminServiceImplementation.save(admin);
		
		return "redirect:/admin/admin-details";
	}
	
	@GetMapping("/update-admin")
	public String UpdateArea(@RequestParam("id") int theId,Model theModel) {
		this.lastseen();
		System.out.println(theId);
		
		Admin admin=adminServiceImplementation.findById(theId);
		System.out.println(admin);
		
		theModel.addAttribute("admin",admin);
		
		return "admin/editAdmin";
	}
	
	@GetMapping("/delete-admin")
	public String delete(@RequestParam("id") int theId,Model theModel) {
		this.lastseen();
		System.out.println(theId);
		
		adminServiceImplementation.deleteById(theId);
	
		return "redirect:/admin/add-admin";
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
