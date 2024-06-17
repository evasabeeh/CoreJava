
//Static vs instance variables
public class progg {
    static int count=0;
    int count2=0;
    void display(){
        count++;
        count2++;
        System.out.println(count+" "+count2);
    }
    public static void main(String[] args){
        progg a=new progg();
        progg b=new progg();
        progg c=new progg();
        a.display();
        b.display();
        c.display();
    }
}

