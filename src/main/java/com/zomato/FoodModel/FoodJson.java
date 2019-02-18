package com.zomato.FoodModel;

public class FoodJson {
	
	private int foodID;
	private String foodName;
	private String foodType;
	
	
	public int getFoodID() {
		return foodID;
	}
	public void setFoodID(int foodID) {
		this.foodID = foodID;
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public String getFoodType() {
		return foodType;
	}
	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}
	
	@Override
	public String toString() {
		return "FoodJson [foodID=" + foodID + ", foodName=" + foodName + ", foodType=" + foodType + "]";
	}

}
