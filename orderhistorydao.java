package com.tapfood.dao;

import java.util.ArrayList;

import com.tapfood.model.orderhistory;

public interface orderhistorydao {
	 int addOrderHistory(orderhistory oh);

	    ArrayList<orderhistory> getAllOrderHistories();

	    orderhistory getOrderHistoryById(int orderHistoryId);

	    ArrayList<orderhistory> getOrderHistoriesByUserId(int userId);

	    int updateOrderHistory(orderhistory oh);

	    int deleteOrderHistory(int orderHistoryId);

}

