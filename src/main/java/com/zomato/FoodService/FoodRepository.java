package com.zomato.FoodService;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.init.DataSourceInitializer;

import com.zomato.FoodModel.FoodJson;

public class FoodRepository {
	
	public String getFoodDetail() {
		
		ApplicationContext  applicationContext2 = new ClassPathXmlApplicationContext("food.xml");
		FoodJson foodJson = (FoodJson)applicationContext2.getBean("food-json");
		
		DataSource datasource = (DataSource)applicationContext2.getBean("datasource");
		JdbcTemplate  jdbcTemplate= new JdbcTemplate(datasource );
		
		String query= "UPDATE `fooddatabase`.`fooddetails` SET `foodID` = '3', `foodType` = 'spicey', `foodName` = 'curry5' WHERE (`foodID` = '2')";
		jdbcTemplate.update(query);
		
		foodJson.setFoodID(1);
		foodJson.setFoodName("Pav Bhaji");
		foodJson.setFoodType("Fast Food");
		
		
		return "Food details are - id is "+ foodJson.getFoodID() + " foodName  is" + foodJson.getFoodName() + " foodType  is" + foodJson.getFoodType();
	}


}
