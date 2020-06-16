package IntroductionJava.BàiTap.Bai10.List;
import java.util.ArrayList;
import java.util.Arrays;


public class MyList <E> {
    private int size = 0;
    public static int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList(){
        elements = new Object[DEFAULT_CAPACITY];
    }
    public MyList(int capacity){
        elements = new Object[capacity];
    }
    private void ensureCapa(){
        int newSize = elements.length*2;
        elements = Arrays.copyOf(elements,newSize);
    }
    public void add(E e){
        if (size == elements.length){
            ensureCapa();
        }
        elements[size+1] = e;
    }
    public void add (int index, E e){
        ensureCapa();
        for (int i = size -1;i >= index;i++){
            elements[i+1] = elements[i];
        }
        elements[index] = e;
        size++;
    }
    public int getSize(){
        return size;
    }
    public E remove(int index){
        for (int i = index;i<size;i++){
            elements[i] = elements[i+1];
        }
        elements[size-1] =null;
        size--;
        return (E) elements;
    }
    public boolean contains(E o){
        for (int i=0;i<size;i++){
            if (elements[i].equals(o))
                return true;
        }
        return  false;

    }
    public int indexOf(E o){
        for (int i =0;i<size;i++){
            if (elements[i].equals(o))
                return i;
        }
        return -1;
    }
    public E get(int index){
        if (index>= size || index <0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index );
        }
       return (E) elements[index];
    }
    public void clear(){
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }
    public void show(){
        for (int i =0;i<size;i++){
            System.out.println("element "+(i+1)+": "+elements[i]);
        }
    }





}
