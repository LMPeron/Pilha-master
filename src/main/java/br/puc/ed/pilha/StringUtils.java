package br.puc.ed.pilha;

public class StringUtils {
      
      public Character[] reverse(Character[] value) {
            PilhaArray<Character> pilha = new PilhaArray<>(size(value) + 1);
                  for (Character character : value) 
                        pilha.push(character);

            int i=0;
            while (pilha.size() > 0) {
                  value[i] = pilha.pop();
                  i++;
            }
                  
      
            return value;
      }

      public int size(Character a[]) {
            int i = 0;
            for (Character character : a) {
                  i++;
            }

            return i;
      }

      public void print(Character[] a) {
            for (Character character : a) {
                  System.out.println(character);
            }
      }
}
