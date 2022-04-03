package arrays.m189;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @author lihaocheng
 * @createtime 2022/4/4
 */
public class RotateArray {

    @Test
    void test() {
        rotate(new int[]{-1},2);
    }

    //新开一个数组，从k开始复制参数过去
    public void rotate(int[] nums, int k) {
        if (nums.length<=1){
            return;
        }
        //k比数组长
        if (nums.length<=k){
            k=k%nums.length;
        }
        int[] result=new int[nums.length];
        int len=nums.length;
        int start=0;
        for(int i=len-k;i<len;i++){
            result[start++]=nums[i];
        }
        for (int i=0;i<len-k;i++){
            result[start++]=nums[i];
        }
        for (int i=0;i<len;i++){
            nums[i]=result[i];
        }
    }
}
