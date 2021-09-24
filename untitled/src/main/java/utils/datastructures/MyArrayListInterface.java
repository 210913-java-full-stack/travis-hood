package utils.datastructures;

public interface MyArrayListInterface <E> {
    int size();

    int contains(E e);

    void add(E e);

    void add(E e, int index);

    E get(int index);

    void remove(int index);

    void clear();

}

