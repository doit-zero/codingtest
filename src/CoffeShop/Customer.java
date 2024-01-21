package CoffeShop;

public class Customer {
    public void order(String menuName,Menu menu, Barista barista) {
        MenuItem menuItem = menu.checkMenu(menuName);
        Coffee coffee = barista.makeCoffee(menuItem);
    }
}
