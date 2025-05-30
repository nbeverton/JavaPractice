package LeetCode.Abril.RemoveElement_27;

public class RemoveElement_27 {
    public int removeElement(int[] nums, int val){
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        RemoveElement_27 removeElement27 = new RemoveElement_27();

        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println("resultado: " + removeElement27.removeElement(nums, val));
    }
}
