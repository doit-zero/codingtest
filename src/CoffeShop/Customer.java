package CoffeShop;

public class Customer {
    public void order(String menuName, Menu menu , Barista barista) {
        MenuItem menuItem = menu.choose(menuName);
        Coffee coffee = barista.makeCoffee(menuItem);

        System.out.println(coffee.getName() + " 감사합니다.~!");
    }
}
