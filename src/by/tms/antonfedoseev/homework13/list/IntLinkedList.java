package by.tms.antonfedoseev.homework13.list;

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
        int sizeList = size();
        int returnElement = 0;
        if (index < 0 || index > sizeList) {
            throw new IllegalArgumentException("This element does not exist");
        }
        IntLinkedNode nextNode = headNode;
        for (int i = 0; i <= index; i++) {
            returnElement = nextNode.getElement();
            nextNode = nextNode.getNextNode();
        }
        return returnElement;
    }

    @Override
    public int set(int index, int element) {
        int sizeList = size();
        if (sizeList == 0 || index >= sizeList || index < 0) {
            throw new IllegalArgumentException("This element does not exist or there is no element at this index");
        }
        int returnElement = get(index);
        IntLinkedNode nextNode;
        nextNode = headNode;
        for (int i = 0; i <= index; i++) {
            if (i == index) {
                returnElement = nextNode.getElement();
                nextNode.setElement(element);
            }
            nextNode = nextNode.getNextNode();
        }
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
        int sizeList = size();
        int deleteElement = 0;

        if (sizeList == 0 || index >= sizeList || index < 0) {
            throw new IllegalArgumentException("List is empty or there is no element at this index");
        }
        if (headNode == null) {
            deleteElement = headNode.getElement();
            headNode = null;
            return deleteElement;
        }
        IntLinkedNode nextNode;
        nextNode = headNode;
        if (index == 0) {
            deleteElement = nextNode.getElement();
            nextNode = nextNode.getNextNode();
            headNode = nextNode;
            return deleteElement;
        }
        for (int i = 0; i <= index; i++) {
            if (i + 1 == index) {
                deleteElement = nextNode.getNextNode().getElement();
                nextNode.setNextNode(nextNode.getNextNode().getNextNode());
                break;
            }
            nextNode = nextNode.getNextNode();
        }
        return deleteElement;
    }

    @Override
    public int lastIndexOf(int element) {
        int sizeList = size();
        int returnIndex = -1;
        IntLinkedNode nextNode = headNode;
        for (int i = 0; i < sizeList; i++) {
            if (nextNode.getElement() == element) {
                returnIndex = i;
            }
            nextNode = nextNode.getNextNode();
        }
        return returnIndex;
    }

}
