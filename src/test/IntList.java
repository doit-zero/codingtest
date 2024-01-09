package test;

public class IntList {

    private int[] nums; // 배열
    private int current; // 저장 위치

    public IntList() {
        nums = new int[3];
        current = 0;
    }

    public void add(int num) {
        nums[current++] = num;

    }

    public void clear() { // 실제 삭제한 것은 아님 메모리에 남아있음
        current = 0;
    }

    public int size() {
        return current;
    }

    public int get(int index) {
        if(current <= index)
            throw new IndexOutOfBoundsException();

        return nums[index];
    }

    public int[] getArray() {
        return nums;
    }
}
