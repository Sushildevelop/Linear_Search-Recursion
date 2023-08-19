package Practice.Recursion_3.Linear_Search;

public class FindAllindices {
    static void findallIndices(int[]a,int n,int target,int idx){
        // base case
        if (idx>=n){
            return;
        }
        // self work
        if (a[idx]==target){
            System.out.println(idx);
        }
        // recursive work
        findallIndices(a,n,target,idx+1);
    }
    public static void main(String[] args) {
  int arr[]={1,2,3,2,5,6,2,4,2};
  int n= arr.length;
  int target=2;
  findallIndices(arr,n,target,0);
    }
}
