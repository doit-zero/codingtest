package Spring;

import org.springframework.beans.factory.annotation.Autowired;

public class Car  {
    private String name = "car";

    @Autowired
    private Tire tire;

    public String getTireBrand() {
        return "장착된 타이어 = " + tire.getBrand();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
