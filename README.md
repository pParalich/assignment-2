# Custom Data Structures (Assignment 2)

## Project Overview
This project provides a complete implementation of fundamental data structures in Java from scratch. The primary goal was to implement physical storage structures (**ArrayList** and **Doubly LinkedList**) and use them to build logical structures (**Stack**, **Queue**, and **MinHeap**) without using any classes from `java.util.*` (except for the `Iterator` interface).

## Project Structure

### 1. Physical Structures (Implementing `MyList<T>`)
* **MyArrayList<T>**: A dynamic array implementation.
    * *Logic*: Automatically resizes (doubles capacity) when full. Provides $O(1)$ random access.
* **MyLinkedList<T>**: A doubly linked list implementation.
    * *Logic*: Maintains references to both `head` and `tail`. Prevents memory loops by nullifying node references upon removal. Provides $O(1)$ insertion/deletion at both ends.

### 2. Logical Structures
Based on the task requirements, I chose the most efficient physical basis for each logical structure:

* **MyStack<T>**: LIFO (Last-In-First-Out).
    * *Basis*: `MyArrayList`. Adding and removing from the end of an array is $O(1)$, making it the most memory-efficient choice for a stack.
* **MyQueue<T>**: FIFO (First-In-First-Out).
    * *Basis*: `MyLinkedList`. Removing from the head and adding to the tail of a doubly linked list are both $O(1)$ operations.
* **MyMinHeap<T>**: Priority structure.
    * *Basis*: `MyArrayList`. Represents a complete binary tree within an array. Uses `traverseUp` and `traverseDown` logic to maintain the heap property in $O(\log n)$ time.

## 🛠 Implemented Methods
The `MyList` interface ensures the following functionality across all lists:
- **Insertion**: `add(item)`, `add(index, item)`, `addFirst(item)`, `addLast(item)`.
- **Deletion**: `remove(index)`, `removeFirst()`, `removeLast()`.
- **Search**: `indexOf(object)`, `lastIndexOf(object)`, `exists(object)`.
- **Utility**: `get(index)`, `set(index, item)`, `size()`, `clear()`, `sort()`, `toArray()`.

## How to Run
1. Clone the repository.
2. Compile the files: `javac Main.java`
3. Run the tests: `java Main`

## Complexity Analysis
| Operation | MyArrayList | MyLinkedList |
| :--- | :--- | :--- |
| Access (get) | $O(1)$ | $O(n)$ |
| Add (First) | $O(n)$ | $O(1)$ |
| Add (Last) | $O(1)$* | $O(1)$ |
| Remove (Index)| $O(n)$ | $O(n)$ |

*\*Amortized time complexity*