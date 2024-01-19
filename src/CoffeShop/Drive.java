package CoffeShop;

import java.util.ArrayList;
import java.util.List;

public class Drive {
    public static void main(String[] args) {
        Customer customer = new Customer();

        List<MenuItem> menuItem = new ArrayList<>();
        MenuItem menuItem1 = new MenuItem("americano",3000);
        menuItem.add(menuItem1);

        Barista barista = new Barista();

        Menu menu = new Menu(menuItem);
        customer.order("americano",menu,barista);

    }
}
