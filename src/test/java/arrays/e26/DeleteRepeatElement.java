package arrays.e26;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @author lihaocheng
 * @createtime 2022/4/3
 */
public class DeleteRepeatElement {
    @Test
    void test() {
        int[] nums=new int[]{1,1,2};
        removeDuplicates1(nums);
        Arrays.asList(nums).forEach(System.out::println);
    }

    public int removeDuplicates(int[] nums) {
        int count =0;
        for (int i = 0;i<nums.length;i++){
            //如果和前面的相等
            if(i>0&&nums[i]==nums[i-1]){
                //看看后面有没有重复
                int len=1;
                for (int j=i;j>nums.length-1;j++){
                    if (nums[j]!=nums[i]){
                        continue;
                    }
                    len++;
                }
                //挪动
                for (int j=i;j<nums.length-1;j++){
                    nums[j]=nums[j+len];
                }
                count++;
            }
        }
        return nums.length-count-1;
    }

    /**
     * 双指针
     * @param nums
     * @return
     */
    public int removeDuplicates1(int[] nums) {
        if (nums.length==0){
            return 0;
        }
        int fast =1,slow=1;
        while (fast<nums.length){
            //如果快指针不等于前一个，就交换值
            if (nums[fast]!=nums[fast-1]){
                nums[slow]=nums[fast];
                slow++;
            }
            //快指针往前走
            fast++;
        }
        return slow;
    }

}
