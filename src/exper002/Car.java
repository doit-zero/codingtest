package exper002;

public class Car {
    Tire tire; // Tire 인터페이스를 구현한 클래스의 객체를 참조하는 변수를 선언

    public Tire getTire() {
        return tire;
    }

    public void setTire(Tire tire) {
        this.tire = tire;
    }

    public String getTireBrand() {
        return "장착된 타어이 =" + tire.getBrand();
    }
}
