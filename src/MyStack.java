public class MyStack<T> {
    private MyArrayList<T> storage = new MyArrayList<>();

    public void push(T item) {
        storage.addLast(item);
    }

    public T pop() {
        if (storage.size() == 0) return null;
        T item = storage.getLast();
        storage.removeLast();
        return item;
    }

    public T peek() {
        if (storage.size() == 0) return null;
        return storage.getLast();
    }

    public int size() {
        return storage.size();
    }

    public boolean isEmpty() {
        return storage.size() == 0;
    }
}