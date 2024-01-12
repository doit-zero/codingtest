package DesingPattern.AdapterPattern;

public class Client {
   public static void main(String[] args) {

       Client client = new Client();

       Cat cat = new Cat();
       Dog dog = new Dog();
       Fish fish = new Fish();

       cat.walk();
       dog.walk();
       fish.walk();

       client.say();

   }

   void say(){
       System.out.println("클라이언트는 하나도 변경이 없었따!");
   }
}
