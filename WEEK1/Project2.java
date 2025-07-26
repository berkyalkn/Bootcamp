import java.util.Arrays;

// Time Complexity : O(n log n)


public class Project2 {

    public void sort(int[] arr, int left, int right) {
        if (left < right) {
            
            int mid = left + (right - left) / 2;

            
            System.out.println("Dividing: " + Arrays.toString(Arrays.copyOfRange(arr, left, right + 1)) +
                    " -> " + Arrays.toString(Arrays.copyOfRange(arr, left, mid + 1)) +
                    " & " + Arrays.toString(Arrays.copyOfRange(arr, mid + 1, right + 1)));

            
            sort(arr, left, mid);
            sort(arr, mid + 1, right);

           
            merge(arr, left, mid, right);
        }
    }

    private void merge(int[] arr, int left, int mid, int right) {
        
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[mid + 1 + j];

        System.out.println("Merging: " + Arrays.toString(L) + " and " + Arrays.toString(R));

       
        int i = 0, j = 0;
        int k = left; 
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }

        System.out.println("-> Merging Result : " + Arrays.toString(Arrays.copyOfRange(arr, left, right + 1)));
    }

    public static void main(String[] args) {
        int[] arr = {16, 21, 11, 8, 12, 22};

        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("-------------------------------------");

        Project2 sorter = new Project2();
        sorter.sort(arr, 0, arr.length - 1);

        System.out.println("-------------------------------------");
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
    

