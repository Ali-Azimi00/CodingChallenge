package challenge;

import java.util.ArrayList;
import java.util.Arrays;

public class solution {
    public static int findLrgGap(int[] arr1) {
        ArrayList arr2 = new ArrayList<>();
        Arrays.sort(arr1);
        for (int i = 0; i < arr1.length; i++) {
            arr2.add(arr1[i]);
        }

        int min = 0;
        int max = 1;
        int diff = 0;


        for (int i = 0; i < arr2.size() - 1; i++) {
            int num1 = (int) arr2.get(i);
            int num2 = (int) arr2.get(i + 1);
            int diffCk = num2 - num1;

            if (diffCk > diff) {
                diff = diffCk;
                min = num1;
                max = num2;
            }

        }

        System.out.println("answer :" + (max - min) + "| gap: " + diff);

        return diff;

    }

}
