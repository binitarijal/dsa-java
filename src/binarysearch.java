public class binarysearch {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int target = 7;
        int ans = bs(a, target);
        System.out.println(ans);
    }

    static int bs(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isac=arr[start]<arr[end];
        while(start <= end) {
            int mid = start + (end - start) / 2;
if(target==arr[mid]){
    return mid;
}
if(isac) {
    if (target < arr[mid]) {
        end = mid - 1;
    } else if (target > arr[mid]) {
        start = mid + 1;
    }
}
else {
    if (target < arr[mid]) {
        start = mid + 1;
    } else if (target > arr[mid]) {
        end = mid - 1;

    }
}
        }
        return -1;
    }
}