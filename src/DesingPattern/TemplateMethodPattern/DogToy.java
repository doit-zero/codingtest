package DesingPattern.TemplateMethodPattern;

public class DogToy extends AnimalToy {
    @Override
    void identify() {
        System.out.println("강아지의 장난감 입니다.");
    }
}
