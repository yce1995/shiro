package cn.et.food.seriver;

import cn.et.food.entity.Foods;
import cn.et.food.utils.PageTools;

public interface FoodService {

	public abstract PageTools queryFood(String foodname,Integer page,Integer rows);
	
	public abstract void saveFood(Foods food);
	
	public abstract void updateFood(Foods food);
	
	public abstract void deleteFood(Integer foodid);
}