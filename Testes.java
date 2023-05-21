import java.util.ArrayList;
import java.util.List;
import Produto;
public class Testes {
    public static void main(String[] args) {
        List<Produto> listaProdutos = new ArrayList<>();

        Produto produto1 = new Produto("Jarro", "Muito fragil", 14.38f, 3);
        //Produto produto2 = new Produto("Vidro", "Muito fragil", 12.38f, 1);
        //Produto produto3 = new Produto("Garrafa", "Muito fragil", 18.38f, 8);

        //Object[] listaTemporaria = listaProdutos.toArray();
        System.out.println(produto1.getNome());

    }
}
