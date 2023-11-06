package com.telexar.consumer.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

/**
 * CustomerController
 * 
 * @author Musni
 *
 */
@RestController
@RequestMapping("/customer")
@Slf4j
public class CustomerController {

	/**
	 * To add Coffee Shop With Items
	 * 
	 * 
	 * @throws Exception
	 */
	@ResponseStatus(value = HttpStatus.OK)
	@PostMapping("/get-shop")
	public void getShopDeatils() throws Exception {
		log.info("Inside getShopDeatils method of CustomerController");
		try {
			// TODO

		} catch (Exception e) {
			throw new Exception();
		}

	}

}
