import java.util.Scanner;

public class Lista {
    Node inicioLista;
    Node fimLista;
    //Tamanho da lista
    int n;
    Scanner scanner;

    public Lista(Scanner scanner){
        this.scanner = scanner;
        this.inicioLista = null;
        this.fimLista = null;
        this.n = 0;


    }
    //Testa se já existe um nó com o nome passado
    public boolean existe(String nome){
        Node aux = inicioLista;
        while(aux != null){
            //Trata o case sensitive e evita que nomes repetidos sejam inseridos
            if(aux.getNome().toLowerCase().equals(nome.toLowerCase())){ 
                return true;
            }
            aux = aux.getProximo();
        }
        return false;
    }
    //Pega informações do usuário e cria um nó
    public Node createNode(){
        System.out.println("Digite o nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o número: ");
        int num = scanner.nextInt();
        

        Node node = new Node(nome, num);
        return node;
    }
    
    public void inserirInicio(){
        Node node = createNode();
        if(existe (node.getNome())){
            System.out.println("Nome já existe, não adicionado");
            return;
        }
        if(inicioLista == null){
            inicioLista = node;
            fimLista = node;
        }else{
            node.setProximo(inicioLista);
            inicioLista = node;
        }
        n++;

    }
    public void inserirFim(){
        Node node = createNode();
        if(existe (node.getNome())){
            System.out.println("Nome já existe, não adicionado");
            return;
        }
        if(inicioLista == null){
            inicioLista = node;
            fimLista = node;
        }else{
            fimLista.setProximo(node);
            fimLista = node;
        }
        n++;
    }
    //remove o ultimo elemento
    public void remover(){
        if(inicioLista == null){
            System.out.println("Lista vazia");
        }else{
            Node aux = inicioLista;
            while(aux.getProximo() != fimLista){
                aux = aux.getProximo();
            }
            aux.setProximo(null);
            fimLista = aux;
            n--;
        }

    }
    //Remove item especifico
    public void removerItem(){
        if(inicioLista == null){
            System.out.println("Lista vazia");
        }else{
            System.out.println("Digite o nome do item que deseja remover: ");
            String nome = scanner.nextLine();
            Node aux = inicioLista;
            while(aux.getProximo() != null){
                if(aux.getProximo().getNome().equals(nome)){
                    aux.setProximo(aux.getProximo().getProximo());
                    n--;
                    break;
                }
                aux = aux.getProximo();
            }
        }

    }
    //Imprime a lista
    public void imprimir(){
        if(inicioLista == null){
            System.out.println("Lista vazia");
        }else{
            Node aux = inicioLista;
            while(aux != null){
                System.out.println("Nome: " + aux.getNome() + " Número: " + aux.getNum());
                aux = aux.getProximo();
            }
        }
    }
    public int size(){
        return n;
    }
    
}
