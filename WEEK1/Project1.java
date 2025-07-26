
import java.util.Arrays;


public class Project1 {

    /*

    Array : [22, 27, 16, 2, 18, 6]

    A) Insertion Sort Steps:
    -----------------------------

    Beginning   : [22, 27, 16, 2, 18, 6]  (Sorted part: [22])
    Step 1      : [22, 27, 16, 2, 18, 6]  (Sorted part : [22, 27])
    Step 2      : [16, 22, 27, 2, 18, 6]  (Sorted part: [16, 22, 27])
    Step 3      : [2, 16, 22, 27, 18, 6]  (Sorted part: [2, 16, 22, 27])
    Step 4      : [2, 16, 18, 22, 27, 6]  (Sorted part: [2, 16, 18, 22, 27])
    Step 5      : [2, 6, 16, 18, 22, 27]  (Sorted part: [2, 6, 16, 18, 22, 27])
    End         : [2, 6, 16, 18, 22, 27]


    Big-O Notation:
    --------------------
    - Worst Case:   O(n^2)
    - Average Case: O(n^2)
    - Best Case:    O(n)
    - Space:        O(1)


    Time Complexity Analysis(For 18) :
    ---------------------------------------------
    Sorted Array: [2, 6, 16, 18, 22, 27]
    It located on the middle of the array. (Average Case)

    */


    public static void selectionSortFirstFourSteps(int[] arr) {
        int n = arr.length;
        int maxStep = 4;

        System.out.println("Selection Sort İlk 4 Adımı:");
        System.out.println("Başlangıç Dizisi: " + Arrays.toString(arr));
        System.out.println("------------------------------------");

        for (int i = 0; i < maxStep && i < n - 1; i++) {

            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }

            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;

            System.out.println("After Step " + (i + 1)  + " : " + Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {

        int[] arr = {7, 3, 5, 8, 2, 9, 4, 15, 6};
        selectionSortFirstFourSteps(arr);
    }
}