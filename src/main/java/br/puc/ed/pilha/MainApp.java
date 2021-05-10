package br.puc.ed.pilha;

public class MainApp {

    public static void main(String[] args) {
        Pilha<Integer> pilha = new PilhaArray<>(10);

        pilha.push(5);
        pilha.push(3);
        pilha.pop(); 
        pilha.push(2);
        pilha.push(8);
        pilha.pop(); 
        pilha.pop();
        pilha.push(9); 
        pilha.push(1); 
        pilha.pop();
        pilha.push(7);
        pilha.push(6);
        pilha.pop();
        pilha.pop(); 
        pilha.push(4); 
        pilha.pop(); 
        pilha.pop();  

        // Integer result = pilha.pop();

        // System.out.println(pilha.size());
        pilha.print();

        // System.out.println("popped = " + result);
        // System.out.println("tamanho = " + pilha.size());
        // System.out.println("vazio = " + pilha.isEmpty());




        // Character[] a = {'P', 'I', 'L', 'H', 'A'};
        // StringUtils utils = new StringUtils();
        // Character[] result =  utils.reverse(a);
        // utils.print(result);






    }
}
