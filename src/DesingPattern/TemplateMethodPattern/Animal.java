package DesingPattern.TemplateMethodPattern;

abstract class Animal {
    void playWithOwner() {
        System.out.println("귀염둥이 이리온");
        say();
        System.out.println("꼬리 살랑 살랑 ");
    }

    abstract void say();

    abstract AnimalToy toy();
}
