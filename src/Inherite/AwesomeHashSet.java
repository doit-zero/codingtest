package Inherite;

import java.util.Collection;
import java.util.HashSet;

class AwesomeHashSet<E> extends HashSet<E> {
    // 새로 추가된 필드 (새로운 원소 수 카운트)
    private int addCount = 0;

    public AwesomeHashSet(){}

    public AwesomeHashSet(int initCap, float loadFactor){
        super(initCap, loadFactor);
    }

    // HashSet의 add와 addAll을 오버라이딩
    @Override
    public boolean add(E e){
        addCount++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c){
        addCount += c.size();
        return super.addAll(c);
    }

    // 새로 생성된 getter
    public int getAddCount(){
        return addCount;
    }
}
