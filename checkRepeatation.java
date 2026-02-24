public class checkRepeatation {
    public static void check(int arr[]){
        boolean isFound = false;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    isFound =  true;
                }
            }
        }
        System.out.print(isFound);
    } 
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        check(arr);

    }
}
