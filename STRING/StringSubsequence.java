class StringSubsequence {
    public static void calc(String s,int i,String newString){
        if(i==s.length()){
            System.out.println(newString);
            return;
        }
        else{
            char c=s.charAt(i);
            calc(s,i+1,newString+c);        //when the char needs to be added
            calc(s,i+1,newString);          //when the char don't get added
        }
    }
    public static void main(String[] args){
        calc("abc",0,"");
    }
}