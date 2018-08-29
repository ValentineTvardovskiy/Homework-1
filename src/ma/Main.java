package ma;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //------------------------№1---------------------------------//

        int size = input.nextInt();
        int k = input.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }

        for (int i = 0; i < k; i++) {
            int temp = array[0];
            for (int j = 0; j < array.length - 1; j++) {
                array[j] = array[j+1];
            }
            array[array.length-1] = temp;
        }

        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

        //------------------------№2---------------------------------//

        int size2 = input.nextInt();
        int[] array2 = new int[size2];

        for (int i = 0; i < size2; i++) {
            array2[i] = input.nextInt();
        }

        for (int i = 0; i < size2; i++) {
            if (array2[i] < 0) {
                if ( (array2[i-1] + 1) == (array2[i+1] - 1) )
                    array2[i] = array2[i-1] + 1;
                else
                    array2[i] = array2[i-1] - 1;
            }
        }

        System.out.println();
        for (int i = 0; i < size2; i++) {
            System.out.print(array2[i] + " ");
        }

        //------------------------№3---------------------------------//

        int size3 = input.nextInt();
        int[] array3 = new int[size3];

        for (int i = 0; i < size3; i++) {
            array3[i] = input.nextInt();
        }

        for (int i = 0; i < size3; i++) {
            int min = array3[i];
            System.out.print("[" + min);

            for (int j = i; j < size3; j++) {
                if ((j == size3-1) || (array3[j] + 1 != array3[j+1])) {
                    int max = array3[j];
                    if (min != max) System.out.print(" " + max);
                    i = j;
                    break;
                }
            }
            System.out.print("]");
        }

    }
}
