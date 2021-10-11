public class GinasFavs {
    public static void main (String[] args){
        int [] arr = {1, 5, 7, 8, 9, 11, 0, 99};
        countInRange(arr, -999, 999);
    }


    public static int countInRange(int arr[], int min, int max) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= min && arr[i] <= max) {
                count++;
            }
        }
        return count++;
    }
}