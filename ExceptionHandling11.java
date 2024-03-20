public class ExceptionHandling11 {
    public static void main(String[] args) {

        Stack s = new Stack();
        try {
            s.push(1);
            s.push(2);
            s.push(3);
            s.push(4);
            s.push(5);
            s.push (1);
        } catch (StackOverFlowException e) {
            System.out.println(e.toString());
        } finally {
            System.out.print("{");
            s.print();
            System.out.print("}");
        }
    }
}



class Stack {
        int top = -1;
        int []ary = new int[5];
        int   l = ary.length;
        public void push(int x) throws StackOverFlowException {

            if (top == l-1) {
                throw new StackOverFlowException();
            }
           top++;
            ary[top]=x;


        }
        public void print()
        {
            for (int x:ary)
            {

                System.out.print(x+",");
            }
        }

        public int pop(int top) throws StackUnderFlowException {
            if (top == -1) {
                throw new StackUnderFlowException();
            }

            return 0;
        }
    }


        class StackOverFlowException extends Exception {
            @Override
            public String toString() {
                return "Stack is Over Flow ";
            }
        }

        class StackUnderFlowException extends Exception {
            @Override
            public String toString() {
                return "Stack is Under Flow ";
            }
        }



