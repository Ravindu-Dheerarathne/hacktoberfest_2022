import java.util.Arrays;

public class quick_sort{

    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    static int partition(int arr[], int low, int high){
        int pivot = arr[high];
        int i = (low-1);

        for(int j=low; j<high; j++){
            if(arr[j]<=pivot){
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, high);
        return (i + 1);
    }

    static void quicksort(int arr[], int low, int high){
        if(low<high){
            int p = partition(arr, low, high);
            quicksort(arr, low, p-1);
            quicksort(arr, p+1, high);
        }
    }

    public static void main(String[] args){
        int arr[] = { 22, 13, 42, 7, 2};
        System.out.println("Before sorting");
        System.out.println(Arrays.toString(arr));

        quicksort(arr, 0, arr.length-1);

        System.out.println("After sorting");
        System.out.println(Arrays.toString(arr));
    }
}