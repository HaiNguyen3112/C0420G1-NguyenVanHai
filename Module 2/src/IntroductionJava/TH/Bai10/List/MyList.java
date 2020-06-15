package IntroductionJava.TH.Bai10.List;

import IntroductionJava.BàiTap.Bai7.InterfaceColorable.Rectangle;

import javax.xml.bind.Element;
import java.util.Arrays;

public class MyList <E> {
    private int size =0;
    public  static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
         elements = new Object[DEFAULT_CAPACITY];
    }
    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }
    public E get(int i){
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) elements[i];
    }
    
}
