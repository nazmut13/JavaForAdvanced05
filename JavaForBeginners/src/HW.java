import java.util.Arrays;
import java.util.Random;


public class HW {


    public static void main(String[] args) {

        arraySort(randomArray());
    }

    public static int[] randomArray() {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 100;
        }
        System.out.println(Arrays.toString(array));


        return array;
    }

    public static void arraySort(int[] array) {
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count1++;
            } else {
                count2++;
            }
        }
        int[] evenArray = new int[count1];
        int[] oddArray = new int [count2];
        int evenIndex = 0;
        int oddIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenArray [evenIndex] = array [i];
                evenIndex++;
            } else {
                oddArray [oddIndex] = array [i];
                oddIndex++;
            }
        }


        System.out.println(Arrays.toString(evenArray));
        System.out.println(Arrays.toString(oddArray));



    }
}

