package com.telexar.coffeeshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telexar.coffeeshop.entity.Item;

/**
 * ItemRepository
 * 
 * @author Musni
 *
 */
public interface ItemRepository extends JpaRepository<Item, Long> {

}
