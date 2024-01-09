package test;

public class ObjectList {

    private Object[] nums; // 배열
    private int current; // 저장 위치

    public ObjectList() {
        nums = new Object[3];
        current = 0;
    }

    public void add(Object num) {
        nums[current++] = num;

    }

    public void clear() { // 실제 삭제한 것은 아님 메모리에 남아있음
        current = 0;
    }

    public int size() {
        return current;
    }

    public Object get(int index) {
        if(current <= index)
            throw new IndexOutOfBoundsException();

        return nums[index];
    }

    public Object[] getArray() {
        return nums;
    }
}
