package List;

public class LinkedList {
    protected Node head;
    protected Node tail;

    public LinkedList(){
        head = null;
        tail = null;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public Node getHead(){
        return head;
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

    public void deleteSecond(){
        Node tmp;
        if(head.getNext() == null){
            deleteFirst();
        }else{
            if(head.getNext() == tail){
                deleteLast();
            }else{
                tmp = head.getNext().getNext();
                head.setNext(tmp);
            }
        }
    }

    public void addToSortedList(int x){
        Node new_node = new Node(x);
        Node current;
        Node tmp = null;
        if(head == null || head.getData() >= new_node.getData()){
            insertFirst(new_node);
        }else{
            current = head;
            while(current.getNext() != null && current.getNext().getData() < x){
                current = current.getNext();
                }
            insertMiddle(new_node, current);
            }
        }


    public void deleteKth(int k){
        Node tmp = head;
        Node previous = null;
        int i = 0;
        while(i < k){
            previous = tmp;
            tmp = tmp.getNext();
            i++;
        }
        if(previous == null){
            head = head.getNext();
            if(head == null){
                tail = null;
            }
        }else{
            previous.setNext(tmp.getNext());
            if(previous.getNext() == null){
                tail = previous;
            }
        }
    }

    public void moveNode(Node x, int n){
        Node prev1 = null, prev2, tmp = head;
        while(tmp != x){
            prev1 = tmp;
            tmp = tmp.getNext();
        }
        prev2 = x;
        int i = 0;
        while(i != n){
            prev2 = prev2.getNext();
            i++;
        }
        if(prev1 != null){
            prev1.setNext(x.getNext());
        }else{
            head = head.getNext();
        }
        x.setNext(prev2.getNext());
        prev2.setNext(x);
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
