import java.util.Scanner;

public class pairsDivide {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter arr size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter pair sum val");
        int x = sc.nextInt();

        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                System.out.println(arr[i]+" "+arr[j]);
                if((arr[i]+arr[j])%x==0){
                    count++;
                }
            }
        }
        
        System.out.println(count);
        
    }
}