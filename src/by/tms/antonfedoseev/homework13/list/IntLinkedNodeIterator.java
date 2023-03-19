package by.tms.antonfedoseev.homework13.list;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class IntLinkedNodeIterator implements Iterator<Integer> {
    private IntLinkedNode currentNode;


    public IntLinkedNodeIterator(IntLinkedNode headNode) {
        currentNode = headNode;
    }

    @Override
    public boolean hasNext() {
        if (currentNode.getNextNode() != null) return true;
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
