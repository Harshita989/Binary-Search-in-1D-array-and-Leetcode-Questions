public class PeakIndexinMountainArray {
    public static void main(String[] args) {
        int[] arr = { 0, 10, 12, 5, 2 };
        int ans = MA(arr);
        System.out.println(ans);
    }

    static int MA(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) - 1;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;

            }
        }
        return start;

    }
}
