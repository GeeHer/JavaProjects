package Class8;

public class T7EnhancedLoop {
    public static void main(String[] args) {
        // go through the array and replace all the negative numbers with 0
       int [] nums={10,23,25,56,45,20,-10,-5};
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]<0){
                nums[i]=0;
            }

        }
        for (int n: nums) {
            System.out.println(n);

        }
       }

    }


