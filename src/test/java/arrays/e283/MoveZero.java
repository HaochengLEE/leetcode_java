package arrays.e283;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @author lihaocheng
 * @createtime 2022/4/4
 */
public class MoveZero {
    @Test
    void test(){
        int[] nums={0,1,0};
        moveZeroes(nums);
        Arrays.stream(nums).forEach(System.out::println);
    }

    public void moveZeroes(int[] nums) {
        //边界条件处理
        int j=0;
        //遍历数组
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]!=0){
                nums[j]=nums[i];
                if (j!=i){
                    nums[i]=0;
                }
            }
        }

    }
}
