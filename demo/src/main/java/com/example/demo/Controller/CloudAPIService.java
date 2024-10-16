package com.example.demo.Controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Cloudvendor;

@RestController 
@RequestMapping("/cloudvendor")
public class CloudAPIService {
	Cloudvendor cloudvendor;
	@GetMapping
public Cloudvendor getCloudVendorDetails(String vendorID) {
	return cloudvendor;
	//Cloudvendor("C1","Vendor1","Address 1","xxxx");
}
	@PostMapping
	public String createCloudVendorDetails(@RequestBody Cloudvendor cloudvendor) {
		this.cloudvendor=cloudvendor;
		return " Vendor Added Successfully";
	}
	@PutMapping
	public String updateCloudVendorDetails(@RequestBody Cloudvendor cloudvendor) {
		this.cloudvendor=cloudvendor;
		return " Vendor updated Successfully";
	}
	
	@DeleteMapping
	public String deleteCloudVendorDetails(String vendorID) {
		this.cloudvendor=null;
		return " Vendor deleted Successfully";
	}
	
}