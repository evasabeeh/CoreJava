import java.util.HashMap;
class subArraySum {
  public static void subArray(int a[],int sum){
    int n=a.length;
    int start=0,end=-1,curr=0;
    HashMap<Integer,Integer> map=new HashMap <Integer, Integer>();      //key--> sum; value--> index
    for(int i=0;i<n;i++){
      curr+=a[i];
      int val=curr-sum;
      //System.out.println(a[i]+" "+curr+" "+val+" "+i);
      if(val==0){
        start=0;
        end=i;
        break;
      }
      if(map.containsKey(val)){            //val+sum=curr
        start=map.get(val)+1;
        end=i;
        break;
      }
      map.put(curr,i);
    }
    /*for(int i:map){
      System.out.print(i+" ");
    }*/
      if(end==-1)
      System.out.println("Not Found");
      else
      System.out.println("Found"+" : start = "+start+", end = "+end);
  }
	public static void main(String args[]) {
 
		int arr[]={10,15,-5,15,-10,5};
    int sum=5;
    subArray(arr,sum);
	}
}