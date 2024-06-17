class mergeSort1 {
    public static void sort(int a[],int s,int mid, int e){
        int m[] = new int[e-s+1];
        int i1=s;
        int i2=mid+1;
        int x=0;
        while(i1<=mid&&i2<=e){
            if(a[i1]<=a[i2]){
                m[x++]=a[i1++];
            }
            else{
                m[x++]=a[i2++];
            }
        }
        while(i1<=mid){
            m[x++]=a[i1++];
        }
        while(i2<=e){
            m[x++]=a[i2++];
        }
        for(int i=0,j=s;i<m.length;i++,j++){
             a[j]=m[i];
        }
    }
    public static void divide(int a[],int s,int e){
        if(s>=e){
            return;
        }
        int mid =(s+e)/2;
        divide(a,s,mid);
        divide(a,mid+1,e);
        sort(a,s,mid,e);

    }
    public static void main(String[] args){
         int a[]={300,66,90,32,152,8};
         int l=a.length;
         divide(a,0,a.length-1);
         for(int i=0;i<a.length;i++){
           System.out.print(a[i]+" ");
       }
    }
}