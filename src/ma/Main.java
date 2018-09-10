package ma;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter size, k and elements");
        rotation();

        System.out.println("Enter size and elements");
        reverse();

        System.out.println("Enter size and elements");
        ranges();

    }

    public static void rotation() {
        Scanner input = new Scanner(System.in);

        int size = input.nextInt();
        int k = input.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }

        int[] newArray = new  int[size];

        for (int i = 0; i < k; i++) {
            newArray[size - k + i] = array[i];
        }
        for (int i = 0; i < size - k; i++) {
            newArray[i] = array[k + i];
        }
        //по частям передать

        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.print(newArray[i] + " ");
        }

    }

    public static void reverse() {
        Scanner input = new Scanner(System.in);

        int size2 = input.nextInt();
        int[] array2 = new int[size2];

        for (int i = 0; i < size2; i++) {
            array2[i] = input.nextInt();
        }

        for (int i = 0; i < size2; i++) {
            if (array2[i] < 0) {
                if ((array2[i - 1] + 1) == (array2[i + 1] - 1))
                    array2[i] = array2[i - 1] + 1;
                else
                    array2[i] = array2[i - 1] - 1;
            }
        }

        System.out.println();
        for (int i = 0; i < size2; i++) {
            System.out.print(array2[i] + " ");
        }
    }

    public static void ranges() {
        Scanner input = new Scanner(System.in);

        int size3 = input.nextInt();
        int[] array3 = new int[size3];

        for (int i = 0; i < size3; i++) {
            array3[i] = input.nextInt();
        }

        int min = array3[0];
        for (int i = 0; i < size3; i++) {
            if ((i == size3 - 1) || (array3[i] + 1 != array3[i+1])) {

                int max = array3[i];
                if (min != max) {
                    System.out.print("[" + min + " " + max + "]");
                }
                else {
                    System.out.print("[" + min + "]");
                }

                if (i == size3 - 1) {
                    break;
                }
                min = array3[i+1];
            }
        }

    }
}


