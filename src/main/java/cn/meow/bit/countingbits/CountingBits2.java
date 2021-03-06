package cn.meow.bit.countingbits;

public class CountingBits2 {

    /**
     * 动态规划
     * 对于数字 6(110), 它可以看成是 4(100) 再加一个 2(10)
     * 因此 dp[i] = dp[i&(i-1)] + 1
     */
    public int[] countBits(int num) {
        int[] ret = new int[num + 1];
        for(int i = 1; i <= num; i++){
            ret[i] = ret[i&(i-1)] + 1;
        }
        return ret;
    }
}
