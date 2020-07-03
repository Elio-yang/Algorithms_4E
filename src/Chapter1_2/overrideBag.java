package Chapter1_2;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by Elio Yang on 2020/7/3.
 */
public class overrideBag<T> implements Iterable<T> {
    private Node<T> first;
    private int n;

    private static class Node<T>{
        private T item;
        private Node<T> next;
    }
    public overrideBag(){
        first=null;
        n=0;
    }
    public boolean isEmpty(){
        return first==null;
    }
    public int size(){
        return n;
    }
    public void add(T item){
        Node<T> oldfirst=first;
        first=new Node<T>();
        first.item=item;
        first.next=oldfirst;
        n++;
    }

    @Override
    public Iterator<T> iterator() {
        return new LinkedIterator(first);
    }
    private class LinkedIterator implements Iterator<T>{
        private Node<T> current;
        public LinkedIterator(Node<T> first){
            current=first;
        }

        @Override
        public boolean hasNext() {
            return current!=null;
        }
        public void remove(){
            throw new UnsupportedOperationException();
        }
        public T next(){
            if (!hasNext()) throw new NoSuchElementException();
            T item=current.item;
            current=current.next;
            return item;
        }
    }
}
