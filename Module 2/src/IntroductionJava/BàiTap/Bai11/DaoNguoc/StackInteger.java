package IntroductionJava.BàiTap.Bai11.DaoNguoc;

import org.omg.CORBA.MARSHAL;

public class StackInteger {
    private int arr[];
    private int size;
    private int index =0;

    public StackInteger( int size ) {
        this.size = size;
        arr = new int[size];
    }

    public void push(int element){
        if(isFull()){
            throw new StackOverflowError("Stack is Full!!!");
        }
        arr[index] = element;
        index++;
    }
    public int pop() throws Exception{
        if (isEmpty())
            throw new StackOverflowError("Stack is Empty!!!");
        return arr[--index];
    }
    public int getSize(){
        return size;
    }

    public boolean isFull(){
        if (index == size)
            return true;
        return false;
    }
    public boolean isEmpty(){
        if (index == 0)
            return true;
        return false;
    }
    public void print(){
        for (int i =0;i<size;i++){
            System.out.println(arr[i]);
        }
    }
    public static StackInteger reverseStack( StackInteger stackInteger ) throws Exception {
        StackInteger tempStack = new StackInteger(stackInteger.getSize());
        for (int i =0;i<tempStack.getSize();i++){
            tempStack.push(stackInteger.pop());
        }
        return tempStack;
    }
}

class StackClient{
    public static void main( String[] args ) throws Exception {
        StackInteger stack = new StackInteger(5);
        for (int i =0;i<stack.getSize();i++){
            stack.push((int)Math.round(Math.random()*10));
        }
        System.out.println("Before: ");
        stack.print();

        stack = StackInteger.reverseStack(stack);

        System.out.println("After:");
        stack.print();


    }
}
