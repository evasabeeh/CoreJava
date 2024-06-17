public class Queue1 {   //quque using array
    static class Queue{
        static int a[];
        static int size;
        static int rear=-1;

        Queue(int size){
            this.size=size;
            a=new int[size];
        }
        public static boolean isEmpty(){
            return rear==-1;
        }
        public static void add(int data){
            if(rear==(size-1)){
                System.out.println("Full Queue");
                return;
            }
            rear++;
            a[rear]=data;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            int front=a[0];         //front is removed;
            for(int i=0;i<rear;i++){
                a[i]=a[i+1];
            }
            rear--;
            return front;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            int front=a[0];       
            return front;
        }
    }
    public static void main(String[] args){
         Queue q=new Queue(5);
         q.add(1);
         q.add(2);
         q.add(3);
         q.add(4);

         while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
         }
    }
}
