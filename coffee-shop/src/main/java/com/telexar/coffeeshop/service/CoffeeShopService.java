package com.telexar.coffeeshop.service;

import com.telexar.coffeeshop.dto.RequestDTO;
import com.telexar.coffeeshop.entity.CoffeeShop;

public interface CoffeeShopService {

	public CoffeeShop addCoffeeShopWithItems(RequestDTO request);

}
