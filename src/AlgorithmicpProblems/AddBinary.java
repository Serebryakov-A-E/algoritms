package AlgorithmicpProblems;

import java.math.BigInteger;

public class AddBinary {
    public String addBinary(String a, String b) {
        BigInteger numA = new BigInteger(a, 2);
        BigInteger numB = new BigInteger(b, 2);
        BigInteger result = numA.add(numB);
        return result.toString(2);
    }
}
