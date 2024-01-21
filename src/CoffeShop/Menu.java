package CoffeShop;

import java.util.List;

public class Menu {
    private List<MenuItem> menuItems;

    public Menu(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public MenuItem checkMenu(String menuName) {
        for(MenuItem menuItem : menuItems){
            if(menuItem.equals(menuName)){
                return menuItem;
            }
        }
        return null;
    }
}
