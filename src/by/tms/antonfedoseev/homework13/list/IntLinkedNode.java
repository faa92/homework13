package by.tms.antonfedoseev.homework13.list;

public class IntLinkedNode {
    private int element;
    private IntLinkedNode nextNode;

    int getElement() {
        return element;
    }

    void setElement(int element) {
        this.element = element;
    }

    IntLinkedNode getNextNode() {
        return nextNode;
    }

    void setNextNode(IntLinkedNode nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "[" + element + "]";
    }


}
