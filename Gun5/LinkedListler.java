import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListler {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(5);
        linkedList.add(10);
        linkedList.add(15);
        linkedList.add(20);
        // Node nextNode;
        linkedList.get(3);
        linkedList.get(2);
        Iterator<Integer> it = linkedList.iterator();
        while(it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        
    }
}
