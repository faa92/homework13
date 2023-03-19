package by.tms.antonfedoseev.homework13.list;

import java.util.Iterator;

public class IntLinkedList implements IntList {
    private IntLinkedNode headNode;

    public IntLinkedList() {
        headNode = null;
    }

    private IntLinkedNode getNode(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException();
        }
        IntLinkedNode node = headNode;
        int i = 0;
        while (i < index && node != null) {
            node = node.getNextNode();
            i++;
        }
        if (node == null) {
            throw new IndexOutOfBoundsException();
        }
        return node;
    }

    @Override
    public String toString() {
        if (headNode == null) {
            return "[]";
        }
        StringBuilder builder = new StringBuilder("[");
        IntLinkedNode node = headNode;
        while (node.getNextNode() != null) {
            builder.append(node.getElement()).append(", ");
            node = node.getNextNode();
        }
        return builder.append(node.getElement()).append("]").toString();
    }


    @Override
    public int get(int index) {
        IntLinkedNode node = getNode(index);
        return node.getElement();
    }

    @Override
    public int set(int index, int element) {
        IntLinkedNode node = getNode(index);
        int returnElement = node.getElement();
        node.setElement(element);
        return returnElement;
    }

    @Override
    public int size() {
        IntLinkedNode nextNode = headNode;
        int count = 0;
        while (nextNode != null) {
            count++;
            nextNode = nextNode.getNextNode();
        }
        return count;
    }

    @Override
    public void add(int element) {
        IntLinkedNode newNode = new IntLinkedNode();
        newNode.setElement(element);

        if (headNode == null) {
            headNode = newNode;
        } else {
            IntLinkedNode nextNode = headNode;
            while (nextNode.getNextNode() != null) {
                nextNode = nextNode.getNextNode();
            }
            nextNode.setNextNode(newNode);
        }
    }

    @Override
    public int remove(int index) {
        if (headNode == null) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            int remove = headNode.getElement();
            headNode = headNode.getNextNode();
            return remove;
        } else {
            IntLinkedNode preRemovedNode = getNode(index - 1);
            IntLinkedNode removedNode = preRemovedNode.getNextNode();
            if (removedNode == null) {
                throw new IndexOutOfBoundsException();
            }
            preRemovedNode.setNextNode(removedNode.getNextNode());
            return removedNode.getElement();
        }
    }

    @Override
    public int lastIndexOf(int element) {
        int returnIndex = -1;
        IntLinkedNode node = headNode;
        int i = 0;
        while (node != null) {
            if (node.getElement() == element) {
                returnIndex = i;
            }
            node = node.getNextNode();
            i++;
        }
        return returnIndex;
    }

    @Override
    public Iterator<Integer> iterator() {
        return null;
    }
}
