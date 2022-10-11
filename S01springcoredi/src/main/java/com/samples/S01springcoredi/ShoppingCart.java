package com.samples.S01springcoredi;

public class ShoppingCart {
	private item item;

	public item getItem() {
		return item;
	}

	public void setItem(item item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return "ShoppingCart [item=" + item + "]";
	}
	

}
