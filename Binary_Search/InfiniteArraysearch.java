public class InfiniteArraysearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 20 };
        int target = 5;
        int ans = findingRange(arr, target);
        System.out.println(ans);
    }

    static int findingRange(int[] arr, int target) {
        // first find the range
        // start with the box of size 2
        int start = 0;
        int end = 1;
        while (target > arr[end]) {
            int newStart = end + 1;
            // double the end value
            // end=prevend+size of box*2
            end = end + (end - start + 1) * 2;
            start = newStart;

        }
        return search(arr, target, start, end);

    }

    static int search(int[] arr, int target, int start, int end) {

        while (start <= end) {
            // int mid=(start+end)/2;
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;

            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}