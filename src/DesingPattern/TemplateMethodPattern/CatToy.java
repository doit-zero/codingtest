package DesingPattern.TemplateMethodPattern;

public class CatToy extends AnimalToy {
    @Override
    void identify() {
        System.out.println("고양이의 장난감입니다.");
    }

}
