public class LinkedList {
    private Node head;
    private Node tail;

    public LinkedList(){
        head = null;
        tail = null;
    }

    public void insertFirst(Node newNode){
        if(tail == null){
            tail = newNode;
        }
        newNode.setNext(head);
        head = newNode;
    }

    public void insertLast(Node newNode){
        if(head == null){
            head = newNode;
        }
        tail.setNext(newNode);
        tail = newNode;
    }

    public void insertMiddle(Node newNode, Node previousNode){
        newNode.setNext(previousNode.getNext());
        previousNode.setNext(newNode);
    }
}
