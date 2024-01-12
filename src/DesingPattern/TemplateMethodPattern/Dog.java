package DesingPattern.TemplateMethodPattern;

public class Dog extends Animal{

    @Override
    void say() {
        System.out.println("나는 강아지 멍멍");
    }

    @Override
    AnimalToy toy() {
        return new DogToy();
    }
}
