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
 * @github soumyadip007
 *
 */
@Controller
@RequestMapping("/admin")
public class AdminController {
	
	private ItemServiceImplementation itemServiceImplementation;
	private AdminServiceImplementation adminServiceImplementation;
	private OrderServiceImplementation orderServiceImplementation;
	
	@Autowired
	public AdminController(ItemServiceImplementation objA,
			AdminServiceImplementation adminServiceImplementation,
			OrderServiceImplementation orderServiceImplementation) {
	
		this.itemServiceImplementation=objA;
		this.adminServiceImplementation=adminServiceImplementation;
		this.orderServiceImplementation=orderServiceImplementation;
	}
	
	
	
	@RequestMapping("/admin-details")
	public String adminDetails(Model model){
		
		
		this.lastseen();
			         
		List<Admin> list=adminServiceImplementation.findByRole("ROLE_ADMIN");
		model.addAttribute("user", list);
		
		
		return "admin/admin";
	}
	
	

	@GetMapping("/add-admin")
	public String showForm(Model theModel) {
		
		
		this.lastseen();
		
		
		Admin admin=new Admin();
	
		theModel.addAttribute("admin", admin);
		
		return "admin/addAdmin";
	}
	
	
	@PostMapping("/save-admin")
	public String saveEmploye(@ModelAttribute("doctor") Admin admin) {
		
		admin.setId(0);
		
		admin.setUser(admin.getEmail());
		
		admin.setAddress("Not Defined");
		
		admin.setMobile("Not Defined");

		admin.setLongi("Not Defined");
		
		admin.setLatt("Not Defined");
		
		admin.setRole("ROLE_ADMIN");
		
		admin.setPassword("default");
		
		admin.setEnabled(true);
		
		admin.setConfirmationToken("ByAdmin-Panel");
		
		System.out.println(admin);
		
		adminServiceImplementation.save(admin);
		
		return "redirect:/admin/add-admin";
	}
	
	@GetMapping("/edit-my-profile")
	public String EditForm(Model theModel) {
		
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
		
		Admin admin = adminServiceImplementation.findByEmail(username);
				 
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
		    Date now = new Date();  
		    
		         String log=now.toString();
		    
		         admin.setLastseen(log);
		         
		         adminServiceImplementation.save(admin);
		
		System.out.println(admin);
		
		theModel.addAttribute("profile", admin);
		
		return "admin/updateMyProfile";
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
	public String delete_(@RequestParam("id") int theId,Model theModel) {
		this.lastseen();
		System.out.println(theId);
		
		adminServiceImplementation.deleteById(theId);
	
		return "redirect:/admin/add-admin";
	}
	
	//--------------------------------------------------------------
	
	
	@RequestMapping("/seller-details")
	public String sellerDetails(Model model){
		
		
		this.lastseen();
			         
		List<Admin> list=adminServiceImplementation.findByRole("ROLE_SELLER");
		model.addAttribute("user", list);
		
		
		return "admin/seller";
	}
	
	@PostMapping("/update-seller")
	public String update1(@ModelAttribute("admin") Admin admin) {
		
		this.lastseen();
		System.out.println(admin);
		
		adminServiceImplementation.save(admin);
		
		return "redirect:/admin/seller-details";
	}
	
	@GetMapping("/update-seller")
	public String UpdateAr1ea(@RequestParam("id") int theId,Model theModel) {
		this.lastseen();
		System.out.println(theId);
		
		Admin admin=adminServiceImplementation.findById(theId);
		System.out.println(admin);
		
		theModel.addAttribute("admin",admin);
		
		return "admin/editSeller";
	}
	
	@GetMapping("/delete-seller")
	public String delete(@RequestParam("id") int theId,Model theModel) {
		this.lastseen();
		System.out.println(theId);
		
		adminServiceImplementation.deleteById(theId);
	
		return "redirect:/admin/add-admin";
	}
	
	//--------------------------------------------------------------
	
	
		@RequestMapping("/seller-details")
		public String sellerDetails(Model model){
			
			
			this.lastseen();
				         
			List<Admin> list=adminServiceImplementation.findByRole("ROLE_SELLER");
			model.addAttribute("user", list);
			
			
			return "admin/seller";
		}
		
		@PostMapping("/update-seller")
		public String update1(@ModelAttribute("admin") Admin admin) {
			
			this.lastseen();
			System.out.println(admin);
			
			adminServiceImplementation.save(admin);
			
			return "redirect:/admin/seller-details";
		}
		
		@GetMapping("/update-seller")
		public String UpdateAr1ea(@RequestParam("id") int theId,Model theModel) {
			this.lastseen();
			System.out.println(theId);
			
			Admin admin=adminServiceImplementation.findById(theId);
			System.out.println(admin);
			
			theModel.addAttribute("admin",admin);
			
			return "admin/editSeller";
		}
		
		@GetMapping("/delete-seller")
		public String delete(@RequestParam("id") int theId,Model theModel) {
			this.lastseen();
			System.out.println(theId);
			
			adminServiceImplementation.deleteById(theId);
		
			return "redirect:/admin/add-admin";
		}
	
	
	//--------------------------------------------------------------
	
	@RequestMapping("/item-details")
	public String itemDetails(Model model){
		
		Admin p=this.lastseen();   
		List<Item> list=itemServiceImplementation.findAll();
		model.addAttribute("user", list);
		
		
		return "admin/item";
	}

	
	//--------------------------------------------------------------
	
		@RequestMapping("/order-details")
		public String itemssaDetails(Model model){
			
			Admin p=this.lastseen();   
			List<Order> list=orderServiceImplementation.findAll();
			model.addAttribute("order", list);
			
			
			return "admin/order";
		}

	
	public Admin lastseen()
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
		Admin admin1 = adminServiceImplementation.findByUser(username);
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
		Date now = new Date();  
		String log=now.toString();
		admin1.setLastseen(log);
		adminServiceImplementation.save(admin1);
		return admin1;
	}


}
