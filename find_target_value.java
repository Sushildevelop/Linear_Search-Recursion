package Practice.Recursion_3.Linear_Search;

public class find_target_value {
    static boolean search(int a[],int target,int idx){
        // Base case
        if (idx>=a.length){
            return false;
        }
        // self work
        if (a[idx]==target) return true;

        // Recursive work
        if(search(a,target,idx+1)){
            return true;
        }
        else{
            return false;
        }
    }
    static int findIndex(int a[],int n,int target,int idx){
        // base case
        if (idx>=n){
            return -1;
        }
        if (a[idx]==target) return idx;
        return findIndex(a,n,target,idx+1);
    }
    public static void main(String[] args) {
        int arr[]={4,12,54,14,3,8,6};
        int target=14;
//           if (search(arr,target,0)){
//               System.out.println("Yes");
//           }
//           else{
//               System.out.println("No");
//           }
        int a[]={1,2,3,4,4,4,5,6};
        int target2=4;
        System.out.println(findIndex(a, a.length,target2,0));
    }
}
