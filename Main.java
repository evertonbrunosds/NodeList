/**
 * Classe principal.
 * @author Everton Bruno Silva dos Santos
 */
public class Main{
    public static void main(String[] args) {
        List list = new List();
        list.insert(9);
        list.insert(2);
        list.insert(6);
        list.insert(3);
        list.insert(5);
        list.insert(4);
        list.insert(1);
        list.insert(0);
        list.remove(999);
        System.out.println(list.search(777));
    }
}
