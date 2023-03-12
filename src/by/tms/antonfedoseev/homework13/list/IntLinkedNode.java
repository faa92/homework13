package by.tms.antonfedoseev.homework13.list;

public class IntLinkedNode {
    private int element;        // ОДИН ЭЛЕМЕНТ СПИСКА
    private IntLinkedNode nextNode;     // АДРЕС СЛЕДУЮЩЕГО ЭЛЕМЕНТА СПИСКА (посл объект списка =null)
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
