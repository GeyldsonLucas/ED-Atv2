import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lista lista = new Lista(scanner);
        int opcao = 0;
        while(opcao != 7){
            System.out.println("1 - Inserir no início");
            System.out.println("2 - Inserir no fim");
            System.out.println("3 - Remover");
            System.out.println("4 - Remover item especifico");
            System.out.println("5 - Imprimir");
            System.out.println("6 - Exibir tamanho da lista");
            System.out.println("7 - Sair");
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch(opcao){
                case 1:
                    lista.inserirInicio();
                    break;
                case 2:
                    lista.inserirFim();
                    break;
                case 3:
                    lista.remover();
                    break;
                case 4:
                    lista.removerItem();
                    break;
                case 5:
                    lista.imprimir();
                    break;
                case 6:
                    System.out.println("Tamanho da lista: " + lista.size());
                    break;
                case 7:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
        scanner.close();
    }

    
}
