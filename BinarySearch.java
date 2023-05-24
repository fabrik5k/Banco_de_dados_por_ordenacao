import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
    public static int binarySearch(List<Produto> sortedList, String searchKey) {
        int left = 0;
        int right = sortedList.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = searchKey.compareTo(sortedList.get(mid).getNome());

            if (comparison == 0) {
                return mid; // Encontrou o elemento
            } else if (comparison < 0) {
                right = mid - 1; // O elemento está à esquerda
            } else {
                left = mid + 1; // O elemento está à direita
            }
        }

        return -1; // Elemento não encontrado
    }

    public static void main(String[] args) {
        List<Produto> sortedList = new ArrayList<>();
        Produto produto1 = new Produto("Agua", "Muito fragil", 14.38f, 3);     sortedList.add(produto1);
        Produto produto2 = new Produto("Bola", "Muito fragil", 12.38f, 1);     sortedList.add(produto2);
        Produto produto3 = new Produto("Carro", "Muito fragil", 18.38f, 8);   sortedList.add(produto3);

        // Ordenar a lista (caso ela não esteja ordenada)

        String searchKey = "Carro";
        int index = binarySearch(sortedList, searchKey);

        if (index >= 0) {
            System.out.println("A palavra \"" + searchKey + "\" foi encontrada na posição " + index + ".");
        } else {
            System.out.println("A palavra \"" + searchKey + "\" não foi encontrada na lista.");
        }
    }
}
