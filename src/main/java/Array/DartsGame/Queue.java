package Array.DartsGame;

import Array.Element;

public class Queue {
    private Array.Element array[];
    private int first;
    private int last;
    private int N;

    public Queue(int N){
        this.N = N;
        array = new Array.Element[N];
        first = 0;
        last = 0;
    }

    boolean isFull(){
        return (last + 1) % N == first;
    }

    boolean isEmpty(){
        return first == last;
    }

    void enqueue(Array.Element element){
        if(!isFull()){
            array[last] = element;
            last = (last + 1) % N;
        }
    }

    Array.Element dequeue(){
        if(!isEmpty()){
            Element tmp = array[first];
            first = (first + 1) % N;
            return tmp;
        }
        return null;
    }
}
