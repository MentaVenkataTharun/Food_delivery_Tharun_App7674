
package com.tapfood.dao;

import java.util.ArrayList;
import com.tapfood.model.menu;

public interface menudao {
    int addMenu(menu m);

    ArrayList<menu> getAllMenus();

    ArrayList<menu> getMenusByRestaurantId(int restaurantid);

    menu getMenuById(int menuid);

    int updateMenu(menu m);

    int deleteMenu(int menuid);
}
