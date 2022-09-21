
class Solution{
    
    public int findNth(int n){
        
        int[] fib=new int[100004];
        fib[0]=0;
        fib[1]=1;
        int mod=(int)1e9 +7;
        // Code your solution here.
       for(int i=2;i<=100000;i++){
           if(i%5==0) fib[i]=11;
           else{
                 fib[i]=fib[i-1]+fib[i-2];
                 fib[i]=fib[i]%mod;
           }
        }
        
      
        return fib[n];
    }
}
