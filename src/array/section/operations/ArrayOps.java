package array.section.operations;

public class ArrayOps {
    int[] arr = {3,6,5,2,4};
    //Reversing Array
    public void reverseArray() {
        System.out.println("\nBefore reversing:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+ arr[i] +" ");
        }

        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        System.out.println("\nAfter reversing: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i] + " ");
        }
    }

    //Juggling method or Reversal method

    public void rotateArray(){
        int rotation_num = 2;

        //Rotation for 2 times
        for (int i= 0; i < rotation_num; i++) {

            int first = arr[0]; //Pickup the first element
            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1]; // Shifting the index for other elements
            }
            arr[arr.length - 1] = first; //Inserting the picked up element in last element.

            System.out.println("\nAfter rotation :" + i + " Array is: ");

            for (int num : arr) {
                System.out.print(" " + num + " ");
            }
        } //Repeating the steps for rotation numbers.

    }
}
