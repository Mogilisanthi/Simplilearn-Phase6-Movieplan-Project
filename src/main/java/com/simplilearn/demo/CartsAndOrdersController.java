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

import com.simplilearn.demo.entity.CartsAndOrders;
import com.simplilearn.demo.service.CartsAndOrdersService;

@CrossOrigin("http://localhost:4200/")
@RestController
@RequestMapping("/api/cartandorder")
public class CartsAndOrdersController {
	@Autowired 
	CartsAndOrdersService cservice;
	
	@PostMapping("/")
	public ResponseEntity<CartsAndOrders> addToUserCart(@RequestBody CartsAndOrders c){
		CartsAndOrders resp=cservice.insert(c);
		if(resp!=null)
			return new ResponseEntity<CartsAndOrders>(resp,HttpStatus.CREATED);
		else
			return new ResponseEntity<CartsAndOrders>(resp,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	@GetMapping("/")
	public List<CartsAndOrders> getcart(){
		return cservice.getcart();	
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteFromCart(@PathVariable Long id){
		if(cservice.deleteById(id))
			return new ResponseEntity<String>("removed from cart successfully",HttpStatus.OK);
		else
			return new ResponseEntity<String>("not available to remove",HttpStatus.NOT_FOUND);
	}
	@PutMapping("/{id}")
	public ResponseEntity<Object> updateCartOrder(@PathVariable long id,@RequestBody CartsAndOrders c){
		CartsAndOrders resp=cservice.updateCartByUsername(id, c);
		if(resp!=null)
			return new ResponseEntity<Object>(resp,HttpStatus.OK);
		else
			return new ResponseEntity<Object>("No Order avaialble to updated",HttpStatus.NOT_FOUND);
	}
	@PutMapping("updateqty/{id}")
	public ResponseEntity<Object> updateQtyCartOrder(@PathVariable long id,@RequestBody CartsAndOrders c){
		CartsAndOrders resp=cservice.updateCartqty(id, c);
		if(resp!=null)
			return new ResponseEntity<Object>(resp,HttpStatus.OK);
		else
			return new ResponseEntity<Object>("No Order avaialble to updated",HttpStatus.NOT_FOUND);
	}
	

}
