package Solutions.task4;

import java.math.BigInteger;

public class ASum {

    public static long findNb(long m) {
        BigInteger temp = new BigInteger(String.valueOf(0));
        BigInteger n = new BigInteger(String.valueOf(0));
        BigInteger one = new BigInteger(String.valueOf(1));
        BigInteger bigM = new BigInteger(String.valueOf(m));
        while (true){
            temp=(n.add(one)).pow(3).add(temp);
            n=n.add(one);
            if (bigM.longValue()==temp.longValue()) return n.longValue();
            if (bigM.longValue()<temp.longValue()) return -1;
        }
    }
}