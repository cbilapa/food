package com.zomato.FoodApi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zomato.FoodService.FoodRepository;

public class FoodApi {
	
	public void initFoodApi() {
		System.out.println("IN initFoodApi Method");
	}
	
	public void destoryFoodApi() {
		System.out.println("IN destoryFoodApi Method");
	}
	
	public String getFoodDetail() {
		ApplicationContext  applicationContext2 = new ClassPathXmlApplicationContext("food.xml");
		FoodRepository foodRepository = (FoodRepository)applicationContext2.getBean("food-repository");
		return foodRepository.getFoodDetail();
		
	}

}
