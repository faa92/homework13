package by.tms.antonfedoseev.homework13.list;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class IntLinkedNodeIterator implements Iterator<Integer> {
    private IntLinkedNode currentNode;


    public IntLinkedNodeIterator(IntLinkedNode currentNode) {
        this.currentNode = currentNode;
    }

    @Override
    public boolean hasNext() {
        if (this.currentNode.getNextNode() != null) return true;
        return false;
    }

    @Override
    public Integer next() {
        if (!hasNext()) throw new NoSuchElementException();
        else {
            Integer numberNode = currentNode.getElement();
            currentNode = currentNode.getNextNode();
            return numberNode;
        }
    }
}
