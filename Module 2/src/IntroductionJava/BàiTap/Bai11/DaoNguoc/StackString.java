package IntroductionJava.BàiTap.Bai11.DaoNguoc;

public class StackString {
    private String arr[];
    private int size;
    private int index;

    public StackString( int size ) {
        this.size = size;
        arr = new String[size];
    }
    public void push(String element){
        if(isFull()){
            throw new StackOverflowError("Stack is Full!!!");
        }
        arr[index] = element;
        index++;
    }
    public String pop() throws Exception{
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

    private static StackString reverseString (StackString stackString) throws Exception{
        StackString tempStack = new StackString(stackString.getSize());
        for (int i =0; i< stackString.getSize();i++){
            tempStack.push(stackString.pop());
        }
        return tempStack;
    }

    public static void main( String[] args ) throws Exception {
        String s ="abcdefgh";
        StackString stackString = new StackString(s.length());
        for (int i =0;i<stackString.getSize();i++){
            stackString.push(s.substring(i,i+1));
        }
        System.out.println("Before: ");
        stackString.print();

        stackString = StackString.reverseString(stackString);

        System.out.println("After: ");
        stackString.print();

    }
}
