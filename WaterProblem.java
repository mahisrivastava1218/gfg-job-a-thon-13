class Solution{
    
    public int minCapacity(int a[], int n){
        // Code your solution here. 
        Arrays.sort(a);
        int largest=0;
        
        for(int i=0;i<n;i++){
            largest=Math.max(largest,a[i]-i);
        }
        return largest;
    }
}
