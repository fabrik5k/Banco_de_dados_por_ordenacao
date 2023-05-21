import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import objetos.Produto;

public class Menu {
    
    public static void main(String[] args) {
        List<Produto> listaProdutos = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        //Object[] listaTemporaria = listaProdutos.toArray(); | Usar depois |

        while (true) {
            System.out.println("##########");
            System.out.println("*  Menu  *");
            System.out.println("1 - Adicionar Produto");
            System.out.println("2 - Remover Produto");
            System.out.println("3 - Atualizar");
            System.out.println("4 - Buscar Produto");
            System.out.println("##########");
            System.out.print("R: ");
            Collections.sort(null, null);
            System.out.println("");

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
