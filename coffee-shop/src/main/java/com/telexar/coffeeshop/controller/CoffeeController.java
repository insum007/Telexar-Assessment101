package com.telexar.coffeeshop.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.telexar.coffeeshop.dto.RequestDTO;
import com.telexar.coffeeshop.entity.CoffeeShop;
import com.telexar.coffeeshop.service.CoffeeShopService;

import lombok.extern.slf4j.Slf4j;

/**
 * CoffeeController
 * 
 * @author Musni
 *
 */
@RestController
@RequestMapping("/coffee-shop")
@Slf4j
public class CoffeeController {

	private final CoffeeShopService coffeeShopService;

	public CoffeeController(CoffeeShopService coffeeShopService) {
		this.coffeeShopService = coffeeShopService;
	}

	/**
	 * To add Coffee Shop With Items
	 * 
	 * @param RequestDTO
	 * @return CoffeeShop
	 * @throws Exception
	 */
	@ResponseStatus(value = HttpStatus.OK)
	@PostMapping("/add")
	public CoffeeShop addCoffeeShopWithItems(@RequestBody RequestDTO request) throws Exception {
		log.info("Inside addCoffeeShopWithItems method of CoffeeController");
		try {
			return coffeeShopService.addCoffeeShopWithItems(request);

		} catch (Exception e) {
			throw new Exception();
		}

	}

}
