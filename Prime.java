class Prime {
    public static void main(String[] args){
         int n=7;
         int flag=0;
         for(int i=2;i<n-1;i++){
            if(n%i==0){
                flag++;
                break;
            }
         }
         if(flag!=0)
         System.out.println("Prime");
        
    }
}