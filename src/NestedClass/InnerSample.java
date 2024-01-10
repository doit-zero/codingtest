package NestedClass;

public class InnerSample {
    public static void main(String[] args){
        InnerSample innerSample = new InnerSample();
        innerSample.makeInnerObject();
    }

    public void makeInnerObject(){
        OuterOfInner outerOfInner = new OuterOfInner();
        OuterOfInner.Inner inner = outerOfInner.new Inner();
        inner.setValue(44);
        System.out.println(inner.getValue());
    }
}
