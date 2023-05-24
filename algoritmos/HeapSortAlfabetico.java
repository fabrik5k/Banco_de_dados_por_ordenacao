package algoritmos;
// Java program for implementation of Heap Sort

import java.util.ArrayList;

public class HeapSortAlfabetico {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("banana");
        list.add("apple");
        list.add("orange");
        list.add("grape");
        list.add("cherry");

        System.out.println("Lista antes da ordenação: " + list);

        heapSort(list);

        System.out.println("Lista após a ordenação: " + list);
    }

    public static void heapSort(ArrayList<String> list) {
        int n = list.size();

        // Constrói o heap máximo
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(list, n, i);
        }

        // Extrai elementos do heap um por um
        for (int i = n - 1; i >= 0; i--) {
            // Move a raiz atual para o final
            String temp = list.get(0);
            list.set(0, list.get(i));
            list.set(i, temp);

            // Chama heapify na heap reduzida
            heapify(list, i, 0);
        }
    }

    public static void heapify(ArrayList<String> list, int n, int i) {
        int largest = i; // Inicializa o maior como raiz
        int left = 2 * i + 1; // Filho esquerdo do nó atual
        int right = 2 * i + 2; // Filho direito do nó atual

        // Se o filho esquerdo é maior que a raiz
        if (left < n && list.get(left).compareTo(list.get(largest)) > 0) {
            largest = left;
        }

        // Se o filho direito é maior que o maior até agora
        if (right < n && list.get(right).compareTo(list.get(largest)) > 0) {
            largest = right;
        }

        // Se o maior não é a raiz
        if (largest != i) {
            String swap = list.get(i);
            list.set(i, list.get(largest));
            list.set(largest, swap);

            // Recursivamente heapify a subárvore afetada
            heapify(list, n, largest);
        }
    }
}

