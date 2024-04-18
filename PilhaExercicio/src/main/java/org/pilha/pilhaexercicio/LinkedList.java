class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    private Node head;
    private int size;

    // Adiciona um nó ao fim da lista
    public void push(Node node) {
        if (head == null) {
            head = node;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
        size++;
    }

    // Remove o nó no fim da lista e retorna o mesmo
    public Node pop() {
        if (head == null) {
            return null;
        }
        Node prev = null;
        Node current = head;
        while (current.next != null) {
            prev = current;
            current = current.next;
        }
        if (prev != null) {
            prev.next = null;
        } else {
            head = null;
        }
        size--;
        return current;
    }

    // Adiciona um nó na posição indicada
    public void insert(int index, Node node) {
        if (index < 0 || index > size) {
            System.out.println("Índice inválido");
            return;
        }
        if (index == 0) {
            node.next = head;
            head = node;
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            node.next = current.next;
            current.next = node;
        }
        size++;
    }

    // Remove um nó na posição indicada
    public void remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Índice inválido");
            return;
        }
        if (index == 0) {
            head = head.next;
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
        size--;
    }

    // Retorna o elemento que está no índice indicado
    public Node elementAt(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Índice inválido");
            return null;
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    // Retorna o tamanho da lista
    public int size() {
        return size;
    }

    // Retorna uma representação em texto da lista
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
