package com.telexar.coffeeshop.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @author Musni
 *
 */
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "shop")
public class CoffeeShop {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String location;
	private String contactNo;

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "shop_item", joinColumns = @JoinColumn(name = "shop_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "item_id", referencedColumnName = "id"))
	private List<Item> menu;
	private int noOfQueue;
	private int maxSize;

}
