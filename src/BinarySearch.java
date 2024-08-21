public class BinarySearch {
    public static void main(String[] args) {

        int nums[] = {7, 9, 11, 12, 13};
        int target = 11;

        int result = binarysearch(nums, target, 0, nums.length-1);

        if (result != -1)
            System.out.println("Element fount at index: " + result);

        else
            System.out.println("Element not found");
    }

//    public static int binarysearch(int[] nums, int target) {
//
//        int left = 0;
//        int right = nums.length - 1;
//        int steps =0;
//
//        while (left <= right) {
//            steps++;
//            int mid = (left + right) / 2;
//
//            if (nums[mid] == target) {
//                System.out.println("Steps taken by Binary : " + steps);
//                return mid;
//            } else if (nums[mid] < target) {
//                left = mid + 1;
//            } else
//                right = mid - 1;
//        }
//        System.out.println("Steps taken by Binary : " + steps);
//        return -1;
//    }
//}
//
// FOR RECURSIVE METHOD

public static int binarysearch(int[] nums, int target, int left, int right) {

    int steps =0;

    if (left <= right) {
        steps++;
        int mid = (left + right) / 2;

        if (nums[mid] == target) {
            System.out.println("Steps taken by Binary : " + steps);
            return mid;
        } else if (nums[mid] < target) {
            return binarysearch(nums, target, mid+1, right);
        } else
            return binarysearch(nums, target, left, mid-1);
    }
    System.out.println("Steps taken by Binary : " + steps);
    return -1;
}
}

