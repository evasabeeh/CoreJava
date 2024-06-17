public class StackClass1 {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            next=null;
        }
    }
    static class Stack{
        public static Node head;
        public static boolean isEmpty(){
            return head==null;
        }
        public static void push (int data){
            Node newNode=new Node(data);
            if(isEmpty()){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top=head.data;
            head=head.next;
            return top;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            int top=head.data;
            return top;
            
        }
    }
    public static void main(String[] args){
        Stack s=new Stack();
        s.push(1);
        s.push(4);
        s.push(7);
        s.push(9);
        System.out.println(s.peek());         //top value of stack
        while(!s.isEmpty()){                 //till stack is not empty
            System.out.println(s.pop());
        }
    }
}
