package Spring;

import org.springframework.beans.factory.annotation.Autowired;

public class Car  {

    @Autowired
    Tire tire;

//    public Car() {
//    }
//
//    public Car(Tire tire) {
//        this.tire = tire;
//    }
//
//    public Tire getTire() {
//        return tire;
//    }
//
//    public void setTire(Tire tire) {
//        this.tire = tire;
//    }

    //    public Car() {
//        tire = new KoreaTire();
//    }

    public String getTireBrand() {
        return "장착된 타이어 = " + tire.getBrand();
    }
}
