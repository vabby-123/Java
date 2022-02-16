
public class bs1{
    public static void main(String[] args){
        int[] arr={10,20,30,40,50};
        ceiling(arr,35);
    }
    static void ceiling(int[] arr,int target){
        int lb=0;
        int mid;
        int ub=arr.length-1;
        while(lb<=ub){
            mid=(lb+ub)/2;
            if(target==arr[mid]){
                System.out.print(arr[mid]);
            }
            else if(target>arr[mid]){
              lb=mid+1;
            }
            else if(target<arr[mid]){
                ub=mid-1;
            }
           
                System.out.println(arr[lb]);
            
        }
    }
}