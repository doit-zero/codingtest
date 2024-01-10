package NestedClass;

public class ReferenceAtNested {

    public static void main(String[] args) {
        ReferenceAtNested referenceAtNested = new ReferenceAtNested();
        ReferenceAtNested.StaticNested staticNested = new ReferenceAtNested.StaticNested();
        ReferenceAtNested referenceAtNested1 = new ReferenceAtNested();
        ReferenceAtNested.Inner inner = referenceAtNested1.new Inner();

        referenceAtNested.setValue(200,inner);



    }
    static class StaticNested{
        private int staticNestedInt = 99;
    }

    class Inner {
        private int innerValue = 100;
    }

    public void setValue(int value, ReferenceAtNested.Inner inner) {
        ReferenceAtNested re = new ReferenceAtNested();
        ReferenceAtNested.Inner inne1 = re.new Inner();

        inner = inne1;
        System.out.println(inne1.innerValue);

        inne1.innerValue = value;
        System.out.println(inner.innerValue);
        System.out.println(inne1.innerValue);

    }

}
