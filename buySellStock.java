public class buySellStock {
    public static void maxProfit(int arr[]){
        int profit=0,maxProfit = 0,buyDate=0,sellDate=0;
        int BP = Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            if(BP<arr[i]){  // is today's price is higher than Buy price
                profit = arr[i] - BP;   // today's profit
                if(profit>maxProfit){
                    maxProfit = profit;
                    sellDate = i+1;
                }
                
            }
            else{   // if not then price is lower than before
                BP = arr[i];    // so change th BP to new buy price
                buyDate = i+1;
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
