package br.puc.ed.pilha;

public class MainApp {

    public static void main(String[] args) {
        Pilha<Integer> pilha = new PilhaArray<>(10);

        pilha.push(10);
        pilha.push(5);
        pilha.push(9);

        Integer result = pilha.pop();



        // System.out.println(pilha.size());
        pilha.print();

        System.out.println("popped = " + result);
        System.out.println("tamanho = " + pilha.size());
        System.out.println("vazio = " + pilha.isEmpty());
    }
}
