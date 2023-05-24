import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;


public class Menu {
    
    public static void main(String[] args) {
        //Traçando chaves no alfabeto para converter em numeros
        char[] alfabeto = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        HashMap<Character, Integer> alfabeto_para_numero = new HashMap<Character, Integer>();
        for (int i = 0; i < alfabeto.length; i++) {
            alfabeto_para_numero.put(alfabeto[i], i);
        }

        List<Produto> listaProdutos = new ArrayList<>();
        Produto produto1 = new Produto("Jarro", "Muito fragil", 14.38f, 3);     listaProdutos.add(produto1);
        Produto produto2 = new Produto("Vidro", "Muito fragil", 12.38f, 1);     listaProdutos.add(produto2);
        Produto produto3 = new Produto("Garrafa", "Muito fragil", 18.38f, 8);   listaProdutos.add(produto3);
        Scanner scan = new Scanner(System.in);
        
        while (true) {
            System.out.println("##########");
            System.out.println("*  Menu  *");
            System.out.println("1 - Adicionar Produto");
            System.out.println("2 - Remover Produto");
            System.out.println("3 - Atualizar");
            System.out.println("4 - Buscar Produto");
            System.out.println("##########");
            System.out.print("R: ");

            switch (scan.nextInt()) {
                case 1:
                    Produto produtoAtual = new Produto();
                    System.out.println("##########");

                    System.out.println("Nome do Produto: ");
                    produtoAtual.setNome(scan.next());

                    System.out.println("Descrição do Produto: ");
                    produtoAtual.setDescricao(scan.nextLine());

                    System.out.println("Preço do Produto: ");
                    produtoAtual.setPreco(scan.nextFloat());

                    System.out.println("Quantidade do produto: ");
                    produtoAtual.setQuantidade(scan.nextInt());

                    System.out.println("##########");
                    break;
                
                case 2:
                    System.out.println();
                    System.out.println("Digite o nome do produto que voce deseja remover: ");
                    String nomeProduto = scan.next();
                    for (int i = 0; i < nomeProduto.length(); i++) {
                        if () {
                            
                        }
                    }
                    break;

                case 3:
                    
                    break;

                case 4:
                    
                    break;
            
                default:
                    System.out.println("Coloque uma opção válida!!");
                    break;
            }
        }
    }

}
