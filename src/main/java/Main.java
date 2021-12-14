public class Main {

    static class Number {
        int smallest;
        int biggest;
    }
    static Number findMinMax(int[] array, int index) {
        Number digit = new Number();
        if(index == 1) {
            digit.biggest = array[0];
            digit.smallest= array[0];
            return digit;
        }
        if(array[0] > array[1]){
            digit.biggest = array[0];
            digit.smallest = array[1];
        }
        else{
            digit.biggest = array[1];
            digit.smallest = array[0];
        }
        for(int i = 2; i < index; ++i){
            if(array[i] > digit.biggest) {
                digit.biggest = array[i];
            }
            else if(array[i] < digit.smallest){
                digit.smallest = array[i];
            }
        }
        return digit;
    }

    public static void main(String[] args){
        int[] array = {1000, 11, 445, 1, 330, 3000};
        int index = 6;
        Number digit = findMinMax(array, index);
        System.out.printf("\nSmallest Number in array is %d", digit.smallest);
        System.out.printf("\nBiggest Number in array  is %d", digit.biggest);
    }
}

