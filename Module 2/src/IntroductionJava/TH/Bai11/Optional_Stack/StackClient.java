package IntroductionJava.TH.Bai11.Optional_Stack;

public class StackClient {
    public static void main( String[] args ) throws Exception {
        MyStack stack = new MyStack(5);
        stack.push(5);
        stack.push(4);
        stack.push(6);
        stack.push(2);
        stack.push(8);

        System.out.println("1. Size of stack after push: "+stack.size());
        System.out.printf("2. Pop elements from stack : ");
        while (!stack.isEmpty()) {
            System.out.printf(" %d", stack.pop());
        }

        System.out.println("\n3. Size of stack after pop operations : " + stack.size());
    }
}
