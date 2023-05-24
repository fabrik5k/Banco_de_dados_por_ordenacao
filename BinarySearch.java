import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearchExample {
    public static int binarySearch(List<String> sortedList, String searchKey) {
        int left = 0;
        int right = sortedList.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = searchKey.compareTo(sortedList.get(mid));

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
        List<String> sortedList = new ArrayList<>(Arrays.asList("apple", "banana", "cherry", "grape", "orange"));

        // Ordenar a lista (caso ela não esteja ordenada)
        Collections.sort(sortedList);

        String searchKey = "cherry";
        int index = binarySearch(sortedList, searchKey);

        if (index >= 0) {
            System.out.println("A palavra \"" + searchKey + "\" foi encontrada na posição " + index + ".");
        } else {
            System.out.println("A palavra \"" + searchKey + "\" não foi encontrada na lista.");
        }
    }
}
