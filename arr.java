import java.util.*;

public class arr {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // int arr = {1,2,3,4};
        int arr[] = new int[5];
        
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.println("Element "+i+": "+arr[i]);
        }
    }
    
} 
