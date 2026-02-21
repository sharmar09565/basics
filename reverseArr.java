import java.util.*;

public class reverseArr {
    public static void reverse(int arr[]) {

        // It is not optimized because it takes extra space(i.e O(n))

        // int newArr[] = new int[arr.length];
        // int j=0;
        // for(int i=(arr.length-1);i>=0;i--){
        // newArr[j] = arr[i];
        // j++;
        // }
        // for(int i=0;i<newArr.length;i++){
        // System.out.print(newArr[i]+" ");
        // }

        // Use swapping method;

        int temp, beg = 0, end = arr.length - 1;
        while (beg < end) {
            //Swapping using temp
            // temp = arr[beg];
            // arr[beg] = arr[end];
            // arr[end] = temp;

            // Without temp var
            arr[beg]=arr[beg]-arr[end];
            arr[end]=arr[end]+arr[beg];
            arr[beg]=arr[end]-arr[beg];
            beg++;
            end--;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        reverse(arr);
        // int a = 10, b = 6;
        // a = a - b; // 1
        // b = b + a; // 5
        // a = b - a; // 4
        // System.out.println("a=" + a);
        // System.out.println("b=" + b);
    }

}
