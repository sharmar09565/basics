public class trapWater {
    public static void volume(int arr[]){
        int nodeLevel;
        int lb[]= new int[arr.length];
        int rb[]= new int[arr.length];
        int nodeVol[] = new int[arr.length];
        int vol=0;

        lb[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            lb[i] = Math.max(lb[i-1], arr[i]);
        }
        rb[arr.length-1] = arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            rb[i] = Math.max(rb[i+1], arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            nodeLevel = Math.min(rb[i], lb[i]);
            nodeVol[i] = nodeLevel - arr[i];
            vol+=nodeVol[i];
        }
        System.out.println(vol);
    }
    public static void main(String args[]){
        int arr[] = {4,2,0,6,3,2,5};
        volume(arr);
    }
}
