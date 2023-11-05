package com.telexar.coffeeshop.service;

import org.springframework.stereotype.Service;

import com.telexar.coffeeshop.dto.RequestDTO;
import com.telexar.coffeeshop.entity.CoffeeShop;
import com.telexar.coffeeshop.repository.CoffeeShopRepository;
import com.telexar.coffeeshop.repository.ItemRepository;

import lombok.extern.slf4j.Slf4j;

/**
 * CoffeeShopService
 * 
 * @author Musni
 *
 */
@Service
@Slf4j
public class CofeeShopServiceImpl implements CoffeeShopService {

	private final CoffeeShopRepository coffeeShopRepository;
	private final ItemRepository itemRepository;

	public CofeeShopServiceImpl(CoffeeShopRepository coffeeShopRepository, ItemRepository itemRepository) {
		this.coffeeShopRepository = coffeeShopRepository;
		this.itemRepository = itemRepository;
	}

	/**
	 * To add coffee-shop with Items
	 */
	@Override
	public CoffeeShop addCoffeeShopWithItems(RequestDTO request) {
		log.info("Inside addCoffeeShopWithItems method of CoffeeShopService");
		CoffeeShop coffeeShop = CoffeeShop.builder().location(request.getLocation()).contactNo(request.getContactNo())
				.menu(request.getMenu()).noOfQueue(request.getNoOfQueue()).maxSize(request.getMaxSize()).build();

		return coffeeShopRepository.save(coffeeShop);
	}

}
