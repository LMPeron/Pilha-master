package br.puc.ed.pilha;

public class PilhaListaEncadeada<T> implements Pilha<T> {
    private Node<T> base;
    private Node<T> topo;
    private int size;

    public PilhaListaEncadeada() {
        this.base = null;
        this.size = 0;
    }

    @Override
    public void push(T t) {
        if (this.size == 0) {
            this.base = new Node<>(t);
            this.topo = this.base;
        } else {
            Node<T> newNode = new Node<>(t);
            this.topo.setProximo(newNode);
            this.topo = newNode;
        }
        this.size++;
    }

    @Override
    public T pop() {
        if (this.size == 0) return null;
        Node<T> node = base;
        while (!this.topo.equals(node)) {
            node = node.getProximo();
        }
        Node<T> deleted = this.topo;
        this.topo = node;

        return deleted.getObject();
    }

    @Override
    public T top() {
        return this.topo.getObject();
    }

    @Override
    public Integer size() {
        return this.size;
    }

    @Override
    public Boolean isEmpty() {
        return (size == 0);
    }

    public void print() {
        Node<T> node = base;
        while (!this.topo.equals(node)) {
            System.out.println(node.getObject());
            node = node.getProximo();
        }
    }
}
