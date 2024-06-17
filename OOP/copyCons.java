public class copyCons {
    int marks;
    int roll;
    copyCons(int a,int b){
        marks=a;
        roll=b;
    }
    copyCons(copyCons c){
        System.out.println("Copy Constuctor called");
        marks=c.marks;
        roll=c.roll;
    }
    void display(){
        System.out.println(marks+" "+roll);
    }
    public static void main(String[] args){
        copyCons c1=new copyCons(10,15);
        copyCons c2=new copyCons(c1);
        copyCons c3=c2;
        c2.display();
    }
}
