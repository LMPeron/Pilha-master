package br.puc.ed.pilha;

public interface Pilha<T> {

    void push(T t);

    T pop();

    T top();

    Integer size();

    Boolean isEmpty();

    void print();
}
