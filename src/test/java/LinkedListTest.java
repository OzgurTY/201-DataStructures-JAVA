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

    @Test
    public void TestDeleteSecond(){
        LinkedList list = new LinkedList();
        list.insertFirst(new Node(4));
        list.insertFirst(new Node(5));
        list.insertFirst(new Node(6));
        System.out.println(list.toString());
        list.deleteSecond();
        System.out.println(list.toString());
        list.deleteSecond();
        System.out.println(list.toString());
        list.deleteSecond();
        System.out.println(list.toString());
    }

    @Test
    public void TestAddToSortedList() {
        LinkedList list = new LinkedList();
        list.insertLast(new Node(3));
        list.insertLast(new Node(5));
        list.insertLast(new Node(7));
        System.out.println(list.toString());
        list.addToSortedList(4);
        System.out.println(list.toString());
    }

    @Test
    public void TestDeleteKth() {
        LinkedList list = new LinkedList();
        list.insertLast(new Node(3));
        list.insertLast(new Node(5));
        list.insertLast(new Node(7));
        System.out.println(list.toString());
        list.deleteKth(2);
        System.out.println(list.toString());
        list.deleteKth(0);
        System.out.println(list.toString());
    }

    @Test
    public void TestMoveNode() {
        LinkedList list = new LinkedList();
        Node node1 = new Node(3), node2 = new Node(5);
        Node node3 = new Node(7), node4 = new Node(9);
        list.insertLast(node1);
        list.insertLast(node2);
        list.insertLast(node3);
        list.insertLast(node4);
        System.out.println(list.toString());
        list.moveNode(node1, 2);
        System.out.println(list.toString());
        list.moveNode(node2, 1);
        System.out.println(list.toString());
    }
}