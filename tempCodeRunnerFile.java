class backTracking {
    public static void calc(String s,String p,int ind){
        if(s.length()==0){
            System.out.println(p);
            return;
        }
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            String n=s.substring(0,i)+s.substring(i+1);
            calc(n,p+c,ind+1);
        }
    }
    public static void main(String[] args){
        calc("ABC","",0);
    }
}