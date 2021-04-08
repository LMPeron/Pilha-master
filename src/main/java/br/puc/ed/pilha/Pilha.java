package br.puc.ed.pilha;

public interface Pilha {

    void push(Character e);

    Character pop();

    Character top();

    Integer size();

    Boolean isEmpty();
}
