package org.example.sandbox.linkedlist;

public class Driver {

    public static void main(String[] args) {

        LinkedList<String> linkedList = new SinglyLinkedList<>();

        linkedList.addFirst("One");
        linkedList.addFirst("Two");
        linkedList.addFirst("Three");
        linkedList.addFirst("Four");
        linkedList.addFirst("Five");

        linkedList.addLast("Six");
        linkedList.addLast("Seven");
        linkedList.addLast("Eight");
        linkedList.addLast("Nine");
        linkedList.addLast("Ten");

        System.out.println(linkedList);

        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());


        System.out.println("element removed from front:"+linkedList.pollFirst());


        System.out.println(linkedList);

         System.out.println("element removed from end:"+linkedList.pollLast());
         System.out.println(linkedList);

        System.out.println(linkedList.contains("One"));
        System.out.println(linkedList.contains("Two"));
        System.out.println(linkedList.contains("Three"));
        System.out.println(linkedList.contains("Four"));
        System.out.println(linkedList.contains("Five"));
        System.out.println(linkedList.contains("Six"));
        System.out.println(linkedList.contains("Seven"));
        System.out.println(linkedList.contains("Eight"));
        System.out.println(linkedList.contains("Nine"));
        System.out.println(linkedList.contains("Ten"));

        System.out.println(linkedList.size());

         linkedList.clear();
         System.out.println(linkedList);
    }
}