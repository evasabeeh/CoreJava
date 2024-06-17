class towerOfHanoi {
    public static void calc(int n,char s, char h, char d){
        if(n==1){
        System.out.println("Transfer disk "+n+" from "+s+" to "+d);
        return;
        }
        else{
            calc(n-1,s,d,h);
            System.out.println("Transfer disk "+n+" from "+s+" to "+d);
            calc(n-1,h,s,d);
        }
    }
    public static void main(String[] args){
        calc(3,'s','h','d');
    }
}