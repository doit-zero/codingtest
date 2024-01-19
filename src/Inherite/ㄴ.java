package Inherite;

class Parent {
    protected int value;

    public Parent(int value) {
        this.value = value;
    }

    public void printValue() {
        System.out.println("Parent value: " + value);
    }
}

class Child extends Parent {
    public Child(int value) {
        super(value);
    }

    // 자식 클래스에서 부모 클래스의 메서드를 오버라이드
    @Override
    public void printValue() {
        System.out.println("Child value: " + value);
    }
}


