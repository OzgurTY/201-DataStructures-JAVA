import org.junit.Test;

public class LinkedListTest {

    @Test
    public void Test1(){
        LinkedList list = new LinkedList();
        list.insertFirst(new Node(4));
        list.insertFirst(new Node(5));
        list.insertFirst(new Node(6));
        System.out.println(list.toString());
    }

    @Test
    public void Test2(){
        LinkedList list = new LinkedList();
        list.insertFirst(new Node(4));
        list.insertFirst(new Node(5));
        list.insertFirst(new Node(6));
        System.out.println(list.toString());
        list.deleteLast();
        System.out.println(list.toString());
        list.deleteLast();
        System.out.println(list.toString());
        list.deleteLast();
        System.out.println(list.toString());
    }
}