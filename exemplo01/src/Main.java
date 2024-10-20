public class Main {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();

        pilha.push(10); // Inserir o número 10
        pilha.push(20); // Inserir o número 20
        pilha.push(30); // Inserir o número 30

        pilha.top(); // Pegar o número que está no topo da pilha
        pilha.lista(); // Pegar a lista do número

        pilha.pop(); // Remover o número que está no topo da pilha

        pilha.top();
        pilha.lista();
    }
}