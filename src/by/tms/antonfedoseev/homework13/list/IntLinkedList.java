package by.tms.antonfedoseev.homework13.list;

public class IntLinkedList implements IntList {
    private IntLinkedNode headNode;
    private IntLinkedNode nextNode;

    public IntLinkedList() {
        headNode = null;
    }

    @Override
    public String toString() {
        return String.valueOf(headNode);
    }


    @Override
    public int get(int index) {
        int sizeList = size();
        int returnElement = 0;
        if (index < 0 || index > sizeList) {
            throw new IllegalArgumentException("This element does not exist");
        }
        nextNode = headNode;
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
        nextNode = headNode;
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

        nextNode = headNode;

        if (headNode == null) {
            headNode = newNode;
        } else {
            while (nextNode.getNextNode() != null) {
                nextNode = nextNode.getNextNode();
            }
            nextNode.setNextNode(nextNode);
        }
    }

    @Override
    public int remove(int index) {
        int sizeList = size();
        int deleteElement = 0;

        if (sizeList == 0 || index >= sizeList || index < 0) {
            throw new IllegalArgumentException("List is empty or there is no element at this index");
        }
        if (headNode == nextNode) {
            deleteElement = headNode.getElement();
            headNode = null;
            nextNode = null;
            return deleteElement;
        }
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
                nextNode.setNextNode(nextNode.getNextNode().getNextNode());             //!!!!!!!!!!!
                break;
            }
            nextNode = nextNode.getNextNode();
        }
        return deleteElement;
    }

    @Override
    public int lastIndexOf(int element) {
        int sizeList = size();
        nextNode = headNode;
        int returnIndex = -1;

        for (int i = 0; i < sizeList; i++) {
            if (nextNode.getElement() == element) {
                returnIndex = i;
            }
            nextNode = nextNode.getNextNode();
        }
        return returnIndex;
    }

}
