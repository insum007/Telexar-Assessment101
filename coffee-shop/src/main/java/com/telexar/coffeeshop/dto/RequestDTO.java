package com.telexar.coffeeshop.dto;

import java.util.List;

import com.telexar.coffeeshop.entity.Item;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * 
 * @author Musni
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestDTO {

	private String location;
	private String contactNo;
	private List<Item> menu;
	private int noOfQueue;
	private int maxSize;

}
