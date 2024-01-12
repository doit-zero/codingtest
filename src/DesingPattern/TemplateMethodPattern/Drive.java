package DesingPattern.TemplateMethodPattern;

public class Drive {
    public static void main(String[] args){
        Animal cat = new Cat();
        Animal dog = new Dog();

        cat.playWithOwner();
        dog.playWithOwner();

        AnimalToy catToy = cat.toy();
        AnimalToy dogToy = dog.toy();

        System.out.println(catToy.equals(dogToy));

        catToy.identify();
        dogToy.identify();
    }
}
