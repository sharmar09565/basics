import java.util.*;
public class rotate{
    public static void rotate(int arr[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the idx: ");
        int idx = sc.nextInt();
        int first;
        for(int i=0;i<idx-1;i++){
            first = arr[0];
            for(int j=0;j<arr.length;j++){    
                if(j == arr.length-1){
                    arr[j] = first;
                }
                else{
                    arr[j]=arr[j+1];
                }
            }
        }
        for (int val : arr) {
            System.out.print(val+" ");
        }
        System.out.println();
        System.out.print("Enter the target: ");
        int target = sc.nextInt();
        int loc = -1;
        
        for (int i=0;i<arr.length;i++) {
            if(arr[i]==target){
                loc = i;
                break;
            }
        }
        System.out.print(loc);
    }
    public static void main(String args[]){
        int arr[] = {1,21,3,44,5,16};
        rotate(arr);
    }
}