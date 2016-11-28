package com.vz.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.vz.entities.Price;

@RestController
public class ItemController {
	
	@RequestMapping("/price")
	public @ResponseBody Price getItem(){		
		return new Price(40.56,45.76,30.43);
	}

}
