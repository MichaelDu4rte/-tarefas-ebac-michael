public class FIFOQueue {
    private int[] queue;
    private int size;
    private int capacity;
    private int front;
    private int rear;
    
    // Constructor
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
    
    //  verificar se a fila está cheia
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
    
    // remover um elemento da fila
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
    
    // obter o elemento no fim da fila
    public int rear() {
        if (isEmpty()) {
            System.out.println("A fila está vazia. Não há elementos no fim da fila.");
            return -1; 
        }
        return queue[rear];
    }
    
    // obter o elemento na frente da fila
    public int front() {
        if (isEmpty()) {
            System.out.println("A fila está vazia. Não há elementos na frente da fila.");
            return -1; 
        }
        return queue[front];
    }
    
    //  obter o tamanho da fila
    public int size() {
        return size;
    }
}
