package by.tms.antonfedoseev.homework13.list;

public interface IntList extends Iterable<Integer> {

    int get(int index);

    int set(int index, int element);

    int size();

    void add(int element);

    int remove(int index);

    int lastIndexOf(int element);
}
