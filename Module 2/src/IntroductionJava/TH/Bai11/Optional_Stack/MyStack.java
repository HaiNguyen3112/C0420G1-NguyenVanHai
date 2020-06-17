package IntroductionJava.TH.Bai11.Optional_Stack;

public class MyStack {
    private int arr[];
    private int size;
    private int index =0;

    public MyStack( int size ) {
        this.size = size;
        arr = new int[size];
    }

    public void push(int element){
        if (isFull()){
            throw new StackOverflowError("Stack is full");
        }
        arr[index] = element;
        index++;
    }

    public int pop() throws Exception{
        if (isEmpty()){
            throw new StackOverflowError("Stack is Empty!");
        }
        return arr[--index];
    }

    public int size(){
        return size;
    }

    public boolean isFull(){
        if (index==size)
            return true;
        return false;
    }
    public boolean isEmpty(){
        if (index==0)
            return true;
        return false;
    }
}
