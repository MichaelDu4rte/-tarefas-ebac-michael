public class Main {
    public static void main(String[] args) {
        Pilha pilha = new Pilha(5);

        pilha.push(1);
        pilha.push(2);
        pilha.push(3);

        System.out.println("Topo da pilha: " + pilha.topo()); // Deve imprimir "Topo da pilha: 3"

        System.out.println("Elemento removido: " + pilha.pop());

        pilha.push(4);
        pilha.push(5);


        while (!pilha.estaVazia()) {
            System.out.println("Elemento removido: " + pilha.pop());
        }

    }
}
