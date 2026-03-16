package com.tapfood.dao;

import java.util.ArrayList;

import com.tapfood.model.ordertable;

public interface ordertabledao {
	  int addOrder(ordertable order);
	    
	    ArrayList<ordertable> getAllOrders();
	    
	    ordertable getOrderById(int orderId);
	    
	    int updateOrder(ordertable order);
	    
	    int deleteOrder(int orderId);

		ordertable getSpecificOrder();


}
