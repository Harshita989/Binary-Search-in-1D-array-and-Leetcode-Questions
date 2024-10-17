
public class Floorofno {
    public static void main(String[] args) {

        int[] arr = { 2, 3, 5, 6, 8, 9, 10, 11 };
        int target = 4;
        int ans = floorofano(arr, target);
        System.out.println(ans);

    }

    static int floorofano(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        // If the target is greater than the last element, there's no ceiling
        if (target > arr[end]) {
            return -1; // No ceiling found
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return target;

            } else if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }
        }
        return arr[end];
    }
}