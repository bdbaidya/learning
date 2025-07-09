package array.section.operations;

public class ArrayOps {
    //Reversing Array
    public void reverseArray() {
        int[] arr = {3,6,5,2,4};
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Before reversing: " + arr[i]);
        }

        System.out.println("################################");

        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println("After reversing: " + arr[i]);
        }
    }
}
