import java.util.*;
public class linearSearch{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isFound = false;

        int arr[] = {21,45,16,81,44};
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                System.out.println("Element present at "+(i+1)+" position");
                isFound = true;
                break;
            }

        }
        if(!isFound){
            System.out.print("Not found");
        }
    }
}