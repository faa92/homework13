package by.tms.antonfedoseev.homework13.list;

public class IntLinkedNode {
    private int element;
    private IntLinkedNode nextNode;

    public int getElement() {
        return element;
    }

    public void setElement(int element) {
        this.element = element;
    }

    public IntLinkedNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(IntLinkedNode nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "[" + element + "]";
    }


}
