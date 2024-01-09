package godOfJava.lesson8_참조자료형;
// 오버로딩 연습
public class Client {
    public static void main(String[] args){
        Client client = new Client();
        client.order("페페로니");
        client.order("페페로니","제로콜라");
    }

    public Client() {
    }

    public Client(int money) {
        this.money = money;
    }

    public String pizza;
    public String coke;
    public int money;

    public void order(){
        System.out.println("아직 주문 준비가 안됬습니다.");
    }

    public void order(String pizza){
        System.out.println(pizza + " 로 주문할게요");
    }

    public void order(String pizza,String coke){
        System.out.println(pizza + coke + " 로 주문할게요");
    }


}
