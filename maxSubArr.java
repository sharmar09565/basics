public class maxSubArr {
    // Brute force approach
    // public static void subArrays(int arr[]){
    // int sum = 0, largestSum = Integer.MIN_VALUE;
    // for(int i=0;i<arr.length;i++){
    // for(int j=i;j<arr.length;j++){
    // for(int k=i;k<=j;k++){
    // System.out.print(arr[k]+ " ");
    // sum+=arr[k];

    // }
    // if(largestSum<sum){
    // largestSum=sum;
    // }
    // System.out.println(" = "+sum+" Largest = "+ largestSum);
    // sum=0;
    // }
    // System.out.println();
    // }
    // System.out.println(largestSum);
    // }

    // prefix sum method
    // public static void subArrays(int arr[]){
    // int sum = 0, largestSum = Integer.MIN_VALUE;
    // int preFix[] = new int[arr.length]; // Make a newArr that store sum of sub
    // arr
    // preFix[0]=arr[0];

    // for(int i=1;i<preFix.length;i++){
    // preFix[i] = preFix[i-1] + arr[i];
    // }

    // for(int i=0;i<arr.length;i++){
    // for(int j=i;j<arr.length;j++){
    // if (i==0) {
    // sum = preFix[j];
    // }
    // else{
    // sum = preFix[j]+preFix[i-1];
    // }
    // }
    // if(largestSum<sum){
    // largestSum=sum;
    // }
    // }
    // System.out.println(largestSum);
    // }

    // Kadane's Method
    public static void subArrays(int arr[]) {
        int curSum = 0, largestSum = Integer.MIN_VALUE;
        int preFix[] = new int[arr.length]; // Make a newArr that store sum of sub arr
        preFix[0] = arr[0];

        for (int i = 1; i < preFix.length; i++) {
            preFix[i] = preFix[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            curSum+=arr[i];
            if (curSum<0) {
                curSum=0;
            }
            
        }
        // if (largestSum < curSum) {
        //     largestSum = curSum;
        // }
        largestSum = Math.max(largestSum, curSum);
        System.out.println(largestSum);
    }
    



    public static void main(String args[]) {
        int arr[] = { 1, -2, -3, 4, 5 };
        subArrays(arr);
    }
}
