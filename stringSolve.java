public class stringSolve {
    public static void main(String[] args){
        String str=" hello world";

        System.out.println(str.indexOf('l',5));  //index of char from the specified pos
        System.out.println(str.replace('o','a'));
        System.out.println(str.trim());  //remove ending and staring spaces
        System.out.println(str.replace("llo","*"));  //replace char or substring with specified value
        System.out.println(str.contains("world")); //check for substring
        System.out.println(str.indexOf("llo"));  //start idx of substring
        System.out.println(str.isEmpty());  //if str is null

        String m="43";
        int n=Integer.parseInt(m);  //str to int
        System.out.println(n+1);

        int num=12;             //int to string
        System.out.println(String.valueOf(num)+13);

        char arr[]=str.toCharArray(); //str to char array
        for(char d:arr)
        System.out.print(d+" ");

        char ch[]={'a','b','c'};   //char array to string
        String c=new String(ch);
        System.out.println("\n"+c);

        str.concat(" hii");   //concat two strings
        String w=str.concat("jj");
        System.out.println(str+" "+str.concat("hii")+" "+w);

        String x="Hello", y="Hello";
        System.out.println(x.startsWith("e"));//starswith or endswith or not
        System.out.println(x.endsWith("o"));
        
        String z=new String("Hello");
        System.out.println((x==y)+" "+(y==z));  //checks for same instances.

        StringBuilder ab=new StringBuilder("maze");   //StringBuilder
        ab.append("d");
        System.out.println(ab);

        
    }
}
