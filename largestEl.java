import java.util.*;
public class largestEl {
    public static int biggestEl(int arr[]){
        int largest = Integer.MIN_VALUE;
        
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
                // System.out.print(largest);
            }
        }
        return largest;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        // biggestEl(arr);
        System.out.println(biggestEl(arr));
    }

}
