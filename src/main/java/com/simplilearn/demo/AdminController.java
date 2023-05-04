package com.simplilearn.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.demo.entity.Admin;
import com.simplilearn.demo.service.AdminService;


@CrossOrigin("http://localhost:4200/")
@RestController
@RequestMapping("/api/admin")
public class AdminController {
	@Autowired
	private AdminService ad_service;
	
	@PostMapping("/")
	public ResponseEntity<Admin> addAdmin(@RequestBody Admin ad){
		
		Admin admin= ad_service.addAdmin(ad);
		
		if(admin!=null)
			return new ResponseEntity<Admin>(admin,HttpStatus.CREATED);
		else
			return new ResponseEntity<Admin>(admin,HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	@GetMapping("/")
	public List<Admin> getAllAdmin(){
		return ad_service.getAllAdmin();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Admin>getAdminById (@PathVariable int id){
		Admin admin= ad_service.getAdminById(id);
		
		if(admin!=null)
			return new ResponseEntity<Admin>(admin, HttpStatus.OK);
		else
			return new ResponseEntity<Admin>(admin, HttpStatus.NOT_FOUND);
	}
	@PutMapping("/{id}")
	public ResponseEntity<Object> updateAdmin(@PathVariable int id,@RequestBody Admin newAdmin){
		Admin admin= ad_service.updateAdmin(id, newAdmin);
		
		if (admin!=null)
			return new ResponseEntity<Object>(admin,HttpStatus.OK);
		else
			return new ResponseEntity<Object>("No Admin Available to Update",HttpStatus.NOT_FOUND);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String>deleteAdmin(@PathVariable int id){
		boolean result = ad_service.deleteAdmin(id);
		if(result) 
			return new ResponseEntity<String>("Object Deleted",HttpStatus.OK);
		else
			return new ResponseEntity<String>("NO Admin Found", HttpStatus.NOT_FOUND);
		
	}
 



}
