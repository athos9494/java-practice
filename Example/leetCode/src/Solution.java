/*将数字变成 0 的操作次数
* 给你一个非负整数 num ，请你返回将它变成 0 所需要的步数。 如果当前数字是偶数，你需要把它除以 2 ；否则，减去 1 。*/

public class Solution {
    public int numberOfSteps (int num) {
        int count = 0;
        while (num != 0){
            if(num%2 == 0){
                num = num/2;
                count++;
            }
            if(num%2 !=0){
                num = num -1;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().numberOfSteps(14));
    }
}
