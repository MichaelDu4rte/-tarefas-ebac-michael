public class Pilha {
    private int tamanhoMaximo;
    private int topo;
    private int[] elementos;

    // Construtor
    public Pilha(int tamanhoMaximo) {
        this.tamanhoMaximo = tamanhoMaximo;
        this.elementos = new int[tamanhoMaximo];
        this.topo = -1;
    }

    // Método para verificar se a pilha está vazia
    public boolean estaVazia() {
        return (topo == -1);
    }

    // Método para verificar se a pilha está cheia
    public boolean estaCheia() {
        return (topo == tamanhoMaximo - 1);
    }

    // Método para adicionar um elemento à pilha (push)
    public void push(int elemento) {
        if (estaCheia()) {
            System.out.println("Erro: Pilha cheia!");
            return;
        }
        topo++;
        elementos[topo] = elemento;
    }

    // Método para remover um elemento da pilha (pop)
    public int pop() {
        if (estaVazia()) {
            System.out.println("Erro: Pilha vazia!");
            return -1;
        }
        int elementoRemovido = elementos[topo];
        topo--;
        return elementoRemovido;
    }

    // Método para retornar o elemento do topo da pilha (sem remover)
    public int topo() {
        if (estaVazia()) {
            System.out.println("Erro: Pilha vazia!");
            return -1;
        }
        return elementos[topo];
    }
}
