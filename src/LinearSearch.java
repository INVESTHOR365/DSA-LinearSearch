public class LinearSearch {

    public static void main(String[] args) {


        int nums[] = {7, 9, 11, 12, 13};
        int target = 70;

        int result = linearsearch(nums, target);

        if (result != -1)
            System.out.println("Element fount at index: " + result);

        else
            System.out.println("Element not found");
    }


    public static int linearsearch(int[] nums, int target) {

        int steps = 0;

        for(int i = 0; i < nums.length; i++) {
            steps++;

            if(nums[i] == target) {
                System.out.println("Steps taken by Linear : " + steps);
                return i;
            }
        }
        System.out.println("Steps taken by Linear : " + steps);
        return -1;
    }
}
