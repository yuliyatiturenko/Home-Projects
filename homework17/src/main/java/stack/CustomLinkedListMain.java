package linkedlists;

public class CustomLinkedListMain {
    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("j");
        list.add("e");
        list.add("k");
        System.out.println(list);

        // list.introduceCycle(4);

        boolean hasCycle = list.hasCycle();
        System.out.println(hasCycle);


        System.out.println(list.nElementOfLinkedList(4));
    }
}
