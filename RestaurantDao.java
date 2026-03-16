package com.tapfood.dao;

import java.util.List;
import com.tapfood.model.Restaurant;

public interface RestaurantDao {
    int addRestaurant(Restaurant restaurant);
    List<Restaurant> getAllRestaurants();
    Restaurant getRestaurant(int id);
    int updateRestaurant(Restaurant restaurant);
    int deleteRestaurant(int id);
}
