package com.service.minimicroservice.restcontroller;

import java.awt.List;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.service.minimicroservice.objects.MyObject;

@RestController
public class MyRestController {

	
	
	
	@RequestMapping(value = "/api", method = RequestMethod.POST)
	public Map<String,String> postApi(@ModelAttribute(name = "ApiObject") MyObject json) {
		HashMap <String,String> test = new HashMap<String,String>();
		test.put(json.getField1(),json.getValue1());
		test.put(json.getField2(),json.getValue2());
		test.put(json.getField3(),json.getValue3());


		return test;
		
	
	
	}
	
	
	 
}
