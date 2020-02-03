package com.ecommerce.agriculture.Controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

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
import com.ecommerce.agriculture.entity.Order;
import com.ecommerce.agriculture.service.AdminServiceImplementation;
import com.ecommerce.agriculture.service.ItemServiceImplementation;
import com.ecommerce.agriculture.service.OrderServiceImplementation;

/**
 * 
 * @author Soumyadip Chowdhury
 * @github Soumyadip007
 * 
 */
@Controller
@RequestMapping("/user")
public class UserController {


	private ItemServiceImplementation itemServiceImplementation;
	private AdminServiceImplementation adminServiceImplementation;
	private OrderServiceImplementation orderServiceImplementation;
	
	@Autowired
	public UserController(ItemServiceImplementation objA,
			AdminServiceImplementation adminServiceImplementation,
			OrderServiceImplementation orderServiceImplementation) {
	
		this.itemServiceImplementation=objA;
		this.adminServiceImplementation=adminServiceImplementation;
		this.orderServiceImplementation=orderServiceImplementation;
	}
	
	
	@RequestMapping("/index")
	public String itemIndex(Model model){
		
		Admin p=this.lastseen();
		model.addAttribute("name",p.getFirstName()+" "+p.getLastName());        
	//	List<Item> list=itemServiceImplementation.findAll();
	//	model.addAttribute("user", list);
		
		
		return "user/index";
	}
	
	
	@RequestMapping("/item")
	public String itemDetails(Model model){
		
		Admin p=this.lastseen();
		model.addAttribute("name",p.getFirstName()+" "+p.getLastName());        
		List<Item> list=itemServiceImplementation.findAll();
		model.addAttribute("user", list);
		
		
		return "user";
	}
	
	@RequestMapping("/find-item")
	public String oneItem(@RequestParam("id") int theId,Model model){
		
		Admin p=this.lastseen();
		
		model.addAttribute("name",p.getFirstName()+" "+p.getLastName());        
		Item list=itemServiceImplementation.findById(theId);
		int c=list.getViews();
		c++;
		list.setViews(c);
		itemServiceImplementation.save(list);
		
		model.addAttribute("item", list);
		
		
		return "user";
	}
	
	
	@GetMapping("/add-orders")
	public String index(Model model){

		Admin p=this.lastseen();
		model.addAttribute("name",p.getFirstName()+" "+p.getLastName());   
		Order order=new Order();
		
		model.addAttribute("order", order);
		
		return "user";
	}
	
	@PostMapping("/save")
	public String save(@ModelAttribute("order") Order order) {
		
		Admin admin1=this.lastseen();
		
		
		System.out.println(order);
		
		int p=admin1.getId();
		String p1=String.valueOf(p);
		
		orderServiceImplementation.save(order);
		
		
		return "";
	}
	
	
	@RequestMapping("/my-orders")
	public String orderDetails(Model model){
		
		
		Admin p=this.lastseen();
		model.addAttribute("name",p.getFirstName()+" "+p.getLastName());   
		String s=String.valueOf(p.getId());
		List<Order> list= orderServiceImplementation.findByUserid(p.getId());
		model.addAttribute("order", list);
		
		
		return "";
	}
	
	public Admin lastseen()
	{
		String username="";
		String Pass = "";
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		if (principal instanceof UserDetails) {
		   username = ((UserDetails)principal).getUsername();
		   Pass = ((UserDetails)principal).getPassword();
		  System.out.println("One + "+username+"   "+Pass);
		  	} else {
		 username = principal.toString();
		  System.out.println("Two + "+username);
		}
		System.out.println("One + "+username+"   "+Pass);
		Admin admin1 = adminServiceImplementation.findByUser(username);
		System.out.println(admin1);
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
		Date now = new Date();  
		String log=now.toString();
		admin1.setLastseen(log);
		adminServiceImplementation.save(admin1);
		
		return admin1;
		
	}
}