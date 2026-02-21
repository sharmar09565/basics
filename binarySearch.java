import java.util.*;
public class binarySearch {
    public static int findEl(int arr[], int num){
        int loc = -1;
        int mid,beg = 0, end = arr.length-1;

        while(end>=beg){
            mid = (beg+end)/2;

            if(arr[mid]<num){
                beg = mid+1;
            }
            else if(arr[mid]>num){
                end = mid-1;
            }
            else{
                loc = mid+1;
                break;
            }
        }
        if(loc!=-1){
            System.out.println("The element is present at "+ loc + "th position");
            return 0;
        }
        else{
            System.out.println("Not found");
        }
        return 0;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];
        System.out.print("Enter array elements:\n");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Find Element:");
        int num = sc.nextInt();

        findEl(arr, num);
    }
}
