public class copyConst {
    int marks;
    int roll;
    copyConst(int a,int b){
        marks=a;
        roll=b;
    }
    copyConst(){
    }
    void display(){
        System.out.println(marks+" "+roll);
    }
    public static void main(String[] args){
        copyConst c1=new copyConst(10,15);
        copyConst c2=new copyConst();
        c2.marks=c1.marks;
        c2.roll=c1.roll;
        c2.display();
    }
}
