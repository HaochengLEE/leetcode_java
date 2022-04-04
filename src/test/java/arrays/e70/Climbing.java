package arrays.e70;

import org.junit.jupiter.api.Test;

/**
 * @author lihaocheng
 * @createtime 2022/4/4
 */
public class Climbing {
    @Test
    void test(){
        System.out.println(climbStairs(10));
    }

    /**
     * 数学归纳法
     * @param n
     * @return
     */
    public int climbStairs(int n) {
        //n=1时，有1种方法；n=2,2;n=3,3;n=4,5
        int i=0,j=0,result=1;
        //不存在 n=0 的情况，从 1 开始
        for (int k = 1; k <= n; k++) {
            i=j;
            j=result;
            result=i+j;
        }
        return result;
    }
}
