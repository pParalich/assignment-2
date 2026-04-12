public class MyMinHeap<T extends Comparable<T>> {
    private MyArrayList<T> list = new MyArrayList<>();

    public void insert(T item) {
        list.add(item);
        traverseUp(list.size() - 1);
    }

    public T extraMin() {
        if (list.size() == 0) return null;
        T min = list.get(0);

        T lastItem = list.get(list.size() - 1);
        list.removeLast();

        if (list.size() > 0) {
            list.set(0, lastItem);
            traverseDown(0);
        }
        return min;
    }

    private void traverseUp(int index) {
        while (index > 0) {
            int parentIndex = (index - 1) / 2;
            if (list.get(index).compareTo(list.get(parentIndex)) < 0) {
                swap(index, parentIndex);
                index = parentIndex;
            } else break;
        }
    }

    private void traverseDown(int index) {
        while (true) {
            int left = 2 * index + 1;
            int right = 2 * index + 2;
            int smallest = index;

            if (left < list.size() && list.get(left).compareTo(list.get(smallest)) < 0) smallest = left;
            if (right < list.size() && list.get(right).compareTo(list.get(smallest)) < 0) smallest = right;

            if (smallest != index) {
                swap(index, smallest);
                index = smallest;
            } else break;
        }
    }

    private void swap(int index1, int index2) {
        T temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }

    public int size() {
        return list.size();
    }
}