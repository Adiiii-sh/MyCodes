import java.util.*;
class BubSort{
    int[] arr = {3,2,4,7,5,1,6};
    void sort(){
        for(int i=0; i<arr.length-1; i++) {
            for(int j=0; j< arr.length-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
public class bubble_sorting {
    public static void main(String[] args) {
        BubSort obj = new BubSort();
        obj.sort();
    }
}
