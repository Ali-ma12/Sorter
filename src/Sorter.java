public class Sorter {
    public static void main(String[] args) {
        
    }

    public int[] selectionSort(int[] array){
        for(int i = 0; i < array.length - 1; i ++){
            int currentMin = array[i];
            int currentMinIndex = i;

            for(int j = i + 1; j < array.length; j ++){
                if(array[j] < currentMin){
                    currentMin = array[j];
                    currentMinIndex = j;
                }
            }

            if(currentMinIndex != i){
                array[currentMinIndex] = array[i];
                array[i] = currentMin;
            }
        }
        return array;
    }
    public void insertionSort(int[] arr)
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int r = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (r >= 0 && arr[r] > key) {
                arr[r + 1] = arr[r];
                r = r - 1;
            }
            arr[r + 1] = key;
        }
    }

}
