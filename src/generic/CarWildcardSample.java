package generic;

import java.util.HashSet;

public class CarWildcardSample {
    public static void main(String[] args) {
        CarWildcardSample sample = new CarWildcardSample();
        sample.callBound();
        HashSet<Car> carHashSet = new HashSet<>();
        Car car = new Car("벤츠");
        Car car1 = new Car("벤츠");

        carHashSet.add(car);

        boolean contains = carHashSet.contains(car1);
        System.out.println(contains);
        System.out.println(car.equals(car1));
        System.out.println(car.hashCode() == car1.hashCode());
        System.out.println(car == car1);

    }

    public void callBound(){
        WildcardGeneric<Bus> wildcard = new WildcardGeneric<Bus>();
        wildcard.setWildcard(new Bus("10230"));
        bounded(wildcard);
    }

    public void bounded(WildcardGeneric<? extends Car> c) {
        Car value = c.getWildcard();
        System.out.println(value);
    }
}
