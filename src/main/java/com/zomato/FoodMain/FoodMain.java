package com.zomato.FoodMain;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.zomato.FoodApi.FoodApi;

public class FoodMain {
	
	public static void main(String args[]) {
			System.out.println("Main Class Called");
			
//			BeanFactory factory = new XmlBeanFactory(new ClassPathResource("food.xml"));
//			FoodApi foodApi = (FoodApi)factory.getBean("foodapi");
			
//			ApplicationContext applicationContext = new FileSystemXmlApplicationContext("C:/Users/admin/eclipse-workspace/Food/src/main/resources/food.xml");
//			FoodApi foodApi = (FoodApi)applicationContext.getBean("foodapi");
					
			ConfigurableApplicationContext  applicationContext1 = new ClassPathXmlApplicationContext("food.xml");
			FoodApi foodApi = (FoodApi)applicationContext1.getBean("food-api");

			System.out.println("Data  " + foodApi.getFoodDetail() );
			applicationContext1.close();
	}

}
