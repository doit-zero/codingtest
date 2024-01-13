package CoffeeShop;

public class Driver {
    public static void main(String[] args){
        CoffeeShop coffeeShop = new CoffeeShop();
        Customer customer = new Customer();
        Order order = new Order();

        coffeeShop.takeOrder();
        customer.orderMilktea();
        int milktea = order.getMilktea();

        coffeeShop.calculateOrder(customer.payMoney(),milktea);
        customer.getLastMoney(milktea);
        customer.getLastMoney(2233);
        coffeeShop.myMoney();
        customer.myMoney();

    }
}
