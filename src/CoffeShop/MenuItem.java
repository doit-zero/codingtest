package CoffeShop;

public class MenuItem {
    private String menuName;
    private int price;

    public MenuItem(String menuName, int price) {
        this.menuName = menuName;
        this.price = price;
    }

    public int getPrice(){
        return price;
    }

    public String getMenuName(){
        return menuName;
    }
}
