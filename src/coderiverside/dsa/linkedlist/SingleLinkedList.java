package coderiverside.dsa.linkedlist;

public class SingleLinkedList<T> {
    private static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node<T> head;
    private int size;

    public SingleLinkedList() {
        this.head = null;
        this.size = 0;
    }

    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public boolean remove(T data) {
        if (head == null) {
            return false;
        }
        if (head.data.equals(data)) {
            head = head.next;
            size--;
            return true;
        }
        Node<T> current = head;
        while (current.next != null && !current.next.data.equals(data)) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
            size--;
            return true;
        }
        return false;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }



    public void addFirst(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = head; // New node points to the current head
        head = newNode;      // New node becomes the new head
        size++;              // Increment the size
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        Node<T> current = head;
        // Traverse to the desired index
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data; // Return the data of the node at that index
    }



    @Override
    public String toString() {
        if (head == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        Node<T> current = head;
        while (current != null) {
            sb.append(current.data);
            if (current.next != null) {
                sb.append(", ");
            }
            current = current.next;
        }
        sb.append("]");
        return sb.toString();
    }

    // --- Main method for testing ---
    public static void main(String[] args) {
        SingleLinkedList<String> myList = new SingleLinkedList<>();

        System.out.println("Is list empty initially? " + myList.isEmpty()); // true
        System.out.println("Initial size: " + myList.size()); // 0

        // Add elements
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Cherry");
        System.out.println("List after adding: " + myList); // [Apple, Banana, Cherry]
        System.out.println("Current size: " + myList.size()); // 3

        // Remove elements
        myList.remove("Banana");
        System.out.println("List after removing Banana: " + myList);
        System.out.println("Current size: " + myList.size()); // 2


        boolean removedNonExistent = myList.remove("Grape");
        System.out.println("Tried to remove non-existent Grape: " + removedNonExistent); // false
        System.out.println("List: " + myList);
    }
}