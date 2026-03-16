package com.tapfood.dao;

import java.util.ArrayList;

import com.tapfood.model.orderitem;

public interface orderitemdao {
    int addOrderItem(orderitem orderItem);
    
    ArrayList<orderitem> getAllOrderItems();
    
    orderitem getOrderItemById(int orderItemId);
    
    int updateOrderItem(orderitem orderItem);
    
    int deleteOrderItem(int orderItemId);

}
