package IntroductionJava.BàiTap.Bai12.ArrayListNLinkedList.ArrayList;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ProductManager <E> {
    private int size = 0;
    public static int DEFAULT_CAPACITY = 10;
    private Product elements[];

    public ProductManager() {
        elements = new Product[DEFAULT_CAPACITY];
    }
    public ProductManager(int capacity){
        elements = new Product[capacity];
    }
    private void ensureCapa(){
        int newSize = elements.length*2;
        elements = Arrays.copyOf(elements,newSize);
    }
    public void add(E e){
        if (size == elements.length){
            ensureCapa();
        }
        elements[size] = (Product) e;
        size++;

    }
    public void add(int index, E e){
        ensureCapa();
        for (int i = size-1;i>=index;i--){
            elements[i+1] = elements[i];
        }
        elements[index] = (Product) e;
        size++;
    }
    public void delete(String id){
        int temp = -1;
        for (int i =0;i<size-1;i++){
            if (id == elements[i].getId()){
                temp =i;
                break;
            }
        }
        if (temp == -1){
            System.out.println("Không tìm thấy với id "+id);
            return;
        } else {
            for (int i = temp; i<size-1;i++){
                elements[i] = elements[i+1];
            }
            size--;
        }
    }
    public void edit(String id){
        Scanner sc = new Scanner(System.in);
        int temp =-1;
        for (int i =0;i<size;i++){
            if (id == elements[i].getId()){
                temp = i;
                break;
            }
        }
        if (temp == -1){
            System.out.println("Không tìm thấy với id "+id);
        } else {
            System.out.println("Enter new name: ");
            String newName = sc.nextLine();
            elements[temp].setName(newName);
            System.out.println("Enter new price: ");
            int newPrice = sc.nextInt();
            elements[temp].setPrice(newPrice);
        }
    }
    public void sortUp(){
        for (int i = 0;i<size;i++){
            for (int j =i;j<size;j++){
                if (elements[i].getPrice()>elements[j].getPrice()){
                    int temp = elements[i].getPrice();
                    elements[i].setPrice(elements[j].getPrice());
                    elements[j].setPrice(temp);
                }
            }
        }
    }
    public void sortDown(){
        for (int i = 0;i<size;i++){
            for (int j =i;j<size;j++){
                if (elements[i].getPrice()<elements[j].getPrice()){
                    int temp = elements[i].getPrice();
                    elements[i].setPrice(elements[j].getPrice());
                    elements[j].setPrice(temp);
                }
            }
        }
    }

    public void show(){
        for (int i =0;i<size;i++){
            System.out.println("Id: "+elements[i].getId()
                                +"Name: "+elements[i].getName()
                                +"Price: "+elements[i].getPrice());
        }
    }

}
