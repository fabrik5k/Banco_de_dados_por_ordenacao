import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Menu {
    
    public static void main(String[] args) {
        List<Produto> listaProdutos = new ArrayList<>();
        Produto produto1 = new Produto("Jarro", "Muito fragil", 14.38f, 3);     listaProdutos.add(produto1);
        Produto produto2 = new Produto("Vidro", "Muito fragil", 12.38f, 1);     listaProdutos.add(produto2);
        Produto produto3 = new Produto("Garrafa", "Muito fragil", 18.38f, 8);   listaProdutos.add(produto3);
        Scanner scan = new Scanner(System.in);
        HeapSortAlfabetico.heapSort(listaProdutos);
        String nomeProduto;
        int index;
        
        while (true) {
            System.out.println("##########");
            System.out.println("*  Menu  *");
            System.out.println("1 - Adicionar Produto");
            System.out.println("2 - Remover Produto");
            System.out.println("3 - Atualizar");
            System.out.println("4 - Buscar Produto");
            System.out.println("5 - Visualizar Produtos");
            System.out.println("##########");
            System.out.print("R: ");
            HeapSort.sort(listaProdutos);

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
                    listaProdutos.add(produtoAtual);
                    HeapSortAlfabetico.heapSort(listaProdutos);

                    break;
                
                case 2:
                    System.out.println();
                    System.out.println("Digite o nome do produto que voce deseja remover: ");
                    nomeProduto = scan.next();
                    if (BinarySearch.binarySearch(listaProdutos, nomeProduto) != 1) {
                        listaProdutos.remove(BinarySearch.binarySearch(listaProdutos, nomeProduto));
                    } else {
                        System.out.println("Produto não encontrado !!!");
                    }
                    break;

                case 3:
                    System.out.println();
                    System.out.println("Digite o nome do produto que voce deseja atualizar: ");
                    nomeProduto = scan.next();
                    index = BinarySearch.binarySearch(listaProdutos, nomeProduto);
                    if (index != -1) {
                        System.out.println("##########");
    
                        System.out.println("Nome do Produto: ");
                        listaProdutos.get(index).setNome(scan.next());
    
                        System.out.println("Descrição do Produto: ");
                        listaProdutos.get(index).setDescricao(scan.nextLine());
    
                        System.out.println("Preço do Produto: ");
                        listaProdutos.get(index).setPreco(scan.nextFloat());
    
                        System.out.println("Quantidade do produto: ");
                        listaProdutos.get(index).setQuantidade(scan.nextInt());
    
                        System.out.println("##########");
                        HeapSortAlfabetico.heapSort(listaProdutos);
                    } else {
                        System.out.println("Produto não encontrado !!!");
                    }
                    
                    break;

                case 4:
                    System.out.println();
                    System.out.println("Buscar por nome: ");
                    nomeProduto = scan.next();
                    index = BinarySearch.binarySearch(listaProdutos, nomeProduto);
                    if (index != -1) {
                        System.out.println("##########");
    
                        System.out.println("Nome do Produto: ");
                        listaProdutos.get(index).getNome();
    
                        System.out.println("Descrição do Produto: ");
                        listaProdutos.get(index).getDescricao();
    
                        System.out.println("Preço do Produto: ");
                        listaProdutos.get(index).getPreco();
    
                        System.out.println("Quantidade do produto: ");
                        listaProdutos.get(index).getQuantidade();
    
                        System.out.println("##########");
                    } else {
                        System.out.println("Produto não encontrado !!!");
                    }
                    break;

                case 5:
                    System.out.println("");
                    System.out.println("Escolha como deseja visualizar");
                    System.out.println("1 - Preço");
                    System.out.println("2 - Ordem Alfabética");
                    switch (scan.nextInt()) {
                        case 1:
                            HeapSort.sort(listaProdutos);
                            System.out.println("Escolha a ordem: ");
                            System.out.println("1 - Crescente");
                            System.out.println("2 - Decrescente");
                            switch (scan.nextInt()) {
                                case 1:
                                    System.out.println("Produtos: ");
                                    for (int i = 0; i < listaProdutos.size(); i++) {
                                        System.out.println("| Nome:" + listaProdutos.get(i).getNome() + "| Preço: " + listaProdutos.get(i).getPreco() + "| Quantidade: " + listaProdutos.get(i).getQuantidade() + "|");
                                        System.out.println("Descrição: " + listaProdutos.get(i).getDescricao());
                                        System.out.println("");
                                    }
                                    break;

                                case 2:
                                    for (int i = listaProdutos.size(); i > 0; i--) {
                                        System.out.println("| Nome:" + listaProdutos.get(i).getNome() + "| Preço: " + listaProdutos.get(i).getPreco() + "| Quantidade: " + listaProdutos.get(i).getQuantidade() + "|");
                                        System.out.println("Descrição: " + listaProdutos.get(i).getDescricao());
                                        System.out.println("");
                                    }
                                    break;
                            
                            
                                default:
                                    break;
                            }
                            break;

                        case 2:
                            HeapSortAlfabetico.heapSort(listaProdutos);
                            System.out.println("Escolha a ordem: ");
                            System.out.println("1 - Crescente");
                            System.out.println("2 - Decrescente");
                            switch (scan.nextInt()) {
                                case 1:
                                    System.out.println("Produtos: ");
                                    for (int i = 0; i < listaProdutos.size(); i++) {
                                        System.out.println("| Nome:" + listaProdutos.get(i).getNome() + "| Preço: " + listaProdutos.get(i).getPreco() + "| Quantidade: " + listaProdutos.get(i).getQuantidade() + "|");
                                        System.out.println("| Descrição: " + listaProdutos.get(i).getDescricao());
                                        System.out.println("");
                                    }
                                    break;

                                case 2:
                                    for (int i = listaProdutos.size(); i > 0; i--) {
                                        System.out.println("| Nome:" + listaProdutos.get(i).getNome() + "| Preço: " + listaProdutos.get(i).getPreco() + "| Quantidade: " + listaProdutos.get(i).getQuantidade() + "|");
                                        System.out.println("Descrição: " + listaProdutos.get(i).getDescricao());
                                        System.out.println("");
                                    }
                                    break;
                            
                                default:
                                    break;
                            }
                            break;
                    
                        default:
                            break;
                    }
                    break;
            
                default:
                    System.out.println("Coloque uma opção válida!!");
                    break;
            }
        }
    }

}
