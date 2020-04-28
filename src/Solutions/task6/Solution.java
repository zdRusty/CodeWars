package Solutions.task6;

public class Solution {
    public static int zeros(int n) {
        int result = 0;
        while (n>0){
            n/=5;
            result+=n;
        }
        return result;
    }
}
