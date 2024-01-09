package test;

public class GList<T> {

    private Object[] nums; // 배열
    private int current; // 저장 위치
    private int capacity;
    private int amount;

    public GList() {
        current = 0;
        capacity = 3; // 배열 크기
        amount = 5; // 배열 추가 확장 크기
        nums = new Object[capacity];
    }

    public void add(T num) {
        if(capacity <= current) {
            Object[] temp = new Object[capacity + amount];
            for(int i = 0; i < nums.length; i++){
                temp[i] = nums[i];
            }
            nums = temp;
            capacity += amount ;
        }

        nums[current++] = num;

    }

    public void clear() { // 실제 삭제한 것은 아님 메모리에 남아있음
        current = 0;
    }

    public int size() {
        return current;
    }

    public T get(int index) {
        if(current <= index)
            throw new IndexOutOfBoundsException();

        return (T)nums[index];
    }

    public Object[] getArray() {
        return nums;
    }
}
