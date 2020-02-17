/**
 * Classe molde de nós.
 * @author Everton Bruno Silva dos Santos
 */
public class Node{
    public int data;
    public Node next;

    /**
     * Construtor que inicializa os valores dos nós.
     * @param data  Refere-se ao dado a ser atribuido ao nó durante sua construção.
     */
    public Node(int data){
        this.data = data;
        next = null;
    }
}
