package godOfJava.lesson13.list;

abstract class AbstractList implements List{
    @Override
    public void add() {}

    @Override
    public void update(int index, Object value) {}

    @Override
    public void remove(int index) {}

    abstract void clear();
}
