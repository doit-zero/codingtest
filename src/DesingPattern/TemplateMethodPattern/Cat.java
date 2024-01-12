package DesingPattern.TemplateMethodPattern;

public class Cat extends Animal{

    @Override
    void say() {
        System.out.println("야옹야용");
    }

    @Override
    AnimalToy toy() {
        return new CatToy();
    }
}
