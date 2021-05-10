package br.puc.ed.pilha;

public class PilhaArray<T> implements Pilha<T> {

    private int capacidade;
    private Object[] pilha;
    private int tamanho;

    public PilhaArray(int capacidade) {
        this.capacidade = capacidade;
        this.pilha = new Object[capacidade];
        this.tamanho = 0;
    }

    public void push(T t) {
        if (this.isEmpty()) {
            this.pilha[0] = t;
            this.tamanho++;
            return;
        }
        if (!this.size().equals(this.capacidade)) {
            this.pilha[this.tamanho] = t;
            this.tamanho++;
        }
            
    }

    public T pop() {
        if (this.size() > 0) {
            Object popped = pilha[this.tamanho - 1];
            this.pilha[this.tamanho - 1] = null;
            this.tamanho--;
            return (T)popped;
        }
        return null;
    }

    public T top() {
        if (this.size() > 0) return (T)this.pilha[this.tamanho];
        return null;
    }

    public Integer size() {
        return this.tamanho;
    }

    public Boolean isEmpty() {
        return (this.tamanho == 0);
    }

    public void print() {
        for (Object obj : pilha) {
            if (obj != null) {
                System.out.println((T)obj);
            }
        }
    }
}
