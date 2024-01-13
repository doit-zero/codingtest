package CoffeeShop;

public class Customer {
    private int money = 10000;

    public int payMoney(){
        return this.money;
    }

    public int getLastMoney(int orderMoney) {
        return money = this.money - orderMoney;
    }

    public void orderMilktea(){
        System.out.println("밀크티 주세여");
    }

    public void orderIceCoffee(){
        System.out.println("아이스커피 주세요");
    }

    public void myMoney(){
        System.out.println("고객의 잔고는 " + money);
    }
}
