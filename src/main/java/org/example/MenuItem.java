package org.example;

public class MenuItem {
	private final int price;
	private final String name;

	public MenuItem(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public String getName() {
		return name;
	}
}
