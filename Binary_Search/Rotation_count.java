public class Rotation_count {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
        System.out.println((countRotaion(arr)));
    }

    static int countRotaion(int[] arr) {
        int pivot = pivotelement(arr);
        if (pivot == -1) {
            return 0;
        }
        return pivot + 1;

    }

    static int pivotelement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            // four cases
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;

            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return -1;

    }

    static int search(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

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
