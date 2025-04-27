import java.util.Arrays;

class InsertionSort{
    int[] arr = {2,1,3,4,6,5,7};
    void Sort(){
        for(int i=1; i<arr.length; i++) {
            int curr = arr[i];
            int j = i-1;
            while(j>=0&&arr[j]>arr[j+1]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = curr;
        }
        System.out.println(Arrays.toString(arr));
    }
}
public class InsertionSorting {
    public static void main(String[] args) {
        InsertionSort obj = new InsertionSort();
        obj.Sort();
    }
}
