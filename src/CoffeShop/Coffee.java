package CoffeShop;

public class Coffee {
    private String coffeName;
    private int price;

    public Coffee(MenuItem menuItem){
        coffeName = menuItem.getMenuName();
        price = menuItem.getPrice();
    }
}
