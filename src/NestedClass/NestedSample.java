package NestedClass;

public class NestedSample {
    public static void main(String[] args) {
        NestedSample nestedSample = new NestedSample();
        nestedSample.makeStaticNestedClass();
    }

    public void makeStaticNestedClass() {
        OuterOfStatic.StaticNested staticNested = new OuterOfStatic.StaticNested();
        staticNested.setValue(44);
        System.out.println(staticNested.getValue());

    }

}
