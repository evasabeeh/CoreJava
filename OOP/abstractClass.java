
abstract class emp{
    abstract void greet();
}
class abstract2Class extends emp{
    void greet(){
        System.out.println("Good noon");
    }
}
class abstractClass{
    public static void main(String[] args){
        emp aa=new abstract2Class();                //ok
        aa.greet();
        abstract2Class ab=new abstract2Class();
        ab.greet();
    }
}