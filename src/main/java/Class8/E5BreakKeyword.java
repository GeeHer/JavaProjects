package Class8;

public class E5BreakKeyword {
    public static void main(String[] args) {
        // You have to search the array for the number 45 if it is present in the array
        // Print Found

        int[] nums= {10, 23, 25, 56, 45, 20};
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==45){
                System.out.println("Found");
                break;

            }

        }

    }
}
