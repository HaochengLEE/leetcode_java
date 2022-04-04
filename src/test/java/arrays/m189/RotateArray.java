package arrays.m189;

import org.junit.jupiter.api.Test;

/**
 * @author lihaocheng
 * @createtime 2022/4/4
 */
public class RotateArray {

    @Test
    void test() {
        rotate(new int[]{-1},2);
    }

    //解法1：新开一个数组，从k开始复制参数过去
    public void rotate(int[] nums, int k) {
        //边界条件
        if (nums.length<=1){
            return;
        }
        //k比数组长，对k取余
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
        //复制数组
        System.arraycopy(result, 0, nums, 0, len);
    }
}
