package godOfJava.lesson8_참조자료형;

import java.util.ArrayList;
import java.util.List;

public class PizzaStore {
    public static void main(String[] args){

        List<Client> arrayClient = new ArrayList<>(4);

        Client client1 = new Client(9000);
        Client client2 = new Client(10000);
        Client client3 = new Client(13000);
        Client client4 = new Client();

        arrayClient.add(client1); // 0
        arrayClient.add(client2); // 1
        arrayClient.add(client3); // 2
        arrayClient.add(client4); // 3


        PizzaStore pizzaStore = new PizzaStore();
        for(int i = 0 ; i < 4 ; i++){
            System.out.println(arrayClient.get(i).money);
            System.out.println("고객 " + (i+1));
            arrayClient.get(i).order("치즈피자");
            pizzaStore.calculate(arrayClient.get(i));
        }

    }

    public void calculate(Client client){
        int pizza = 12000;
        if(client.money < 10000){
            System.out.println("고객님 돈이 부족합니다.");
        } else {
            System.out.println("고객님 계산되었고 거스름 돈은 여깄습니다. " + (client.money - pizza));
        }
    }

}
