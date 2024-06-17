
import java.util.*;
import java.io.*;
class Solution{
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        float t=0,b=0;
        if(sc.hasNextFloat())
        t=sc.nextFloat();
        if(sc.hasNextFloat())
        b=sc.nextFloat();
        if(t%5==0&&t<=(b+0.50)){
            System.out.println(b-t-0.50);
        }
        else 
        System.out.println(b);
    }
}

