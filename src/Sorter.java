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
    
}
