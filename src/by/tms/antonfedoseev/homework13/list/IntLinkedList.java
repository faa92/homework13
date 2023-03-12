package by.tms.antonfedoseev.homework13.list;

public class IntLinkedList implements IntList {
    private IntLinkedNode headNode;
    private IntLinkedNode nextNode;

    IntLinkedList() {
        headNode = null;
    }
    @Override
    public String toString() {
        return null;
    }


    @Override
    public int get(int index) {

        return 0;
    }

    @Override
    public int set(int index, int element) {
        return 0;
    }

    @Override
    public int size() {
        headNode = nextNode;
        int count = 0;
        while (nextNode != null) {
            count++;
            nextNode = nextNode.getNextNode();
        }
        return count;
    }

    @Override
    public void add(int element) {

    }

    @Override
    public int remove(int index) {
        return 0;
    }

    @Override
    public int lastIndexOf(int element) {
        return 0;
    }

}
