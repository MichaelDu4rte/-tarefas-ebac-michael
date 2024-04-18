public class FIFOQueue {
    private int[] queue;
    private int size;
    private int capacity;
    private int front;
    private int rear;
    
    // Construtor
    public FIFOQueue(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.size = 0;
        this.front = 0;
        this.rear = -1;
    }
    
    // verificar se a fila está vazia
    public boolean isEmpty() {
        return size == 0;
    }
    
    // verificar se a fila está cheia
    public boolean isFull() {
        return size == capacity;
    }
    
    // adicionar um elemento à fila
    public void enqueue(int element) {
        if (isFull()) {
            System.out.println("A fila está cheia. Não é possível adicionar mais elementos.");
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = element;
        size++;
    }
    
    // Método para remover um elemento da fila
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("A fila está vazia. Não é possível remover elementos.");
            return -1; 
        }
        int removedElement = queue[front];
        front = (front + 1) % capacity;
        size--;
        return removedElement;
    }
}
