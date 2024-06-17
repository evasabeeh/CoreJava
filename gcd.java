import java.util.*;
import java.lang.*;
import java.io.*;
class gcd
{
    public static int gcd(int a,int b){
        if(b%a==0)
        return a;
        else
        return gcd(b%a,a);
    }
    public static int lcm(int a,int b, int gcd){
        return (a*b)/gcd;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	    try{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int [][]dp=new int[n+1][n+1];
		    //Arrays.fill(dp,-1);
		    int count=0;
		    for(int i=1;i<=n;i++){
		            for(int j=1;j<=n;j++){
		               if(dp[i][j]==0||dp[j][i]==0){
		               int gcd=gcd(i,j);
		               int lcm=lcm(i,j,gcd);
		               int exp=(i*i)+(j*j)+(gcd*gcd)+(lcm*lcm);
		               dp[i][j]=dp[j][i]=exp;
		               }
		               if(dp[i][j]==n)
		                  count++;
		           }
		        }
		    System.out.println(count);
		}}
		catch(Exception e){
		    return;
		}
	}
}
