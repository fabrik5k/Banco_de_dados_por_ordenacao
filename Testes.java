import java.util.ArrayList;
import java.util.List;
public class Testes {
    public static void main(String[] args) {
        List<Produto> listaProdutos = new ArrayList<>();

        Produto produto1 = new Produto("Jarro", "Muito fragil", 14.38f, 3);     listaProdutos.add(produto1);
        Produto produto2 = new Produto("Vidro", "Muito fragil", 12.38f, 1);     listaProdutos.add(produto2);
        Produto produto3 = new Produto("Garrafa", "Muito fragil", 18.38f, 8);   listaProdutos.add(produto3);

        Produto[] listaTemporaria = new Produto[listaProdutos.size()];
        for (int i = 0; i < listaProdutos.size(); i++) {
            listaTemporaria[i] = listaProdutos.get(i);
        }

        listaProdutos.remove(1);
        for (int i = 0; i < listaProdutos.size(); i++) {
            System.out.println();;
            System.out.println(i);
        }

        

    }
}
