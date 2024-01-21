package generic;

public class Car {
    protected String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        Car carObj = (Car) obj;
        return this.name == carObj.name;
    }

    @Override
    public String toString() {
        return "Car name = " + name;
    }
}
