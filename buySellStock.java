public class buySellStock {
    public static void maxProfit(int arr[]){
        int CP,profit=0,buyDate=0,sellDate=0;
        int BP = Integer.MAX_VALUE;
        int SP = Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){

            BP = Math.min(arr[i-1], BP);
            System.out.println("BP="+BP);
            SP = Math.max(arr[i], SP);
            
            profit = Math.max(SP-BP, profit);
            if(BP == arr[i-1]){
                buyDate = i;
            }
            if(SP == arr[i]){
                sellDate = i+1;
            }
            
        }
        System.out.println("Buying date: "+ buyDate);
        System.out.println("Selling date: "+ sellDate);
        System.out.println(profit);
        

    }
    public static void main(String args[]){
        int profits[] = {7,1,5,3,6,4};
        maxProfit(profits);
    }
}
