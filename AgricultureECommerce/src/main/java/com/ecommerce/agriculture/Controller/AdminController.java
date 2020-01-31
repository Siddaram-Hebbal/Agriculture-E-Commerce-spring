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
import com.ecommerce.agriculture.service.AdminServiceImplementation;

/**
 * 
 * @author Soumyadip Chowdhury
 * @github soumyadip007
 *
 */
@Controller
@RequestMapping("/admin")
public class AdminController {
	
	private AdminServiceImplementation adminServiceImplementation;
	
	@Autowired
	public AdminController(AdminServiceImplementation obj) {
		this.adminServiceImplementation=obj;
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
