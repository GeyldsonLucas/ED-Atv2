

public class Node {
    String nome;
    int num;
    Node proximo;

    public Node(String nome, int num){
        this.nome = nome;
        this.num = num;
        this.proximo = null;
    }


    //Getters 
    public String getNome(){
        return this.nome;
    }
    public int getNum(){
        return this.num;
    }
    public Node getProximo(){
        return this.proximo;
    }
    //Setters
    public void setProximo(Node node){
        this.proximo = node;
    }

    
}
