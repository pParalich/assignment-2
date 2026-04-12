public class MyQueue<T> {
    private MyLinkedList<T> list = new MyLinkedList<>();

    public void enqueue(T item) {
        list.addLast(item);
    }

    public T dequeue() {
        if (list.size() == 0) return null;
        T item = list.get(0);
        list.removeFirst();
        return item;
    }

    public T peek() {
        if (list.size() == 0) return null;
        return list.getFirst();
    }

    public int size() {
        return list.size();
    }
}