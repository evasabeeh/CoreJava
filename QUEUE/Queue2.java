public class Queue2 {   //Circular queue using array
    static class Queue{
        static int a[];
        static int size;
        static int rear=-1;
        static int front=-1;

        Queue(int size){
            this.size=size;
            a=new int[size];
        }
        public static boolean isEmpty(){
            return rear==-1&&front==-1;
        }
        public static boolean isFull(){
            return (rear+1)%size==front;
        }
        public static void add(int data){       //enque
            if(isFull()){
                System.out.println("Full Queue");
                return;
            }
            if(front==-1){        //add 1st element
                front=0;
            }
            rear=(rear+1)%size;
            a[rear]=data;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            int result=a[front];
            if(rear==front){                //single element condition
                rear=front=-1;
            }
            else{
                front=(front+1)%size;
            }
            return result;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            return a[front];
        }
    }
    public static void main(String[] args){
         Queue q=new Queue(3);
         q.add(1);
         q.add(2);
         q.add(3);
         q.add(4);
         q.remove();
         q.add(5);

         while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
         }
    }
}
