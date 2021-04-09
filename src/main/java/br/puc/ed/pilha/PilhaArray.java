package br.puc.ed.pilha;

public class PilhaArray<T> implements Pilha<T> {

    private int capacidade;
    private Object[] pilha;

    public PilhaArray(int capacidade) {
        this.capacidade = capacidade;
        this.pilha = new Object[capacidade];
    }

    @Override
    public void push(T t) {
        if (this.isEmpty()) {
            this.pilha[0] = t;
            return;
        }
        if (!this.size().equals(this.capacidade))
            this.pilha[this.size() + 1] = t;
    }

    @Override
    public T pop() {
        if (this.size() > 0) {
            Object popped = pilha[this.size()];
            this.pilha[this.size()] = null;
            return (T)popped;
        }
        return null;
    }

    @Override
    public T top() {
        if (this.size() > 0) return (T)this.pilha[this.size()];
        return null;
    }

    @Override
    public Integer size() {
        Integer count = 0;
        for (Object obj : pilha) {
            if (obj != null) count++;
        }
        return count; 
    }

    @Override
    public Boolean isEmpty() {
        Integer count = 0;
        for (Object obj : pilha) {
            if (obj != null) count++;
        }
        return (count == 0);
    }

    public void print() {
        for (Object obj : pilha) {
            if (obj != null) {
                System.out.println((T)obj);
            }
        }
    }
}
