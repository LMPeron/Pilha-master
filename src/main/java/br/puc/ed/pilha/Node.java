package br.puc.ed.pilha;

public class Node<T> {

      protected T object;
      protected Node<T> proximo;

      public Node(T object) {
            proximo = null;
            this.object = object;
      }

      public T getObject() {
            return object;
      }

      public void setObject(T object) {
            this.object = object;
      }

      public Node<T> getProximo() {
            return proximo;
      }

      public void setProximo(Node<T> proximo) {
            this.proximo = proximo;
      }
}
