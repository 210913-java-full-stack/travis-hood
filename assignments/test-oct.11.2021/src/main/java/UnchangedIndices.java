import java.util.Arrays;

public class UnchangedIndices {
    public static void main(String[] args){
        int [] arr = {1, 5, 7, 8, 9, 11, 0, 99};
        countUnchangedIndices(arr);
    }

    public static int countUnchangedIndices(int arr[]){
        int [] arraySorted = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arraySorted);
        int count =0;
        for(int i = 0; i <arr.length; i++){
            if(arr[i]==arraySorted[i]){
                count++;
            }
        }
        return count;
    }
}
