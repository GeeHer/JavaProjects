package Class8;

public class T6EnhancedLoop {
    public static void main(String[] args) {
        // find the smallest number
       int [] nums={10,23,25,56,45,20,-10,-5};
       int smallestNum=nums[0];
       for (int n:nums){
           if(n<smallestNum){
               smallestNum=n;
           }
        }
        System.out.println(smallestNum);

    }
}

