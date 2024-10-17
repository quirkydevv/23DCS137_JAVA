public class PRACT8{
    public static void main(String args[]) {
        int[] arr1 = { 1, 2, 9 };
        int[] arr2 = { 1, 9, 9 };
        int[] arr3 = { 1, 9, 9, 3, 9 };

        System.out.println(arrayCount9(arr1)); 
        System.out.println(arrayCount9(arr2)); 
        System.out.println(arrayCount9(arr3)); 
    }

    public static int arrayCount9(int[] a) {
        int count = 0;
        for (int num = 0; num < a.length; num++) {
            if (a[num] == 9) {
                count++;
            }
        }
        return count;
    }
}
