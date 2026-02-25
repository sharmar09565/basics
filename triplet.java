public class triplet {
    public static void triple(int arr[]){
        boolean isTriplet = false;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]==arr[j]||arr[j]==arr[k]||arr[i]==arr[k]){
                        continue;
                    }
                    else if(arr[i]+arr[j]+arr[k]==0){
                        System.out.println(arr[i]+ " "+arr[j]+" "+ arr[k]);
                        isTriplet = true;
                        
                    }
                }
            }
        }
        if(!isTriplet){
            System.out.print("Not any triplet found");
        }
    }
    
    public static void main(String args[]){
        int arr[] = {-1,-2,-3,4,5};
        triple(arr);

    }
}
