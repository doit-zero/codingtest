package CoffeeShop;

public class CoffeeShop {
    private int money;

    public void takeOrder(){
        System.out.println("주문하시겠습니까?");
    }

    public int calculateOrder(int customerMoney,int orderMoney) {
        System.out.println("주문하신 음료를 계산하겠습니다.");
        System.out.println("주문하신 음료는 " + orderMoney +" 입니다.");
        System.out.println(customerMoney + " 받았습니다. 거스름 돈은 " + (customerMoney - orderMoney));
        return this.money = orderMoney;
    }

    public void myMoney(){
        System.out.println("커피숍소 잔고는 " + money);
    }
}
