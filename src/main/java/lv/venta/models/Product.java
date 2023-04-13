package lv.venta.models;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class Product {

	private int id;
	private String title;
	private float price;
	private String description;
	private int quantity;
	private static int idCounter = 0;
	
	public int getId() {
		return id;
	}

	public void setId() {
		this.id = idCounter++;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Product(String title, float price, String description, int quantity) {
		setId();
		this.title = title;
		this.price = price;
		this.description = description;
		this.quantity = quantity;
	}

	public Product() {
	}

}