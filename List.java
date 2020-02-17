/**
 * Classe molde de listas encadeadas ordenadas.
 * @author Everton Bruno Silva dos Santos
 */
public class List{
    private Node node;

    /**
     * Método de inserção de dados ordenados.
     * @param data  Refere-se ao dado a ser inserido.
     */
    public void insert(int data){
        node = insert(node, data);
    }

    /**
     * Método auxiliar de inserção de dados ordenados recursivo.
     * @param node  Refere-se ao nó raiz da lista.
     * @param data  Refere-se ao dado a ser inserido.
     * @return      Retorna a lista atualizada com o novo nó.
     */
    private Node insert(Node node, int data){
        if(node == null){
            return new Node(data);
        } else {
            if(node.data > data){
                Node newNode = new Node(data);
                newNode.next = node;
                return newNode;
            } else {
                node.next = insert(node.next, data);
            }
        }
        return node;
    }

    /**
     * Método de busca de dados.
     * @param data  Refere-se ao dado a ser buscado.
     * @return      Retorna valor boleano que compreende ao resultado da busca.
     */
    public boolean search(int data){
        return search(node, data);
    }

    /**
     * Método auxiliar de busca de dados recursivo.
     * @param node  Refere-se ao nó raiz da lista.
     * @param data  Refere-se ao dado a ser buscado.
     * @return      Retorna valor boleano que compreende ao resultado da busca.
     */
    private boolean search(Node node, int data){
        if(node == null){
            return false;
        } else {
            if(node.data == data){
                return true;
            } else {
                return search(node.next, data);
            }
        }
    }

    /**
     * Método de remoção de dados.
     * @param data  Refere-se ao dado a ser removido.
     */
    public void remove(int data){
        node = remove(node, data);
    }

    /**
     * Método auxiliar de remoção de dados recursivo.
     * @param node  Refere-se ao nó raiz da lista.
     * @param data  Refere-se ao dado a ser removido.
     * @return      Retorna a lista atualizada sem o nó a ser removido.
     */
    private Node remove(Node node, int data){
        if(node == null){
            return null;
        } else {
            if(node.data == data){
                return node.next;
            } else {
                node.next = remove(node.next, data);
            }
        }
        return node;
    }

    /**
     * Método de exibição dos dados contidos na lista.
     */
    public void show(){
        show(node);
    }

    /**
     * Método auxiliar recursivo de exibição de dados contidos na lista.
     * @param node
     */
    private void show(Node node){
        if(node != null){
            System.out.println(node.data);
            show(node.next);
        }
    }
}
