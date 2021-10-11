public class LeastGreatest {
    public static void main (String[] args){
        int [] arr = {23, 1, 5, 7, 9, 11, 0, 99};
        findLeastGreatest(arr, 9);
    }
    public static int findLeastGreatest(int arr[], int x){

        int candidate = Integer.MAX_VALUE;


        for(int i = 0; i <arr.length; i++){
            int temp;
            if(arr[i]>x){
                temp=arr[i];
            } else {
                continue;
            }
            if(temp< candidate){
                candidate = temp;
            }
        }
        return candidate;
    }
}
