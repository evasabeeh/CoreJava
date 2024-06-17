class quickSort {
    public static int partition(int a[], int start, int end){
        int pivot=a[end];
        int i=start-1;
        for(int j=start;j<end;j++){             //excluding a[end], ie, pivot
            if(a[j]<pivot){
                i++;
                int t=a[j];
                a[j]=a[i];
                a[i]=t;
            }
        }
        i++;                                //setting pivot at right place
        int t=a[i];
        a[i]=a[end];
        a[end]=t;
        return i;
    }
    public static void quicksort(int a[], int start, int end){
        if(start<end){
        int pidx=partition(a, start, end);

        quicksort(a,start,pidx-1);                     //smaller elements
        quicksort(a,pidx+1,end);                       //larger elements
        }
    }
    public static void main(String[] args){
        int a[]={2,7,1,9,17,12,2};
        int l=a.length;
        quicksort(a, 0, l-1);
        for(int i=0;i<l;i++)
        System.out.print(a[i]+" ");
    }
}