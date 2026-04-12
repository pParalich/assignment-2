public class Main {
    public static void main(String[] args) {
        System.out.println("=== TESTING MYARRAYLIST ===");
        MyList<String> arrayList = new MyArrayList<>();
        arrayList.add("Java");
        arrayList.add("Python");
        arrayList.add("C++");
        arrayList.addFirst("Kotlin");
        arrayList.addLast("Go");

        System.out.println("Current list: ");
        for (String s : arrayList) {
            System.out.print(s + " ");
        }
        System.out.println("\nSize after adds: " + arrayList.size());

        arrayList.sort();
        System.out.println("After sort: ");
        for (Object s : arrayList.toArray()) {
            System.out.print(s + " ");
        }

        System.out.println("\nExists 'Java': " + arrayList.exists("Java"));
        System.out.println("Index of 'Go': " + arrayList.indexOf("Go"));

        arrayList.removeFirst();
        arrayList.removeLast();
        System.out.println("After removeFirst/Last size: " + arrayList.size());
        System.out.println();

        System.out.println("=== TESTING MYLINKEDLIST ===");
        MyList<Integer> linkedList = new MyLinkedList<>();
        linkedList.add(300);
        linkedList.add(100);
        linkedList.add(200);
        linkedList.add(50);

        System.out.print("Original LinkedList: ");
        for (Integer i : linkedList) {
            System.out.print(i + " ");
        }

        linkedList.sort();
        System.out.print("\nSorted LinkedList: ");
        for (Integer i : linkedList) {
            System.out.print(i + " ");
        }

        System.out.println("\nFirst: " + linkedList.getFirst() + ", Last: " + linkedList.getLast());
        linkedList.remove(1);
        System.out.println("After removing index 1, size: " + linkedList.size());

        linkedList.clear();
        System.out.println("After clear, size: " + linkedList.size());
        System.out.println();

        System.out.println("=== TESTING MYSTACK ===");
        MyStack<Character> stack = new MyStack<>();
        stack.push('A');
        stack.push('B');
        stack.push('C');
        System.out.println("Stack size: " + stack.size());
        System.out.println("Stack Pop: " + stack.pop());
        System.out.println("Stack Peek: " + stack.peek());
        System.out.println("Is Empty: " + stack.isEmpty());
        System.out.println();

        System.out.println("=== TESTING MYQUEUE ===");
        MyQueue<String> queue = new MyQueue<>();
        queue.enqueue("User 1");
        queue.enqueue("User 2");
        queue.enqueue("User 3");
        System.out.println("Queue Dequeue: " + queue.dequeue());
        System.out.println("Queue Peek: " + queue.peek());
        System.out.println("Queue size: " + queue.size());
        System.out.println();

        System.out.println("=== TESTING MYMINHEAP ===");
        MyMinHeap<Integer> heap = new MyMinHeap<>();
        heap.insert(50);
        heap.insert(10);
        heap.insert(40);
        heap.insert(5);
        heap.insert(2);

        System.out.println("Heap size: " + heap.size());
        System.out.println("Heap Extra Min (should be 2): " + heap.extraMin());
        System.out.println("Heap Extra Min (should be 5): " + heap.extraMin());
        System.out.println("Heap Extra Min (should be 10): " + heap.extraMin());
        System.out.println("Heap Size remaining: " + heap.size());
    }
}