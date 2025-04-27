import java.util.Arrays;

class Selsort{
    int[] arr = {3,2,4,1,5,7,6};
    void selsort(){
        for(int i=0; i<arr.length; i++){
            int minIndex = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]<arr[minIndex]) {
                    minIndex = j;
                }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
            }
            System.out.println(Arrays.toString(arr));
        }
    }
}
public class SelectionSort {
    public static void main(String[] args) {
        Selsort obj = new Selsort();
        obj.selsort();
    }
}
