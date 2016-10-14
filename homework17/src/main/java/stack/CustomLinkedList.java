package linkedlists;

public class CustomLinkedList {
    private Node firstNode;
    private Node lastnode;

    private class Node {
        String value;
        Node next;
        Node prev;
    }

    public void add(String element) {
        Node node = new Node();
        node.value = element;
        if (firstNode == null) {
            firstNode = node;
            lastnode = node;
        } else {
            lastnode.next = node;
            lastnode = node;
        }
    }

    public void introduceCycle(int index) {
        Node current = firstNode;
        int currentIndex = 0;

        while (currentIndex < index) {
            current = current.next;
            currentIndex++;
        }
        lastnode.next = current;

    }

    public boolean hasCycle() {
        Node current = firstNode;
        Node current2Step = current.next.next;
        while (current2Step.next != null) {
            if (current == current2Step) {
                return true;
            } else {
                current = current.next;
                current2Step = current2Step.next.next;
            }
        }
        return false;
    }

    public String nElementOfLinkedList(int index) {
        int counter = 0;

        Node current = firstNode;

        while (current != lastnode) {
            current = current.next;
            counter++;
        }

        counter++;
        current = firstNode;
        for (int i = 0; i < counter - index; i++) {

            current = current.next;

        }

        return current.value;
    }

    @Override
    public String toString() {
        String result = "[";
        Node current = firstNode;
        while (current != null) {
            if (result.equals("[")) {
                result += current.value;
            } else
                result += "," + current.value;
            current = current.next;
        }
        result += "]";
        return result;
    }
}
