import java.util.ArrayList;
import java.util.List;

public class Pilha {
    // Definir so atributos da class
    private List<Integer> numeros; // Lista
    private int top; // Topo

    // Criar o contrutor
    public Pilha() {
        numeros = new ArrayList<>();
        this.top = -1;
    }

    // Criar os método
    // Inserir (Push)
    public void push(int numero) {
        numeros.add(numero); // Adiciona o número na lista
        top++; // Inclemente um número no topo
    }

    // Remover (Pop)
    public void pop() {
        System.out.println("Número: " + numeros.get(top) + " Removido da Pilha.");
        numeros.remove(top);
        top--;
    }

    // Ver o topo (Top)
    public void top(){
        System.out.println("O número que está no topo da pilha é: " + numeros.get(this.top));
    }

    // Ver os números da lista
    public void lista(){
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));
        }
    }
}
