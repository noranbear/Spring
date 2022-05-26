package com.vo;

/**
 * @author noranbear
 * @date 2022. 5. 26.
 * @version 1.0
 * @description
 *
 *
 * =========================================================
 * 	    DATE			 AUTHOR				    NOTE
 * ---------------------------------------------------------
 *  2022. 5. 26.		noranbear			    Fisrt
 *
 * =========================================================
 */
public class ItemVo {
	
	private String id;
	private String name;
	private int price;
	
	// Constructors
	public ItemVo() {
	}

	public ItemVo(String id, String name, int price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	// Getters and Setters
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	// toString
	@Override
	public String toString() {
		return "ItemVo [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

}




