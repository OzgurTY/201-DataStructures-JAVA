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
        } else {
            tail.setNext(newNode);
        }
        tail = newNode;
    }

    public void insertMiddle(Node newNode, Node previousNode){
        newNode.setNext(previousNode.getNext());
        previousNode.setNext(newNode);
    }

    /**
     *
     * @param value The value to be searched.
     * @return The node that has the data value. If no node exists, returns null.
     */
    public Node search(int value){
        Node tmp = head;
        while(tmp != null){
            if ( value == tmp.getData()){
                return tmp;
            }
            tmp = tmp.getNext();
        }
        return null;
    }

    public Node getValueAtIndex(int index) {
        Node tmp = head;
        int count = 0;
        while (tmp != null) {
            if (count == index) {
                return tmp;
            }
            count++;
            tmp = tmp.getNext();
        }
        // If index is out of bounds, return null
        return null;
    }

    public int numberOfElements(){
        Node tmp = head;
        int count = 0;
        while(tmp != null){
            count++;
            tmp = tmp.getNext();
        }
        return count;
    }

    public void deleteFirst(){
        head = head.getNext();
        if (head == null) {
            tail = null;
        }
    }

    public Node getPrevious(Node node){
        Node tmp = head;
        Node previous = null;
        while (tmp != tail) {
            previous = tmp;
            tmp = tmp.getNext();
        }
        return previous;
    }

    public void deleteLast(){
        tail = getPrevious(tail);
        if (tail != null) {
            tail.setNext(null);
        } else {
            head = null;
        }
    }

    public void deleteMiddle(Node node){
        Node previous;
        previous = getPrevious(node);
        previous.setNext(node.getNext());
    }

    public String toString(){
        StringBuilder result = new StringBuilder();
        Node tmp = head;
        while (tmp != null) {
            result.append(tmp).append(" ");
            tmp = tmp.getNext();
        }
        return result.toString();
    }
}
